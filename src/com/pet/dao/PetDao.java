package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PetDao implements IPetDao{

	@Override
	public ResultSet petList(Connection con, String kind) throws Exception {
		StringBuffer sql = new StringBuffer("select * from ");
		if("dog".equals(kind)) {
			sql.append("t_dogs");
		}else if("cat".equals(kind)) {
			sql.append("t_cats");
		}
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		return pstmt.executeQuery();
	}
	@Override
	public ResultSet petList(Connection con, String kind,int pageNo) throws Exception {
		StringBuffer sql = new StringBuffer("select * from ");
		if("dog".equals(kind)) {
			sql.append("t_dogs");
		}else if("cat".equals(kind)) {
			sql.append("t_cats");
		}
		sql.append(" order by id limit ?,?");
		int pageSize = 12; 
		int page = (pageNo - 1) * 12;
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, page);
		pstmt.setInt(2, pageSize);
		return pstmt.executeQuery();
	}
	
}
