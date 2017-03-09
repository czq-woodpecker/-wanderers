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

public class RegisterServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.print("submiteddealing!!!");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String nickname = request.getParameter("nickname");
		String sex = request.getParameter("sex");
		String address = request.getParameter("address");
		IUserDao userDao = DaoFactory.getUserDao();
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setNickname(nickname);
		user.setSex(sex);
		user.setAddress(address);		
		boolean	add = userDao.add(user);
		if(add == false)
		{
			//注册失败
			request.setAttribute("rigsterError", "注册失败！用户名已存在！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		else 
		{
			//注册成功并登陆
			HttpSession session = request.getSession();
			session.setAttribute("currentUser", user);
			request.getRequestDispatcher("main.jsp").forward(request, response);
			return;
		}
		
	}
	
}
