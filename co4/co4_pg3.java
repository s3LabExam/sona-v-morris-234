package sona;
import java.util.*;
class userexeption extends Exception{
	public userexeption(String msg) {
	super(msg);
}
}

public class co4_pg3 {
	public static void main(String[] args)
	{
		String username="sona";
		String passwd="sona@123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you username:");
		String usr=sc.nextLine();
		System.out.println("Enter you Password:");
		String pas=sc.nextLine();
		int length=usr.length();
		try {
			if(length>6) 
			{
				System.out.println("username must be grater than 6 charcters");
			}
			
			else if(usr.equals(username)&&pas.equals(passwd))
			{
	          System.out.println("Permission granted");
			}
			else
			{
				throw new userexeption("invalid username and password");
			}
		}
		catch(userexeption e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Final statement executed");
		}
		
	}

}

