import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Color;

/**
 * Write a description of class Moon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon
{

    private int xLeft;
    private int radius;

    /**
     * Default constructor for objects of class Moon
     */
    public Moon(int x, int size)
    {
        // initialise instance variables
        xLeft = x;
        radius = size; 
        
    }
   
    public void draw(Graphics2D g2)
    {

        Ellipse2D.Double moon = new Ellipse2D.Double(xLeft, -(radius/2), radius, radius);
        g2.draw(moon);
        g2.setColor(java.awt.Color.YELLOW);
        g2.fill(moon);
        
        
    }

}
