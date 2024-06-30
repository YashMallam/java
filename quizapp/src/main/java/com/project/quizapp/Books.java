package com.project.quizapp;


@Entity(name="booksinfo")
public class Books {
	
	private Integer id;
	private String name;
	private String author;
	
	
	public Books(Integer id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}


	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAuthor() {
		return author;
	}
	
	
	
	

}
