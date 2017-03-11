package com.pet.test;

import java.text.ParseException;


public class Test
{
	public static void main(String[] args) throws ParseException
	{
	    java.util.Calendar c=java.util.Calendar.getInstance();      
	    java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");      
	    String date = f.format(c.getTime());
	    System.out.println(date);
	}
}
