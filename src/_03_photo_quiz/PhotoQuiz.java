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
		String image2 = "data:image/png;base64,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";
		
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
