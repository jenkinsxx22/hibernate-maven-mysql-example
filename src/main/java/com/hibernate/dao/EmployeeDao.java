package com.hibernate.dao;
import java.util.Set;

import com.hibernate.model.*;
import com.hibernate.util.HIbernateUtil;
import com.mysql.cj.Session;

import jakarta.transaction.Transaction;

public class EmployeeDao {

	public void SaveEmployee(Employee emp) {
		
		Transaction trn = null;
		
		Employee emp1 = new Employee();
		
		emp1.setId(1);
		emp1.setFirstName("Nisar");
		emp1.setLastName("Ahmed");
		emp1.setCaste("Abbasi");
		
		Set<Contact> contactset = null;
		 
		Contact empcontact = new Contact("123","23");
		
		contactset.add(empcontact); 
		
		emp1.setContact(contactset);
		
		try(Session s = HIbernateUtil.getSessionFactory().){
			
		}		
		
	}
}
