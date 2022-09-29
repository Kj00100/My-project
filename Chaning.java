public class Chaning
{
    int rollNum,studentId,marksInPhysics,marksInChemistry,marksInMath;
    float percentage;
    String studentName;
  
     Chaning()
     {    this(76f);
      rollNum =12;
      studentId =444;
      marksInPhysics =70;
      marksInChemistry =59;
      marksInMath =66;
       studentName ="krushna";
    
     }
     Chaning(int num,int id,int p,int c,int m,String n,float per)
     {
         rollNum = num;
      studentId = id;
      marksInPhysics = p;
      marksInChemistry = c;
      marksInMath = m;
       studentName = n;
        percentage = per;
     }
     Chaning(int a,int  b,int c,int d)
     {  
        this(45,56.45f,"vishal")
         marksInPhysics = a;
         marksInChemistry = b;
         marksInMath = c;
         studentId = d;
     }
     Chaning (float k)
     {
        percentage = k;
     }
     Chaning (int x,float y, String z)
     {
         rollNum = x;
         percentage = y;
         studentName = z;
     }
     public void showDetails()
     {
        System.out.println("student id is = "+studentId);
        System.out.println("student roll number is = "+rollNum);
        System.out.println("marks in physics  is = "+marksInPhysics);
        System.out.println("marks in physics is = "+marksInChemistry);
        System.out.println("marks in math is = "+marksInMath);
        System.out.println("student id is = "+percentage);
         System.out.println(" name of student is = "+studentName);
     }
     public static void main (String []a)
     {
         Chaning ch = new  Chaning();
          Chaning ch1 = new  Chaning(11,23,44,67,32,"mohit",88.5f);
           Chaning ch2 = new  Chaning(99,77,88);
         
          ch.showDetails();
          ch1.showDetails();
          ch2.showDetails();
          
     }






}