package repetition2;

public class ExceptionDemo1 {

    public static void main(String[] args) {
            int[] numbers = new int[4];
            try {
            numbers[0] = 10;
            numbers[1] = 30/0;
            numbers[4] = 20; 
            }            
            catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
                e.printStackTrace();    
                System.out.println( e.getMessage());
            }
                       
            System.out.println("This is the end");
    }

}
