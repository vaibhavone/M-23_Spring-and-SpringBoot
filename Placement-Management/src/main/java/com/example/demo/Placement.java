package com.example.demo;


	
	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Placement {
		@Id
		private int id;
		private String name;
		private String date;
		private String qualification;
		private int year;
		
		
		//Parameterized constructor
			
		public Placement(int id, String name, String date, String qualification, int year) {
			super();
			this.id = id;
			this.name = name;
			this.date = date;
			this.qualification = qualification;
			this.year = year;
		}
		
		//default constructor
		
		public Placement() {
			super();
			// TODO Auto-generated constructor stub
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

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		

		//toString method
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}


	}


