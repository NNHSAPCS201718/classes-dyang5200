import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Class for sun object.
 *
 * @author @Danielle Yang
 * @version 3 October 2017
 */
public class Sun
{
    /**
     * Defines instance variables for the Sun object
     */
    int x;
    int y;
    int radius;
    
    /**
     * Constructs a new Sun objects with specified x, y, and radius values.
     * 
     * @param x1 the x value, y1 the y value, radius1 the radius of the new sun
     */
    public Sun( int x1, int y1, int radius1 )
    {
        this.x = x1;
        this.y = y1;
        this.radius = radius1;
    }
    
    /**
     * Draws a sun object.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(x,y,radius,radius);
        g2.setColor(Color.YELLOW);
        g2.draw(sun);
        g2.fill(sun);
    }
}
