package model;
import java.util.ArrayList;

/**
 * Write a description of class FriendContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendContainer
{
    // instance variables - replace the example below with your own
    private ArrayList <Friend> friends;
    private static FriendContainer instance;

    /**
     * Constructor for objects of class FriendContainer
     */
    private FriendContainer(){
        // initialise instance variables
        friends = new ArrayList<>();
    }

    public static FriendContainer getInstance(){
        if(instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    
    // OBS IKKE EN DEL AF USE CASE 1. Bruges i TryMe
    public boolean addFriend(Friend friend){
        return friends.add(friend);
    }
    
    /**
     * Method getFriendByName
     *
     * @param name The name of the friend to search for
     * @return The friend object with the matching name or null if no friend with that name is found
     */
    public Friend getFriendByName(String name){
        
        Friend foundFriend = null;
        boolean found = false; 
        int index = 0;
        
        while (index < friends.size() && !found) {
            Friend currFriend = friends.get(index);
            if (currFriend.getName().equals(name)) {
                found = true;
                foundFriend = currFriend;
            }
            index ++;
        }

        return foundFriend;
    }
}
