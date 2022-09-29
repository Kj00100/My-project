package inheritance;

public class Exam 
{
   private int math,physics,chemistry ;
   private String examType;
   
   Exam()
   {
	   math=89;
	   physics =78;
	   chemistry=77;
	   examType="theory";
   }
   Exam(int m,int p,int c,String e)
   {
	   math=m;
	   physics=p;
	   chemistry=c;
	   examType=e;
   }
   public void showExamDetails()
   {
	   int total=math+physics+chemistry;
	   System.out.println("\n exam type = " +examType);
	   System.out.println("marks in math = " +math);
	   System.out.println("marks in physics = " +physics);
	   System.out.println("marks in chemistry = " +chemistry);
	   System.out.println(" total marks in exam = " +total);
   }
}
class PracticalExam extends Exam
{
	private String topic;
	private int outOfMarks = 300;
	
	 PracticalExam(){   topic = "chemistry practicle";outOfMarks = 300;}
	 
	 PracticalExam(String t, int m)
	 {
		 super(88,65,77,"Main exam");
		 topic=t;
		 outOfMarks=m;
	 }
	 public void practicleDetails()
	 {
		 System.out.println("\n topics for exam = " +topic);
		 System.out.println("out of marks in  exam = " +outOfMarks); 
		 showExamDetails();
	 }
	 public void conductPracticles()
	 {
		 System.out.println("\n 28/09/2022   first practicle exam \n 29/09/2022   second practicle exam");
	 }
	
	
}
