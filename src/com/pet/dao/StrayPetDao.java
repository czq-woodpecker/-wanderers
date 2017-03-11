package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StrayPetDao implements IStrayPetDao {

	@Override
	public ResultSet strayPetList(Connection con, String kind) throws Exception {
		StringBuffer sql = new StringBuffer("select * from");
		if("dog".equals(kind)) {
			sql.append(" t_straydogs");
		}else if("cat".equals(kind)) {
			sql.append(" t_straycats");
		}
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		return pstmt.executeQuery();
	}

	@Override
	public ResultSet strayPetList(Connection con, String kind,int pageNo) throws Exception {
		StringBuffer sql = new StringBuffer("select * from");
		if("dog".equals(kind)) {
			sql.append(" t_straydogs");
		}else if("cat".equals(kind)) {
			sql.append(" t_straycats");
		}
		sql.append(" order by id limit ?,?");
		int pageSize = 9; 
		int page = (pageNo - 1) * 9;
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, page);
		pstmt.setInt(2, pageSize);
		return pstmt.executeQuery();
	}
}
