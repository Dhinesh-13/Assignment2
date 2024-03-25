package trak;

public class class_activity extends class_user {
	public  void activity(int a)
	{
		System.out.println("1.Running:");
		System.out.println("2.Cycling");
		System.out.println("3.Swimming");
		System.out.println("4.Walking");
		int k=in.nextInt();
		class_workplan o=new class_workplan();
		switch(k)
		{
			case 1:
				System.out.println("Set your workout plan");
				o.running(a);
				break;
			case 2:
				System.out.println("Set your workout plan");
				o.Cycling(a);
				break;
			case 3:
				System.out.println("Set your workout plan");
				o.Swimming(a);
				break;
			case 4:
				System.out.println("Set your workout plan");
				o.Walking(a);;
				break;
			default :
				System.out.println("Invalid selection try again");
				activity(a);
				break;
		}
	}
}
