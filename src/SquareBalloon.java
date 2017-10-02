/*
	Name: David Brooks
	Date: 9/27/2017
	Class: SquareBalloon
	
	This class extends the Balloon class and adds functionality that makes the 
	balloon square instead of round.
 */


import java.awt.Color;
import java.awt.Graphics;

public class SquareBalloon extends Balloon
{

	public SquareBalloon(int xCenter, int yCenter, int width, Color color)
	{
		super(xCenter, yCenter, width, color);
	}
	
	public void draw(Graphics g, boolean makeItFilled)
	{
	    g.setColor(getColor());
	
		// Draw a square...
	    if (makeItFilled)
	    	g.fillRect(getX()-getRadius(), getY()-getRadius(), 2*getRadius(), 2*getRadius());
	    else
	    	g.drawRect(getX()-getRadius(), getY()-getRadius(), 2*getRadius(), 2*getRadius());
	}
	
	public boolean isOnBorder(int x, int y)
	{
		// First case is the top border...
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();
		
		boolean nearTopOrBottom = false;
		boolean nearLeftOrRight = false;

		// First see if we are near the top line in the 'y' direction
		if (((yCenter - radius - 5) < y) && (y < (yCenter - radius + 5)))
		{
			System.out.println("Near the top border");
			nearTopOrBottom = true;
		}

		// First see if we are near the bottom line in the 'y' direction
		if (((yCenter + radius - 5) < y) && (y < (yCenter + radius + 5)))
		{
			System.out.println("Near the bottom border");
			nearTopOrBottom = true;
		}
		
		if (nearTopOrBottom && ((xCenter - radius) < x) || (x < (xCenter + radius)))
			return true;

		// See if we are near the left border in the 'x' direction...
		if (((xCenter - radius - 5) < x) && (x < (xCenter - radius + 5)))
		{
			System.out.println("Near the left border");
			nearLeftOrRight = true;
		}

		// See if we are near the right border in the 'x' direction...
		if (((xCenter + radius - 5) < x) && (x < (xCenter + radius + 5)))
		{
			System.out.println("Near the right border");
			nearLeftOrRight = true;
		}
		
		if (nearLeftOrRight && ((yCenter - radius) < y) || (y < (yCenter + radius)))
			return true;

		return false;
	}	
	
	public boolean isInside(int x, int y)
	{
		int xCenter = getX();
		int yCenter = getY();
		int radius = getRadius();
		
		return false;
	}

}
