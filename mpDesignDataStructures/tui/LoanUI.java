package tui;
import java.util.Scanner;
import control.LoanController; 
import model.Loan;
import model.Copy;
import model.Friend; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.concurrent.TimeUnit; 
import java.text.ParseException;

/**
 * Write a description of class LoanUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanUI{

    private LoanController loanController;
    private Scanner keyboard;
    private boolean running;

    public LoanUI(){
        keyboard = new Scanner(System.in);
        loanController = new LoanController();
        TryMe tryMe = new TryMe();
        tryMe.generateData();
        running = true;
    }

    /**

    This method starts the loan menu and keeps running until the user chooses to exit.
    It uses a while loop to continuously display the loan menu and receive the user's choice.
    If the user chooses to create a loan, the method calls createLoan() to create a new loan.
    If the user chooses to exit, the method sets the 'running' flag to false and displays a goodbye message.
     */

    public void loanMenuStart(){
        while(running) {
            int choice = writeLoanMenu(); 
            if(choice == 1){ //create the loan
                createLoan();
            }
            else {
                running = false;
                System.out.println("Goodbye");
            }//end else  
        }//end while
    }

    private int writeLoanMenu(){
        int choice = 0;
        System.out.println("*** Loan menu ***");
        System.out.println(" (1) Create loan");
        System.out.println(" (2) Exit");
        System.out.print("\n Type a number: ");
        while (!keyboard.hasNextInt()) {         
            System.out.println("You must type a number to proceed.");
            keyboard.nextLine();

        }

        choice = keyboard.nextInt();
        keyboard.nextLine();
        return choice;
    }

    /**

    This method creates a new loan by prompting the user for required information such as borrower details, loan period, and dates of borrowing and return.
    It calls on other methods to retrieve Friend and Copy objects, get a loan number from the user, and calculate the loan period.
    If the required information is successfully gathered and validated, it creates a new Loan object using the LoanController's createLoan method.
    @return void
     */
    private void createLoan(){
        Friend friend = getFriendByName();

        Copy copy = getCopyBySerialNumber();

        int loanNumber = inputLoanNumber();

        System.out.println();
        System.out.println("Type borrow date: ");
        System.out.println();
        String borrowDate = inputDate();

        System.out.println("Type return date: ");
        System.out.println();
        String returnDate = inputDate(); 

        int period = getLoanPeriod(borrowDate,returnDate);

        if (finish(loanNumber, borrowDate, returnDate, period, friend, copy)) {
            Loan loan = loanController.createLoan(loanNumber, borrowDate, returnDate, period, friend, copy);    
        }
    }

    /**

    Gets a Friend object by the name input from the user through the console.
    If the name is not found in the system, the method will prompt the user to try again.
    @return a Friend object with the name provided by the user
     */
    private Friend getFriendByName(){
        System.out.println();
        System.out.println("Type friend name:  ");
        String name = keyboard.nextLine();

        Friend friend = loanController.getFriendByName(name);

        while (friend == null) {
            System.out.println("Could not find a friend called: " + name + ". Try again");
            name = keyboard.nextLine();
            friend = loanController.getFriendByName(name);
        }

        return friend;
    }

    private int inputLoanNumber(){
        System.out.println();
        Scanner keyboard = new Scanner(System.in);  
        System.out.println(" Type loan number:  ");
        int loanNumber = keyboard.nextInt();
        keyboard.nextLine();
        return loanNumber;
    }

    private String inputDate(){
        System.out.println(" format dd-mm-yyyy:  ");
        System.out.println();
        System.out.println(" Type day:  ");
        int day = keyboard.nextInt();
        System.out.println(" Type month:  ");
        int month = keyboard.nextInt();
        System.out.println(" Type year:  ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        String borrowDate = day + "-" + month + "-"+year;
        return borrowDate;
    }

    /**

    This method gets the copy object by its serial number. It prompts the user to input the copy's serial number,
    checks if the copy with the given serial number exists in the system, and returns the corresponding Copy object.
    If a copy with the given serial number does not exist, it prompts the user to try again until a valid serial number is entered.
    @return The Copy object with the given serial number.
     */
    private Copy getCopyBySerialNumber(){
        System.out.println();
        System.out.println(" Type the Copy's SerialNumber: "); 

        int serialNumber = keyboard.nextInt();
        Copy copy = loanController.getCopyBySerialNumber(serialNumber);

        while (copy == null) {
            System.out.println("Could not find a copy with serial number: " + serialNumber + ". Try again");
            serialNumber = keyboard.nextInt();
            copy = loanController.getCopyBySerialNumber(serialNumber);
        }

        return copy;
    }

    private int getLoanPeriod(String borrowDate, String returnDate){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        int diffInDays = 0;

        try {
            Date date1 = sdf.parse(borrowDate);
            Date date2 = sdf.parse(returnDate);

            long diffInMillis = date2.getTime() - date1.getTime();
            diffInDays = (int)TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);

            System.out.println(" Loan period: " + diffInDays + " days");
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }

        return diffInDays;
    }

    /**

    Displays loan details to user and prompts them to confirm or cancel the loan.
    If user confirms the loan, sets running to false and returns true. Otherwise, returns false.
    @param loanNumber the loan number
    @param borrowDate the borrow date
    @param returnDate the return date
    @param period the loan period
    @param friend the friend who is borrowing the copy
    @param copy the copy being borrowed
    @return true if user confirms the loan, false if user cancels the loan
     */
    private boolean finish(int loanNumber, String borrowDate, String returnDate, int period, Friend friend, Copy copy){
        System.out.println();
        System.out.println("Do you wish to make the following loan");
        System.out.println(" LoanNumber: " + loanNumber);
        System.out.println(" BorrowDate: " + borrowDate);
        System.out.println(" ReturnDate: " + returnDate);
        System.out.println(" Period: " + period);
        System.out.println(" Friend: " + friend.getName());
        System.out.println(" Copy: " + copy.getSerialNumber());

        System.out.println("Type: yes or no");

        String answer = keyboard.nextLine();

        while (!answer.toLowerCase().equals("yes") && !answer.toLowerCase().equals("no")){
            System.out.println("Invalid input, please try again");
            System.out.println("Type: yes or no");
            answer = keyboard.nextLine();
        }

        if (answer.toLowerCase().equals("yes")) {
            running = false;
        }

        return answer.toLowerCase().equals("yes");
    }
}

