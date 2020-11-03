package com.springbootfirst.dao;

import org.springframework.stereotype.Repository;

import com.springbootfirst.entity.Employee;

@Repository
public class FacebookDAO implements FacebookDAOInterface{

	@Override
	public String createProfile(Employee emp) {
		// TODO Auto-generated method stub
		return emp.getAddress();
	}

}
