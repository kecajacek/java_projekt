import java.awt.Color;
import java.awt.Graphics;


public class PaintCyclotron extends PanelCyclotron
{
	public PaintCyclotron()
	{
		
	}

	public void paintComponent (Graphics g)
	{
		//super.paintComponent(g)
		g.setColor(Color.MAGENTA);
		g.fillOval(200,200,200,200);
		g.setColor(Color.WHITE);
		g.fillRect(250,200,100,50);
		
		
	}

}
