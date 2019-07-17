package ProgramsJavaModule3;

import java.util.Scanner;

//Write classes to hold Account, SB-Account and Current-Account details. 
//Here implement the concept of inheritance.]
//The common properties of the account are Account number, name and amount.
//Specifics of SB account is 4% interest to be paid per month.Implement the run-time polymorphism by creating base class variable 
//and derived class object.  Ask the user for which type of account to be created then create the corresponding account 
//(Note: Use scanner class).Implement function overriding by having deposit and withdraw functions
//and perform the required action accordingly.
//Ensure base class can’t be instantiated. (Note: Abstract keyword can be used).2.
abstract class Account{
	double intrst = .04;
	int accnum = 213130;
	String name = "Jb Singh";
	float amount = 34000;
	abstract void interest();
	abstract void withdraw();
	abstract void deposit();
	
 }
 class SBAccount extends Account
 {
	
	void interest()
	{
		double interest = intrst* amount; //interest per month
		System.out.println("the amount for interest pm is: "+ interest);
		double balance = amount- interest;
		System.out.println("the balance amount after deduction is :"+ balance); 
	}
	
	}
class CurretAccountDetails extends SBAccount{
	double deposit;
	void deposit()
	{
		System.out.println("Deposit Money");
		
	}
	double withdraw;
	void withdraw()
	{
		System.out.println("Withdraw Money");
		
	}
	
}
public class QS1 {

	public static void main(String[] args) {
		Account acc; 
		acc = new SBAccount(); // creating base class variable and derived class object
		acc = new CurretAccountDetails();
		acc.withdraw();
		acc.deposit();
		acc.interest();
		
		/*
		 * SBAccount sbacc = new SBAccount(); // creating object of base class1
		 * sbacc.interest();
		 * 
		 * CurretAccountDetails cad = new CurretAccountDetails(); // creating object for
		 * base class 2
		 * 
		 * cad.interest();
		 */
		 
		Scanner  obj1 = new Scanner(System.in); //creating object of a scanner class
		
		System.out.println("enter type of account");
		
		String acctype = obj1.nextLine(); // to use method nextline() for entering Strings
		System.out.println("the account type is: "+ acctype);
		 
	}

}
