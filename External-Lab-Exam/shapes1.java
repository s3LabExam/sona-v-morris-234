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
	    	int l,b,s,h,r;
	    	System.out.println("enter the length:");
	    	l=sc.nextInt();
	    	System.out.println("enter the breadth:");
	    	b=sc.nextInt();
	    	System.out.println("enter the side:");
	    	s=sc.nextInt();
	    	System.out.println("enter the height:");
	    	h=sc.nextInt();
	    	System.out.println("enter the radius:");
	    	r=sc.nextInt();
	    	shapes obj = new shapes();
	        obj.area(r);
	        obj.area(l,b);
	        obj.area(s);
	        obj.area(l,b,h);
	}
	
}
