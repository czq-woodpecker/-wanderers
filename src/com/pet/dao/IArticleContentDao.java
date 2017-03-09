package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;


/**
 * 某条帖子的评论信息接口
 * @author Cedo
 *
 */
public interface IArticleContentDao {

	public ResultSet getArticleContent(Connection con, String questionId) throws Exception;
}
