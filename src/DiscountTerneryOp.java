import java.util.Scanner;

public class DiscountTerneryOp 
{

	public static void main(String[] args)
	{
		float totalcoast;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the price");
		float price= sc.nextInt();
		System.out.println(" enter the quantity");
		float quantity= sc.nextInt();
		
		
		
		totalcoast= price*quantity;
        
		String max= (totalcoast>=10000)? "congratulations you got 10% DISCOUNT" +totalcoast*10/100:
			        (totalcoast>=5000 && totalcoast<=9999)? "congratulations you got 5% DISCOUNT" +totalcoast*5/100:
			        	"otherwise no discount";
		
		
		    System.out.println(max);
	}

}
