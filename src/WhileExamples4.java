import java.util.Scanner;
public class WhileExamples4 {

	public static void main(String[] args) 
	{    Scanner sc= new Scanner(System.in);
	     int no = sc.nextInt(); 
	     int i=sc.nextInt();
	    System.out.println("main is started  ::  ");
	    WhileExamples4 A= new WhileExamples4();
	     A.evenNo(no,i);
	     A.evenNo(no, i);
	     System.out.println("its completed ,, Thankyou!!!");
    }
    
	public void evenNo(int no, int i)

    { 
		while (i<=no/2) 
    {
    	if (i%no==0)
    	{ no++;
    	break;
    	}
    	no++;
    }
    	if (no==0)
    	{
    		System.out.println("given no. is prime");
    	}
    	else 
    		System.out.println("given no. is not prime");
    	
    	     
    
 
     
           
        
        	
        }
        
}
    

