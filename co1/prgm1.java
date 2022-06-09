//Define a class ‘product’ with data members pcode, pname and price
//Create 3 objects of the class and find the product having the lowest price. 
package sona;
import java.util.*;
public class product {
	int pcode,price;
	String pname;
	    void read(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the pcode:");
		pcode=sc.nextInt();
		sc.nextLine();
		System.out.println("\nenter the pname:");
		pname=sc.nextLine();
		System.out.println("\nenter the price:");
		price=sc.nextInt();
		
	    }
	    void display(){
	    	System.out.println("\nThe pcode is:"+pcode);
	    	System.out.println("\nThe pname is:"+pname);
	    	System.out.println("\nThe price is:"+price);
	    	}
		
		public static void main(String[] args){
			product ob1=new product();
			ob1.read();
			ob1.display();
			product ob2=new product();
			ob2.read();
			ob2.display();
			product ob3=new product();
			ob3.read();
			ob3.display();
			if((ob1.price<ob2.price)&&(ob1.price<ob3.price))
			{
				System.out.println("\nThe product" +ob1.pname+ "has the lowest price");
			}
			if((ob2.price<ob1.price)&&(ob2.price<ob3.price))
			{
				System.out.println("\nThe product" +ob2.pname+ "has the lowest price");
			}
			else{
				System.out.println("\nThe product" +ob3.pname+ "has the lowest price");
			}
}
}

