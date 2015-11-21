import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;


/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    private int moon_radius;
    private int moon_distance;
    private int building_height;
    private int sun_distance;
    
    /**
     * Descibe instance variables
     */
    public CityscapeComponent(int moon_radius, int moon_distance, int building_height, int sun_distance)
    {

        
        this.moon_radius = moon_radius;
        this.moon_distance = moon_distance;
        this.building_height = building_height;
        this.sun_distance = sun_distance;  
    }
    
   
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
       Graphics2D g2 = (Graphics2D) g;
       
       int x = getWidth();
       int y = getHeight();
        
       Color night = new Color(0,0,51);
       g2.setColor(night);
       Rectangle sky = new Rectangle(0,0,800,600);
       g2.draw(sky);
       g2.fill(sky);
       Color street = new Color(32,32,32);
       g2.setColor(street);
       Rectangle ground = new Rectangle(0,500,800,100);
       g2.draw(ground);
       g2.fill(ground);
       Moon moon = new Moon(moon_distance,moon_radius);
       Sun sun = new Sun(sun_distance,moon_radius);  
       if (moon_distance <0)
       {
           Color day = new Color(102,178,255);
           g2.setColor(day);
           g2.fill(sky);
           Color street2 = new Color(92, 64, 51);
           g2.setColor(street2);
           g2.fill(ground);
           sun.draw(g2);
           sun_distance -= 5;
       }
       else
       {
           moon.draw(g2);
           moon_distance -= 5;
        }
       if(sun_distance < 0)
       {
           moon_distance += 750;
           sun_distance += 750;
       } 
       
       Building b1 = new Building(100,building_height);
       b1.draw(g2);
       Building b2 = new Building(300,building_height);
       b2.draw(g2);
       Building b3 = new Building(200, building_height);
       b3.draw(g2);
       
       Tree t1 = new Tree(430, 442);
       Tree t2 = new Tree(500, 442);
       Tree t3 = new Tree(570, 442);
       Tree t4 = new Tree(640, 442);
       Tree t5 = new Tree(710, 442);
       Tree t6 = new Tree(48, 442);
       t1.draw(g2);
       t2.draw(g2);
       t3.draw(g2);
       t4.draw(g2);
       t5.draw(g2);
       t6.draw(g2);

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
        repaint();
    }

}
