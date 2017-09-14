
/**
 * Creates a class that models a door object.
 *
 * @author Danielle Yang
 * @version 14 September 2017
 */
public class Door
{
    private String name;
    private boolean isOpened;
    
    public void open()
    {
        this.isOpened = true;
    }
    
    public void close()
    {
        this.isOpened = false;
    }
    
    public void setName(String newName)
    {
        this.name=newName;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public boolean getState()
    {
        return this.isOpened;
    }
    
    public Door(boolean initialIsOpened, String name)
    {
        this.isOpened = initialIsOpened;
        this.name = name;
    }
    
    
    
    
    
}
