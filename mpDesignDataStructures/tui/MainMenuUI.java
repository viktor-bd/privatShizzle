package tui;

import java.util.Scanner;

/**
 * Write a description of class MenuUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainMenuUI
{
    private Scanner scanner;

    private LoanUI loanUI;

    public MainMenuUI()
    {
        loanUI = new LoanUI();

        startMenu();
    }

    private void startMenu() {

        boolean running = true;

        while (running)
        {
            printOptions();
            int choice = getInputChoice();
            switch(choice) {
 
                case 1:
                    loanUI.loanMenuStart();
                    break;
                case 2:
                    System.out.println("This has not yet been implemented");
                case 0:
                    running = false;
                    System.exit(0);
                default:
                    System.out.println();
                    System.out.println("Invalid input, try again");
                    System.out.println();
            }
        }

    }
    private void printOptions()
    {
        System.out.println("(1) Loan menu");
        System.out.println("(2) Generate test data");
        System.out.println("(0) Quit the program");
    }

    public int getInputChoice()
    {
        scanner = new Scanner(System.in);

        boolean validInput = false;
        int inputChoice = -1;

        try {
            inputChoice = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {

        }

        return inputChoice;
    }
}
