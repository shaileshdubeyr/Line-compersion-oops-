package com.linecompersion;

public class Line {
	Point p1;
	Point p2;
	Point p3;
	Point p4;
	
	public float lineLength(int x, int y, int x1, int y1) {
		float value = (float) Math.sqrt(Math.pow( (x - y) , 2 ) + Math.pow ( (x1 - y1 ), 2));
		return value;
	}

}
