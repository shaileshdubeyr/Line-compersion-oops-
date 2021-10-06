package com.bl.lineCompersion;


public class Main {
		
	public static void main(String[] args) {
		
		Point p1 = new Point();
		p1.x= p1.sacanInput();
		p1.y = p1.sacanInput();
		Point p2 = new Point();
		p2.x = p2.sacanInput();
		p2.y = p2.sacanInput();
		
		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;
		System.out.println("the length is "+l1.lineLength());
		 
	}

}
