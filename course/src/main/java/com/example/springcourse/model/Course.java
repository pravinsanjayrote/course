package com.example.springcourse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="course")
public class Course implements Serializable {

	public Course() {
	
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	int Id;
	@Column(name="name")
	String Name;
	@Column(name="description")
	String Description;
	@Column(name="amount")
	int Amount;
	
	public Course(int Id, String name, String description, int amount) {
	
		this.Id = Id;
		this.Name = name;
		this.Description = description;
		this.Amount = amount;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		this.Amount = amount;
	}

	@Override
	public String toString() {
		return "Course [id=" + Id + ", name=" + Name + ", description=" + Description + ", amount=" + Amount + "]";
	}
	
}
