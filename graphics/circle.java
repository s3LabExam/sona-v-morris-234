package graphics;


interface circle1{
	public void area(int radius);
}

public class circle implements circle1{
	public void area(int radius) {
		System.out.println("Area of circle :"+3.14*radius*radius);
	}
}


