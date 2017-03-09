package com.pet.model;

import java.sql.Date;

/**
 * 帖子的详细内容，包括评论
 * @author Cedo
 *
 */
public class ArticleContent {

	private int id;
	private int exchangeId;
	private String answerName;
	private String content;
	private Date time;
	public ArticleContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArticleContent(int exchangeId, String answerName, String content) {
		super();
		this.exchangeId = exchangeId;
		this.answerName = answerName;
		this.content = content;
	}
	public int getExchangeId() {
		return exchangeId;
	}
	public void setExchangeId(int exchangeId) {
		this.exchangeId = exchangeId;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
