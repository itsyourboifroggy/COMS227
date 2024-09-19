package lab2;
import java.util.Random;


public class RabbitModel4 {
	int population = 0;
	Random rand = new Random();
	
	public RabbitModel4() {
		
	}

	public int getPopulation() {
		return population;
	}
	public void simulateYear() {
		int rand_int = rand.nextInt(9);
		population += rand_int;
	}
	
	public void reset() {
		population = 0;
	}
}