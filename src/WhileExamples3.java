
public class WhileExamples3 {

	
	public void cnt()
	{ int cnt1= 10;
	while(cnt1<=67)
	{ if (cnt1%2==0)
		System.out.println("even no. =" +cnt1);
	     cnt1= cnt1+1;
	}
	
	}
	
	
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("main method is started");
		WhileExamples3 A= new WhileExamples3();
	   int x;
	   A.cnt();
	   
	   
	   

	}

}
