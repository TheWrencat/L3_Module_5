package data_structures;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ComedyCentral implements ActionListener {
	JButton button; 
	JFrame frame;
	int pressCount = 0;
	ArrayList<String> punchlines;
	ArrayList<String> jokes;
	int r=0;
	private void setup() {
		frame = new JFrame();
		button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		button.setText("Joke");
		frame.setVisible(true);
		frame.pack();
		
		jokes = new ArrayList<String>();
		jokes.add("What's the best thing about Switzerland?");
		jokes.add("I invented a new word:");
		jokes.add("Did you hear about the mathematician who's afraid of numbers?");
		punchlines = new ArrayList<String>();
		punchlines.add("I don't know, but the flag is a big plus.");
		punchlines.add("Plagiarism.");
		punchlines.add("He'll stop at nothing to avoid them.");
		

	}
public static void main(String[] args) {
	ComedyCentral com = new ComedyCentral();
	com.setup();
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(pressCount %2 == 0) {
		r = new Random().nextInt(3);
		System.out.println(jokes.get(r));
	}
	if(pressCount %2 != 0) {
		System.out.println(punchlines.get(r));
		
	}
	pressCount ++;
	
}
}
