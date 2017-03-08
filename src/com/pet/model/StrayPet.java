package com.pet.model;

public class StrayPet {

	private int id;
	private String name;
	private String kind;
	private String sex;
	private String color;
	private String hobby;
	private String foundAddress;
	private int	owerId;
	public StrayPet() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getFoundAddress() {
		return foundAddress;
	}
	public void setFoundAddress(String foundAddress) {
		this.foundAddress = foundAddress;
	}
	public int getOwerId() {
		return owerId;
	}
	public void setOwerId(int owerId) {
		this.owerId = owerId;
	}
	
}
