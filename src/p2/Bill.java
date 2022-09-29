package p2;

public class Bill
{
  private int billId;
  private float billAmount;
  private int billDiscount;
  MyDate d;
  
  Bill (){}
  
  Bill(int id, int dis, float amu, MyDate d)
  {
	  billId =id;
	  billDiscount = dis;
	  billAmount = amu;
	  this.d=d;
  }
  public void setBillId(int id)
  {
	  billId= id;
  }
  public void setBillAmount(float amu)
  {
	  billAmount= amu;
  }
  public void setBillDiscount(int dis)
  {
	  billDiscount= dis;
  }
  public void setD(MyDate d)
  {
	  this.d= d;
  }
  public String toString ()
  {
	  return d+ "\n Bill id : "+billId+" \n Bill amount : " +billAmount+" \n discount : "+billDiscount;
  }
}
