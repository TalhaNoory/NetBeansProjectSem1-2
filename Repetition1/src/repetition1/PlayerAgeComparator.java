package repetition1;

import java.util.Comparator;

/**
 *
 * @author TM
 */
public class PlayerAgeComparator implements Comparator <Player> {

    @Override
    public int compare(Player p1, Player p2) {
       
        return p1.getAge() - p2.getAge();
        /*if (p1.getAge() == p2.getAge()) {
            
            return 0;
        } else if (p1.getAge() > p2.getAge()) {
            return 1;
        } else {
            return -1;
        }*/
    }

}
