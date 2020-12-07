package com.javaex.ex01;

public class TriangleList {
	private Triangle[] tArray ;
	private int crtPos ;
	
	public TriangleList() {
		tArray = new Triangle[3];
		crtPos = 0;
	}
	
	public void add(Triangle t) {
		tArray[crtPos] = t;
		crtPos++;
		
	}
	
	public Triangle get(int index) {
		return tArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
