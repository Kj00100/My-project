package inheritance;

  public class Employee 
{
private int empId,empSalary;
private String empName,empJoiningDate;

Employee()
{
	empId=234;
	empSalary=30000;
	empName="pavan";
	empJoiningDate="30/09/22";
}
Employee(int id, int salary,String name,String date)
{
	empId=id;
	empSalary=salary;
	empName=name;
	empJoiningDate=date;
}
public void showDeyails()
{
	System.out.println("\n empoyee name is  = " +empName);
	System.out.println(" empoyee id = " +empId);
	  System.out.println("empoyee salary is = " +empSalary);
	  System.out.println("empoyee joining date = " +empJoiningDate);
}
protected void joiningProcess(String doc1,String workExp,String doc2)
{
	  System.out.println("\n empoyee submiteed the document = " +doc1);
	  System.out.println("empoyee submiteed the work experience = " +workExp);
	  System.out.println("empoyee submiteed the 2nd document = " +doc2);
}
protected void calculateSalary(int bonus)
{
	empSalary += bonus;
	System.out.println("employee salary is = " +empSalary);
}
}


class Ceo extends Employee
{
	private int empId,empSalary;
	private String empName,empJoiningDate;

	Ceo()
	{
		empId=634;
		empSalary=550000;
		empName="mohit";
		empJoiningDate="31/09/22";
	}
	Ceo(int id, int salary,String name,String date)
	{
		empId=id;
		empSalary=salary;
		empName=name;
		empJoiningDate=date;
	}
	public void showDeyails()
	{
		System.out.println("\n ceo name is  = " +empName);
		System.out.println(" ceo id = " +empId);
		  System.out.println("ceo salary is = " +empSalary);
		  System.out.println("ceo joining date = " +empJoiningDate);
	}
	protected void joiningProcess(String doc1,String workExp,String doc2)
	{
		  System.out.println("\n ceo submiteed the document = " +doc1);
		  System.out.println("ceo submiteed the work experience = " +workExp);
		  System.out.println("ceo submiteed the 2nd document = " +doc2);
	}
    protected void calculateSalary(int bonus)
	{
		int incentives = 3;
		empSalary = bonus*incentives;
		System.out.println(" ceo salary is = " +empSalary);
	}
}


class Hr extends Employee
{
	private int empId,empSalary;
	private String empName,empJoiningDate;

	Hr()
	{
		empId=934;
		empSalary=30000;
		empName="krushna";
		empJoiningDate="2/10/22";
	}
	Hr(int id, int salary,String name,String date)
	{
		empId=id;
		empSalary=salary;
		empName=name;
		empJoiningDate=date;
	}
	
	public void showDeyails()
	{
		System.out.println("\n HR name is  = " +empName);
		System.out.println(" HR id = " +empId);
		  System.out.println("HR salary is = " +empSalary);
		  System.out.println("HR joining date = " +empJoiningDate);
	}
	protected void joiningProcess(String doc1,String workExp,String doc2)
	{
		  System.out.println("\n hr submiteed the document = " +doc1);
		  System.out.println("hr submiteed the work experience = " +workExp);
		  System.out.println("hr submiteed the 2nd document = " +doc2);
	}
	  protected void calculateSalary(int bonus)
	{
		int incentives = 3;
		int bonus1= 3000;
		empSalary = bonus*incentives+bonus1;
		System.out.println("\n Hr salary is = " +empSalary);
	}
}


class Perol 
{
	public static void main(String [] s)
	{
		Employee e = new Ceo();
		e.calculateSalary(5000);
		e.showDeyails();
		
		Employee e1 = new Hr();
		e1.calculateSalary(6000);
		
		Employee e3 = new Employee();
		e3.joiningProcess("pan card","5 years ", "aadhar card");
		
		Employee e4 = new Employee();
		e4.showDeyails();
		
	}
}