package com.pet.dao;

public class DaoFactory
{
	public static IUserDao getUserDao()
	{
		return new UserDao();
	}
	public static IPetDao getDogsDao() {
		return new PetDao();
	}
	public static IArticleListDao getBeautyArticleListDao() {
		return new BeautyArticleListDao();
	}
	public static IArticleListDao getTalkAndDicussListDao() {
		return new TalkAndDicussListDao();
	}
	public static IArticleListDao getFeedKnowledgeListDao() {
		return new FeedKnowledgeListDao();
	}
	public static ICommentDao getBeautyArticleCommentDao() {
		return new BeautyArticleCommentDao();
	}
	public static ICommentDao getFeedKnowledgeCommentDao() {
		return new FeedKnowledgeCommentDao();
	}
	public static ICommentDao getTalkAndDicussCommentDao() {
		return new TalkAndDicussCommentDao();
	}
	public static IStrayPetDao getStrayPetDao() {
		return new StrayPetDao();
	}
}
