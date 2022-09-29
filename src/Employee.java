
public class Employee 
{
    int empid, salary;
    String name ;
    
    public void acceptDetails(int e, int s,String n)
    {
    	empid=e;
    	salary=s;
    	name=n;
    	
    }
    public void showDetails()
    {
    	System.out.println("\n  employee id is = " +empid);
    	System.out.println("  salary is = " +salary);
    	System.out.println("  name is = " +name + "\n");
    	
    }
}
