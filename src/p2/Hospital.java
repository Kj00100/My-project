package p2;

public class Hospital 
{
  private String hName;
  private int hReg;
  Doctor doc;
  Hospital(){}
  
  Hospital( String n, int reg,Doctor d)
  {
	  hName = n;
	  hReg = reg;
	  doc = d;
  }
  public void setHname(String n)
  {
	  hName = n;
  }
  public void setHreg(int r)
  {
	  hReg = r;
  }
  public void setDoc(Doctor d)
  {
	  doc = d;
  }
  public String toString()
  {
	  return " \n Hospital name is  : " +hName+" \n hospital registrstion id : " +hReg+ "\n  Dr. details " +doc;
  }
}
