package p1.com;

public class Bank 
{  
	public void accessAccount(FDAccount f)
	{
		 
		System.out.println("\n the details of FD account is =" );
		f.showDetails();
	}
    public void accessAccount(SavAccount s)
    {
    	System.out.println(" \n the details of saving account is = " );
    	s.showDetails();
    }
    public void accessAccount( RecurAccount r)
    {
    	System.out.println("\n the details of reccursiv account is =");
    	r.showDetails();
    }
	public static void main(String[] args) 
	{
        Bank b = new Bank();
        FDAccount f = new FDAccount(4563,"pavan");
        FDAccount f1 = new FDAccount();
        b.accessAccount(f);
        b.accessAccount(f1);
        
        FDAccount.changeIntrest(2.6f);
        
        b.accessAccount(f);
        b.accessAccount(f1);
       
        SavAccount s = new SavAccount();
        SavAccount s1 = new SavAccount(6897.77f,"vishal");
        b.accessAccount(s);
        b.accessAccount(s1);
        
        RecurAccount r = new RecurAccount();
        RecurAccount r1 = new RecurAccount(99999f,"kj");
        b.accessAccount(r);
        b.accessAccount(r1);
	}

}
