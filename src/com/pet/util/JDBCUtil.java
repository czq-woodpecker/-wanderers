package com.pet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil
{
	private static String username = "root";
	private static String password = "360mima";
	private static String database = "pets";

	//创建与数据库的连接
	public static Connection getConnection()
	{
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/"+database;
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
	
	//关闭Connection
	public static void close(Connection connection)
	{
		try
		{
			if(connection != null)
			{
				connection.close();
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//关闭PreparedStatement
	public static void close(PreparedStatement preparedStatement)
	{
		try
		{
			if(preparedStatement != null)
			{
				preparedStatement.close();
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//关闭ResultSet
	public static void close(ResultSet resultSet)
	{
		try
		{
			if(resultSet != null)
			{
				resultSet.close();
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
