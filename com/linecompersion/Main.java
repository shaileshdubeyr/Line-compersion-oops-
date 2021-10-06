package com.linecompersion;

public class Main {
		static final int ZERO = 0; 
	public static void main(String[] args) {
		
		System.out.println("Eneter the first line points value");
		Point p1 = new Point();
		p1.x = p1.sacanInput();
		p1.y = p1.sacanInput();
		Point p2 = new Point();
		p2.x = p2.sacanInput();
		p2.y = p2.sacanInput();
		System.out.println("Enter the second line point value");
		Point p3 = new Point();
		p3.x = p3.sacanInput();
		p3.y = p3.sacanInput();
		Point p4 = new Point();
		p4.x = p4.sacanInput();
		p4.y = p4.sacanInput();

		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;

		Line l2 = new Line();
		l2.p3 = p3;
		l1.p4 = p4;
		float lineOne = l1.lineLength(p1.x, p1.y, p2.x, p2.y);
		float lineTwo = l1.lineLength(p3.x, p3.y, p4.x, p4.y);
		float checkValue = Float.compare(lineOne, lineTwo);
		if (checkValue == ZERO)
			System.out.println("Both line are equal");
		else
			System.out.println("Bot line are identical");
	}

}
