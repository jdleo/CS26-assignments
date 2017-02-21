// John Leonardo
// CSP26A

import javax.swing.*;

public class ch4_assignment {

	public static void main(String[] args) {
		//empty variables
		int totalRooms = 0, totalOccupied = 0, totalVacant, floors;
		double occupancyRate;
		
		//get the amount of floors, and validate that it's above 1
		do {
			String floorsTemp = JOptionPane.showInputDialog("How many floors are in the hotel?");
			floors = Integer.parseInt(floorsTemp);
		} while (floors < 1);
		
		for (int a = 1;(a <= floors);a++) {
			int thisFloorRooms = 0, thisFloorOccupied = 0;
			
			//get the amount of rooms, and amount occupied, as long as less than 10 and not greater than avail. rooms
			do {
				String thisFloorRoomsTemp = JOptionPane.showInputDialog(String.format("How many rooms are on floor %s", a));
				thisFloorRooms = Integer.parseInt(thisFloorRoomsTemp);
				String thisFloorOccupiedTemp = JOptionPane.showInputDialog(String.format("How many rooms are occupied for floor %s", a));
				thisFloorOccupied = Integer.parseInt(thisFloorOccupiedTemp);
				
			} while ( thisFloorRooms < 10 || thisFloorOccupied > thisFloorRooms );
			
			//add to the total amounts
			totalRooms += thisFloorRooms;
			totalOccupied += thisFloorOccupied;
			
			//calculate, format, display
			double thisFloorOccupancyRate = (double)thisFloorOccupied / (double)thisFloorRooms;
			String msg = String.format("Occupancy rate for Floor %s: %.2f", a, thisFloorOccupancyRate);
			JOptionPane.showMessageDialog(null, msg);
		}
		
		
		
		

	}

}
