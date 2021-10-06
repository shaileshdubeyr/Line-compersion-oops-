package com.bl.lineCompersion;

import java.util.Scanner;

public class Point {
	public int x;
	public int y;
	
	public int sacanInput() {
		Scanner scannerobj = new Scanner(System.in);
		System.out.println("Enter the value of points");
		int userInput  = scannerobj.nextInt();
		return userInput;
	}
}
