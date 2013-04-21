import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;


public class ProjectCyclotron extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	protected JMenuBar menu;
	protected JMenu options, settings, help;
	protected JMenuItem close;
	protected JMenuItem informations;

	protected PanelCyclotron mainPanel; 

	protected int WIDTH=800;
	protected int HEIGHT=600; 
	
	public ProjectCyclotron()
	{
		// FRAME SETTINGS 
		setTitle("Cyklotron Marysia & Jacek");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setVisible(true);
		
		
		
		// CREATING MENU
		
		menu = new JMenuBar(); 
		
		options = new JMenu("Opcje");
		settings = new JMenu("Ustawienia");
		help = new JMenu("Pomoc");
		
		close = new JMenuItem("Zamknij");
		informations = new JMenuItem("Informacje");
		
		close.addActionListener(this);
		informations.addActionListener(this);
		
		// KEYSTROKES
		
		close.setAccelerator(KeyStroke.getKeyStroke("ctrl K"));
		informations.setAccelerator(KeyStroke.getKeyStroke("ctrl I"));
		
		// ADDING THINGS TO FRAME 
		
		options.add(close);
		help.add(informations);
		
		menu.add(options);
		menu.add(settings);
		menu.add(help);
		
		setJMenuBar(menu);

		mainPanel = new PanelCyclotron();
		add(mainPanel);
		
				
	}
	public static void main(String[] args) 
	{
		new ProjectCyclotron();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if (source == informations)
		{
			JOptionPane.showMessageDialog(this, "Program napisany przez Mariê Sawick¹ i Jacka Rosiñskiego" +
					"\n 2013 - czwarty semestr studiów na kierunku Fizyka Techniczna");
		} 
		else if (source == close)
		{
			dispose();
		}
		
	}

}
