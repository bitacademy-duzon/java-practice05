package prob6;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(double w, double h) {
		super(w, h);
	}

	@Override
	public void resize(double rate) {
		width *= rate;
		height *= rate;
	}

	@Override
	double getArea() {
		return width * height;
	}

	@Override
	double getPerimeter() {
		return (width + height) * 2;
	}

}
