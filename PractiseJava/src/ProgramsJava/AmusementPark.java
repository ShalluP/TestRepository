package ProgramsJava;

public class AmusementPark {

	public static void main(String[] args) {
		
		int price = 400;
		
		System.out.println("the price of ticket per person is : "+ price);
		
		int num = 8;
		
			if (num >= 10)
			
				{
				double rabat = (.1* price);
				System.out.println("the discount on 10 tickets is : "+rabat);
				
				 double total = num*( price - rabat);
				 System.out.println("the bill with discount is : "+total);
				}
			else
			{
				double total = num* price;
				System.out.println("the total balance without discount: "+ total);
			}
		
		
		
		
	}

}
