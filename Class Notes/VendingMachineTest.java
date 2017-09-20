

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendingMachineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /**
     * Default constructor for test class VendingMachineTest
     */
    public VendingMachineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
        @Test
    public void testGetCanCount()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        int amount = testVendingMachine.getCanCount();
        assertEquals(10,amount);
    }
    
    @Test
    public void testGetTokenCount()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        int amount = testVendingMachine.getTokenCount();
        assertEquals(0, amount);
    }
    
    @Test
    public void testFillUp()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.fillUp(10);
        int amount = testVendingMachine.getCanCount();
        assertEquals(20,amount);
        
    }
    
    @Test
    public void testInsertToken()
    {
        VendingMachine testVendingMachine = new VendingMachine();
        testVendingMachine.insertToken();
        int amount = testVendingMachine.getTokenCount();
        assertEquals(1,amount);
    }
    
}
