import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Class for car object.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private int x;
    private int y;
    
    /**
     * Constructs a car.
     * @param x1 the x-coordinate of the top-left corner
     * @param y1 the y-coordinate of the top-left corner
     */
    public Car(int x1, int y1)
    {
        this.x = x1;
        this.y = y1;
    }
    
    /**
     * Draws the car.
     * @param g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        Rectangle car = new Rectangle(x,y+10,60,10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(x+10,y+20,10,10);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(x+40,y+20,10,10);
        
        Point2D.Double r1 = new Point2D.Double(x+10,y+10);
        Point2D.Double r2 = new Point2D.Double(x+20,y);
        Point2D.Double r3 = new Point2D.Double(x+40,y);
        Point2D.Double r4 = new Point2D.Double(x+50,y+10);
        
        Line2D.Double frontWindshield = new Line2D.Double(r1,r2);
    }
    
}
