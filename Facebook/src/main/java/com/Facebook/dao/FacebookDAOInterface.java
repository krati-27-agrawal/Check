package com.Facebook.dao;

import java.sql.ResultSet;

import com.Facebook.entity.FacebookUser;

public interface FacebookDAOInterface {
	public int createProfileDAO(FacebookUser f)throws Exception;

	public int deleteProfileDAO(FacebookUser f)throws Exception;

	public FacebookUser viewProfileDAO(FacebookUser f)throws Exception;

}
