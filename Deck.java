
/**
 * Class to model a Deck of cards.
 *
 * @author Mary Lee
 * @version 2017-11-17.
 */
public class Deck
{
    // instance variables - replace the example below with your own
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    /**
     * Default constructor for creating a Deck instance.
     */
    public Deck()
    {
        // initialise instance variables
        
    }
    /**
     * A method for printing every combination in a 52 deck of cards.
     */
    
    public void printDeck ()
    {
        
        
        for (int i = 0; i < DESCRIPTIONS.length; i++)
        {
            for (int j = 0; j < SUITS.length; j++)
            {
                System.out.println(DESCRIPTIONS[i] + " of " + SUITS[j]);
            }
            System.out.println();
        }
    }
}
