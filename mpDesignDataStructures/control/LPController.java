package control;
import model.*;


/**
 * Write a description of class LPController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPController
{
    // instance variables - replace the example below with your own
    private LPContainer lpContainer;
    /**
     * Constructor for objects of class LPController
     */
    public LPController()
    {
        // initialise instance variables
        lpContainer = LPContainer.getInstance();
    }
    
    public Copy getCopyBySerialNumber(int serialNumber){
        return lpContainer.getCopyBySerialNumber(serialNumber);
    }
}
