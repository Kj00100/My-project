package p2;

public class Supplier 
{
  private String supName,supMobile;
  private int supId;
  Bill b;
  
  Supplier (){}
  
  Supplier ( String name, String mob, int id,Bill b)
  {
	  supName=name;
	  supMobile=mob;
	  supId=id;
	  this.b=b;
  }
  public void setSupName(String n)
  {
	  supName=n;
  }
  public void setSupMobile(String mob)
  {
	  supMobile=mob;
  }
  public void setSupId(int id)
  {
	  supId=id;
  }
  public void setB(Bill b)
  {
	  this.b=b;
  }
  public String toString()
  {
	  return b+" \n supplier name :"+supName+" \n supplier mobile : "+supMobile+ " \n supplier id : " +supId;
  }
}
