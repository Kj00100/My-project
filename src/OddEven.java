import java.util.Scanner;

public class OddEven 
{

	public static void main(String[] args) 
	{
		Scanner number = new Scanner(System.in);
		
		int num;
		System.out.println("Enter the number");
		
		 num = number.nextInt();
		 
		if(num % 2 == 0)
		System.out.println("number is even");
		
		
		else
			System.out.println("number is odd");

	}

}
