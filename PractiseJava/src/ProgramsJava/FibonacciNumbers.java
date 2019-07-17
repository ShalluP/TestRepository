package ProgramsJava;

public class FibonacciNumbers {

	public static void main(String[] args) { // 0 1 1 2 3 5 8
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int i;
		int count = 10;

		System.out.print(n1 + " " + n2); // printed first 2 numbers

		/*
		 * for (i= 2; i< count; i++) // for loop is for the count to run till 10; //
		 * starts from 2, because already 2 nos have been printed.
		 * 
		 * { n3 = n1 + n2; // n3= 0+1=1
		 * 
		 * System.out.print(" "+ n3); // printing 1 again n1 = n2; n2 = n3; //moving n2
		 * to n1 and n3 to n2
		 * 
		 * }
		 */
		/*
		 * do { n3 = n1 + n2; // n3= 0+1=1 System.out.print(" "+ n3); // printing 1
		 * again n1 = n2; n2 = n3; // moving n2 to n1 and n3 to n2 }
		 * 
		 * 
		 * while(n1<=10) ;
		 */

		while (n1 <= 13)
		{
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1 = n2;
			n2 = n3;
		}
	}

}
