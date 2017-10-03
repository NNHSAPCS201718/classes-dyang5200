import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Class for moon object.
 *
 * @author @Danielle Yang
 * @version 3 October 2017
 */
public class Moon
{
    /**
     * Draws a moon object.
     * @param g2 the graphics context
     */
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double moon = new Ellipse2D.Double(600,40,75,75);
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(moon);
        g2.fill(moon);
    }
}
