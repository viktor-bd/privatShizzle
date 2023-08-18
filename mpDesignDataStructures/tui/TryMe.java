package tui;
import model.*;

/**
 * Write a description of class TryMe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TryMe
{
    // instance variables - replace the example below with your own
    private Loan l1;
    private Loan l2;
    private Loan l3;
    private Loan l4;
    private Loan l5;
    private LoanContainer loanCon;

    private Friend f1;
    private Friend f2;
    private Friend f3;
    private Friend f4;
    private Friend f5;
    private FriendContainer friendCon;

    private LP lp1;
    private LP lp2;
    private LP lp3;
    private LP lp4;
    private LP lp5;
    private LPContainer LPCon;

    private Copy copy1;
    private Copy copy2;
    private Copy copy3;
    private Copy copy4;
    private Copy copy5;
    private Copy copy6;
    private Copy copy7;


    /**
     * Constructor for objects of class TryMeLoan
     */
    public TryMe(){
        // initialise instance variables
        f1 = new Friend("Rasmus", "Istedgade 2", 9000, "Aalborg", "+452374262");
        f2 = new Friend("Nikoline", "Hobrovej 65", 9400, "Nørrenullerby", "+13023842");
        f3 = new Friend("Carl", "Slimbabway 5", 2300, "Aalborg", "+4523847422");
        f4 = new Friend("Malik", "Randersvej 30", 2000, "København", "+2334924932");
        f5 = new Friend("Viktor", "Bruhvej 22", 1000, "Slagelse", "+567243283");

        
        lp1 = new LP(1234, "John", "Doe", "27/4-2000");
        lp2 = new LP(5678, "Hurry", "Lil", "27/3-1999");
        lp3 = new LP(12345, "Denmark", "Rasmus", "14/4-2023");
        lp4 = new LP(6789, "Germany", "Malikeren", "23/4-2013");
        lp5 = new LP(12312, "Hejhej", "Viktor", "31/1-2005");

        copy1 = new Copy(1, "01-01-2001", 10.1, false);
        copy2 = new Copy(2, "02-01-2001", 10.2, false);
        copy3 = new Copy(3, "03-01-2001", 10.3, false);
        copy4 = new Copy(4, "04-01-2001", 10.4, true);
        copy5 = new Copy(5, "05-01-2001", 10.5, false);
        copy6 = new Copy(6, "06-01-2001", 10.6, false);
        copy7 = new Copy(7, "07-01-2001", 10.7, true);

        
        l1 = new Loan(1, "23/2-2005", "24/3-2005", 31, f1, copy1);
        l2 = new Loan(2, "22/5-2016", "22/6-2016", 30, f2, copy2);
        l3 = new Loan(3, "12/4-2008", "12/6-2009", 420, f3, copy3);
        l4 = new Loan(4, "15/10-2003", "17/10-2003", 2, f4, copy4);
        l5 = new Loan(5, "17/12-2017", "17/1-2018", 31, f5, copy5);

           
    }

    public void generateData(){
        friendCon = FriendContainer.getInstance();
        friendCon.addFriend(f1);
        friendCon.addFriend(f2);
        friendCon.addFriend(f3);
        friendCon.addFriend(f4);
        friendCon.addFriend(f5); 

        lp1.addCopy(copy1);
        lp1.addCopy(copy2);
        lp2.addCopy(copy3);
        lp3.addCopy(copy4);
        lp4.addCopy(copy5);
        lp5.addCopy(copy6);
        lp5.addCopy(copy7);

        LPCon = LPContainer.getInstance();
        LPCon.addLP(lp1);
        LPCon.addLP(lp2);
        LPCon.addLP(lp3);
        LPCon.addLP(lp4);
        LPCon.addLP(lp5);

    }
    public void generateLoans(){
        loanCon = LoanContainer.getInstance();
        loanCon.addLoan(l1);
        loanCon.addLoan(l2);
        loanCon.addLoan(l3);
        loanCon.addLoan(l4);
        loanCon.addLoan(l5);
    }
}
