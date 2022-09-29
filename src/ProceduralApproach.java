import java.util.Scanner;

public class ProceduralApproach

{
	public void areaOfCircle()
	{ 
		Scanner sc= new Scanner(System.in);
		System.out.println("enter radious :" );
		int r= sc.nextInt();
		float a = 3.14f;
		float A=  a*r*r;
		System.out.println("Radious of cirlce :" +A);
		
	}
	public void rectangle() 
	{ 
		Scanner sc= new Scanner(System.in);
	
	System.out.println("enter length and bredth :"  );
	int l= sc.nextInt();
	int b = sc.nextInt();
	int R=  l*b;
	System.out.println("Area of rectangle :" +R);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main is started ");
		ProceduralApproach b= new ProceduralApproach();
		 b.areaOfCircle();
		 b. rectangle();
		
		 System.out.println("completed");
	}

}
