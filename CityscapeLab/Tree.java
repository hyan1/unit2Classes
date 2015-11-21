import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;
import java.awt.Color;
/**
 * Write a description of class Tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int yTop;
    /**
     * Constructor for objects of class Tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle body = new Rectangle(xLeft, yTop, 10, 60);
        Ellipse2D.Double top = new Ellipse2D.Double(xLeft-30,yTop-55,70,70);
        Color main = new Color(165, 42, 42);
        g2.setColor(main);
        g2.draw(body);
        g2.fill(body);
        g2.setColor(Color.GREEN);
        g2.draw(top);
        g2.fill(top);        
    }
}
