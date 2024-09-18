package lab2;

public class RabbitModel2 {

	public class RabbitModel {
		int population = 0;
		
		public RabbitModel() {
			
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

}
