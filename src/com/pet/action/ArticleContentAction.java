package com.pet.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.dao.IArticleContentDao;
import com.pet.dao.DaoFactory;
import com.pet.model.Comment;
import com.pet.model.ArticleList;
import com.pet.util.DbUtil;


public class ArticleContentAction {

	private IArticleContentDao articleContentDao = DaoFactory.getArticleContentDao();
	
	public List<Comment> getArticleContent(String questionId) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = articleContentDao.getArticleContent(con, questionId);
			List<Comment> contentList = new ArrayList();
			while(rs.next()) {
				Comment content = new Comment();
				content.setAnswerName(rs.getString("answerName"));
				content.setContent(rs.getString("content"));
				content.setTime(rs.getDate("time"));
				contentList.add(content);
			}
			return contentList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
				DbUtil.close(con);
		}
	}
	
	
	public List<Comment> getArticleContent(String questionId,int pageNo) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = articleContentDao.getArticleContent(con,questionId,pageNo);
			List<Comment> contentList = new ArrayList();
			while(rs.next()) {
				Comment content = new Comment();
				content.setAnswerName(rs.getString("answerName"));
				content.setContent(rs.getString("content"));
				content.setTime(rs.getDate("time"));
				contentList.add(content);
			}
			return contentList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
				DbUtil.close(con);
		}
	}
	
	
	public int getPage(String questionId){
		int recordCount = 0;
		int t1 = 0, t2 = 0;
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = articleContentDao.getArticleContent(con, questionId);
			List<Comment> contentList = new ArrayList();

			while (rs.next()) {

				Comment content = new Comment();
				content.setAnswerName(rs.getString("answerName"));
				content.setContent(rs.getString("content"));
				content.setTime(rs.getDate("time"));
				contentList.add(content);

			}
			recordCount = contentList.size();
			t1 = recordCount % 4;
			t2 = recordCount / 4;
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
