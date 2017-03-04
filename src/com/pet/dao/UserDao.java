package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pet.model.User;
import com.pet.util.JDBCUtil;

public class UserDao implements IUserDao
{

	@Override
	public void add(User user) 
	{
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try
		{
			//1.创建与数据库的连接
			connection = JDBCUtil.getConnection();
			String sql = "select count(*) from t_user where username = ?";
			//2.预处理
			preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, user.getUsername());
			//3.查询
			resultSet = preparedStatement.executeQuery();
//			int count = 0;
			while(resultSet.next())
			{
				if(resultSet.getInt(1)>0)
				{
					throw new Exception("要添加的用户已存在，不能继续添加");
				}
			}
//			if(count > 0 )
//			{
//				throw new ShopException("要添加的用户已存在，不能继续添加");
//			}
			sql = "insert into t_user (username,password,nickname) value (?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getNickname());
//			preparedStatement.setInt(4, user.getType());
//			preparedStatement.setInt(5, user.getStatus());
			//4.更新至数据库
			preparedStatement.executeUpdate();
		
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCUtil.close(resultSet);
			JDBCUtil.close(preparedStatement);
			JDBCUtil.close(connection);
		}
	}

	@Override
	public void delete(int id)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try
		{
			connection = JDBCUtil.getConnection();
			User user = this.load(id);
			if(user.getUsername().equals("admin"))
			{
				throw new Exception("超级管理员admin不能被删除");
			}
			String sql = "delete from t_user where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();		
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCUtil.close(preparedStatement);
			JDBCUtil.close(connection);
		}
	}

	@Override
	public void update(User user)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try
		{
			connection = JDBCUtil.getConnection();
			String sql = "update t_user set password = ?,nickname = ? where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getPassword());
			preparedStatement.setString(2, user.getNickname());
//			preparedStatement.setInt(3, user.getType());
//			preparedStatement.setInt(4, user.getStatus());
			preparedStatement.setInt(3,user.getId());
			preparedStatement.executeUpdate();		
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCUtil.close(preparedStatement);
			JDBCUtil.close(connection);
		}
	}

	@Override
	public User load(int id)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = null;
		try
		{
			connection = JDBCUtil.getConnection();
			String sql = "select * from t_user where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);			
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				user = new User();	//找到才创建  这样才可能出现返回的user为null的情况
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setNickname(resultSet.getString("nickname"));
//				user.setType(resultSet.getInt("type"));
//				user.setStatus(resultSet.getInt("status"));
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCUtil.close(resultSet);
			JDBCUtil.close(preparedStatement);
			JDBCUtil.close(connection);
		}
		return user;
	}

	@Override
	public List<User> list()
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = null;
		List<User> users = new ArrayList<>();
		try
		{
			connection = JDBCUtil.getConnection();
			String sql = "select * from t_user";
			preparedStatement = connection.prepareStatement(sql);		
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				user = new User();	//找到才创建  这样才可能出现返回的user为null的情况
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setNickname(resultSet.getString("nickname"));
//				user.setType(resultSet.getInt("type"));
//				user.setStatus(resultSet.getInt("status"));
				users.add(user);
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCUtil.close(resultSet);
			JDBCUtil.close(preparedStatement);
			JDBCUtil.close(connection);
		}
		return users;
		
	}

	@Override
	public User login(String username, String password)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		User user = null;
		try
		{
			connection = JDBCUtil.getConnection();
			String sql = "select * from t_user where username=? ";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next())
			{
				user = new User();	//找到才创建  这样才可能出现返回的user为null的情况
				user.setId(resultSet.getInt("id"));
				user.setUsername(resultSet.getString("username"));
				user.setPassword(resultSet.getString("password"));
				user.setNickname(resultSet.getString("nickname"));
//				user.setType(resultSet.getInt("type"));
//				user.setStatus(resultSet.getInt("status"));
			}

//			if(user == null)
//			{
//				throw new Exception("用户名不存在");
//			}
			
			if(!user.getPassword().equals(password))
			{
				
//				throw new Exception("用户密码不正确");
				user = null;
			}
//			if(user.getStatus() == 1)
//			{
//				throw new Exception("该账号已被停用，无法登录");
//			}
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCUtil.close(resultSet);
			JDBCUtil.close(preparedStatement);
			JDBCUtil.close(connection);
		}
		return user;
	}

}
