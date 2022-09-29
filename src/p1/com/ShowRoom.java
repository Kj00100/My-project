package p1.com;

public class ShowRoom {

	public static void main(String[] args)
    {
		System.out.println("1st laptop details :");
		Laptop1 l=new Laptop1();
		l.showDetails();
	    
		System.out.println("\n 2nd laptop details :");
		Laptop1 l1= new Laptop1("hp","linux",80000);
		l1.showDetails();
		
		System.out.println(" \n 3rd laptop details");
		Laptop1 l2= new Laptop1("mac", 55555);
		l2.showDetails();
		

	}

}
