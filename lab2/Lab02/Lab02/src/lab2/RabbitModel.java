package lab2;


public class RabbitModel {
	// initialize all instance variables
	int population = 0;
	int lastYear = 1;
	int yearBefore = 0;
	
	// not needed
	public RabbitModel() {
		
	}
	// returns population each time simulateYear runs
	public int getPopulation() {
		return population;
	}
	// actual running thing!
	public void simulateYear() {
		population = lastYear + yearBefore;
		lastYear = population;
		yearBefore = lastYear;

	}
	// resets start point only runs once	
	public void reset() {
		population = 0;
		lastYear = 1;
		yearBefore = 0;
	}
}