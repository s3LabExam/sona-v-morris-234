//Perform string manipulations  
package sona;
import java.util.*;
public class stringmanipulation {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter a string:");
		str1=sc.nextLine();
		int length=str1.length();
		System.out.println("The length of a entered string is "+length);
		System.out.println("Enter another string:");
		str2=sc.nextLine();
		String str3=str1.concat(str2);
		System.out.println("String after concatination operation is: "+str3);
		int str4=str1.compareTo(str2);
		if(str4>0)
		System.out.println("String are equal and the value is "+str4);
		else if(str4<0)
			System.out.println("The first string is lessthan second string and the value is "+str4);
		else
			System.out.println("The first string is lessthan second string and the value is "+str4);
		String str5=str2.replace('w','h');
		System.out.println("After the replacement operation  the new string is:"+str5);
		System.out.println("The uppercase  form of given string is: "+str1.toUpperCase());
		System.out.println("The lowercase form of given string is: "+str1.toLowerCase());
		char ch=str1.charAt(0);
		System.out.println("The result of charat function is:"+ch);
		char[] chars=str1.toCharArray();
		System.out.println("The character array of a given  string is ");
		for(int i= 0;i<chars.length;i++)
		{
		System.out.println(chars[i]);
		}
		System.out.println("The result of a equals method is "+str1.equals(str2));
}
}
