package p2;

public class HealthCare {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		Doctor d = new Doctor();
		d.setDname("krushna");
		d.setDid(1919);
		
		Hospital h= new Hospital();
		h.setHname("sasun hospital");
		h.setHreg(123);
		h.setDoc(d);
		
		System.out.println(h);
	}

}
