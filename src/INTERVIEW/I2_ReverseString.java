package INTERVIEW;

public class I2_ReverseString {

	public static void main(String[] args) {
		String s = "Siva Sankar Reddy Ankireddypalle";
		String temp="";
		
		System.out.println("String is ="+ s);

		//How to reverse a string
		for(int i=s.length()-1;i>=0;i--) 
		{
			//temp = temp + s.charAt(i);
			
			temp +=  s.charAt(i);
			
		}
		
		System.out.println("Reversed String is ="+ temp);


	}

}
