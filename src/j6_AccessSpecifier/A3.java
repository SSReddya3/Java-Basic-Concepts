package j6_AccessSpecifier;

public class A3 
{
	protected void msg()
	{
		System.out.println("Hello protected AccessSpecifier");
	}  
}




class B extends A3{  
	  public static void main(String args[]){  
	   B obj = new B();  
	   obj.msg();  
	  }  
	}  



