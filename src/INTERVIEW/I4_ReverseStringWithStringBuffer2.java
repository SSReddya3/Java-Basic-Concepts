package INTERVIEW;

public class I4_ReverseStringWithStringBuffer2 {

	public static void main(String[] args) {
		String s = "Siva Sankar Reddy ";
		

		System.out.println("String is = " + s);
		StringBuffer sb = new StringBuffer(s);
	
		System.out.println("ReverseString useing StringBuffer == " + sb.reverse());

	}

}
