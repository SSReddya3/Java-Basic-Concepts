package INTERVIEW;

public class I5_ReverseStringWithStringBuilder {

	public static void main(String[] args) {
		String s = "Siva Sankar Reddy ";
		

		System.out.println("String is = " + s);
		
		StringBuilder sb = new StringBuilder(s);
	
		System.out.println("Sb is = " + sb);
		
		System.out.println("ReverseString useing StringBuffer == " + sb.reverse());

	}

}
