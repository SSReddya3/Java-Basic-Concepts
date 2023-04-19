package INTERVIEW;

public class I_RemoveDuplicateElements {

	public static void main(String[] args) {
		 
		          String s = "aabb12233.@ccff";    
			       
		        int count; 
		  	  char[] inp = s.toCharArray();

		  	            
		        System.out.print("After removeing Duplicate char in a given string = ");     
		        for(int i = 0; i < s.length(); i++) 
		        {    
		            count = 1;    
		            for(int j = i+1; j < s.length(); j++) 
		            {   
		            	  
							
						
		            if (inp[i] == inp[j])  
		                {    
		                    count++;    
		                    
		                }    
		            }    
		                
		            //Displays the duplicate char if count is greater than 1    
		            if(count > 1 )    
		                System.out.print(inp[i]);    
		        }    
		    }    

	}


