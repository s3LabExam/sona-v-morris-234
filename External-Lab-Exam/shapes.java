package sona;
import java.util.*;
public class shapes {
	    
	    void area(double radius)
	    {
	        System.out.println("area of the circle is " + (3.14*radius*radius));
	    }

	    void area(int l,int b)
	    {
	        System.out.println("area of the rectangle is " + (l*b));
	    }

	    void area(int length)
	    {
	        System.out.println("area of the square is " + (length*length));
	    }
	    void area(float length,float breadth,float height)
	    {
	    	System.out.println("area of triangle is:" + (length*breadth*height));
	    }
	    public static void main(String[] args){
	    	Scanner sc=new Scanner(System.in);
	    	shapes obj = new shapes();
	        obj.area(6.0);
	        obj.area(10,20);
	        obj.area(10);
	        obj.area(4,5,6);
	}
	
}
