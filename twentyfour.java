package com.firstjava;

import java.util.Scanner;

public class twentyfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount");
		int P=sc.nextInt();
		System.out.println("Enter intreset rate in decimals");
		double i=sc.nextDouble();
		System.out.println("Enter time period  ");
		int t=sc.nextInt();
		 double amount = P * Math.pow((1 +i) , t);
		 System.out.println("total amount is "+ amount);
	}

}













