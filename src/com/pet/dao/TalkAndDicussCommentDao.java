package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pet.model.Comment;
/**
 * 与数据库交互，查询帖子内容
 * @author Cedo
 *
 */
public class TalkAndDicussCommentDao implements ICommentDao {

	/**
	 * 返回参与帖子的评论者信息
	 */
	@Override
	public ResultSet getArticleContent(Connection con, String questionId) throws Exception {
		StringBuffer sql = new StringBuffer("select * from t_talkanddicuss");
		sql.append(" where exchangeId="+questionId);
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		return pstmt.executeQuery();
	}
	
	@Override
	public ResultSet getArticleContent(Connection con, String questionId,int pageNo) throws Exception {
		StringBuffer sql = new StringBuffer("select * from t_talkanddicuss");
		sql.append(" where exchangeId="+questionId);
		
		
		sql.append(" order by id limit ?,?");
		int pageSize = 4;  //每页4个评论数据
		int page = (pageNo - 1) * 4;
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, page);
		pstmt.setInt(2, pageSize);
		
		return pstmt.executeQuery();
	}
	
	/**
	 * 用来插入数据
	 * @param  con        [description]
	 * @param  artCon     [description]
	 * @param  questionId [description]
	 * @throws Exception  [description]
	 */
	@Override
	public boolean addArticleContent(Connection con,Comment artCon) throws Exception{
//		public boolean addArticleContent(Connection con,Comment artCon,String questionId) throws Exception{
		String sql = "insert into t_talkanddicuss (id,exchangeId,answerName,content,time) values (null,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		//pstmt.setInt(1, artCon.getId());
		pstmt.setInt(1, artCon.getArticleId());
		pstmt.setString(2, artCon.getAnswerName());
		pstmt.setString(3, artCon.getContent());
		pstmt.setString(4, artCon.getTime());
		

		
		pstmt.executeUpdate();
		
		return true;
	}

}
