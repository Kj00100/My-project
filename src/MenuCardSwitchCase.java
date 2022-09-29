import java.util.Scanner;

public class MenuCardSwitchCase
{

	public static void main(String[] args) 
	{
	     int pizza=230;
	     int misalPav= 70;
	     int vadapav= 30;
	     Scanner sc= new Scanner(System.in);
	      
	     System.out.println("enter your order");
	     int order = sc.nextInt();
	     
	     System.out.println("enter your quantity");
	     int quantity= sc.nextInt();
	      
	     int totalcoast= order*quantity;
	      
	     System.out.println("paid coast" +totalcoast);
	     

	}

}
  
