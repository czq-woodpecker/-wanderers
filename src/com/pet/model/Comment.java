package com.pet.model;

import java.sql.Date;


public class Comment {

	private int id;	//评论ID
	private int articleId;	//帖子ID
	private String answerName;	//评论者
	private String content;		//评论内容
	private String time;	//评论时间
	public Comment()
	{

	}
	public Comment(int id, int articleId, String answerName, String content, String time)
	{
		super();
		this.id = id;
		this.articleId = articleId;
		this.answerName = answerName;
		this.content = content;
		this.time = time;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getArticleId()
	{
		return articleId;
	}
	public void setArticleId(int articleId)
	{
		this.articleId = articleId;
	}

	
	
	public String getAnswerName()
	{
		return answerName;
	}
	public void setAnswerName(String answerName)
	{
		this.answerName = answerName;
	}
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content = content;
	}
	public String getTime()
	{
		return time;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
	
	
	
	
	
}