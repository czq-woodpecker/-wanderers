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

public class ArticlesContentServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//1.获取评论内容          
		String content = request.getParameter("content");
//		HttpSession session = request.getSession();
//		User currentUser = (User)session.getAttribute("currentUser");
//		//2.获取帖子ID
		String questionId = request.getParameter("questionId"); 
		//3.获取评论者用户名
		String answerName = request.getParameter("answerName");
		//4.获取评论时间
		System.out.println(content+"*****");
		System.out.println(questionId+"====");
		System.out.println(answerName+"^^^^");
//		System.out.println(currentUser.getId()+"***"+currentUser.getUsername());
		
//		IUserDao userDao = DaoFactory.getUserDao();
//		User user = userDao.login(username, password);

//		else
//		{
//			//登录成功
//			HttpSession session = request.getSession();
//			session.setAttribute("currentUser", user);
//			request.getRequestDispatcher("main.jsp").forward(request, response);
//			
//		}
		
	}
	
}
