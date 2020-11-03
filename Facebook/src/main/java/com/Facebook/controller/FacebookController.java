package com.Facebook.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.ResultSet;

import com.Facebook.entity.FacebookUser;
import com.Facebook.service.FacebookService;
import com.Facebook.service.FacebookServiceInterface;

public class FacebookController implements FacebookControllerInterface{
	private FacebookController(){
		
	}
	
	public static FacebookControllerInterface createObject() {
		return new FacebookController();
	}
	public void createProfile()throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String name=br.readLine();
		
		System.out.println("enter Password");
		String password=br.readLine();
		System.out.println("enter Email");
		String email=br.readLine();
		System.out.println("enter Address");
		String address=br.readLine();
		//we should transfer data from one layer to other layer via entity class object here FacebookUser is entity
		FacebookUser f=new FacebookUser();
		f.setName(name);
		f.setPassword(password);
		f.setEmail(email);
		f.setAddress(address);
		
		FacebookServiceInterface fs = new FacebookService();
		int i=fs.createProfile(f);
		
		if(i>0) {
		System.out.println("profile created successfully");
		}
	}

	public void viewProfile() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of person you want to view: ");
		String name = br.readLine();
		System.out.println();
		
		FacebookUser fb = new FacebookUser();
		fb.setName(name);
		
		FacebookServiceInterface fs = new FacebookService();
		FacebookUser i = fs.viewProfile(fb);
		/**while (i.next()) {
			String namee = i.getString("name");
			String mail = i.getString("email");
			String address = i.getString("address");
			
			System.out.println("The information of the viewed user is: " );
			System.out.println("Name: " + namee);
			System.out.println("Email: "+ mail);
			System.out.println("Address: "+ address);
		}**/
		if (i != null) {
		System.out.println("Name: "+ i.getName()+ "Address: " + i.getAddress() + "Email: "+ i.getEmail());
		}
		System.out.println("Profile viewed Successfully");
	}

	public void deleteProfile() throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of profile you want to delete: ");
		String naam = br.readLine();
		System.out.println();
		FacebookUser f = new FacebookUser();
		f.setName(naam);
		
		FacebookServiceInterface fs = new FacebookService();
		int i = fs.deleteProfile(f);
		
		if (i>0) {
		System.out.println("profile deleted successfully");
		}
	}

	public void editProfile() {
		System.out.println("profile edited");
	}

	public void searchProfile() {
		System.out.println("profile searched");
	}

	public void viewallProfile() {
		System.out.println("profile vv");
	}
}
