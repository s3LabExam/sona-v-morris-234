//Read 2 matrices from the console and  perform matrix addition. 
package sona;
import java.util.*;
public class matrix {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a[][]=new int[10][10];
		int b[][]=new int[10][10];
		int c[][]=new int[10][10];
		int m,n,i,j;
		System.out.println("enter the size of the first matrix");
		m=sc.nextInt();
		System.out.println("enter the elements of the first matrix");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				a[i][j]=sc.nextInt();
				}
		}
		System.out.println("the elements in the first matrix are:");
		for(i=0;i<m;i++){
			for(j=0;j<m;j++){
				System.out.print(a[i][j]+"\t");
			}
			    System.out.println();
			}
        System.out.println("enter the size of the second matrix");
		n=sc.nextInt();
		System.out.println("enter the elements of the second matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
			    {
				b[i][j]=sc.nextInt();
				}
		}
		System.out.println("the elements in the second matrix are:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(b[i][j]+"\t");
			}
			    System.out.println();
			}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
			    {
				c[i][j]=a[i][j]+b[i][j];
			    }
		}
		System.out.print("\nThe sum of the matrix a and b is:\n");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]+"\t");
			}
			    System.out.println();
			}
     }
}
