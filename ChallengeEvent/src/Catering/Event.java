package Catering;

public class Event {
	private String type;
	private String date;
	private int NumOfGuests;
	private String EventNum;
	public Event(String type)
	{
		this.type = type;
		setEventNum(type);
	}
	public Event(String type,String date)
	{
		this.type = type;
		this.date = date;
		setEventNum(type);
	}
	public Event(String type,String date,int NumOfGuests)
	{
		this.type = type;
		this.date = date;
		this.NumOfGuests = NumOfGuests;
		setEventNum(type);
	}
public String getType()
{
	return type;
}
public void setType()
{
	this.type = type;
}
public String getDate()
{
	return date;
}
public void setDate()
{
	this.date = date;
}
public int getGuests()
{
	return NumOfGuests;
}
public void setGuests()
{
	this.NumOfGuests = NumOfGuests;
}
public int getTotal()
{
	return NumOfGuests * 40;
}
public String setEventNum(String type)
{
	   String EventNum ="";
	   if (type == "Wedding")
	   {
		   EventNum = "W";
	   }
	   else if(type == "Birthday")
	   {
		   EventNum = "B";
	   }
	   else if(type == "Shower")
	   {
		   EventNum = "S";
	   }
	   return EventNum;
}
public void printEvent()
{
	System.out.println("Type of Event: "+ type + "\nDate of Event: " + date + "\nNumber of guests: " + NumOfGuests + "\nEvent number: "+ EventNum + "\nTotal amount: " + getTotal());

}
}