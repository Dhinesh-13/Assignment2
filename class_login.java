package trak;

public class class_login extends class_user {
	public static void up()
	{
		System.out.print("Enter your username : ");
		String username=in.next();
		System.out.print("Enter your password : ");
		String password1=in.next();
		home(username,password1);
	}
	public static void home(String username,String password1)
	{
		class_goals o=new class_goals();
		int k=0;
		class_update o1=new class_update();
		class_activity o2=new class_activity();
		for(int i=0;i<user.size();i++)
		{
			if(username.equals(user.get(i)) && password1.equals(password.get(i)))
			{ 
				System.out.println("------------------Welcome Back "+username+" -------------------");
				System.out.println("1.Update your profile");
				System.out.println("2.Activity");
				System.out.println("3.Goals");
				System.out.println("4.Friends status");
				System.out.println("5.Exit");
				int n=in.nextInt();
				float a= weigth.get(i);
				switch(n)
				{
					case 1:
						o1.update(username, password1);
						break;
					case 2:
						o2.activity(i);
						break;
					case 3:
						o.goal(username, password1);;
						break;
					case 4:
						class_friends.viwe();
						break;
					default :
						
						class_user.enter();
				}
				k=1;
				
		}
		}
		if(k==0)
		{
			
			
			System.err.println("Invalid use Id Password");
			System.out.println();
			enter();
			
		}
		}
		
	}


