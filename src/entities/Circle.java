package entities;

import entities.enums.Color;

public class Circle extends Shape{
	
	private static final Double PI = Math.PI;

	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return PI * Math.pow(this.radius, 2.0);
	}	
	
	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%.2f", this.area()));
		return sb.toString();
	}
}
