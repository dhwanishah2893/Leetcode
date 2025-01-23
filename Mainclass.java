package com.leetcode.string;

public class Mainclass {
	
	public static void main(String args[]) {
		
		Parantheses parantheses = new Parantheses();
		
		boolean status =parantheses.isValid("[]");
		
		System.out.println("Valid Parantheses" + status);
	}

}
