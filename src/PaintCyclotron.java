import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;


public class PaintCyclotron extends Panel
{

	private static final long serialVersionUID = 1L;

	public PaintCyclotron()
	{
	}

	@Override
	public void paint (Graphics g)
	{
		g.setColor(Color.MAGENTA);
		g.fillOval(0,0,400,350);
		g.setColor(Color.WHITE);
		g.fillRect(175,0,50,350);
	}

}
