package com.firstjava;
import java.util.Scanner;
import java.util.*;
public abstract class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int percentage =sc.nextInt();
		//int percentage = 90;
System.out.print("You have recieved");
if(percentage> 74) {System.out.print(" Division");}
else {
	if (percentage >59 && percentage < 75) {System.out.println(" first division");}
	else {
		if (percentage >49 && percentage < 60) {System.out.println(" second division");
	}else {
		if (percentage >39 && percentage < 50) {System.out.println(" third division");
	}else System.out.println(" Failed");
	}
	}
}}}
