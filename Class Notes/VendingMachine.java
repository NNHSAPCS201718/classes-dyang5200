
/**
 * Vending Machine
 * 
 * Methods:
 *      - Insert Token
 *      - Fill up with more cans
 *      - Number of Tokens
 *      - Number of Cans
 */
public class VendingMachine
{
    private int numTokens;
    private int numCans;
    
    public VendingMachine()
    {
        this.numCans = 10;
        this.numTokens = 0;
    }
    
    public VendingMachine(int cans)
    {
        this.numCans = cans;
        this.numTokens = 0;
    }

    public void fillUp(int cans)
    {
        this.numCans += cans;
    }
    
    public void insertToken()
    {
        this.numCans -= 1;
        this.numTokens += 1;
    }
    
    public int getCanCount()
    {
        return this.numCans;
    }
    
    public int getTokenCount()
    {
        return this.numTokens;
    }
    
    
    }
