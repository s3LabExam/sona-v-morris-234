//Add complex numbers 
package sona;
import java.util.*;
public class complex {
	int real,image,image2,image1,real1,real2;;
    Scanner sc= new Scanner(System.in);
	    void read()
		{
		System.out.println("enter the real part of the first complex number:");
		real1=sc.nextInt();
		System.out.println("enter the imaginary part of the first complex number:");
		image1=sc.nextInt();
		System.out.println("enter the real part of the second complex number:");
		real2=sc.nextInt();
		System.out.println("enter the imaginary part of the second complex number:");
		image2=sc.nextInt();
		}
		void display()
		{
			System.out.println("the first complex number is:"+real1+"+"+image1+"i");
			System.out.println("the second complex number is:"+real2+"+"+image2+"i");
			System.out.println("the sum of the two complex number is:"+real+"+"+image+"i");
		}
		void sum(){
			real=real1+real2;
			image=image1+image2;
			
		}
		public static void main(String[] args){
		complex ob=new complex();
			ob.read();
			ob.sum();
			ob.display();
			}

}
