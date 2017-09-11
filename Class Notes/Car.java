
/**
 * This class models a car.
 * 
 * @author Danielle Yang
 * @ version 11 September 2017
 */
public class Car
{
    /*
     * Instance variables store the object's properties.
     *      specify the visibility (eg. private)
     *          public: accessible by anyone
     *          private: only accessible by methods in this class
     *      specify the type (eg. double)
     *      specify the name (eg. fuelEfficiency, fuelInTank)
     *      
     * Instance variables differ from local variables in the following ways:
     *      scoped to their class (accessible from all methods)
     *      automatically initialized to a default value (0, false, null)
     */
    
    private double fuelEfficiency; // in units of miles per gallon
    private double fuelInTank; // in units of gallons
    
    
    /*
     * When defing a method, specify:
     *      the visibility (eg. public)
     *      the return type (eg. void)
     *      the method name (eg. drive)
     *      the parameters and their types (eg. distance of type double)
     *      
     */
    /**
     * Drives this car the specified distance, consuming fuel
     * 
     * @param distance the distance, in miles, this car drives
     */
    public void drive(double distance)
    {
        
    }

    
    /**
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param amount the amount of fuel, in gallons, to add to this car's tank
     */
    public void addGas(double amount)
    {
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @returns the amount of fuel, in gallons, in this car's tank
     */
    public double getGasInTank()
    {
        return 0;
    }
}
