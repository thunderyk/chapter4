package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		//사각형 사각형 끼리
		//원 원끼리
		//삼각형 삼각형 끼리
		
		//사각형 관리
		RectList rList = new RectList();
		
		Rectangle r01 = new Rectangle(3, 9);
		Rectangle r02 = new Rectangle(10, 10);
		
		rList.add(r01);
		rList.add(r02);
		
		Rectangle r100 = rList.get(0);
		r100.draw();
		
		System.out.println(rList.size());
		
		//원 관리
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(10);
		Circle c02 = new Circle(5);
		
		cList.add(c01);
		cList.add(c02);
		
		cList.get(0).draw();
		
		System.out.println(cList.size());
		
		//삼각형 관리
		TriangleList tList = new TriangleList();
		Triangle t01 = new Triangle(2,10);
		Triangle t02 = new Triangle(4,8);
		Triangle t03 = new Triangle(20,12);
		
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		
		tList.get(2).draw();
		
		System.out.println(tList.size());
	}

}