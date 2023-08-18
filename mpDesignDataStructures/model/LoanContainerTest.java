package model;
import tui.*;
import model.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LoanContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LoanContainerTest
{
    private LoanContainer sut;
    /**
     * Default constructor for test class LoanContainerTest
     */
    public LoanContainerTest()
    {

    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        sut = LoanContainer.getInstance();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        sut.destroy();
    }

    /**

    Tests the getNumberOfLoans() method of the System Under Test (sut).
    The test case generates 5 loans using the TryMe class and asserts that
    the number of loans returned by the sut is 5.
     */
    @Test
    public void getNumberOfLoans_given5LoansShouldReturn5(){
        TryMe tryMe = new TryMe();
        tryMe.generateLoans();

        var actual = sut.getNumberOfLoans();

        assertTrue(actual == 5);

    }
    
    @Test
    public void addLoan_givenLoanShouldIncreaseArrayListSizeBy1(){
        TryMe tryMe = new TryMe();
        tryMe.generateLoans();
        Friend testFriend = new Friend("TestFriend","TestAddress", 9000, "TestCity", "TestPhone");
        Copy testCopy = new Copy(88, "1/2-2020", 10.5, false);
        Loan testLoan = new Loan(99, "1/2-2023", "2/2-2023", 1, testFriend, testCopy);
        sut.addLoan(testLoan);
        
        var actual = sut.getNumberOfLoans();
        
        assertTrue(actual == 6);
    }
}

