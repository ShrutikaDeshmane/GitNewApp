package com.dpk.reverse;

import java.util.Scanner;

public class StringReversing {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter ur Name");
	String name=sc.next();
	
	long leng=name.length();
	String reverse="";
	long i;
	for(i=leng-1; i>=0; i--)
	{
		reverse=reverse+name.charAt((int) i);
	}
	
	System.out.println("Reverse of "+name+" is "+reverse);
	
	
}
}
