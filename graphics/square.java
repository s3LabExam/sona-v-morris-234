package graphics;

interface square1{
	public void area(int side);
}

public class square implements square1{
	public void area(int side) {
		System.out.println("Area of square :"+side*side);
	}

}
