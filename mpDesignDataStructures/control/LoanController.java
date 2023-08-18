package control;
import model.*;
import control.FriendController;
/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    private LoanContainer loanContainer;
    private FriendController friendController;
    private LPController lpController;
    
    public LoanController(){
        loanContainer = LoanContainer.getInstance();
        friendController = new FriendController();
        lpController = new LPController();
    }
    
    public Loan createLoan(int loanNumber, String borrowDate, String returnDate, int period, Friend friend, Copy copy){    
        Loan loan = new Loan(loanNumber, borrowDate, returnDate, period, friend, copy);
        
        loanContainer.addLoan(loan);
        return loan;
    }
    
    public Friend getFriendByName (String name){
        return friendController.getFriendByName(name);
    }
    
    public Copy getCopyBySerialNumber(int serialNumber){
        return lpController.getCopyBySerialNumber(serialNumber);
    }
}