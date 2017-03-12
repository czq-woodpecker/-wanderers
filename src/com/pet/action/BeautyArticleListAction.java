package com.pet.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.dao.BeautyArticleListDao;
import com.pet.dao.DaoFactory;
import com.pet.dao.IArticleListDao;
import com.pet.model.ArticleList;
import com.pet.util.DbUtil;

public class BeautyArticleListAction {

	private IArticleListDao articleListDao = DaoFactory.getBeautyArticleListDao();
	
	public List<ArticleList> getArticleList() {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = articleListDao.articleList(con);
			List<ArticleList> list = list = new ArrayList();
			while(rs.next()) {
				ArticleList articleList = new ArticleList();
				articleList.setId(rs.getInt("id"));
				articleList.setTitle(rs.getString("title"));
				articleList.setPublisher(rs.getString("publisher"));
				articleList.setComments(rs.getInt("comments"));
				String summary = rs.getString("summary");
				if(summary.length()> 300) {
					summary = summary.substring(0, 300);
				}
				articleList.setSummary(summary);
				articleList.setTime(rs.getString("time"));
				list.add(articleList);
				
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if(con != null) {
				DbUtil.close(con);
			}
		}
	}
	
	
	public ArticleList getArticle(String id) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = articleListDao.articleList(con, id);
			ArticleList article = null;
			if(rs.next()) {
				article = new ArticleList();
				article.setTitle(rs.getString("title"));
				article.setPublisher(rs.getString("publisher"));
				article.setComments(rs.getInt("comments"));
				article.setSummary(rs.getString("summary"));
				article.setTime(rs.getString("time"));
			}
			return article;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			DbUtil.close(con);
		}
	}
	

		public List<ArticleList> getArticleList(int pageNo) {
			Connection con = null;
			try {
				con = DbUtil.getCon();
				if(pageNo==0){
					pageNo =1;
				}
				
				ResultSet rs = articleListDao.articleList(con,pageNo);
				List<ArticleList> list = list = new ArrayList();
				while(rs.next()) {
					ArticleList articleList = new ArticleList();
					articleList.setId(rs.getInt("id"));
					articleList.setTitle(rs.getString("title"));
					articleList.setPublisher(rs.getString("publisher"));
					articleList.setComments(rs.getInt("comments"));
					String summary = rs.getString("summary");
					if(summary.length()> 300) {
						summary = summary.substring(0, 300);
					}
					articleList.setSummary(summary);
					articleList.setTime(rs.getString("time"));
					list.add(articleList);
					
				}
				return list;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				if(con != null) {
					try {
						DbUtil.close(con);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		public int getPage(){
			int recordCount = 0;
			int t1 = 0, t2 = 0;
			Connection con = null;
			try {
				con = DbUtil.getCon();
				ResultSet rs = articleListDao.articleList(con);
				List<ArticleList> list = list = new ArrayList();
				
				while(rs.next()) {
					ArticleList articleList = new ArticleList();
					articleList.setTitle(rs.getString("title"));
					articleList.setPublisher(rs.getString("publisher"));
					articleList.setComments(rs.getInt("comments"));
					articleList.setSummary(rs.getString("summary"));
					list.add(articleList);
				}
				recordCount = list.size();
				t1 = recordCount % 5;
				t2 = recordCount / 5;
				}catch(Exception e){
					e.printStackTrace();
					
			}
			if (t1 != 0) {
				t2 = t2 + 1;
			}
			return t2;
		}
		
		/*
		 * 增加帖子
		 * */
		public int insertArticle(ArticleList article) {
			Connection con = null;
			try {
				con = DbUtil.getCon();
				return articleListDao.insertArticle(con, article);
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				DbUtil.close(con);
			}
			return 0;
		}

}
