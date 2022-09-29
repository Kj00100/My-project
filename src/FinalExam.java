
public class FinalExam 
{  
	Semester s = new Semester();
	
	public void result( Semester sem1, Semester sem2 )
	
	{   
       int total1 = sem1.phy + sem2.phy;
       System.out.println("marks obtain in physics = " +total1);
       
       int total2 = sem1.chem + sem2.chem;
       System.out.println("marks obtain in chemistry = " +total2);
       
       int total3 = sem1.math + sem2.math;
       System.out.println("marks obtain in math =  " +total3 + "\n");
       
       float per = total1 + total2 + total3;
       float percentage = (per *100)/600;
      
       System.out.println(" percentage occured  = " +percentage);
       
	}
       
      public static void main (String[] s)
      {    int a ,b ,c;
    	  Semester p1 = new Semester();
    	  p1.acceptMarks( 80, 70, 55);
    	  p1.showMarks();
    	  
    	  Semester p2 = new Semester();
    	  p2.acceptMarks(66, 99, 67);
    	  p2.showMarks();
    	  
    	  FinalExam k = new FinalExam ();
    	  
    	  k. result(p1, p2) ;
      }
}