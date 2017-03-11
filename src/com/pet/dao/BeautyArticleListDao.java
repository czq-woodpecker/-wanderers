package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;

import com.pet.model.ArticleList;

public class BeautyArticleListDao implements IArticleListDao {

	@Override
	public ResultSet articleList(Connection con) throws Exception {
		String sql = "select * from t_beauty";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeQuery();
	}

	@Override
	public ResultSet articleList(Connection con, String id) throws Exception {
		StringBuffer sql = new StringBuffer("select * from t_beauty");
		sql.append(" and id=" + id);
		PreparedStatement pstmt = con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	@Override
	public ResultSet articleList(Connection con,int pageNo) throws Exception{
		String sql = "select * from t_beauty order by id limit ?,?";
		int pageSize = 5;  //默认每页5条数据
		int page = (pageNo - 1) * 5;//pageNo为指定页面页数，page为数据数
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, page);
		pstmt.setInt(2, pageSize);
		return pstmt.executeQuery();
	}
	
	@Override
	public int insertArticle(Connection con, ArticleList article) throws Exception {
		String sql = "insert into t_beauty values(null,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, article.getTitle());
		pstmt.setString(2, article.getPublisher());
		pstmt.setTime(3, (Time) article.getTime());
		pstmt.setInt(4, article.getComments());
		pstmt.setString(5, article.getSummary());
		return pstmt.executeUpdate();
	}
}
