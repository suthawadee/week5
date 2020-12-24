class Final{
	int i = 10;
}


public class Variable101 {
	int data = 50;
	String name = "Mark";
	
	public static void main(String[]arg)
	{
		int x = 5;
		Variable101 obj = new Variable101();
		Final obj2 = new Final();
		
		System.out.println(x);
		System.out.println(obj.data);
		System.out.println(obj.name);
		System.out.println(Variable101.name);
		System.out.println(obj2.i);
	}
}
