package ProgramsJavaModule2;
//2. Write another function display() withEmployee ID array and Employee name array as arguments.
//(Note: here we are using concept of function overloading). 
//This function will display the content of the 2 arrays in the followingformat.ID

public class QS2 {

	static String EmpId[] = new String[6];
	static String[] EmpName = new String[2];
	public static void display( String EmpId[], String EmpName[])
	{
		EmpId[0] = "ID";
		EmpId[1] = "00";
		EmpId[2] = "01";
		EmpId[3] = "02";
		EmpId[4] = "03";
		EmpId[5] =	"04";	
		EmpName[0] = "Name";	
		EmpName[1] = "john"	;
		//EmpName[2] =	"marie";
			
		
	}
	public static void main(String[] args) 
	{
		 QS2 obj1 = new QS2();
	
		/*
		 * obj1.display("id", "name"); obj1.display("00", "John"); obj1.display("o1",
		 * "joe"); obj1.display("02", "mary"); obj1.display("003", "nanacy");
		 * obj1.display("04", "Clark")
		 */;
		 obj1.display(EmpId, EmpName);
		System.out.println(obj1);
		
	}

}
