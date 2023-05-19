import java.util.*; 

public class Main {

	public static void main(String[] args) {
		// the testing is like the following
		// display all available slots using display function.
		// park in once 
		// and display the slots again to see the changes
		
		ParkingSystem ps=new ParkingSystem();
		Relation r=new Relation();
		DataBase db=new DataBase();
		
		db.makeData(); // function to test the park In Function

		r.displaySlots();
		ps.parkIn();
		r.displaySlots();
	}
}
