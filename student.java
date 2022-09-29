class Student 
{   
      int rollNumber,physics,chemistry,math;
      String name;
   
      public void displayRecords()
      {  
         System.out.println("your physics marks is =" +physics);
         System.out.println("your chemistry marks is =" +chemistry);
         System.out.println("your math marks is =" +math);
         System.out.println("student name is =" +name);
         System.out.println("student roll number is =" +rollNumber);
      }

      public void acceptRecords(int p,int c,int m,int roll, String n )
      {    
          System.out.println("student details");
          rollNumber = roll;
          physics = p;
          chemistry = c;
          math = m;
          name = n;


      }
 
      public void percentage()
      {  
         int total=physics+chemistry+math;

         float percentage = (total*100)/300;

         System.out.println("your percentage is " +percentage);
      }
        


}