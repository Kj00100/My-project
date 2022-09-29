package p1.com;

import java.util.Scanner;

public class Shape
{
    public void  calculateArea(int length,int bredth)
    {
    	int areaOfrectangle = length*bredth;
    	System.out.println("area of rectangle is = " +areaOfrectangle);
    }
    public void calculateArea(float length,float heigth)
    {
    	float areaOfTriangle = (length*heigth)/2;
    	System.out.println("area of triangle is = " +areaOfTriangle);
    }
    public void calculateArea(double r)
    {
    	double areaOfCircle = 3.14*r*r;
    	System.out.println("area of circle is = " +areaOfCircle);
    }
    public void calculateArea(int side)
    {
    	int areaOfSquare = side*side;
    	System.out.println("area of square is = " +areaOfSquare);
    }
    
    public void main (String []a)
    {
    	Shape k = new Shape();
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("to find area of rectangle please enter length and bredth");
    	int l=sc.nextInt();
    	int b=sc.nextInt();
    	System.out.println("length is = " +l+ " \n and bredth is =  " +b);
    	k.calculateArea(l,b);
    	
    	System.out.println("to find area of triangle please enter length and height");
    	float len=sc.nextInt();
    	float h=sc.nextInt();
    	System.out.println("length is = " +len+ " \n and height is =  " +h);
    	k.calculateArea(len,h);
    	
    	
    	System.out.println("to find area of triangle please enter redious");
    	double r=sc.nextDouble();
    	System.out.println("redious is = " +r );
    	k.calculateArea(r);
    	
    	System.out.println("to find area of square please enter side");
        int s= sc.nextInt();
    	System.out.println("side is = " +s);
    	k.calculateArea(s);
    	
    	
    }
}
