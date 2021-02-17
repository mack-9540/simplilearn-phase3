package com.simplilearn.model;

public class Product {
	
	public Product(String name, String category, String company, int size, int amount) {
		super();
		this.name = name;
		this.category = category;
		this.company = company;
		this.size = size;
		this.amount = amount;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String category;
	private String company;
	private int size;
	private int amount;
	private int id;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
