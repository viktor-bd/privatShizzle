package model;
import tui.*;
import model.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class LPContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LPContainerTest
{
    private LPContainer sut;
    private LP lp1;
    private Copy copy1;
    /**
     * Default constructor for test class LPContainerTest
     */
    public LPContainerTest()
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
        sut = LPContainer.getInstance();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void getCopyBySerialNumber_givenIntShouldReturnCopy(){
        Copy copy1 = new Copy(1, "01-01-2001", 10.1, false);
        lp1 = new LP(1234, "John", "Doe", "27/4-2000");
        lp1.addCopy(copy1);
        sut.addLP(lp1);

        Copy actual = sut.getCopyBySerialNumber(1);

        assertEquals(actual,copy1);
    }
}
