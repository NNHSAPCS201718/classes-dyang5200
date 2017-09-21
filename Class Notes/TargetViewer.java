
/**
 * Draws a shooting target - set of concentric rings in alternating
 *      black and white colors
 *      Hint: fill a black circle, then fill a smaller white circle
 *      on top, and so on.
 *      
 *      Classes: Target, TargetComponent, and Target Viewer
 * 
 */
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JComponent;
/**
 * A target.
 */

public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }
    /**
     * Draws the target
     * @param g2
     */
    
    public void draw(Graphics2D g2)
    {
        //The first black circle
        Ellipse2D.Double blackOne = new Ellipse2D.Double(50,50,30,30);
        
        g2.draw(blackOne);
    }
}
