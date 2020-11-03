package com.Facebook.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Facebook.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface{

	public int createProfileDAO(FacebookUser f) throws Exception {
		// TODO Auto-generated method stub
		//step 1: load driver( to connect with database)
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		//step 2: connection with database
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb2;create=true","paras","paras");
		//step 3 create query
		PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		ps.setString(1, f.getName());
		ps.setString(2, f.getPassword());
		ps.setString(3,f.getEmail());
		ps.setString(4, f.getAddress());
				
		//step 4 execute query
		int i=ps.executeUpdate();
				
		return i;

	}
	public int deleteProfileDAO(FacebookUser f)throws Exception{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb2;create=true","paras","paras");
		PreparedStatement ps=con.prepareStatement("delete from facebookuser where name = ?");
		ps.setString(1, f.getName());
		
		int i = ps.executeUpdate();
		return i;
	}
	public FacebookUser viewProfileDAO(FacebookUser f)throws Exception{
		boolean b;
		b = false;
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb2;create=true","paras","paras");
		PreparedStatement ps=con.prepareStatement("select * from facebookuser where name = ?");
		ps.setString(1, f.getName());
		
		ResultSet resultset =(ResultSet) ps.executeQuery();
	
		
		while (resultset.next()) {
			b = true;
			String namee = resultset.getString("name");
			String maill = resultset.getString("email");
			String adress = resultset.getString("address");
			String pasword = resultset.getString("password");
			f.setName(namee);
			f.setAddress(adress);
			f.setEmail(maill);
			f.setPassword(pasword);
		}
		con.close();
		if (b = true)return f;
		return null;	
	}

}