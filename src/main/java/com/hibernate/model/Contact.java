package com.hibernate.model;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.*;

public class Contact  {

	   @Id
	   @GeneratedValue( strategy = GenerationType.AUTO )
	   private int             id;
	   private String          name;
	   @Transient
	   private String          details;
	   
	   
	public Contact( String name, String details) {

		this.name = name;
		this.details = details;
	}
	public Contact() {
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
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	   
}
