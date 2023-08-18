package model;
import java.util.ArrayList;

/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    // instance variables - replace the example below with your own
    private ArrayList<Loan> loans;
    private static LoanContainer instance;

    /**
     * Constructor for objects of class LoanContainer
     */
    private LoanContainer()
    {
        // initialise instance variables
        loans = new ArrayList<>();
    }

    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }

    public boolean addLoan(Loan loan){
        return loans.add(loan);
    }

    /**
     * Removes all existing loans in the LoanContainer object.
     * This method clears the underlying data structure used to store loans.
     * After calling this method, the LoanContainer object will be empty.
     * This method is used to assist the unit test during setup for multiple
     * test runs.
     */
    public void destroy(){
        loans.clear();
    }
    
    public int getNumberOfLoans(){
        return loans.size();
    }
}
