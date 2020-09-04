package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// Copy Image Address)
		String image = "https://cms.qz.com/wp-content/uploads/2018/03/pi-symbol.png?w=350&h=339&crop=1&strip=all&quality=75";
		// 2. create a variable of type "Component" that will hold your image
		Component c;
		c = createImage(image);
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		quizWindow.add(c);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String pi = JOptionPane.showInputDialog(null, "what does the picture represent?");
		// 7. print "CORRECT" if the user gave the right answer
		if (pi.equals("pi"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(c);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://d1.awsstatic.com/sdks-and-tools/eclipse%20icon%201.3778a4cbe978d8dfd73c091706e26aa6c57c65aa.jpeg";
		
		c = createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(c);
		
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String eclipse = JOptionPane.showInputDialog("What does this logo mean?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(eclipse.equals("eclipse"))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
	}

	private Object loadImage() {
		// TODO Auto-generated method stub
		return null;
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
