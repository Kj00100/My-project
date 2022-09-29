import java.util.Scanner;

public class Company 
{
	public void showEmpWithHighSalary(Employee e1,Employee e2)
	{
		if (e1.salary>e2.salary)
			System.out.println(  e1.name+" has highest salary " +e1.salary);
		else 
			System.out.println(e2.name+ "has highest salary " +e2.salary);
		
	}
	
	
	
	
	

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" \n enter employee id = ");
	int e = sc.nextInt();
	
	System.out.println("  enter salary  = ");
	int s = sc.nextInt();
	
	System.out.println(" enter employee name  = ");
	String n = sc.nextLine();
	
	System.out.println(" \n enter 2nd  employee id = ");
	int e1 = sc.nextInt();
	
	System.out.println("  enter 2nd  salary  = ");
	int s1 = sc.nextInt();
	
	System.out.println(" enter 2nd  employee name  = ");
	String n1 = sc.nextLine();
	
	Employee emp1= new Employee();
	emp1.acceptDetails(e,s,n);
	emp1.showDetails();
	
	Employee emp2 = new Employee();
	emp2.acceptDetails(e1,s1,n1);
	emp2.showDetails();
	
	Company k = new Company ();
	k.showEmpWithHighSalary(emp1,emp2);
	}

}
