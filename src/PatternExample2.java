import java.util.Scanner;

public class PatternExample2 {

	public static void main(String[] args) {
		System.out.println("enter number = ");
		
	
		
		Scanner sc= new Scanner(System.in);
		 int row=sc.nextInt();
		 int row1=row-1;
		
		for(int i=1;i<=row;i++)
		{  
			for( int j=1;j<=row1;j++)
			{
				System.out.print("  ");
			System.out.println();
			  
			for( int k=1; k<=j;k++)
				System.out.print(" * ");
			}
		}
         
	}

}
