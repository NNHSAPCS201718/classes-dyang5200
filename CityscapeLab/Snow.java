import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
/**
 * This class models a snowflake
 *
 * @author dyang5200
 */
public class Snow
{
    /**
     * Defines instance variables for Snow object.
     */
    private int x;
    private int y;
    
    /**
     * Constructs a new Star object with specified x and y values
     * 
     * @param x1 the x value, y1 the y value
     */
    public Snow(int x1, int y1)
    {
        this.x = x1;
        this.y = y1;
    }
    
    /**
     * Moves a snowflake across the sky.
     */
    public void snowFall()
    {
        this.y += 10;
    }
    
    /**
     * Draws the stars.
     * @param g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        Color myWhite = new Color(255,250,250);
        Ellipse2D.Double star = new Ellipse2D.Double(x,y,5,5);
        g2.setColor(myWhite);
        g2.draw(star);
        g2.fill(star);
    }
}
