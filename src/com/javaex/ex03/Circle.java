package com.javaex.ex03;

public class Circle {

	private double radius;

	public Circle() {

	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius="+ radius + "]";
	}

	public void draw() {
		System.out.println("원 (반지름=" + radius+")을 그렸습니다.");
	}
}
