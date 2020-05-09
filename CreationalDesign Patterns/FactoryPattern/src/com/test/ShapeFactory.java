package com.test;

public class ShapeFactory {

	public static Shape drawMyShape(String shape) {
		if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("triangle")) {
			return new Triangle();
		} else {
			return null;
		}
	}
}