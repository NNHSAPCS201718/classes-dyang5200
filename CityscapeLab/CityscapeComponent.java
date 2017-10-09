import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @Danielle Yang
 * @version 3 October 2017
 */
public class CityscapeComponent extends JComponent
{
    // Define instance variables:
    
    Sun sun = new Sun(600,40,75);
    Building building1 = new Building(200,300,75,150);
    // Building building2 = new Building(100,400,75,300);
    // Building building3 = new Building(0,400,75,300);
    // Building building4 = new Building(300,400,75,300);
        
    // Building sky = new Building(0,0,800,600);
    
    Building road = new Building(0,450,800,150);
    // Building roadLine = new Building(200,400,75,300);
    
    public CityscapeComponent()
    {
        
    
    
    }
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        sun.draw(g2);
        
        // Draws a building.
        building1.draw(g2);
        
        // Draws the road.
        road.draw(g2);
        
        /*
         * Objects I want:
         *      - Moon moving across sky
         *      - Several Buildings
         *          - Lights flashing in buildings
         *      - Stars twinkling
         */
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
