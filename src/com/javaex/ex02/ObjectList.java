package com.javaex.ex02;

public class ObjectList {
	private Object[] oArray ;
	private int crtPos ;
	
	public ObjectList() {
		oArray = new Object[3];
		crtPos = 0;
	}
	
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
		
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public int size() {
		return crtPos;
	}
}
