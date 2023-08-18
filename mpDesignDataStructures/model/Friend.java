package model;


/**
 * Write a description of class Friend here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Friend
{
    // instance variables - replace the example below with your own
    private String name;
    private String address;
    private int postalCode;
    private String city;
    private String phone;

    /**
     * Constructor for objects of class Friend
     */
    public Friend(String name, String address, int postalCode, String city, String phone)
    {
        // initialise instance variables
        this.name = name;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getPostalCode(){
        return postalCode;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPostalCode(int PostalCode){
        this.postalCode = PostalCode;
    }
    
    public void setCity(String City){
        this.city = City;
    }
    
    public void setPhone(String Phone){
        this.phone = Phone;
    }
}
