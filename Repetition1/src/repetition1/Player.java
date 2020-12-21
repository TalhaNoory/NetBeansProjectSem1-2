package repetition1;

public class Player implements Comparable<Player>{

    private String name;
    private int age;
    private int ranking;

    public Player(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public int compareTo(Player other) {
        if (this.ranking == other.ranking) {
            return this.name.compareTo(other.name);
        } else {
            return (this.ranking - other.ranking);
        }
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", ranking=" + ranking;
    }

}
