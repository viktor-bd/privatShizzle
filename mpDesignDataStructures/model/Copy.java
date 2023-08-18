package model;


/**
 * Write a description of class Copy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Copy
{
    // instance variables - replace the example below with your own
    private int serialNumber;
    private String purchaseDate;
    private double purchasePrice;
    private boolean borrowed;

    /**
     * Constructor for objects of class Copy
     */
    public Copy(int serialNumber, String purchaseDate, double purchasePrice, boolean borrowed)
    {
        // initialise instance variables
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.borrowed = borrowed;

    }
    
    public boolean isBorrowed(){
        return borrowed;
    }
    
    public int getSerialNumber(){
        return serialNumber;
    }
    
    public String getPurchaseDate(){
        return purchaseDate;
    }
    
    public double getPurchasePrice(){
        return purchasePrice;
    }
    
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }
    
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    
    public void setPurchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    
    public void setPurchasePrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }
}
