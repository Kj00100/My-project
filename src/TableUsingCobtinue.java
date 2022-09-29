import java.util.Scanner;

public class TableUsingCobtinue {

	public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("your enterd number is =" +a);
        TableUsingCobtinue b = new TableUsingCobtinue();
        b.Table(a);
	     }


       public int Table(int a)
{     for(int i=1;i<=10;i++)
{     
	    if(i==6)
		continue;
	System.out.println(a*i);
}
return a;
}
       }