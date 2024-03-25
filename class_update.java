package trak;

public class class_update extends class_user {
	public static void update(String a,String b)
	{
		boolean flage=false;
		for(int i=0;i<user.size();i++)
		{
			if(a.equals(user.get(i))   )
			{
				if(b.equals(password.get(i)))
				{
					flage=true;
					System.out.println("1.Update your height in (cm)");
					System.out.println("2.Update your weigtht in (kg)");
					int n=in.nextInt();
					class_login o=new class_login();
					switch(n)
					{
						case 1:
							System.out.println("Enter your height in (cm)");
							float k=in.nextFloat();
							height.set(i, k);
							System.out.println("--------------complete your Update--------------");
							o.home(a,b);
							break;
						case 2:
							System.out.println("Enter your weigtht in (kg)");
							float k1=in.nextFloat();
							weigth.set(i, k1);
							System.out.println("--------------complete your Update--------------");
							o.home(a,b);
							break;
						default :
							System.out.println("Invalid Select");
							o.home(a,b);
					}
				}
				}
		}
		if(flage==false)
		{
			
		}
	}
}
