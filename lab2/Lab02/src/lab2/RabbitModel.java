package lab2;

public class RabbitModel {
	int population = 0;
	
	public RabbitModel() {
		
	}
	
	
	
	public int getPopulation() {
		return population;
	}
	public void simulateYear() {
		population /= 2;
	}
	
	public void reset() {
		population = 500; 
	}
}
