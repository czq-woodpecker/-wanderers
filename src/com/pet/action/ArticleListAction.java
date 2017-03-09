package com.pet.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.dao.ArticleListDao;
import com.pet.dao.DaoFactory;
import com.pet.dao.IArticleListDao;
import com.pet.model.ArticleList;
import com.pet.util.DbUtil;
/**
 * ��ȡ������Ϣ
 * @author Cedo
 *
 */
public class ArticleListAction {

	private IArticleListDao articleListDao = DaoFactory.getArticleListDao();
	
	/**
	 * �ӽ���н�����������Ϣȡ������List
	 * @return
	 */
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
				articleList.setTime(rs.getDate("time"));
				list.add(articleList);
				System.out.println(articleList.getId());
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
	/**
	 * ����ĳ�����ӵ���Ϣ
	 * @return
	 */
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
				article.setTime(rs.getDate("time"));
			}
			return article;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			DbUtil.close(con);
		}
	}
	
	//查询分页
		public List<ArticleList> getArticleList(int pageNo) {
			Connection con = null;
			try {
				con = DbUtil.getCon();
				if(pageNo==0){
					pageNo =1;//默认当前页是第一页，如何从jsp页面中获取pageNo的值
				}
				 System.out.print("***************");
				System.out.print(pageNo);
				System.out.print("************");
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
					articleList.setTime(rs.getDate("time"));
					list.add(articleList);
					System.out.println(articleList.getId());
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
		
		//计算总的页数
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
				t1 = recordCount % 12;
				t2 = recordCount / 12;
				}catch(Exception e){
					e.printStackTrace();
					return 1;
			}
			if (t1 != 0) {
				t2 = t2 + 1;
			}
			return t2;
			
		}
}