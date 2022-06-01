
package cardtrickice1;


import java.util.Random;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author sivagamasrinivasan,May 23rd
 * Modifier name: Vernika Aggarwal
 * Student number: 991650548
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // GENERATING 7 RANDOM CARDS AND STORED IN AN ARRAY
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        generator.setSeed(System.currentTimeMillis());
        System.out.println("The following cards are: ");
        for (int i = 0; i < magicHand.length; i++) {
            Card c1 = new Card();
            c1.setValue(generator.nextInt(13) + 1);
            c1.setSuits(Card.SUITS[generator.nextInt(4)]);
            magicHand[i] = c1;
            System.out.println(c1);
        }
        
        
     //Step 2: Take input
     //Input of suit and number from the user
        System.out.print("Enter suit:"
                + ""
                + " 1.Hearts"
                + ""
                + " 2.Diamonds"
                + ""
                + " 3.Spades"
                + ""
                + " 4.Clubs");       
        String suit = input.next();
         System.out.print("Enter card number from 1 to 12: ");
        int number = input.nextInt();
        
        
        // Step 3: Match with array
        // If user card is ine array card is present
        Card c1 = new Card();
        c1.setValue(2);
        c1.setSuits("Hearts");
        boolean found = false;
        System.out.println("Do a search for: " + c1);
        for (int i = 0; i < magicHand.length; i++) {
            if ((magicHand[i].getValue() == c1.getValue()) && magicHand[i].getSuits().equalsIgnoreCase(c1.getSuits())) {
                System.out.println("Card is present there at " + (i+1));
                found = true;
                break;
            }
        //Otherwise card is not present
        if (!found)
            System.out.println("Card is not present.");
        }
    }}
    
        
       
        
       
        
    
    

