package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel1
{
  // TODO - add instance variables as needed
  int initYear; // Current year
  int population = 2; // Current rabbit population
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel1()
  {
    // TODO
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    // TODO - returns a dummy value so code will compile
    return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    initYear += 1; // Increment the year counter
    population += 1; // Increment the rabbit population by 1
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    initYear = 0; // Reset the year counter
    population = 2; // Reset the rabbit population
  }

    public int getInitYear() {
        return initYear;
    }
    public int population() {
      return population;
    }
} 
