package p2;

public class Fruite 
{
   String name;
   int content;
   Vitamin v;
   
   Fruite () {}
   
   Fruite (String n,int con , Vitamin k)
   {
	   name = n;
	   content = con ;
	   v=k;
	  
   }
   
   public String toString()
   {
	   return " \n name of fruite is : "+name+" \n  content in fruite is : "+content+" \n  vitamin  in fruite details details : "+v;
   }
}
