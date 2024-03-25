package trak;

public class class_friends extends class_user {
	public static void viwe()
	{
		System.out.println("Enter the userId for your friends");
		String a=in.next();
		for(int i=0;i<user.size();i++)
		{
			if(a.equals(user.get(i)))
				{
					System.out.println("Name                      Calories achived");
					System.out.print(name.get(i)+"                    ");
					System.out.print(colories.get(i));
				}
		}
	}
}
