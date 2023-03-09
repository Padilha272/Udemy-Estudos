package entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
	
	private double width;
	private double height;
	
	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width*height;
	}
	
	

}
