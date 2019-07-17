package ProgramsJava;

public class CallByValue {

	static void increase(int p) {
		p = p+1;
	}
	public static void main(String[] args)
	{
		int a=6;
		increase(6);
		System.out.println(a);
		
		
		  
	}

}