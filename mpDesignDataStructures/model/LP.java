package model;
import java.util.ArrayList;


/**
 * Write a description of class LP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LP
{
    // instance variables - replace the example below with your own
    private int barcode;
    private String title;
    private String artist;
    private String publicationDate;
    private ArrayList<Copy> copies;

    /**
     * Constructor for objects of class LP
     */
    public LP(int barcode, String title, String artist, String publicationDate)
    {
        // initialise instance variables
        this.barcode = barcode;
        this.title = title;
        this.artist = artist;
        this.publicationDate = publicationDate;
        this.copies = new ArrayList<Copy>();
    }
    
    public boolean addCopy(Copy copy){
        return copies.add(copy);
    }
    
    public int getBarcode(){
        return barcode;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getPublicationDate(){
        return publicationDate;
    }
    
    public ArrayList<Copy> getCopies() {
        return copies;
    }
    
    public void setBarcode(int barcode){
        this.barcode = barcode;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }
    
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }
    
    /**
     * Method getCopyBySerialNumber
     *
     * @param serialNumber The serial number of the copy to be retreived
     * @return The copy object with the specified seriel number, or null if it is not found in the library
     */
    public Copy getCopyBySerialNumber(int serialNumber){
        Copy foundCopy = null;
        int index = 0;
        boolean found = false;
        while(index < copies.size() && !found){
            foundCopy = copies.get(index);
            if(copies.get(index).getSerialNumber() == serialNumber){
                found = true;
            }
            else{
                index++;
            }
        }
        return copies.get(index);
    }
}
