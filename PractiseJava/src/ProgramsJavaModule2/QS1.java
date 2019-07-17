package ProgramsJavaModule2;

public class QS1 {
	void display()
	{
	 
	}
	public static void main(String[] args) {
		
		String[][] emp = new String[6][3]; // creating a 3-dim array with length 5
		
		emp[0][0] = "id";
		emp[0][1] = "name";
		emp[0][2] = "salary";
		emp[1][0] = " 00";
		emp[1][1] = "John ";
		emp[1][2] =	" 63000";	
		emp[2][0] = "002";
		emp[2][1] = "Clark ";
		emp[2][2] = " 55000";
		emp[3][0] = "003 ";
		emp[3][1] = "nancy";
		emp[3][2] = "50000";
		emp[4][0] = " 004";
		emp[4][1] = "Joe";
		emp[4][2] = "50000 ";
		emp[5][0] = " 005";
		emp[5][1] = "marry";
		emp[5][2] = "30000 ";
		
		
		for (int i =0; i<=5; i++) 
		{
			for (int j = 0; j<= 2; j++)
		{System.out.print(emp[i][j]+ " ");}
		
			System.out.println();
		}
	}

}
