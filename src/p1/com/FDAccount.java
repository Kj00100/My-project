package p1.com;

public class FDAccount
{  
	long accNumber;
	 float balance;
	 String accHolderName;
	 static float intrest = 4;
	 static long  accno=123456L;
   FDAccount()
   {
	    accNumber=++accno;
	    balance = 5689.6f;
	    accHolderName= "krushna";
	    
	   
	}
   FDAccount(float bal,String name)
   {
	   accNumber=++accno;
	   balance = bal;
	   accHolderName = name;
   }
   public static void changeIntrest(float f)
   {
	   intrest=f;
   }
   public void showDetails()
   {
	   System.out.println("account holder name is = " +accHolderName);
	   System.out.println("account number  is = " +accNumber);
	   System.out.println("account balance is = " +balance);
	   System.out.println("intrest applied is = " +intrest);
   }
}
 class SavAccount
 {
 long accNumber;
 float balance;
 String accHolderName;
 static long accno=1233;
 SavAccount()
{
    accNumber=++accno;
    balance = 8000.6f;
    accHolderName= "mohit";
   
}
 SavAccount(float bal,String name)
{
   accNumber=++accno;
   balance = bal;
   accHolderName = name;
}
public void showDetails()
{
   System.out.println("account holder name is = " +accHolderName);
   System.out.println("account number  is = " +accNumber);
   System.out.println("account balance is = " +balance);
}
}
class RecurAccount
{
	long accNumber;
    float balance;
    String accHolderName;
    static long accno=1235;
    RecurAccount()
{
   accNumber=accno++;
   balance = 5689.6f;
   accHolderName= "krushna";
  
}
    RecurAccount(float bal,String name)
{
  accNumber=accno++;
  balance = bal;
  accHolderName = name;
}
public void showDetails()
{
  System.out.println("account holder name is = " +accHolderName);
  System.out.println("account number  is = " +accNumber);
  System.out.println("account balance is = " +balance);
}
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 