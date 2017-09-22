
/**
 * Draws a target.
 *
 * @author Danielle Yang
 * @version 21 September 2017
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Target target1 = new Target();
        
        target1.draw(g2);
    }
}
