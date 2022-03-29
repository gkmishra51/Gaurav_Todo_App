package com.gaurav.todorest.entity;

public class Todo {
	private int id;
	private String title;
	private String description;
	public Todo(int i, String title, String description) {
		super();
		this.id = i;
		this.title = title;
		this.description = description;
	}
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	

}
