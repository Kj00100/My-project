package p2;

public class Doctor
{
   private int dId;
   private String dName;
   
   Doctor () {}
   
   Doctor (int id ,String n)
   {
	   dId=id;
	   dName =n;
   }
   
  public void setDid(int id)
  {
	  dId = id;
  }
  public void setDname(String n)
  {
	  dName = n;
  }
  public String toString()
  {
	  return "Dr.Id : " +dId+" \n Dr. name : " +dName;
  }
}
