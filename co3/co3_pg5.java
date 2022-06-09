package sona;

public class co3_pg5 implements Student,Sports{
	
	void display(){	
		System.out.println("Name: "+name+"\nMark for Java: "+java+"\nMark for Sports: "+sm);
	}
	
	public static void main(String[] args){
		co3_pg5 obj=new co3_pg5();
		obj.display();
			
	}
}

interface Student{	
	String name="Anju";
	int java=100;
	
}


interface Sports{
	int sm=30;
	

}
