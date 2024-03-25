package trak;

public class class_createaccount extends class_user 
{
	public static void create()
	{
		System.out.print("Enter your UserId : ");
		String user1=in.next();
		int k=0;
		for(int i=0;i<user.size();i++)
		{
			if(user1.equals(user.get(i)))
			{
				k=1;
				System.err.println("User ID already exit");
				
				create();
			}
		}
		if(k==0)
		{
			user.add(user1);
			System.out.println();
			System.out.print("Enter the user name : ");
			String username=in.next();
			int v=1;
			goalid.add(user1+v);
			v++;
			int j=0;
			running.add(j);
			Swimming.add(j);
			cycling.add(j);
			walking.add(j);
			colories.add(j);
			name.add(username);
			System.out.println();
			System.out.print("Enter the user age : ");
			int age1=in.nextInt();
			age.add(age1);
			System.out.println();
			System.out.print("Enter the user height in (cm) : ");
			float heightt=in.nextFloat();
			height.add(heightt);
			System.out.println();
			System.out.print("Enter the user weigtht in (kg): ");
			float weigthtt=in.nextFloat();
			weigth.add(weigthtt);
			System.out.println();
			//System.out.print("Enter your Password : ");
			password();
			
		}		
	}
	public static void password()
	{
		System.out.print("Enter your Password : ");
		String pass=in.next();
		System.out.println();
		System.out.print("Enter your conform Password : ");
		String word=in.next();
		System.out.println();
		if(pass.equals(word))
		{			
			password.add(pass);
			System.out.println("--------------------Your Profile Update--------------");
			enter();
		}
		else
		{
			System.err.println("The given password has diffrent try again");
			password();
		}
	}
}
