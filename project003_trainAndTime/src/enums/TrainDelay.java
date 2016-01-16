package enums;

public enum TrainDelay {
	TIME_A(0), TIME_B(3), TIME_C(10), TIME_D(6), TIME_E(15); 

	//ATTRIBUTES ENUM
	private final int delay;

	//CONSTRUCTOR ENUM
	private TrainDelay(final int delay) {
		this.delay = delay;
	}
	
	//GETTER
	public int getDelay() {
		return delay;
	}

	//TOSTRING ENUM
	@Override
	public String toString() {
		return "DELAY: " + delay;
	}
}
