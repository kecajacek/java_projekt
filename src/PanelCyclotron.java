import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class PanelCyclotron extends Panel implements ActionListener, MouseListener
{
	private static final long serialVersionUID = 1L;

	protected JTextField voltage, magneticInduction, charge, mass, velocity, currentEnergy, currentVelocity;
	protected JButton showEnergy, showVelocity;
	
	protected int WIDTH=800;
	protected int HEIGHT=600; 

	public PanelCyclotron()
	{
		
		setLayout(null);
		setSize(WIDTH, HEIGHT);
		setBackground(Color.white);
		
		// 	CREATING ALL THINGS 
		
		voltage = new JTextField(); 
		magneticInduction  = new JTextField(); 
		charge = new JTextField(); 
		mass = new JTextField(); 
		velocity = new JTextField(); 
		currentEnergy = new JTextField(); 
		currentVelocity = new JTextField(); 
		
		showEnergy = new JButton("Poka¿ wykres E(t)");
		showVelocity = new JButton("Poka¿ wykres V(t)");
		
		// BOUNDS 
		
		voltage.setBounds(100, 150, 60, 30);
		magneticInduction.setBounds(100, 150 + 50, 60, 30);
		charge.setBounds(100, 150 + 100, 60, 30);
		mass.setBounds(100, 150 + 150, 60, 30);
		velocity.setBounds(100, 150 + 200, 60, 30);
		currentEnergy.setBounds(50 + 450, 30, 120, 30);
		currentVelocity.setBounds(50 + 600, 30, 120, 30);
		
		showEnergy.setBounds(50 + 395, 50 + 400, 150, 40);
		showVelocity.setBounds(50 + 550, 50 + 400, 150, 40);
		
		
		// ADDING THINGS
		
		add(voltage);
		add(magneticInduction); 
		add(charge); 
		add(mass); 
		add(velocity); 
		add(currentEnergy); 
		add(currentVelocity); 
		
		add(showEnergy); 
		add(showVelocity); 
		
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
