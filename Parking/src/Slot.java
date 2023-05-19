import java.util.*; 

public class Slot {
	private int id;
	private boolean free; // if free == true then this slot is free else this slot isn't free
	private int slotWidth;
	private int slotDepth;
	private static int id_maker=0;
	
	Slot(int slotWidth,int slotDepth)
	{
		id=++id_maker;
		free=true;
		this.slotWidth=slotWidth;
		this.slotDepth=slotDepth;
	}

	Slot()
	{
		id=++id_maker;
		free=true;
	}
	public void setSlotWidth(int _slotWidth)
	{
		this.slotWidth=_slotWidth;
	}
	public void setSlotDepth(int _slotDepth)
	{
		this.slotWidth=_slotDepth;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return this.id;
	}
	public int getSlotWidth()
	{
		return this.slotWidth;
	}
	public int getSlotDepth()
	{
		return this.slotDepth;
	}
	
	// if the garage is free return true other wise return false;
	public boolean State() 
	{
		return this.free;
	}
	public Slot  setOn()
	{
		free=true;
		
		//the point of returning the main object in the off,on functions is because we will need this in parkInApproach() 
		return this;
	}
	public Slot setOff()
	{
		free=false;
		return this;
	}
}
