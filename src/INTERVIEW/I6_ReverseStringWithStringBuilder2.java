package INTERVIEW;

public class I6_ReverseStringWithStringBuilder2 {

	public static void main(String[] args) {
	
		
		StringBuilder sb = new StringBuilder("Siva Sankar Reddy ");
	
		System.out.println("String is = " + sb);
		StringBuilder sbr = sb.reverse();
		System.out.println("ReverseString useing StringBuffer == " + sbr);

	}

}
