package p1.com;

public class Laptop1
{
    private String BrandName,os;
    private int cost;
    
    public Laptop1()
    {
    	  BrandName = "dell";
    	  os = "Microsoft Window";
    	  cost = 50000;
    	
    }
    public Laptop1(String ba,String os, int c)
    {    this("mac",70000 );
    	BrandName=ba;
    	 this. os=os;
    	 cost = c;
    	 
    }
    public Laptop1(String name,int price)
    {
    	this.os=os;
    
    }
    public void showDetails()
    {
    	System.out.println("Brand name is =" +this.BrandName);
    	System.out.println("name of os is =" +this.os);
    	System.out.println("cost of laptop is =" +this.cost);
    	
    }
}
