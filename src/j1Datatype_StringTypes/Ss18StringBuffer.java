package j1Datatype_StringTypes;

public class Ss18StringBuffer {

	public static void main(String[] args) {

		String s,s1,s2;
 s="Siva ";
	
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	StringBuffer sb1=new StringBuffer("siva");
	
	System.out.println("s Substring= "+sb);
	System.out.println("s1 Substring= "+sb1.append("Sankar"));
	System.out.println("s2 Substring= "+sb1.reverse());
	System.out.println("s1 Substring= "+sb1.length());
	
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
