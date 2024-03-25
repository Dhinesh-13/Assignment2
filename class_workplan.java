package trak;

public class class_workplan extends class_user {
	
	public static void running(int a)
	{
		 //class_login o=new class_login();
		System.out.print("Distance (meter) : ");
		int k=in.nextInt();
		System.out.print("Duration (in minutes) ");
		int m=in.nextInt();
		Float weigth1=weigth.get(a);
		int Calories_Burned=(int) ((k/1000)*(m/60)*weigth1);
		System.out.println("Calories burned is : "+Calories_Burned);
		int d=running.get(a);
		int d1=colories.get(a)+Calories_Burned;
		colories.set(a,d1);
		running.set(a,++d);
		class_login.home(user.get(a), password.get(a));
	}
	public static void Cycling(int a)
	{
		System.out.print("Distance (in kilometers or miles) : ");
		int k=in.nextInt();
		System.out.print("Duration (in minutes) ");
		int m=in.nextInt();
		int Calories_Burned=(int) (k*(m/60)*a);
		System.out.println("Calories burned is : "+Calories_Burned);
		int d=cycling.get(a);
		cycling.set(a,++d);
		int d1=colories.get(a)+Calories_Burned;
		colories.set(a,d1);

		class_login.home(user.get(a), password.get(a));
	}
	public static void Swimming(int a)
	{
		System.out.print("Duration (in minutes) ");
		int m=in.nextInt();
		int Calories_Burned=(int) ((m/60)*a);
		System.out.println("Calories burned is : "+Calories_Burned);
		int d=Swimming.get(a);
		Swimming.set(a,++d);
		int d1=colories.get(a)+Calories_Burned;
		colories.set(a,d1);

		class_login.home(user.get(a), password.get(a));
	}
	public static void Walking(int a)
	{
		
		System.out.print("Distance (in meter) : ");
		int k=in.nextInt();
		System.out.print("Duration (in minutes) ");
		int m=in.nextInt();
		int Calories_Burned=(int) ((k/1000)*(m/60)*a);
		System.out.println("Calories burned is : "+Calories_Burned);
		int d=walking.get(a);
		walking.set(a,++d);
		int d1=colories.get(a)+Calories_Burned;
		colories.set(a,d1);

		class_login.home(user.get(a), password.get(a));
	}
	
}
