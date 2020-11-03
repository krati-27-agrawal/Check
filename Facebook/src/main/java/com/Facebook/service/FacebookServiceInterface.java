package com.Facebook.service;
import java.sql.ResultSet;

import com.Facebook.entity.FacebookUser;

public interface FacebookServiceInterface {
	public int createProfile(FacebookUser f)throws Exception;
	public int deleteProfile(FacebookUser f)throws Exception;
	public FacebookUser viewProfile(FacebookUser f)throws Exception;
	public void editProfile();
	public void searchProfile();
	public void viewallProfile();
}