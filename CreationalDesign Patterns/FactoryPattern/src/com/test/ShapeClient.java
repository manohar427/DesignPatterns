package com.test;

public class ShapeClient {

	public static void main(String[] args) {
		Shape shape = null;
		shape = ShapeFactory.drawMyShape("circle");
		shape.drawShape();
		shape = ShapeFactory.drawMyShape("triangle");
		shape.drawShape();
	}
}
