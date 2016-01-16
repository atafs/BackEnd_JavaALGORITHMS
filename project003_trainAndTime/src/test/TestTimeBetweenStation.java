package test;

import static org.junit.Assert.*;
import manage.TimeBetweenStation;

import org.junit.Test;

import dao.TrainStation;
import enums.TrainDelay;

public class TestTimeBetweenStation {

	@Test
	public void testA_B() {
		TrainStation stationFrom = new TrainStation('A', TrainDelay.TIME_A.getDelay());
		TrainStation stationTo = new TrainStation('B', TrainDelay.TIME_B.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(3, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testB_A() {
		TrainStation stationFrom = new TrainStation('B', TrainDelay.TIME_B.getDelay());
		TrainStation stationTo = new TrainStation('A', TrainDelay.TIME_A.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(3, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testA_D() {
		TrainStation stationFrom = new TrainStation('A', TrainDelay.TIME_A.getDelay());
		TrainStation stationTo = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(6, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testB_C() {
		TrainStation stationFrom = new TrainStation('B', TrainDelay.TIME_B.getDelay());
		TrainStation stationTo = new TrainStation('C', TrainDelay.TIME_C.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(7, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testC_D() {
		TrainStation stationFrom = new TrainStation('C', TrainDelay.TIME_C.getDelay());
		TrainStation stationTo = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(8, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testD_E() {
		TrainStation stationFrom = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TrainStation stationTo = new TrainStation('E', TrainDelay.TIME_E.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(9, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testE_D() {
		TrainStation stationFrom = new TrainStation('E', TrainDelay.TIME_E.getDelay());
		TrainStation stationTo = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(9, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testD_C() {
		TrainStation stationFrom = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TrainStation stationTo = new TrainStation('C', TrainDelay.TIME_C.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(9, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testD_B() {
		TrainStation stationFrom = new TrainStation('D', TrainDelay.TIME_D.getDelay());
		TrainStation stationTo = new TrainStation('B', TrainDelay.TIME_B.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(5, calc.getDistanceBetweenStations());
	}
	
	@Test
	public void testC_E() {
		TrainStation stationFrom = new TrainStation('C', TrainDelay.TIME_C.getDelay());
		TrainStation stationTo = new TrainStation('E', TrainDelay.TIME_E.getDelay());
		TimeBetweenStation calc = new TimeBetweenStation(stationFrom, stationTo);
		calc.calculateDistance();
		
		//TEST
		assertEquals(3, calc.getDistanceBetweenStations());
	}
}
