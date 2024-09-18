import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        Random rand = new Random(137);
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(6));
        System.out.println(rand.nextInt(6));
        
    }
    
}