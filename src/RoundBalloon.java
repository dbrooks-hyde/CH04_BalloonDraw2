import java.awt.Color;
import java.awt.Graphics;

public class RoundBalloon extends Balloon
{
	public RoundBalloon(int xCenter, int yCenter, int radius, Color color)
	{
		super(xCenter, yCenter, radius, color);
	}
	
	public void draw(Graphics g, boolean makeItFilled)
	{
	    g.setColor(getColor());
	
	    // Draw a circle...
	    if (makeItFilled)
	      g.fillOval(getX() - getRadius(),
	                 getY() - getRadius(), 2*getRadius(), 2*getRadius());
	    else
	      g.drawOval(getX() - getRadius(),
	                 getY() - getRadius(), 2*getRadius(), 2*getRadius());
	}
	
}
