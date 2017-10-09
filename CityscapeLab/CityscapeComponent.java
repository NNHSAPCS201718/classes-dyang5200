import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author Danielle Yang @dyang5200
 * @version 3 October 2017
 */
public class CityscapeComponent extends JComponent
{
    /**
     * Initializes instance variables
     */
    private Moon moon;
    private Moon crescent;
    private Building building1;
    private Building building2;
    private Building building3;
    private Building building4;
    private Building building5;
    private Building building6;
    private Building building7;
    
    private Building road;
    private Building roadLine1;
    private Building roadLine2;
    private Building roadLine3;
    private Building roadLine4;
    
    private Building sky;
    
    /**
     * Constructs a Cityscape
     */
    public CityscapeComponent()
    {
        moon = new Moon(600,40,75, Color.YELLOW);
        crescent = new Moon(600,40,50, Color.BLUE);
        building1 = new Building(200,200,75,250, Color.GRAY);
        building2 = new Building(100,400,75,150,Color.GRAY);
        building3 = new Building(10,330,75,150,Color.GRAY);
        building4 = new Building(320,280,75,170,Color.GRAY);
        building5 = new Building(400,250,75,200,Color.GRAY);
        building6 = new Building(500,350,75,200,Color.GRAY);
        building7 = new Building(610,280,75,200,Color.GRAY);
        
        road = new Building(0,450,800,150, Color.GRAY);
        roadLine1 = new Building(60,505,100,15, Color.YELLOW);
        roadLine2 = new Building(250,505,100,15, Color.YELLOW);
        roadLine3 = new Building(440,505,100,15, Color.YELLOW);
        roadLine4 = new Building(630,505,100,15, Color.YELLOW);
        
        sky = new Building(0,0,800,600, Color.BLUE);
    
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * @param Graphics g
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        // Draws the sky.
        sky.draw(g2);
        
        // Draws the moon.
        moon.draw(g2);
        crescent.draw(g2);
        
        // Draws the buildings.
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        
        // Draws the road.
        road.draw(g2);
        roadLine1.draw(g2);
        roadLine2.draw(g2);
        roadLine3.draw(g2);
        roadLine4.draw(g2);
        
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
