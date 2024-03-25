package trak;
public class class_goals extends class_user {
		public static void goal(String a,String b)
		{
			for(int i=0;i<user.size();i++)
			{
				if(a.equals(user.get(i)))
				{
					if(b.equals(password.get(i)))
					{
						System.out.println("Username                                Calories");
						System.out.print(name.get(i)+"                        ");
						//System.out.print(running.get(i)+"                        ");
						System.out.print(colories.get(i)+"                                ");
						System.out.println();
						 class_login.home(user.get(i), password.get(i));
					}
				}
			}
			
			
		}
}
