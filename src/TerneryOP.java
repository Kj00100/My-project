import java.util.Scanner;

public class TerneryOP
{

	public static void main(String[] args)
	
	{
		int n = 5;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your value " );
		int r= sc.nextInt();
		 
		String msg = r%5==0? r+ "Its divisibal by 5": r+" Its not divisibal by 5";
		
			System.out.println(msg)	;
			
                
			
				

	}

}
