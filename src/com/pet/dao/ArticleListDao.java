package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * ����ݿ⽻��
 * @author Cedo
 *
 */
public class ArticleListDao implements IArticleListDao {

	/**
	 * ����������Ϣ�Ľ��
	 */
	@Override
	public ResultSet articleList(Connection con) throws Exception {
		String sql = "select * from t_exchange";
		PreparedStatement pstmt = con.prepareStatement(sql);
		return pstmt.executeQuery();
	}
	/**
	 * ����ĳ�����ӵ���Ϣ
	 */

	@Override
	public ResultSet articleList(Connection con, String id) throws Exception {
		StringBuffer sql = new StringBuffer("select * from t_exchange");
		sql.append(" and id=" + id);
		PreparedStatement pstmt = con.prepareStatement(sql.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	@Override
	public ResultSet articleList(Connection con,int pageNo) throws Exception{
		String sql = "select * from t_exchange order by id limit ?,?";
		int pageSize = 5;  //默认每页5条数据
		int page = (pageNo - 1) * 5;//pageNo为指定页面页数，page为数据数
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, page);
		pstmt.setInt(2, pageSize + page);
		return pstmt.executeQuery();
		
	}
}
