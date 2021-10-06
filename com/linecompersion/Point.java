package com.linecompersion;

import java.util.Scanner;

public class Point {
	
	public int x;
	public int y;
	public int x1;
	public int y1;
	
	public int sacanInput() {
		Scanner scannerobj = new Scanner(System.in);
		System.out.println("Enter the value of points");
		int userInput  = scannerobj.nextInt();
		return userInput;
	}

}
