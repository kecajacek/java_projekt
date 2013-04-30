import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class PanelCyclotron extends Panel implements ActionListener
{
	private static final long serialVersionUID = 1L;

	protected JTextField voltage, magneticInduction, charge, mass, velocity, currentEnergy, currentVelocity;
	protected JButton showEnergy, showVelocity, startSimolation, stopSimulation, newSimulation;
	protected JLabel labelVoltage, labelMagneticInduction, labelCharge, labelMass, labelVelocity, labelParticles;
	protected JLabel labelCurrentEnergy, labelCurrentVelocity;
	protected JComboBox<String> particles;
	protected PaintCyclotron cyclotron;
	protected Graphics g;
	 
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
		
		//FIRST RUN SETTINGS 
		
		voltage.setText("100");
		magneticInduction.setText("3.1");
		charge.setText("-1");
		mass.setText("0.00054");
		velocity.setText("0.001");
		
		// ICON BUTTONS
		ImageIcon startSimulationIcon = new ImageIcon("images/startSimulation.png");
		ImageIcon stopSimulationIcon = new ImageIcon("images/stopSimulation.png");
		ImageIcon newSimulationIcon = new ImageIcon("images/newSimulation.png");
		
		startSimolation = new JButton(startSimulationIcon);
		stopSimulation = new JButton(stopSimulationIcon);
		newSimulation = new JButton(newSimulationIcon);
		
		// COMBOBOX
		particles = new JComboBox<String>();
		particles.addItem("Elektron");
		particles.addItem("Proton");
		particles.addItem("Pozyton");
		particles.addItem("J¹dro Helu");
		particles.addItem("J¹dro Deuteru");
		particles.addItem("Argon");

		
		
		// BOUNDS 
		
		voltage.setBounds(100, 150, 60, 30);
		magneticInduction.setBounds(100, 150 + 50, 60, 30);
		charge.setBounds(100, 150 + 100, 60, 30);
		mass.setBounds(100, 150 + 150, 60, 30);
		velocity.setBounds(100, 150 + 200, 60, 30);
		particles.setBounds(50, 450, 150, 30);
		currentEnergy.setBounds(50 + 420, 30, 140, 30);
		currentVelocity.setBounds(50 + 570, 30, 140, 30);
		
		showEnergy.setBounds(50 + 395, 50 + 430, 150, 40);
		showVelocity.setBounds(50 + 550, 50 + 430, 150, 40);
		
		startSimolation.setBounds(20, 20,startSimulationIcon.getIconWidth() , startSimulationIcon.getIconHeight());
		stopSimulation.setBounds(120, 20,stopSimulationIcon.getIconWidth() , stopSimulationIcon.getIconHeight());
		newSimulation.setBounds(220, 20, newSimulationIcon.getIconWidth() , newSimulationIcon.getIconHeight());
		
		// LABELS
		
		labelVoltage = new JLabel("U[kV]");
		labelMagneticInduction = new JLabel("B[T]");
		labelCharge = new JLabel("q[e]");
		labelMass = new JLabel("m[mp]");
		labelVelocity = new JLabel("Vo[c]");
		labelParticles = new JLabel("Popularne cz¹ski: ");
		labelCurrentEnergy = new JLabel("Aktualna energia [eV]");
		labelCurrentVelocity = new JLabel("Aktualna prêdkoœæ [m/s]");
		
		labelVoltage.setBounds(50, 150, 60, 30);
		labelMagneticInduction.setBounds(50, 150 + 50, 60, 30);
		labelCharge.setBounds(50, 150 + 100, 60, 30);
		labelMass.setBounds(50, 150 + 150, 60, 30);
		labelVelocity.setBounds(50, 150 + 200, 60, 30);
		labelParticles.setBounds(50, 420, 150, 30);
		
		labelCurrentEnergy.setBounds(50 + 420, 5, 140, 30);
		labelCurrentVelocity.setBounds(50 + 570, 5, 140, 30);
		
		// ACTIONLISTENERS
		particles.addActionListener(this);
		showEnergy.addActionListener(this);
		showVelocity.addActionListener(this);
		startSimolation.addActionListener(this);
		stopSimulation.addActionListener(this);
		newSimulation.addActionListener(this);
		voltage.addActionListener(this);
		magneticInduction.addActionListener(this);
		charge.addActionListener(this);
		mass.addActionListener(this);
		velocity.addActionListener(this);
		
		//CYCLOTRON 
		cyclotron = new PaintCyclotron();
		cyclotron.setBackground(Color.white);
		cyclotron.setBounds(350, 100, 400, 350);
		add(cyclotron);
		
		
		// ADDING THINGS
		
		
		add(voltage);
		add(magneticInduction); 
		add(charge); 
		add(mass); 
		add(velocity); 
		add(particles);
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
		add(labelParticles);
		add(labelCurrentEnergy);
		add(labelCurrentVelocity);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getSource();
		
		if (source == particles)
		{
			String particle = particles.getSelectedItem().toString();
			if ( particle.equals("Elektron"))
			{
				voltage.setText("100");
				magneticInduction.setText("3.1");
				charge.setText("-1");
				mass.setText("0.00054");
				velocity.setText("0.001");
				
			}
			else if (particle.equals("Proton"))
			{
				voltage.setText("100");
				magneticInduction.setText("3.1");
				charge.setText("1");
				mass.setText("1");
				velocity.setText("0.001");
			}
			else if (particle.equals("Pozyton"))
			{
				voltage.setText("100");
				magneticInduction.setText("3.1");
				charge.setText("1");
				mass.setText("0.00054");
				velocity.setText("0.001");
			}
			else if (particle.equals("J¹dro Helu"))
			{
				voltage.setText("100");
				magneticInduction.setText("3.1");
				charge.setText("2");
				mass.setText("4");
				velocity.setText("0.001");
				
			}
			else if (particle.equals("J¹dro Deuteru"))
			{
				
				voltage.setText("100");
				magneticInduction.setText("3.1");
				charge.setText("1");
				mass.setText("2");
				velocity.setText("0.001");
			}
			else if(particle.equals("Argon"))
			{
				voltage.setText("100");
				magneticInduction.setText("3.1");
				charge.setText("6");
				mass.setText("18");
				velocity.setText("0.001");
			}
		}
			
		else if(source == showEnergy)
		{
			System.out.println("klikEnergy :)");
		}
		else if(source == showVelocity)
		{
			System.out.println("klikvelocity :)");
		}
		else if(source == startSimolation)
		{
			System.out.println("klikstartsim :)");
		}
		else if(source == stopSimulation)
			{
				System.out.println("klikstopsim :)");
			}
		else if(source == newSimulation)
			{
				System.out.println("kliknewsim :)");
			}
		
		
		//EXCEPRIONS OF BAD VALUE -> spr przed startem, mo¿e lepiej ... 
		
		else if(source == voltage)
		{
			try
			{
				Double.parseDouble(voltage.getText());
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(null, "Podaj wartoœæ liczbow¹.", "Niepoprawne Dane Wejœciowe", JOptionPane.ERROR_MESSAGE);
				voltage.setText("100");
			}
		}
		else if(source == magneticInduction)
		{
			try
			{
				Double.parseDouble(magneticInduction.getText());
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(null, "Podaj wartoœæ liczbow¹.", "Niepoprawne Dane Wejœciowe", JOptionPane.ERROR_MESSAGE);
				magneticInduction.setText("3.1");
			}
		}
		else if(source == charge)
		{
			try
			{
				Double.parseDouble(charge.getText());
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(null, "Podaj wartoœæ liczbow¹.", "Niepoprawne Dane Wejœciowe", JOptionPane.ERROR_MESSAGE);
				charge.setText("-1");
			}
		}
		else if(source == mass)
		{
			try
			{
				Double.parseDouble(mass.getText());
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(null, "Podaj wartoœæ liczbow¹.", "Niepoprawne Dane Wejœciowe", JOptionPane.ERROR_MESSAGE);
				mass.setText("0.00054");
			}
		}
		else if(source == velocity)
		{
			try
			{
				Double.parseDouble(velocity.getText());
			}
			catch (NumberFormatException exception)
			{
				JOptionPane.showMessageDialog(null, "Podaj wartoœæ liczbow¹.", "Niepoprawne Dane Wejœciowe", JOptionPane.ERROR_MESSAGE);
				velocity.setText("0.001");
			}
		}
	}
}	