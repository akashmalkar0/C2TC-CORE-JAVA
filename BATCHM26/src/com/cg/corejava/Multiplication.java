package com.cg.corejava;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 1 number");
		int num1=obj.nextInt();
		System.out.println("Enter 2 number");
		int num2=obj.nextInt();
		int num3=num1*num2;
		System.out.println("Multiplication of number is "+ num3);

	}

}
