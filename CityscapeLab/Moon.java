import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * This class models a moon.
 *
 * @author dyang5200
 * @version 3 October 2017
 */
public class Moon
{
    /**
     * Defines instance variables for the Moon object
     */
    int x;
    int y;
    int radius;
    Color color;
    
    /**
     * Constructs a new Moon object with specified x, y, radius, and color values.
     * 
     * @param x1 the x value, y1 the y value, radius1 the radius,
     *      and color1 the color of the new sun
     */
    public Moon( int x1, int y1, int radius1, Color color1)
    {
        this.x = x1;
        this.y = y1;
        this.radius = radius1;
        this.color = color1;
    }
    
    /**
     * Method to move the moon across the sky.
     */
    public void moveMoon()
    {
        // this.x -= 10;
        // this.y -= 5;
    }
    
    /**
     * Draws a moon object.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(x,y,radius,radius);
        g2.setColor(color);
        g2.draw(moon);
        g2.fill(moon);
    }
}
