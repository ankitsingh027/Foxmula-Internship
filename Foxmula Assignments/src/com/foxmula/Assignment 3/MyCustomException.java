package com.foxmula.assignment3;

import java.util.*;

class TestException extends Exception{
	
	public TestException(String string) {
		super(string);
	}
	
}

public class MyCustomException extends Exception {

	public static Boolean prime(int num) {
	int flag = 0;
	for(int i = 2; i <= num / 2; i++) {
		if(num % i == 0) {
			flag = 1;
			break;
		}
	}
	
	if(num == 1) {
		System.out.println("neither prime nor composite");
	}else if(flag == 0) return true;
	
   return false;
}

public static Boolean odd(int num) {
	if(num % 2 != 0) return true;
	
	return false;
}

static void Helper(int num) throws TestException{
	 Boolean condition1 = prime(num);
	 Boolean condition2 = odd(num);
	 
	 if(condition1 && condition2) {
		 throw new TestException("Number is invalid");
	 }
	
	
}
public static void main(String[] args) {
	int num;
	Scanner scan = new Scanner(System.in);
	num = scan.nextInt();
	
	try {
		Helper(num);
	}catch (Exception e) {
		System.out.println("Exception Occured: " +e);
	}
}
}
