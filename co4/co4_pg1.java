package sona;
import java.util.*;
import graphics.rectangle;
import graphics.circle;
import graphics.square;
import graphics.triangle;


public class co4_pg1 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int side,length,breadth,radius;
		
		rectangle rectangle=new rectangle();
		circle circle=new circle();
		square square=new square();
		triangle triangle=new triangle();
		
		System.out.println("enter the length of the rectangle:");
		length=sc.nextInt();
		System.out.println("enter the breadth of the rectangle:");
		breadth=sc.nextInt();
		rectangle.area(length,breadth);
		System.out.println("enter the radius of the circle:");
		radius=sc.nextInt();
		circle.area(radius);
		System.out.println("enter the side of the square:");
		side=sc.nextInt();
		square.area(side);
		System.out.println("enter the length of the triangle:");
		length=sc.nextInt();
		System.out.println("enter the breadth of the triangle:");
		length=sc.nextInt();
		triangle.area(length,breadth);
	}

}
