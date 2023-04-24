package tw.org.iii.tutor;



public class Jay31 {

	public static void main(String[] args) {
		RecShape s1 = new RecShape(10, 3);
		Circle s2 = new Circle(4);
		System.out.println(m1(s1));
		System.out.println(m1(s2));

	}
	static String m1(Shape shape) {
		if(shape instanceof RecShape) {
			
			System.out.println(((RecShape)shape).isSquare()?"OK":"XX");
		}else if(shape instanceof Circle) { //參考:https://www.runoob.com/java/method-instanceof.html
			System.out.println(((Circle)shape).getDiameter());
		}
		return shape.length()+":"+shape.area();
	}

}

interface Shape {// 訂規格
	double length();// interface永遠是抽象方法

	double area();//public abstract

}

class RecShape implements Shape {
	int w,h;
	public RecShape(int w,int h) {
		this.w = w;this.h = h;
	} 
	public double length() {//public
		return (w+h)*2;
	}

	public double area() {
		return w*h;
	}

	public boolean isSquare() {return w==h;}
}
	class Circle implements Shape{
		double r;
		Circle(double r){
			this.r= r;
		}
		public double length(){return r*2*Math.PI;}
		public double area() {return r*r*Math.PI;}
		public double getDiameter() {return r*2;}
	} 

