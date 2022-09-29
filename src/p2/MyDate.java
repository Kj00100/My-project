package p2;

public class MyDate
{
   private int dd,mm,yy;
   private String name;
   
   MyDate(){}
   
   MyDate( int d,int m, int y, String n)
   {
	   dd=d;
	   mm=m;
	   yy=y;
	   name =n;	   
   }
     public void setDd(int d)
    {
	   dd=d;
    }
     public void setMm(int m)
     {
  	   mm=m;
     }
     public void setYy(int y)
     {
  	   yy=y;
     }
     public void setName(String  n)
     {
  	   name=n;
     }
     public String toString()
     {
    	 return "name of person :" +name+" \n Date of issue : " +dd +"/"+mm+ "/"+yy;
     }
}