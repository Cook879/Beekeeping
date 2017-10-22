/**
 * Bee abstract class
 * 
 * @file
 * @ingroup Bees
 * @version 0.1
 * @date October 29, 2013
 * @author Richard Cook
 */

public abstract class Bee {
    
    // @todo FIXME: Guess I just set these up here - I dunno right now tbh
    String type;
    int age;
    int health;
    
   /**
    * Getter for the type variable
    * 
    * @return type String: type of bee
    */
   public String getType() {
       return type;
   }
   
   /**
    * Setter for the age variable
    * 
    * @param age int: age of the bee
    */
   public void setAge( int age ) {
       // @todo FIXME That ain't gonna work, baby
       age = age;
   }
   
   /**
    * Getter for the age variable
    * 
    * @return age int: age of the bee
    */
   public int getAge() {
       return age;
   }
   
   /**
    * Method that lets the bees eat
    * 
    * @return boolean
    */
   public abstract boolean eat();
   
   /**
    * anotherDay
    * 
    * @return boolean
    */
   public abstract boolean anotherDay();
   
   
}
