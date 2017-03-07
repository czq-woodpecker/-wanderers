package com.pet.dao;

import java.util.List;

import com.pet.model.User;

public interface IUserDao
{
	public boolean add(User user);
	public boolean delete(int id);
	public boolean update(User user);
	public User load(int id);
	public List<User> list();
	public User login(String username,String password);
}
