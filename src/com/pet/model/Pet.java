package com.pet.model;

public class Pet {

	private int id;
	private String name;
	private String habit;
	private String hobby;
	private String photoAddress;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String name, String kind, String sex, String habit,
			String hobby, String photoAddress) {
		super();
		this.name = name;
		this.habit = habit;
		this.hobby = hobby;
		this.photoAddress = photoAddress;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHabit() {
		return habit;
	}
	public void setHabit(String habit) {
		this.habit = habit;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getPhotoAddress() {
		return photoAddress;
	}
	public void setPhotoAddress(String photoAddress) {
		this.photoAddress = photoAddress;
	}
	
}