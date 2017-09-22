
/**
 * Write a description of class Target here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

public class Target
{
    /**
     * Draws the target
     * @param g2
     */
    
    /**
     * Draws the car.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        //The first black circle
        Ellipse2D.Double blackOne = new Ellipse2D.Double(80,80,160,160);
        
        //The first white circle
        Ellipse2D.Double whiteOne = new Ellipse2D.Double(90,90,140,140);
        
        g2.setColor(Color.BLACK);
        g2.draw(blackOne); // outline
        g2.fill(blackOne); // filled
        
        g2.draw(whiteOne);
        g2.setColor(Color.WHITE);
        g2.fill(whiteOne);
        
        // The second black circle
        Ellipse2D.Double blackTwo = new Ellipse2D.Double(100,100,120,120);
        
        //The second white cirlce
        Ellipse2D.Double whiteTwo = new Ellipse2D.Double(110,110,100,100);
        
        g2.draw(blackTwo);
        g2.setColor(Color.BLACK);
        g2.fill(blackTwo);
        
        g2.draw(whiteTwo);
        g2.setColor(Color.WHITE);
        g2.fill(whiteTwo);
        
        //The third black circle
        Ellipse2D.Double blackThree = new Ellipse2D.Double(120,120,80,80);
        g2.draw(blackThree);
        g2.setColor(Color.BLACK);
        g2.fill(blackThree);
        
        //The third white circle
        Ellipse2D.Double whiteThree = new Ellipse2D.Double(130,130,60,60);
        g2.draw(whiteThree);
        g2.setColor(Color.WHITE);
        g2.fill(whiteThree);
    }
}
