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
    
    private Car car1;
    private Car car2;
    
    private Star star1;
    private Star star2;
    private Star star3;
    private Star star4;
    private Star star5;
    private Star star6;
    private Star shootingStar;
    
    private Snow snow1;
    private Snow snow2;
    private Snow snow3;
    private Snow snow4;
    private Snow snow5;
    private Snow snow6;
    private Snow snow7;
    private Snow snow8;
    
    /**
     * Constructs a Cityscape. 
     * Includes objects: Moon, Buildings, Roads, Sky, Car, and Stars.
     */
    public CityscapeComponent()
    {
        Color myGray = new Color(205,201,201);
        Color mySky = new Color(135,206,250);
        Color myYellow = new Color(255,255,224);
        Color myPurple = new Color(147,112,219);
        Color myGreen = new Color(10,250,154);
        
        moon = new Moon(600,40,75, myYellow);
        crescent = new Moon(600,40,50, mySky);
        
        building1 = new Building(200,200,75,250, myGray);
        building2 = new Building(100,400,75,150,myGray);
        building3 = new Building(10,330,75,150,myGray);
        building4 = new Building(320,280,75,170,myGray);
        building5 = new Building(400,250,75,200,myGray);
        building6 = new Building(500,350,75,200,myGray);
        building7 = new Building(610,280,75,200,myGray);
        
        road = new Building(0,450,800,150, myGray);
        roadLine1 = new Building(60,505,100,15, Color.YELLOW);
        roadLine2 = new Building(250,505,100,15, Color.YELLOW);
        roadLine3 = new Building(440,505,100,15, Color.YELLOW);
        roadLine4 = new Building(630,505,100,15, Color.YELLOW);
        
        sky = new Building(0,0,800,600, mySky);
        
        snow1 = new Snow(32,12);
        snow2 = new Snow(111,59);
        snow3 = new Snow(189,111);
        snow4 = new Snow(299,67);
        snow5 = new Snow(354,89);
        snow6 = new Snow(467,200);
        snow7 = new Snow(555,112);
        snow8 = new Snow(605,14);
        
        car1 = new Car(0,525,myPurple);
        car2 = new Car(800,475,myGreen);
        
        star1 = new Star(30,30);
        star2 = new Star(90,200);
        star3 = new Star(400,50);
        star4 = new Star(330,70);
        star5 = new Star(580,200);
        star6 = new Star(710,300);
        shootingStar = new Star(450,150);
    
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
        
        // Draws the cars.
        car1.draw(g2);
        car2.draw(g2);
        
        // Draws the stars.
        star1.draw(g2);
        star2.draw(g2);
        star3.draw(g2);
        star4.draw(g2);
        star5.draw(g2);
        star6.draw(g2);
        shootingStar.draw(g2);
        
        //Draws the snowflakes.
        for(int i = 0; i<100; i++)
        {
            
        }
        snow1.draw(g2);
        snow2.draw(g2);
        snow3.draw(g2);
        snow4.draw(g2);
        snow5.draw(g2);
        snow6.draw(g2);
        snow7.draw(g2);
        snow8.draw(g2);
    }
    
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        snow1.snowFall();
        snow2.snowFall();
        snow3.snowFall();
        snow4.snowFall();
        snow5.snowFall();
        snow6.snowFall();
        snow7.snowFall();
        snow8.snowFall();
        car1.moveCarRight();
        car2.moveCarLeft();
        shootingStar.shootingStar();

        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint();
    }

}
