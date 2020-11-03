package com.Facebook.service;

import java.sql.ResultSet;

import com.Facebook.dao.FacebookDAO;
import com.Facebook.dao.FacebookDAOInterface;
import com.Facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface{

	public int createProfile(FacebookUser f) throws Exception {
		FacebookDAOInterface fd=new FacebookDAO();
		return fd.createProfileDAO(f);
	}
	
	public int deleteProfile(FacebookUser f) throws Exception {
		// TODO Auto-generated method stub
		FacebookDAOInterface fi = new FacebookDAO();
		return fi.deleteProfileDAO(f);
	}


	public FacebookUser viewProfile(FacebookUser f) throws Exception{
		// TODO Auto-generated method stub
		FacebookDAOInterface fd = new FacebookDAO();
		return fd.viewProfileDAO(f);
		
	}

	public void editProfile() {
		// TODO Auto-generated method stub
		
	}

	public void searchProfile() {
		// TODO Auto-generated method stub
		
	}

	public void viewallProfile() {
		// TODO Auto-generated method stub
		
	}


}

