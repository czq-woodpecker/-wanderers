package com.pet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pet.action.BeautyArticleCommentAction;
import com.pet.action.FeedKnowledgeCommentAction;
import com.pet.action.TalkAndDicussCommentAction;

import com.pet.model.Comment;
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
		//2.获取帖子ID
		String questionId = request.getParameter("questionId"); 
		//3.获取评论时间
		String systemDate = request.getParameter("systemDate");
		//4.获取页面类型
		String page = request.getParameter("page");
		//5.获取评论者
		HttpSession session = request.getSession();
		User currentUser = (User)session.getAttribute("currentUser");
		//6.
		String pageUrl = request.getParameter("pageUrl");
		if(currentUser == null)
		{
			request.setAttribute("error", "<a>登录后才能评论  点击登录</a>  ");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}

		//实例化comment对象
		Comment comment = new Comment();
		comment.setContent(content);
		comment.setAnswerName(currentUser.getUsername());
		comment.setArticleId(Integer.parseInt(questionId));
		comment.setTime(systemDate);
		
		//更新到数据表中
		if("beauty".equals(page))
		{
			//
			BeautyArticleCommentAction commentAction = new BeautyArticleCommentAction();
			commentAction.addComment(comment);	
		}
		else if ("feed".equals(page)) 
		{
			//
			FeedKnowledgeCommentAction commentAction = new FeedKnowledgeCommentAction();
			commentAction.addComment(comment);	
		}
		else
		{
			//
			TalkAndDicussCommentAction commentAction = new TalkAndDicussCommentAction();
			commentAction.addComment(comment);	
		}
		//评论完跳到哪里的问题
		response.sendRedirect(pageUrl);
		

		
			
	}
	
}
