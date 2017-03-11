package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.pet.model.Comment;


/**
 * 某条帖子的评论信息接口
 * @author Cedo
 *
 */
public interface ICommentDao {

	public ResultSet getArticleContent(Connection con, String questionId) throws Exception;
	public ResultSet getArticleContent(Connection con, String questionId,int pageNo) throws Exception;
	public boolean addArticleContent(Connection con,Comment artCon) throws Exception;     
}
