package com.pet.action;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pet.dao.IArticleContentDao;
import com.pet.dao.DaoFactory;

import com.pet.model.ArticleContent;
import com.pet.util.DbUtil;


public class ArticleContentAction {

	private IArticleContentDao articleContentDao = DaoFactory.getArticleContentDao();
	
	public List<ArticleContent> getArticleContent(String questionId) {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			ResultSet rs = articleContentDao.getArticleContent(con, questionId);
			List<ArticleContent> contentList = new ArrayList();
			while(rs.next()) {
				ArticleContent content = new ArticleContent();
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
}
