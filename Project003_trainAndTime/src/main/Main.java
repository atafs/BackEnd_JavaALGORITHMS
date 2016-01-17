package main;

import java.util.ArrayList;
import java.util.List;

import manage.TimeBetweenStation;
import dao.TrainStation;
import enums.TrainDelay;

public class Main {
	
	//MAIN
	public static void main(String[] args) {

		//INSTANTIATE AND TIMES IN MINUTES 
		TrainStation a = new TrainStation('A', TrainDelay.TIME_A.getDelay());
		TrainStation b = new TrainStation('B', TrainDelay.TIME_B.getDelay());
		TrainStation c = new TrainStation('C', TrainDelay.TIME_C.getDelay());
		TrainStation d = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TrainStation e = new TrainStation('E', TrainDelay.TIME_E.getDelay());
		
		//CALCULATE VALUES
		List<TimeBetweenStation> calculations = new ArrayList<TimeBetweenStation>();
		calculations.add(new TimeBetweenStation(a, b).calculateDistance());
		calculations.add(new TimeBetweenStation(b, a).calculateDistance());
		calculations.add(new TimeBetweenStation(a, d).calculateDistance());
		calculations.add(new TimeBetweenStation(b, c).calculateDistance());
		calculations.add(new TimeBetweenStation(c, d).calculateDistance());
		calculations.add(new TimeBetweenStation(d, e).calculateDistance());
		calculations.add(new TimeBetweenStation(e, d).calculateDistance());
		calculations.add(new TimeBetweenStation(d, c).calculateDistance());
		calculations.add(new TimeBetweenStation(d, b).calculateDistance());
		calculations.add(new TimeBetweenStation(c, e).calculateDistance());
		
		//PRINT
		for (TimeBetweenStation timeBetweenStation : calculations) {
			System.out.println(timeBetweenStation.toString());
		}
	}
}
