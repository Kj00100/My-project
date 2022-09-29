package inheritance;

public class Result {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		PracticalExam p = new PracticalExam();
	
		p.practicleDetails();
	
		PracticalExam p1 = new PracticalExam ("physics practicle",100);
		p1.practicleDetails();
		p1.conductPracticles();
	}

}
