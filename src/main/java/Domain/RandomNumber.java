package Domain;

import java.util.Random;

public class RandomNumber {
    public RandomNumber(){}

    public int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
