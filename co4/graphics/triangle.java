package graphics;

interface triangle1{
	public void area(int length,int breadth);
}
public class triangle implements triangle1 {
	public void area(int length,int breadth) {
		System.out.println("Area of triangle:"+0.5*length*breadth);
	}

}
