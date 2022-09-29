  
  import java.util.Scanner;

public class Semester {
Scanner sc = new Scanner(System.in);
	int phy,chem,math;
		float per;
		 
		public void acceptMarks(int p,int c, int m)
		{    
			System.out.println(" enter marks here \n");
			
			 phy =p;

			 chem =c;
			
             math = m;
            
            
        }
        public void showMarks()
        {  
        	System.out.println("enter physics marks = " +phy);
        	System.out.println("enterd chemistry marks = " +chem);
        	 System.out.println("enterd math marks = " +math + "\n");
        }


}
