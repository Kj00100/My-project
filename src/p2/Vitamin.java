package p2;

public class Vitamin
{
    String name,useToBody;
   int vContent;
   
   Vitamin(){}
   
   Vitamin(String n,String use,int cen)
   {
	   name=n;
	   useToBody=use;
	   vContent=cen;
	   
   }
   public String toString()
   {
	   return "vitamin name is : "+name+" \n is use to body for "+useToBody+ " \n vitamin content is "+vContent;
   }
}