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
     * Draws the buildings.
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Rectangle building = new Rectangle(200,400,75,300);
        g2.setColor(Color.GRAY);
        g2.draw(building);
        g2.fill(building);
    }
}
