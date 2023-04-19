package j3ConditionalStatements;

public class A3_if_Else_if_Condition {

	public static void main(String[] args) {

		int monthNumber = 2;

		if(monthNumber >= 1 && monthNumber <= 4) 
			{
			System.out.println("Winter Season.");
			}
		else if(monthNumber >= 5 && monthNumber <= 8)
		 {
			System.out.println("Summer Season.");
		 }
		else if(monthNumber >= 9 && monthNumber <= 12)
		 {
			System.out.println("Spring Season.");
		 }
		else
		{
			System.out.println("Invalid Month Number. Please Enter the Month Number between : 1 - 12.");
	
		}
		

	}

}
