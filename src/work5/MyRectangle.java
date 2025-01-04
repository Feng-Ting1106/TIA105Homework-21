package work5;

public class MyRectangle {
	double width;
	double depth;
	public MyRectangle() {
		super();
	}
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	void setWidth(double width){
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth = depth;
	}
	double getArea() {
		return depth * width;
	}
}
