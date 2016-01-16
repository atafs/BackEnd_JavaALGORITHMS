package dao;

//DAO
public class TrainStation {
	
	//ATTRIBUTES
	private char name;
	//Fixed referencial to estimate time of arrival
	private int distanceInMinutes;
	
	//CONSTRUCTOR
	public TrainStation(char name, int distanceInMinutes) {
		super();
		this.name = name;
		this.distanceInMinutes = distanceInMinutes;
	}
	
	//GETTERS AND SETTERS
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public int getDistanceInMinutes() {
		return distanceInMinutes;
	}
	public void setDistanceInMinutes(int distanceInMinutes) {
		this.distanceInMinutes = distanceInMinutes;
	}
}
