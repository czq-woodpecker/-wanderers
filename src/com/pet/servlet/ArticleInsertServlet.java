package com.pet.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pet.action.BeautyArticleListAction;
import com.pet.action.FeedKnowledgeListAction;
import com.pet.action.TalkAndDicussListAction;
import com.pet.model.ArticleList;
import com.pet.model.User;

public class ArticleInsertServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		HttpSession session = request.getSession();
		//获取标题
		String title = request.getParameter("title");
		//获取发布者
		User user = (User)session.getAttribute("currentUser");
		if(user == null) {
			request.setAttribute("error", "登录后才能发文  点击登录  ");
			request.getRequestDispatcher("postArticles.jsp").forward(request, response);
			return;
		}
		String publisher = user.getNickname();
		//当前评论人数
		int comments = 0;
		//帖子内容
		String summary = request.getParameter("content");
		//获取时间
		Calendar c = Calendar.getInstance();      
	  	SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");      
	  	String time = f.format(c.getTime());
		ArticleList article = new ArticleList(title, publisher, comments, summary, time);
		//帖子类型
		String posting = request.getParameter("posting");
		if("chickenSoup".equals(posting)){
			BeautyArticleListAction bArticle = new BeautyArticleListAction();
			bArticle.insertArticle(article);
			response.sendRedirect("TalkAndShare_BeautyArticle.jsp");
		}else if("feeding".equals(posting)) {
			FeedKnowledgeListAction fArticle = new FeedKnowledgeListAction();
			fArticle.insertArticle(article);
			response.sendRedirect("TalkAndShare_FeedKnowledge.jsp");
		}else if("discussion".equals(posting)) {
			TalkAndDicussListAction tArticle = new TalkAndDicussListAction();
			tArticle.insertArticle(article);
			response.sendRedirect("TalkAndShare_TalkAndDiscuss.jsp");
		}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
