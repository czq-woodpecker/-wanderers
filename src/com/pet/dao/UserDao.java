package com.pet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pet.model.User;
import com.pet.util.DbUtil;

public class UserDao implements IUserDao
{

	@Override
	public boolean add(User user) 
	{
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try
		{
			//1.创建与数据库的连接
			connection = DbUtil.getCon();
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
					return false;
				}
			}
			sql = "insert into t_user (username,password,nickname,sex,address) value (?,?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getNickname());
			preparedStatement.setString(4, user.getSex());
			
			preparedStatement.setString(5, user.getAddress());
	
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
			DbUtil.close(resultSet);
			DbUtil.close(preparedStatement);
			DbUtil.close(connection);
		}
		return true;
	}

	@Override
	public boolean delete(int id)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try
		{
			connection = DbUtil.getCon();
			User user = this.load(id);
			if(user.getUsername().equals("admin"))
			{
				return false;	//删除失败   超级管理员无法删除
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
			DbUtil.close(preparedStatement);
			DbUtil.close(connection);
		}
		return true;
	}

	@Override
	public boolean update(User user)
	{
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try
		{
			connection = DbUtil.getCon();
			String sql = "update t_user set password = ?,nickname = ?,sex = ?,address = ? where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getPassword());
			preparedStatement.setString(2, user.getNickname());
			preparedStatement.setString(3, user.getSex());
			preparedStatement.setString(4, user.getAddress());
//			preparedStatement.setInt(3, user.getType());
//			preparedStatement.setInt(4, user.getStatus());
			preparedStatement.setInt(5,user.getId());
			preparedStatement.executeUpdate();	
			
		} 
		catch (Exception e)
		{
			return false;
		}
		finally
		{
			DbUtil.close(preparedStatement);
			DbUtil.close(connection);
		}
		return true;
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
			connection = DbUtil.getCon();
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
				user.setSex(resultSet.getString("sex"));
				user.setAddress(resultSet.getString("address"));
				user.setAdoptedPets(resultSet.getString("adoptedPets"));
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
			DbUtil.close(resultSet);
			DbUtil.close(preparedStatement);
			DbUtil.close(connection);
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
		List<User> users = new ArrayList<User>();
		try
		{
			connection = DbUtil.getCon();
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
				user.setSex(resultSet.getString("sex"));
				user.setAddress(resultSet.getString("address"));
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
			DbUtil.close(resultSet);
			DbUtil.close(preparedStatement);
			DbUtil.close(connection);
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
			connection = DbUtil.getCon();
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
				user.setSex(resultSet.getString("sex"));
				user.setAddress(resultSet.getString("address"));
				user.setAdoptedPets(resultSet.getString("adoptedPets"));
			}			
			if(!user.getPassword().equals(password))
			{
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
			DbUtil.close(resultSet);
			DbUtil.close(preparedStatement);
			DbUtil.close(connection);
		}
		return user;
	}

}
