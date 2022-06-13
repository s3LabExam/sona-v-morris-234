package sona;
import java.util.*;

public class students {
	int id,n;
	String name,branch;
	void read(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student id:");
     id=sc.nextInt();
	System.out.println("enter student name:");
     name=sc.nextLine();
     sc.nextLine();
    System.out.println("enter branch of study:");
    branch=sc.nextLine();
	}
	void display(){
		System.out.println("student id:"+id);
		System.out.println("student name:"+name);
		System.out.println("branch of study:"+branch);
	}
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("enter the no: of students");
	    n=sc.nextInt();
		students e[]=new students[n];
		for(int i=0;i<n;i++) {
			e[i]=new students();
			e[i].read();
		}
		System.out.println("student details are :\n");
		for(int i=0;i<n;i++) {
			e[i].display();
			System.out.print("\n");
		}
		
}
}
