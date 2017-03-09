package com.pet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pet.dao.DaoFactory;
import com.pet.dao.IUserDao;
import com.pet.model.User;
import com.sun.media.jfxmedia.events.NewFrameEvent;

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
		System.out.println(username+"=-=-=-=");
		user.setPassword(password);
		user.setNickname(nickname);
		user.setSex(sex);
		user.setAddress(address);		
		boolean	add = userDao.add(user);
		System.out.println(add+"=====");
		if(add == false)
		{
			request.setAttribute("rigsterError", "注册失败  该用户名已存在");
			System.out.println("qqqqqqqqqqqqqqqqq");

			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		else {
			System.out.println("hahahhahahhahahxixixixixi");
		}
		
	}
	
}
