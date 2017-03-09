package com.pet.dao;

public class DaoFactory
{
	public static IUserDao getUserDao()
	{
		return new UserDao();
	}
}
