package sona;
import java.util.Scanner;

public class exception {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of the student:");
    String name=sc.nextLine();
    System.out.println("enter the rollno of the student:");
    int rlno=sc.nextInt();
	System.out.println("***marks of students:***");
    System.out.println("Enter the marks of subject1:");
	int m1=sc.nextInt();
	System.out.println("Enter the marks of subject2:");
	int m2=sc.nextInt();
	System.out.println("Enter the marks of subject3:");
	int m3=sc.nextInt();
	
float percentage= (m1+m2+m3)/3;
	System.out.println("The percentage of marks:"+percentage);
	try {
		if(percentage <40) {
			throw new Exception("failed");
		}
		if(percentage >40){
			System.out.println("passed");}
		}
	catch(Exception e) {
	
   System.out.println(" " +e);
	}
}}
