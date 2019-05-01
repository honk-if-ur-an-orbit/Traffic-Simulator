import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Drivespace  extends Canvas
{
	JFrame frame;
	Canvas canvas;
	
	private ArrayList <Lane> lanes;
	private int laneCount;
	//**WIP** private Time timeOfDay;
	
	public static void main(String[] args)
	{
		Drivespace d = new Drivespace();
	}
	
	public Drivespace()
	{
		frame = new JFrame("Drivespace");
		canvas =  new Canvas();
		canvas.setSize(400, 400);
		
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
	}

	private void drawSpace(Graphics g)
	{
		int y = 0;
		int width;
		
		for(Lane l: lanes)
		{
			width = l.getWidth();
			g.drawRect(0, y, canvas.getWidth(), width);
			y += width;
		}
	}
	
	
}
