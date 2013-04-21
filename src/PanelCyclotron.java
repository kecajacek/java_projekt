import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class PanelCyclotron extends Panel implements ActionListener, MouseListener
{
	private static final long serialVersionUID = 1L;

	protected JTextField voltage, magneticInduction, charge, mass, velocity, currentEnergy, currentVelocity;
	protected JButton showEnergy, showVelocity, startSimolation, stopSimulation, newSimulation;
	protected JLabel labelVoltage, labelMagneticInduction, labelCharge, labelMass, labelVelocity;
	protected JLabel labelCurrentEnergy, labelCurrentVelocity;
	 
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
		
		// ICON BUTTONS
		ImageIcon startSimulationIcon = new ImageIcon("images/startSimulation.png");
		ImageIcon stopSimulationIcon = new ImageIcon("images/stopSimulation.png");
		ImageIcon newSimulationIcon = new ImageIcon("images/newSimulation.png");
		
		startSimolation = new JButton(startSimulationIcon);
		stopSimulation = new JButton(stopSimulationIcon);
		newSimulation = new JButton(newSimulationIcon);
		
		
		// BOUNDS 
		
		voltage.setBounds(100, 150, 60, 30);
		magneticInduction.setBounds(100, 150 + 50, 60, 30);
		charge.setBounds(100, 150 + 100, 60, 30);
		mass.setBounds(100, 150 + 150, 60, 30);
		velocity.setBounds(100, 150 + 200, 60, 30);
		currentEnergy.setBounds(50 + 420, 30, 140, 30);
		currentVelocity.setBounds(50 + 570, 30, 140, 30);
		
		showEnergy.setBounds(50 + 395, 50 + 430, 150, 40);
		showVelocity.setBounds(50 + 550, 50 + 430, 150, 40);
		
		startSimolation.setBounds(20, 20,startSimulationIcon.getIconWidth() , startSimulationIcon.getIconHeight());
		stopSimulation.setBounds(120, 20,stopSimulationIcon.getIconWidth() , stopSimulationIcon.getIconHeight());
		newSimulation.setBounds(220, 20, newSimulationIcon.getIconWidth() , newSimulationIcon.getIconHeight());
		
		// LABELS
		
		labelVoltage = new JLabel("U[V]");
		labelMagneticInduction = new JLabel("B[T]");
		labelCharge = new JLabel("q[e]");
		labelMass = new JLabel("m[mp]");
		labelVelocity = new JLabel("Vo[c]");
		labelCurrentEnergy = new JLabel("Aktualna energia [eV]");
		labelCurrentVelocity = new JLabel("Aktualna prêdkoœæ [m/s]");
		
		labelVoltage.setBounds(50, 150, 60, 30);
		labelMagneticInduction.setBounds(50, 150 + 50, 60, 30);
		labelCharge.setBounds(50, 150 + 100, 60, 30);
		labelMass.setBounds(50, 150 + 150, 60, 30);
		labelVelocity.setBounds(50, 150 + 200, 60, 30);
		
		labelCurrentEnergy.setBounds(50 + 420, 5, 140, 30);
		labelCurrentVelocity.setBounds(50 + 570, 5, 140, 30);
		
		
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
		
		add(startSimolation); 
		add(stopSimulation);
		add(newSimulation);
		
		add(labelVoltage);
		add(labelMagneticInduction);
		add(labelCharge);
		add(labelMass);
		add(labelVelocity);
		add(labelCurrentEnergy);
		add(labelCurrentVelocity);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
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


}
