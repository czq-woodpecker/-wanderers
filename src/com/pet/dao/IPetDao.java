package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface IPetDao {
	
	public ResultSet petList(Connection con, String kind) throws Exception;
	public ResultSet petList(Connection con, String kind,int pageNo) throws Exception;
}
