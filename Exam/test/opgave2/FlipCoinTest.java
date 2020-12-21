package opgave2;

import org.junit.Test;
import static org.junit.Assert.*;

public class FlipCoinTest {

    //opgave 2
    @Test
    public void testFlipCoin() {
        FlipCoin coin = new FlipCoin();
        int head = 0;
        int tail = 0;
        int none = 0;
        for (int i = 0; i < 10000; i++) {
            HeadTail result = coin.flipCoin();
            switch (result) {
                case HEAD:
                    head++;
                    break;
                case TAIL:
                    tail++;
                    break;
                default:
                    none++;
                    break;
            }
        }
        assertTrue(head > 10);
        assertTrue(tail > 10);
        assertTrue(none == 0);
    }
}
