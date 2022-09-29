package p2;

public class Item 
{
  private String itemName;
  private int itemId;
  Supplier s;
  
  Item() {}
  
  Item( String name, int id,Supplier s )
  {
	  itemName = name;
	  itemId=id;
	  this.s= s;
	  
  }
  public void setItemName(String n)
  {
	  itemName =n;
  }
  public void setItemId(int id)
  {
	  itemId =id;
  }
  public void setS(Supplier s)
  
  {
	  this.s =s;
  }
 public String toString()
 {
	 return s+" \n item name : "+itemName+" \n item id : "+itemId;
 }
  
   
}
