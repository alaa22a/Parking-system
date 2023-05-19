import java.util.*; 

// Boundary class (for input ,output, and any dealings with the user)
public class Relation {
 
 
	public void displaySlots()
	{
		for(Slot s : DataBase.slots)
		{
			if(s.State()){
				System.out.println("The slot ID: "+s.getId()+"\nThe slot depth: "+s.getSlotDepth()+"\nThe slot width: "+s.getSlotWidth());
				System.out.println();
			}
		}
	}
	
	//function that takes a vehicle as a parameter and fill this vehicle information from the user
	public void inputVehicle(Vehicle vehicle)
	{
		System.out.println("Enter the information of the vehicle like that (model name,model year, vehilce identification number, depth, width) :");
		Scanner inp=new Scanner(System.in);
		vehicle.setModelName(inp.next());
		vehicle.setModelYear(inp.next());
		vehicle.setIdNum(inp.nextInt());
		vehicle.setDepth(inp.nextInt());
		vehicle.setWidth(inp.nextInt());
		System.out.println("Thank You.");
	}
	public void setConfiguration()
	{
		System.out.println("1- first come first served approach \n2- fit approach..\n choose an approach: ");
		while(true){
			
		Scanner inp=new Scanner(System.in);
		int choice=inp.nextInt();
		if(choice==1)
		{
			DataBase.configurationType=1; break;
		}
		else if(choice==2)
		{
			DataBase.configurationType=2; break;
		}
		else
		{
			System.out.println("InValid option!,please choose 1 or 2: ");
		}
		
		}
	}
	public void nonAvailableSlots()
	{
		System.out.println("Sorry! there is no available slots right know.");
	}
	public void noSuchDimensions()
	{
		System.out.println("Sorry! there is no avalibale slot with such dimensions.");
	}
}
