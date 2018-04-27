package data_structures;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javazoom.jl.decoder.JavaLayerException;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
* 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/
public class iPodShuffle implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton randomSong;
	JButton stop;
	ArrayList<Song> Album;

	private void setup() {
		frame = new JFrame();
		panel = new JPanel();
		randomSong = new JButton();
		stop = new JButton();
		frame.setVisible(true);
		frame.add(panel);
		panel.add(randomSong);
		panel.add(stop);
		randomSong.addActionListener(this);
		stop.addActionListener(this);
		randomSong.setText("Surprise Me!");
		stop.setText("Stop Song");
		frame.pack();
	}

	public static void main(String[] args) throws IOException, JavaLayerException { // 3. Find an mp3 on your computer
																					// or on the Internet.
		Song mii = new Song("src/data_structures/Mii Channel Music.mp3");
		Song takeOn = new Song("/L3_Module_5/src/data_structures/a-ha - Take On Me (Official Video).mp3");
		Song tetrisTheme = new Song("/L3_Module_5/src/data_structures/Tetris Official Theme song.mp3");
		iPodShuffle pod = new iPodShuffle();
		pod.setup();
		ArrayList<Song> Album = new ArrayList<Song>();
		Album.add(mii);
		Album.add(takeOn);
		Album.add(tetrisTheme);
		// 4. Use the Song class below to instantiate a Song.
		// 5. Play the Song to test that it works.
		/**
		 * 6. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int r = new Random().nextInt(3);
		Song currentSong = Album.get(r);
		if (e.getSource() == randomSong) {
			currentSong.play();
			if (r == 0) {
				System.out.println("mii");
			}
			if (r == 1) {
				System.out.println("takeOn");
			}
			if (r == 2) {
				System.out.println("tetris");
			}
		}
		if (e.getSource() == stop) {
			currentSong.stop();
			System.out.println("song stopped");
		}
	}

}