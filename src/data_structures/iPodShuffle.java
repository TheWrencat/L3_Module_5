package data_structures;

// Copyright The League of Amazing Programmers, 2015
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

/* 1. Download the JavaZoom jar from here: http://bit.ly/javazoom
* 2. Right click your project and add it as an External JAR (Under Java Build Path > Libraries).*/
public class iPodShuffle {
	
	
	
	public static void main(String[] args) throws IOException, JavaLayerException { // 3. Find an mp3 on your computer
																					// or on the Internet.
		// 4. Use the Song class below to instantiate a Song.
		Song wii = new Song("src/data_structures/Mii Channel Music.mp3");
		wii.play();
		wii.setDuration(5);
		// 5. Play the Song to test that it works. 
		/**
		 * 6. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
}