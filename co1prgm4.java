//Read a matrix from the console and check whether it is symmetric or not. 
package sona;
import java.util.*;
public class symmetric {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int m,i,j,count=1;
		System.out.println("enter the size of the matrix");
		m=sc.nextInt();
		System.out.println("enter the elements of the matrix");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				a[i][j]=sc.nextInt();
				}
		}
		System.out.println("the elements in the matrix are:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				System.out.print(a[i][j]+"\t");
			}
			    System.out.println();
			}
		System.out.println("the transpose of the matrix is:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				b[i][j]=a[j][i];
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				if(a[i][j]!=b[i][j])
				{
					count++;
					break;
				}
			}
		}
			if(count==1)
			{
				System.out.println("the matrix is symmetric.");
			}
			else
			{
				System.out.println("the matrix is not symmetric.");
			}
	}

}
