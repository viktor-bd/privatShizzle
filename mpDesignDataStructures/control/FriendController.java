package control;
import model.*;

/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController
{
    // instance variables - replace the example below with your own
    private FriendContainer friendContainer;

    /**
     * Constructor for objects of class FriendController
     */
    public FriendController()
    {
        // initialise instance variables
        friendContainer = FriendContainer.getInstance();
    }

    
    public Friend getFriendByName(String name){
       return friendContainer.getFriendByName(name); 
    }
}
