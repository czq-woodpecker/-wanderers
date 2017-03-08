package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * ����ݿ⽻��
 * @author Cedo
 *
 */
public class PetDao implements IPetDao{
	/**
	 * ����è����Ϣ�Ľ��
	 */
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
		int pageSize = 12;  //默认每页12条数据
		int page = (pageNo - 1) * 12;//pageNo为指定页面页数，page为数据数
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		pstmt.setInt(1, page);
		pstmt.setInt(2, pageSize + page);
		return pstmt.executeQuery();
	}
	
}
