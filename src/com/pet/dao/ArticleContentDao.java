package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * 与数据库交互，查询帖子内容
 * @author Cedo
 *
 */
public class ArticleContentDao implements IArticleContentDao {

	/**
	 * 返回参与帖子的评论者信息
	 */
	@Override
	public ResultSet getArticleContent(Connection con, String questionId) throws Exception {
		StringBuffer sql = new StringBuffer("select * from t_exchangedetails");
		sql.append(" and exchangeId="+questionId);
		PreparedStatement pstmt = con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}

}
