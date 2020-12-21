package repetition;

public class Repetition {

    public static void main(String[] args) {
        
//opgave 1        
        // her er opgave 1 samlet
            /* System.out.println(min(-2, 5, 9));
            //Her printer jeg min metode ud, i main-metoden.
    }
//opgave 1.1    
        public static int min(int a, int b, int c){
            return Math.min(a, Math.min(b, c));
             Her erklærer jeg min metode */
        
//opgave 2
        // her er opgave 2 samlet
            /*System.out.println(prinEvenNumbers(8));
    }       //Her printer jeg, grænsen for print af tal    
//opgave 2.1
        public static int prinEvenNumbers (int limit){
            for (int i = 1; i < limit; i++){
            
            // Hvis nummeret giver 2, så er det et lige tal
            if( i % 2 == 0 ){
                System.out.print(i + " "); 
            }
            
        }
        return limit;*/
            
//opgave 3
        
            /*System.out.println(Absval(-9, -5, -17));
            // Her printer vi metoden ud, og får den mindste værdi ekslusiv fortegnet -> "-"
    }
    
//opgave 3.1
        public static int Absval (int a, int b, int c){
            // her er det ikke så vigtig hvilken af de 2 Math.min eller Math.abs der kommer først
            return Math.min(Math.abs(a), Math.min(Math.abs(b), Math.abs(c)));*/
            
//opgave 4
        /*System.out.println(sumDigits(931, 0));

    }
    
//opgave 4.1
        public static int sumDigits (int num, int sum){
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
            return sum;*/
        
//opgave 5


    }
    
//opgave 5.1
    public static String reverseVertical (String str){
        String reverse = "";
        
        for(int i = str.length() -1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
    }return str.charAt(i);
    
}
