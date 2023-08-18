package model;

import java.util.ArrayList;

/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private int loanNumber;
    private String borrowDate;
    private String returnDate;
    private int period;
    private Friend friend;
    private Copy copy;
    

    /**
     * Constructor for objects of class Loan
     */
    public Loan(int loanNumber, String borrowDate, String returnDate, int period, Friend friend, Copy copy)
    {
        // initialise instance variables
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.period = period;
        this.friend = friend;
        this.copy = copy;
    }
    
    public int getLoanNumber(){
        return loanNumber;
    }
    
    public String getBorrowDate(){
        return borrowDate;
    }
    
    public String getReturnDate(){
        return returnDate;
    }
    
    public int getPeriod(){
        return period;
    }
    
    public Friend getFriend(){
        return friend;
    }
    
    public Copy getCopy(){
        return copy;
    }
    
    public void setLoanNumber(int loanNumber){
        this.loanNumber = loanNumber;
    }
    
    public void setBorrowDate(String borrowDate){
        this.borrowDate = borrowDate;
    }
    
    public void setReturnDate(String returnDate){
        this.returnDate = returnDate;
    }
    
    public void setPeriod(int period){
        this.period = period;
    }
    
    public void setFriend(Friend friend){
        this.friend = friend;
    }
    
    public void setCopy(Copy copy){
        this.copy = copy;
    }
    
}
