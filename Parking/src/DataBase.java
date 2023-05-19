import java.util.*; 

// the entity class where we will save all the data(arrays.. etc)
public class DataBase {
	// we only need one instance from the data so all the attributes will be static
	
	static public int configurationType=1; // if configuration==1 ->first slot approach else ->best fit approach
	
	// this list will represent the garage we have
	static public List<Slot>slots=new ArrayList<Slot>();
	
	// list of the parked vehicle in our garage
	static public List<Vehicle>vehicles=new ArrayList<Vehicle>();
	
	
	// this function is just to test the park in and display function it wont be included in the system 
	void makeData()
	{
		// create 5 object as the garage slots to test
		Slot obj1=new Slot(4,3);
		Slot obj2=new Slot(7,2);
		Slot obj3=new Slot(3,4);
		Slot obj4=new Slot(2,2);
		Slot obj5=new Slot(14,100);
		slots.add(obj1);
		slots.add(obj2);
		slots.add(obj3);
		slots.add(obj4);
		slots.add(obj5);	
	}
}
