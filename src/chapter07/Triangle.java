package chapter07;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public String toString() {

		return "도형의 종류: 정삼각형, 둘레: " + perimeter() + ", 넓이: " + area();
	}

	@Override
	public double perimeter() {
		return side * 3;
	}

	@Override
	public double area() {
		return side * side * Math.sqrt(3.0) / 4;
	}

}
