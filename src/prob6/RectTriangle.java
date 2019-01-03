package prob6;

public class RectTriangle extends Shape {

	public RectTriangle(double w, double h) {
		super(w, h);
	}
	
	@Override
	double getArea() {
		return width * height * 0.5;
	}

	@Override
	double getPerimeter() {
		double x = Math.pow(width, 2) + Math.pow(height, 2);
		return width + height + Math.sqrt(x);
	}

}
