import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * This class models a car.
 *
 * @author dyang5200
 * @version 10 October 2017
 */
public class Car
{
    private int x;
    private int y;
    private Color carColor;
    
    /**
     * Constructs a new Star object with specified x, y, and color1 values
     * @param x1 the x value, y1 the y value, and color1 the color of the car.
     */
    public Car(int x1, int y1, Color color1)
    {
        this.x = x1;
        this.y = y1;
        this.carColor = color1;
    }
    
    /**
     * Method to move a car to the right.
     */
    public void moveCarRight()
    {
        this.x += 10;
    }
    
    /**
     * Method to move the car to the left.
     */
    public void moveCarLeft()
    {
        this.x -= 10;
    }
    
    /**
     * Draws the car.
     * @param g2 the graphics content
     */
    public void draw(Graphics2D g2)
    {
        Rectangle car = new Rectangle(x,y+10,60,10);
        Ellipse2D.Double wheel = new Ellipse2D.Double(x+10,y+20,10,10);
        Ellipse2D.Double wheel2 = new Ellipse2D.Double(x+40,y+20,10,10);
        
        Point2D.Double r1 = new Point2D.Double(x+10,y+10);
        Point2D.Double r2 = new Point2D.Double(x+20,y);
        Point2D.Double r3 = new Point2D.Double(x+40,y);
        Point2D.Double r4 = new Point2D.Double(x+50,y+10);
        
        Line2D.Double frontWindshield = new Line2D.Double(r1,r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3,r4);
        
        g2.setColor(carColor);
        g2.draw(car);
        g2.fill(car);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
        g2.setColor(Color.BLACK);
        g2.draw(wheel);
        g2.draw(wheel2);
        g2.fill(wheel);
        g2.fill(wheel2);
    }
    
}
