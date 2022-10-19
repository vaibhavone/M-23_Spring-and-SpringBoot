package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Certificate {
	
	@Id
	private Integer id;
	private String name;
	
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Certificate(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Certificate [id=" + id + ", name=" + name + "]";
	}
	
	

}
