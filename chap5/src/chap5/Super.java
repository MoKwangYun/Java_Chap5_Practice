package chap5;

class Shape{
	public void paint() {
		draw();
		
	}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}


class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}


class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}	
}
public class Super {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.paint();
	}
}
