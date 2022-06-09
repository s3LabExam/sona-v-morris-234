package graphics;

interface rectangle1{
	public void area(int length,int breadth);
}
public class rectangle implements rectangle1 {
	public void area(int length,int breadth) {
		System.out.println("Area of rectangle :"+length*breadth);
	}
}
