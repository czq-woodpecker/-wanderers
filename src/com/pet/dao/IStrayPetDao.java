package com.pet.dao;

import java.sql.Connection;
import java.sql.ResultSet;

public interface IStrayPetDao {
	/**
	 * 返回流浪宠物信息结果集
	 * @param con
	 * @param kind
	 * @return
	 * @throws Exception
	 */
	public ResultSet strayPetList(Connection con, String kind) throws Exception;
	public ResultSet strayPetList(Connection con, String kind,int pageNo) throws Exception;
}
