package lab2;

public class RabbitModel3 {
	int population = 0;
	
	public RabbitModel3() {
		
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