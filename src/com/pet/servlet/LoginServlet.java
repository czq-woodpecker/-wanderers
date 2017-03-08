package com.pet.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pet.dao.DaoFactory;
import com.pet.dao.IUserDao;
import com.pet.model.User;

public class LoginServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		IUserDao userDao = DaoFactory.getUserDao();
		User user = userDao.login(username, password);
		if(user == null)	
		{
			//登录失败
			request.setAttribute("error", "用户名或密码错误");
			request.setAttribute("username",username);
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		else
		{
			//登录成功
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			request.getRequestDispatcher("main.jsp").forward(request, response);
		}
		
	}
	
}
