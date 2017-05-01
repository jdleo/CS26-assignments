/**
 * @author John Leonardo
 * car's make, model, color, license plate number, & minutes car has been parked
 */
public class ParkedCar {
	
	// data fields
	private String make;
	private String model;
	private String color;
	private String licensePlate;
	private double minutesParked;
	
	// constructor with 5 arguments
	public ParkedCar(String mk, String md, String c, String l, double m) {
		this.make = mk;
		this.model = md;
		this.color = c;
		this.licensePlate = l;
		this.minutesParked = m;
	}
	
	// constructor that takes one ParkedCar argument (duplicates it)
	public ParkedCar(ParkedCar pc) {
		this.make = pc.make;
		this.model = pc.model;
		this.color = pc.color;
		this.licensePlate = pc.licensePlate;
		this.minutesParked = pc.minutesParked;
	}
	
	// --- BEGIN GETTERS --- //
	public double getMinutesParked() {
		return minutesParked;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getLicensePlate() {
		return licensePlate;
	}
	// --- END GETTERS --- //
	
	// we only need one setter, for minutesParked
	public void setMinutesParked(double minutesParked) {
		this.minutesParked = minutesParked;
	}
}
