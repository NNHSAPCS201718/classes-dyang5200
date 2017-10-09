import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Class for building object.
 *
 * @author @Danielle Yang
 * @version 3 October 2017
 */
public class Building
{
    /**
     * Defines instance variables for the Building object
     */
    int x;
    int y;
    int length;
    int width;
    Color color;
    
    /**
     * Constructs a new Building object with specified x, y, length, and width values.
     * 
     * @param x1 the x value, y1 the y value, length1 the length, width1 the width
     *          of the new Building
     */
    public Building( int x1, int y1, int length1, int width1, Color color1)
    {
        this.x = x1;
        this.y = y1;
        this.length = length1;
        this.width = width1;
        this.color = color1;
    }
    
    /**
     * Draws the buildings.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(x,y,length,width);
        g2.setColor(color);
        g2.draw(building);
        g2.fill(building);
    }
}
