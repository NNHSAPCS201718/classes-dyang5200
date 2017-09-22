
/**
 * Draws a shooting target - set of concentric rings in alternating
 *      black and white colors
 *      Hint: fill a black circle, then fill a smaller white circle
 *      on top, and so on.
 *      
 *      Classes: Target, TargetComponent, and Target Viewer
 * 
 */
import javax.swing.JFrame;

/**
 * Creates the frame to view the target.
 */

public class TargetViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        frame.add(component);
        
        frame.setVisible(true);
    }
}
