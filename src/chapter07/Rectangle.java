package chapter07;

public class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "도형의 종류: 직사각형, 둘레: " + perimeter() + ", 넓이: " + area();
	}

	@Override
	public double area() {
		return width * height;
	}

	
	@Override
	public double perimeter() {
		return (width + height) * 2;
	}
}
