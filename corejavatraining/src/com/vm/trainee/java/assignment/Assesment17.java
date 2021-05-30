package com.vm.trainee.java.assignment;

import java.util.Scanner;

public class Assesment17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		System.out.println("Enter a string");
		Scanner input = new Scanner(System.in);
		s=input.nextLine();
		s= s.replace("d", "f");
		System.out.println(s);

	}

}
