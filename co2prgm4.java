//Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ information and Search for an employee given eNo, using the concept of Array of Objects. 
package sona;
import java.util.*;
public class employee {
	int eno,esalary,n;
	String ename;
	Scanner sc= new Scanner(System.in);
	void read()
	{
		System.out.println("enter the employee number:");
		eno=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the employee name:");
		ename=sc.nextLine();
		System.out.println("enter the employee salary:");
		esalary=sc.nextInt();
	}
	void display()
	{
		System.out.println("the employee number is:"+eno+" name is:"+ename+"salary is:"+esalary);
	}
	public static void main(String[] args){
		int flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of employees:");
		int n=sc.nextInt();
		employee e[]=new employee [n];
		for (int i=0;i<n;i++)
		{
			e[i]=new employee();
			e[i].read();
		}
		System.out.println("the details of the employees are:");
		for (int i=0;i<n;i++)
		{
			e[i].display();
		}
		System.out.println("enter the employee number to be searched:");
		int m=sc.nextInt();
		for (int i=0;i<n;i++)
		{
			if (e[i].eno==m)
			{
				flag=1;
				System.out.println("the employee number is:"+e[i].eno+" name is:"+e[i].ename+"salary is:"+e[i].esalary);
				
			}
		}
		if(flag==0)
		{
			System.out.println("not found");
		}
	}
}
