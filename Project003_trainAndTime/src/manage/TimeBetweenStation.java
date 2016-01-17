package manage;

import dao.TrainStation;

public class TimeBetweenStation {

	//ATTRIBUTES
	private TrainStation stationFrom;
	private TrainStation stationTo;
	private int distanceStations;
	
	//CONSTRUCTOR
	public TimeBetweenStation(TrainStation stationFrom,
			TrainStation stationTo) {
		this.stationFrom = stationFrom;
		this.stationTo = stationTo;
		this.distanceStations = 0;
	}

	//GETTERS
	public TrainStation getStationFrom() {
		return stationFrom;
	}

	public TrainStation getStationTo() {
		return stationTo;
	}

	public int getDistanceBetweenStations() {
		return distanceStations;
	}
	
	//TOSTRING
	@Override
	public String toString() {
		String toReturn = "";
		toReturn += stationFrom.getName() + " to ";
		toReturn += stationTo.getName() + " takes ";
		toReturn += distanceStations + " minutes";
		return toReturn;
	}
	
	/** FUNCTION: calculate the distance in  minutes between the train stations */
	public TimeBetweenStation calculateDistance() {
		int from = stationFrom.getDistanceInMinutes();
		int to = stationTo.getDistanceInMinutes();
		int tempDistanceStations = to - from;
		
		//REMOVE NEGATIVE NUMBERS (putting the bigger number first)
		if (tempDistanceStations < 0) {
			distanceStations = from - to;
		} else {
			distanceStations = to - from;
		}
		
		//SPECIAL EVENTS
		checkEvents();
		
		return this;
	}
	
	/** PROCEDURE: check for routes that have special times (events that delay/forward to train) */
	public void checkEvents() {
		
		//CONDITIONS
		if( stationFrom.getName() == 'C' && stationTo.getName() == 'D' ) {
			distanceStations += 4;
		} else if(stationFrom.getName() == 'D' && stationTo.getName() == 'C') {
			distanceStations += 5;
		} else if(stationFrom.getName() == 'D' && stationTo.getName() == 'B'){
			distanceStations += 2;
		} else if(stationFrom.getName() == 'C' && stationTo.getName() == 'E') {
			distanceStations -= 2;
		}
	}
}
