import java.awt.Color;
import java.awt.Graphics;

public class FancyBalloon extends Balloon 
{
	public FancyBalloon(int xCenter, int yCenter, int width, Color color)
	{
		super(xCenter, yCenter, width, color);
	}
	
	public void draw(Graphics g, boolean makeItFilled)
	{
	    g.setColor(getColor());
	
		// Draw a circle...
	    if (makeItFilled)
	      g.fillOval(getX() - getRadius(),
	                 getY() - getRadius()/2, 2*getRadius(), getRadius());
	    else
	      g.drawOval(getX() - getRadius(),
	    		  getY() - getRadius()/2, 2*getRadius(), getRadius());	
	}	
	
	public double distance(int x, int y)
	{
		double dx = x - getX();
		double dy = y - getY();

		int radius = getRadius();
		
		double d = (Math.pow(dx, 2)/Math.pow(radius, 2)) +
				   (Math.pow(dy, 2)/Math.pow(radius/2, 2));

		System.out.println("deltaX: " + dx);
		System.out.println("deltaY: " + dy);
		System.out.println("radius: " + radius);
		System.out.println("d: " + d);
		
		return d*radius;
	}	
}
