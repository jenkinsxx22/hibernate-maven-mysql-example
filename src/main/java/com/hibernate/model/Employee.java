package com.hibernate.model;


import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="Address")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Caste")
	private String Caste;
	@Column(name="Age")
	private int Age;
	@OneToMany(mappedBy="Employee")
	private Set<Address> Address;
	@OneToMany(mappedBy ="Employee")
	private Set<Contact> Contact;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String firstName, String lastName, String caste, int age,
			Set<com.hibernate.model.Address> address, Set<com.hibernate.model.Contact> contact) {
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Caste = caste;
		Age = age;
		Address = address;
		Contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getCaste() {
		return Caste;
	}
	public void setCaste(String caste) {
		Caste = caste;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public Set<Address> getAddress() {
		return Address;
	}
	public void setAddress(Set<Address> address) {
		Address = address;
	}
	public Set<Contact> getContact() {
		return Contact;
	}
	public void setContact(Set<Contact> contact) {
		Contact = contact;
	}	
	
	
}
