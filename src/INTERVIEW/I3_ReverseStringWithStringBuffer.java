package INTERVIEW;

public class I3_ReverseStringWithStringBuffer {

	public static void main(String[] args) {
		//String s = "Siva Sankar Reddy ";
		
		StringBuffer sb = new StringBuffer("Siva Sankar Reddy");
		
		System.out.println("String is = " + sb);
		
	StringBuffer sbr=sb.reverse();
		System.out.println("ReverseString useing StringBuffer == " + sbr);

	}

}
