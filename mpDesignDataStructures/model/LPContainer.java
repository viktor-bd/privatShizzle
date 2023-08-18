package model;
import java.util.ArrayList;

/**
 * Write a description of class LPContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPContainer
{
    // instance variables - replace the example below with your own
    private ArrayList <LP> LPs;
    private static LPContainer instance;

    /**
     * Constructor for objects of class LPContainer
     */
    private LPContainer(){
        // initialise instance variables
        LPs = new ArrayList<>();
    }

    public static LPContainer getInstance(){
        if(instance == null){
            instance = new LPContainer();
        }
        return instance;
    }
    
    // OBS IKKE EN DEL AF USE CASE 1. Bruges i TryMe
    public boolean addLP(LP lp){
        return LPs.add(lp);
    }
   
    public Copy getCopyBySerialNumber(int serialNumber){
        boolean found = false;
        int i = 0;
        int j = 0;
        
        Copy foundCopy = null;
        
        while (i < LPs.size() && !found) {
            LP currLP = LPs.get(i);
            ArrayList<Copy> currLpCopies = currLP.getCopies();
            j = 0;
            while (j < currLpCopies.size() && !found) {
                Copy currCopy = currLpCopies.get(j);
                if (currCopy.getSerialNumber() == serialNumber) {
                    found = true;
                    foundCopy = currCopy;
                }
                j ++;
            }
            i ++;
        }
        return foundCopy;
    }
}
