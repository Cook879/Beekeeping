/**
 * Hive class
 * 
 * @file
 * @ingroup Beekeeping
 * @version 0.1
 * @date October 29, 2013
 * @author Richard Cook
 */

// import ArrayList
import java.util.ArrayList;

public class Hive {
    
    // @todo FIXME does this go here
    ArrayList<Bee> cells = new ArrayList<Bee>();
    // @todo FIXME give it a class
    ArrayList foodStores = new ArrayList();
    
    /**
     * Constructor
     */
    public Hive() {
    // @todo add some default food    
    }
    
    /**
     * Adds a Bee to the hive's cells
     * 
     * @param bee Bee: the Bee to add to the ArrayList
     */
    protected void addBee( Bee bee ) {
        //@todo bee needs to be (lol) a better variable name
        
        // Can only have 100 cells so if we're at 100 don't let the bee in
        if ( numberOfBees() >= 100 ) {
            cells.add( bee );
        } else {
            System.out.println( "Oh no! No room for this bee - come back later" );
        }
    }
    
    /**
     * Getter for a bee in a given cell
     * 
     * @param n int: the cell the wanted Bee is in
     * @return foundBee Bee: Bee found in the given cell
     */
    protected Bee getBee( int n ) {
        return cells.get( n );
    }
    
    /**
     * Returns the number of Bees in the Hive
     * 
     * @return numberOfBees int: number of Bees in the Hive
     */
    protected int size() {
        return cells.size();]
    }
    
    /**
     * Adds Honey to the Hive
     * 
     * @param amount int: Amount of Honey to add
     */
    protected void addHoney( int amount ) {
        for ( int i = 0; i < amount; i++ ) {
            foodStores.add( "Honey" );
        }
    }
    
        
    /**
     * Adds Royal Jelly to the Hive
     * 
     * @param amount int: Amount of Royal Jelly to add
     */
    protected void addRoyalJelly( int amount ) {
        for ( int i = 0; i < amount; i++ ) {
            foodStores.add( "Royal Jelly" );
        }
    }
        
    /**
     * Adds Pollen to the Hive
     * 
     * @param amount int: Amount of Pollen to add
     */
    protected void addPollen( int amount ) {
        for ( int i = 0; i < amount; i++ ) {
            foodStores.add( "Pollen" );
        }
    }
    
    /**
     * Takes the specified amount of Honey from the food store
     */
}
