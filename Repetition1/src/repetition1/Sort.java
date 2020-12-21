package repetition1;

import java.util.*;

public class Sort {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(args);
        //Collections.sort(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        

        List<Player> team = new ArrayList();
        team.add(new Player("tim", 25, 2));
        team.add(new Player("jim", 21, 1));
        team.add(new Player("bob", 20, 1));
        team.add(new Player("tom", 20, 3));
        Collections.sort(team);       
        System.out.println(team);
        
        PlayerAgeComparator comp = new PlayerAgeComparator();
        
        Collections.sort(team, comp);
        System.out.println(team);
        
        System.out.println(Collections.min(team));
   
    }
}
