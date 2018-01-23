import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * This class models a star.
 *
 * @author dyang5200
 * @version 10 October 2017
 */
public class Star
{
    /**
     * Defines instance variables for Star object.
     */
    private int x;
    private int y;
    
    /**
     * Constructs a new Star object with specified x and y values
     * 
     * @param x1 the x value, y1 the y value
     */
    public Star(int x1, int y1)
    {
        this.x = x1;
        this.y = y1;
    }
    
    /**
     * Moves a star across the sky.
     */
    public void shootingStar()
    {
        this.x -= 10;
        if(this.x >= 200)
        {
            this.y -= 5;
        }
        else if(this.x <= 200)
        {
            this.y += 5;
        }
    }
    
    /**
     * Draws the stars.
     * @param g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        Point2D.Double pt1 = new Point2D.Double(x+10,y+15);
        Point2D.Double pt2 = new Point2D.Double(x+20,y+15);
        Point2D.Double pt3 = new Point2D.Double(x+25,y+5);
        Point2D.Double pt4 = new Point2D.Double(x+15,y);
        Point2D.Double pt5 = new Point2D.Double(x+5,y+5);
        Line2D.Double line1 = new Line2D.Double(pt1, pt4);
        Line2D.Double line2 = new Line2D.Double(pt4, pt2);
        Line2D.Double line3 = new Line2D.Double(pt2, pt5);
        Line2D.Double line4 = new Line2D.Double(pt5, pt3);
        Line2D.Double line5 = new Line2D.Double(pt3, pt1);
        Color myYellow = new Color(255,255,224);
        
        g2.setColor(myYellow);
        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);
        g2.draw(line5);
    }
}
