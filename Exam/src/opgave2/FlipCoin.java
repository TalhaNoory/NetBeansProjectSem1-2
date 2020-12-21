package opgave2;

import java.util.Random;

public class FlipCoin {

    public HeadTail flipCoin() {

//        Løsningen findes her, 
//(https://stackoverflow.com/questions/1972392/pick-a-random-value-from-an-enum)
        return HeadTail.values()[new Random().nextInt(HeadTail.values().length)];

    }
}
