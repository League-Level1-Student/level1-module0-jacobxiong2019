package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
	public static void main(String[] args) {
		SoundEffectMachine Sound = new SoundEffectMachine();
		Sound.showButton();
	}
	int pressed = 0;
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		
		frame.add(panel);
		panel.add(button);
		button.setVisible(true);
		button.setText("Piano Note A");
		panel.add(button1);
		button1.setText("Piano Note B");
		panel.add(button2);
		button2.setText("Piano Note C");
		panel.add(button3);
		button3.setText("Piano Note D");
		panel.add(button4);
		button4.setText("Piano Note E");
		frame.pack();
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);

		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (button == arg0.getSource())
		{
			playSound("do.wav");
		}
		if (button1 == arg0.getSource())
		{
			playSound("re.wav");
		}
		if (button2 == arg0.getSource())
		{
			playSound("mi.wav");
		}
		if (button3 == arg0.getSource())
		{
			playSound("fa.wav");
		}
		if (button4 == arg0.getSource())
		{
			playSound("sol.wav");
		}
		
	}
	
	private void playSound(String fileName) {
	      AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	      sound.play();
	}


}
