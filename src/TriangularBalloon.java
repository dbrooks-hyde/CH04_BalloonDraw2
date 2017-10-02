import java.awt.Color;
import java.awt.Graphics;

public class TriangularBalloon extends Balloon 
{
	public TriangularBalloon(int xCenter, int yCenter, int width, Color color)
	{
		super(xCenter, yCenter, width, color);
	}
	
	public void draw(Graphics g, boolean makeItFilled)
	{
	    g.setColor(getColor());
	
		// Draw a circle...
	    if (makeItFilled)
	      g.fillOval(getX() - getRadius(),
	                 getY() - getRadius(), 2*getRadius(), getRadius());
	    else
	      g.drawOval(getX() - getRadius(),
	    		  getY() - getRadius(), 2*getRadius(), getRadius());	
	}	
	
	public boolean isOnBorder(int x, int y)
	{
		int deltaX = x - getX();
		int deltaY = y - getY();
		int radius = getRadius();
		
		double d = (Math.pow(deltaX, 2)/Math.pow(radius, 2)) +
				   (Math.pow(deltaY, 2)/Math.pow(radius/2, 2));

		System.out.println("deltaX: " + deltaX);
		System.out.println("deltaY: " + deltaY);
		System.out.println("radius: " + radius);
		System.out.println("d: " + d);
		
		if ((0.8 < d) && (d < 1.2))
			return true;
		
		return false;
	}
	
	public boolean isInside(int x, int y)
	{
		return false;
	}
	

}
