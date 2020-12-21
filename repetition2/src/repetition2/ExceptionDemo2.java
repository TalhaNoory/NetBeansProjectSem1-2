package repetition2;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[4];
            numbers[0] = 10;
            numbers[1] = 30/0;
            numbers[4] = 20;
            
            System.out.println("last statement in try block");
        }
       catch (ArithmeticException | ArrayIndexOutOfBoundsException e ){
           e.printStackTrace();
        }
    }
}
