/**
 * Try out the Basketball class.
 */
public class BasketballTest
{
  /**
   * Entry point.
   */
  public static void main(String[] args)
  {
    // Construct an instance and examine its attributes
    Basketball b = new Basketball(4.0);
    System.out.println(b.getDiameter());
    System.out.println(b.isDribbleable());
    // Construct another instance with a diameter of 6
    Basketball b2 = new Basketball(6.0);
    
    // Inflate the first one
    b.inflate();
    // my modification
    b2.inflate();
    // First one is now dribbleable
    System.out.println("First basketball: " + b.isDribbleable());
    
    // Second one is unchanged
    System.out.println("Second basketball: " + b2.isDribbleable());

    // check if inflated
    System.out.println("First basketball inflated: " + b.isDribbleable());
    System.out.println("Second basketball inflated: " + b2.isDribbleable());
    // my modification
    b2.deflate();
   
    
  }
}