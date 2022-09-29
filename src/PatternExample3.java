import java.util.Scanner;

public class PatternExample3 {

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
          System.out.println("enter your number ");
          int row = sc.nextInt();
          int  column=row-1;
          for(int i=row;i>1;i--)
          {   for (int j=1;j>column;j--)
          {
        	  System.out.print("_");
          }
	       for (int k=1; k<=i;k++)
		System.out.print(" * ");
	  } 
	}
}
