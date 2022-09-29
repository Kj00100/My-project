package p2;

public class Order {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		 MyDate m= new  MyDate();
		 m.setDd(27);
		 m.setMm(9);
		 m.setYy(2022);
		 m.setName("krushna");
		 
		 Bill b= new Bill();
		 b.setBillAmount(300000);
		 b.setBillDiscount(45);
		 b.setBillId(1234);
	     b.setD(m);
	     
	     Supplier s = new Supplier();
	     s.setB(b);
	     s.setSupId(98765);
	     s.setSupMobile(" 895854785");
	     s.setSupName("vijay agency");
	     
	     Item i = new Item();
	     i.setItemId(56789);
	     i.setItemName("Redmi note 8");
	     i.setS(s);
	     
	     System.out.println(i);
	     
	}
}
