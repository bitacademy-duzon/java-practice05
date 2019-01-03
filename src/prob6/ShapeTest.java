package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();

		list.add(new Rectangle(5, 6));
		list.add(new RectTriangle(6, 2));

		for (Shape shape : list) {
			System.out.println("area:" + shape.getArea());
			System.out.println("perimeter:" + shape.getPerimeter());

			if (shape instanceof Resizeable) {
				Resizeable resizable = (Resizeable) shape;
				resizable.resize(0.5);
				System.out.println("new area:" + shape.getArea());
				System.out.println("new perimeter:" + shape.getPerimeter());
			}
		}
	}
}

abstract class Shape {

	public abstract double getArea();

	public abstract double getPerimeter();

}

interface Resizeable {

	public abstract void resize(double s);

}

class RectTriangle extends Shape {

	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width * height)*0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	

}

class Rectangle extends Shape implements Resizeable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}



	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
		
	}
	
	
	
}