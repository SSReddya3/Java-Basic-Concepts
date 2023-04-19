package j7_OPPS;

class san{

	public static  int siva(int a)
	{
	return a+=5;
	}
public static  int siva(int a,int b)
{
return a+b;

	
}
public static  int siva(int a,int b,int c) 
{

return a+b+c;

	
}
public static  int siva(int a,int b,int c,int d) 
{

return a+b+c+d;

}
public static  int siva(int a,int b,int c,int d,int f) 
{

return a+b+c+d+f;

}
}

public class A2_Polymorphism_methodOverloading  
{

	public static void main(String[] args) {
		
		System.out.println(san.siva(10));  
		System.out.println(san.siva(20,25));  
		System.out.println(san.siva(30,33,39));  
		System.out.println(san.siva(40,42,44,46));  
		System.out.println(san.siva(50,52,54,56,58));  
		
		
		
		
	}

	
}
