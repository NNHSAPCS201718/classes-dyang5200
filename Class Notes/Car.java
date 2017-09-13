
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
     * Constructor:
     *      responsible for initializing newly created objects
     *      invoked automatically via new operator
     *      name of the constructor must match the name of the class
     *      has no return type (not even void)
     *      multiple constructors may be defined for a class
     *      one constructor may call another constructor (with restrictions)
     */
    
    /**
     * Default constructor for the Car class.
     *      Initializes the fuel efficiency to 30 mpg.
     */
    public Car()
    {
        this.fuelEfficiency = 30;
        this.fuelInTank = 0;
    }
    
    /**
     * Constructs a new Car object with the specified inital fuel efficiency
     * 
     * @param initialFuelEfficiency the initial fuel efficiency, in miles per 
     *                              gallon, of this new car
     */
    public Car( double initialFuelEfficiency )
    {
        /*
         * If the parameter was named fuelEfficiency, it would "shadow" the
         *      instance variable fuelEfficiency.
         * Local and parameter variables "shadow" instance variables of
         *      the same name. In this code, fuelEfficiency would refer to
         *      the parameter and not the instance variable.
         *      
         * To refer to the instance variable, use "this", which is
         *      a reserved word that references the current object
         *      (like self in Python)
         *      
         * Mr. Schmit thinks it is good practice to use "this" almost always
         */
        
        fuelEfficiency = 7;
        
        this.fuelEfficiency = initialFuelEfficiency;
        this.fuelInTank = 0;
    }
    
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
        this.fuelInTank -= (distance / this.fuelEfficiency);
    }

    
    /**
     * Adds the specified amount of fuel to this car's tank
     * 
     * @param amount the amount of fuel, in gallons, to add to this car's tank
     */
    public void addGas(double amount)
    {
        this.fuelInTank += amount;
    }
    
    /**
     * Returns the amount of fuel in this car's tank
     * 
     * @returns the amount of fuel, in gallons, in this car's tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
}
