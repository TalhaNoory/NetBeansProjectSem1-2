
package repetition2;

public class Repetition2 {

    public static void main(String[] args) {
        
        // Her er der blevet givet en ny variabel til Class "Item" som er mælk
        Item mælk = new Item("Mælk ", 7);
        
        /* Samme princip, class "ItemOrder" givet den en variabel ved navn itemorder, 
        samt puttet variablen 'mælk' og den antal stk mælk som er købt inde i 'itemoder'*/ 
        ItemOrder itemorder = new ItemOrder(mælk, 5);
        
        /* Her printes itemorder, da variablen 'mælk' er inde i selve 
        'itemorder' behøves 'mælk' ikke at blive printet */
        System.out.println(itemorder);
    }
    
}
