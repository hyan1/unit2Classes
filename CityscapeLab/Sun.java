import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int radius;

    /**
     * Constructor for objects of class Sun
     */
    public Sun(int x, int size)
    {
        // initialise instance variables
        this.xLeft = x;
        this.radius = size;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double Circle = new Ellipse2D.Double(xLeft,-(radius/2),radius,radius);
        Color sun = new Color(139, 0, 0);
        g2.setColor(sun);
        g2.draw(Circle);
        g2.fill(Circle);
        xLeft -= 5;
    }
}
