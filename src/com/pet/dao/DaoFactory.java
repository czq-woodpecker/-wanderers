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
	public static IArticleListDao getArticleListDao() {
		return new ArticleListDao();
	}
	public static IArticleContentDao getArticleContentDao() {
		return new ArticleContentDao();
	}
	public static IStrayPetDao getStrayPetDao() {
		return new StrayPetDao();
	}
}
