import java.util.Scanner;

public class MaximumNumberTerneryOP
    {

	public static void main(String[] args)
	 {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of nmu1,num2,num3 respectiveliy");
		int num1= sc.nextInt();
		int  num2=sc.nextInt();
		int num3=sc.nextInt();
		
		String max= (num1>num2 && num1>num3)? num1+ "is greter" :(num2>num3)? num2+ " is greter":num3+ " is greter";
		
		System.out.println(max);
		
			
		
				
		
	}

}
