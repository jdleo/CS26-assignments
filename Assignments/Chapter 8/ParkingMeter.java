/**
 * @author John Leonardo
 * one data field, minutes purchased
 */
public class ParkingMeter {
	
	// data field
	private double minutesPurchased;
	
	public ParkingMeter(double m) {
		this.minutesPurchased = m;
	}

	// getter + setter
	public double getMinutesPurchased() {
		return minutesPurchased;
	}

	public void setMinutesPurchased(double minutesPurchased) {
		this.minutesPurchased = minutesPurchased;
	}
	
}
