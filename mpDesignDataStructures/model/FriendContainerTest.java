package model;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FriendContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FriendContainerTest
{
    private FriendContainer sut;
    private Friend f1;

    /**
     * Default constructor for test class FriendContainerTest
     */
    public FriendContainerTest()
    {
        sut = FriendContainer.getInstance();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
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
    public void findFriendByName_givenFriendNameShouldReturnFriendObject(){
        f1 = new Friend("Rasmus", "Istedgade 2", 9000, "Aalborg", "+452374262");
        String name = "Rasmus";
        sut.addFriend(f1);

        Friend actual = f1;

        assertTrue(sut.getFriendByName(name) == (f1));
    }
}
