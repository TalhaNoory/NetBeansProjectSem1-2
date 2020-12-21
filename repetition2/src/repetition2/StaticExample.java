package repetition2;

public class StaticExample {
    private static int count;

     public StaticExample() {
         count++;
    }
  
    public static void main(String[] args) {
        StaticExample ex = new StaticExample();
        StaticExample ex2 = new StaticExample();
        StaticExample ex3 = new StaticExample();
        System.out.println("number of objects created " + count);
    }
}
