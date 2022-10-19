package com.example.demo;

	
	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Admin 
	{
		@Id
		private int id;
		private String name;
		private String password;
		
		
		//default constructor
		
		public Admin() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		//parameterized constructor
		public Admin(int id, String name, String password) {
			super();
			this.id = id;
			this.name = name;
			this.password = password;
		}
		
		//getter and setter
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}

		//tostring method
		@Override
		public String toString() {
			return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
		}
		
		
		
	

}
