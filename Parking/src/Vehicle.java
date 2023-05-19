import java.util.*; 

public class Vehicle {
	
	private String modelName;
	private int idNum;
	private String modelYear;
	private int width;
	private int depth;
	private String arrivalTime; // the arrival time of the vehicle to the garage
	private String departureTime; //the departure time of the vehicle to the garage
	private int slotId; // the id of the slot which the vehicle parked in it
	

	public void setIdNum(int id)
	{
		this.idNum=id;
	}
	public void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	public void setModelYear(String modelYear)
	{
		this.modelYear=modelYear;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public void setDepth(int depth)
	{
		this.depth=depth;
	}
	public void setId(int id)
	{
		this.idNum=id;
	}
	public void setArrivalTime(String aTime)
	{
		this.arrivalTime=aTime;
	}
	public void setDepartureTime(String dTime)
	{
		this.departureTime=dTime;
	}
	public void setSlotid(int slotId)
	{
		this.slotId=slotId;
	}
	
	public String getModelName()
	{
		return this.modelName;
	}
	
	public String getModelYear()
	{
		return this.modelYear;
	}
	
	public String getArrivalTime()
	{
		return this.arrivalTime;
	}
	public String getDepartureTime()
	{
		return this.departureTime; 
	}
	public int getIdNum()
	{
		return this.idNum; 
	}
	public int getWidth()
	{
		return this.width; 
	}
	public int getDepth()
	{
		return this.depth; 
	}
	public int getSlotId()
	{
		return this.slotId; 
	}
}
