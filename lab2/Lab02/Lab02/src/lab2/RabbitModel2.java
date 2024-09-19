package lab2;

public class RabbitModel2 {
	int population;
		
	public RabbitModel2() {
			
	}
		
		
		
	public int getPopulation() {
		return population;
	}
	public void simulateYear() {
		population += 1; 
		population %= 5; 
			
	}
		
	public void reset() {
		population = 0;
	}
	
}
