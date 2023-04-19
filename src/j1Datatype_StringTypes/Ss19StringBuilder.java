package j1Datatype_StringTypes;

public class Ss19StringBuilder {

	public static void main(String[] args) {

		String s,s1,s2;
 s="Siva ";
	
	StringBuilder sb=new StringBuilder(s);
	sb.reverse();
	StringBuilder sb1=new StringBuilder("siva");
	
	System.out.println("s Substring= "+sb);
	System.out.println("s1 Substring= "+sb1.append("Sankar"));
	System.out.println("s2 Substring= "+sb1.reverse());
	System.out.println("s1 Substring= "+sb1.length());
	
 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
