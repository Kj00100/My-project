import java.util.Scanner;

public class PercentageByProcedural {
	
	public int percentage(int P,int M ,int C) 
	  {
          Scanner sc = new Scanner(System.in);
          int totalmarks =(( P + M + C)*100)/100;
        
          System.out.println("total marks :" + totalmarks);
          float Percentage = totalmarks*100/300;
          System.out.println( +Percentage);
          
          return totalmarks;
	  }
	

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter maths marks :");
		int M= sc.nextInt();
		System.out.println("enter physics marks :");
		int P= sc.nextInt();
		System.out.println("enter chemistry marks :");
		int C= sc.nextInt();
		
		PercentageByProcedural K= new PercentageByProcedural();
		
		 int sum= K.percentage(  P,  M,  C);
		 
		 System.out.println("completed");
	}

}
