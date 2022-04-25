//Search an element in an array. 
package sona;
import java.util.*;
public class array {
	public static void main(String[] args){
		
		int a[]=new int[10];
		int m,i,s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array:");
		m=sc.nextInt();
		System.out.println("enter the elements of the array:");
		for(i=0;i<m;i++){
			a[i]=sc.nextInt();
			}
		System.out.println("enter the elements to be searched:");
		s=sc.nextInt();
		for(i=0;i<m;i++){
			if(a[i]==s)
			{
				int index=i;
				System.out.println("the element is found and the value is"+s+"and its position is"+i);
				break;
			}
		}
		if(a[i]!=s){
			System.out.println("the element is not found ");
		}
	}

}
