package trak;
 
import java.util.ArrayList;
import java.util.Scanner;

public class class_user {
	 static Scanner in=new Scanner(System.in);
	 static ArrayList<String>user=new ArrayList<String>();
	 static protected ArrayList<String>password=new ArrayList<String>();
	 static protected ArrayList<String>name=new ArrayList<String>();
	 static protected ArrayList<String>goalid=new ArrayList<String>();
	 static protected ArrayList<Integer>running=new ArrayList<>();
	 static protected ArrayList<Integer>walking=new ArrayList<>();
	 static protected ArrayList<Integer>cycling=new ArrayList<>();
	 static protected ArrayList<Integer>Swimming=new ArrayList<>();
	 static ArrayList<Integer>age=new ArrayList<Integer>();
	 static ArrayList<Integer>colories=new ArrayList<Integer>();
	 static ArrayList<Float>height=new ArrayList<>();
	 static ArrayList<Float>weigth=new ArrayList<>();
	public static void main(String[]args) {
		
		System.out.println("Welcome");
		System.out.println();
		enter();
		
	}
	public static void enter()
	{
		
		System.out.println("1.Login");
		System.out.println("2.Create Account");
		System.out.println("3.Exit");
		System.out.println();
		int n=in.nextInt();
		
		class_login o=new class_login();
		class_exit o2=new class_exit();
		class_createaccount o1=new class_createaccount();
		
		switch(n)
		{
			case 1:
				o.up();
				break;
			case 2:
				o1.create();
				break;
			default :
				o2.exit();
				break;
				
		}
	}

}
