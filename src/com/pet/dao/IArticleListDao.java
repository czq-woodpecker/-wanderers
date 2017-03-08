package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface IArticleListDao {

	public ResultSet articleList(Connection con) throws Exception;
	public ResultSet articleList(Connection con, String id) throws Exception;
	public ResultSet articleList(Connection con,int pageNo) throws Exception;
}
