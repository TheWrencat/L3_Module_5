package data_structures;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantaList implements MouseListener {
	JFrame frame;
	JPanel panel;
	int picker = new Random().nextInt(3);
	ArrayList<JLabel> images = new ArrayList<JLabel>();
	//1.Show an image on the screen using a JFrame.
	private void setup() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		JLabel presents = loadImageFromTheInternet("https://vignette.wikia.nocookie.net/glee/images/8/8a/Christmas-present-01.png/revision/latest?cb=20131125004106");
		images.add(presents);
		JLabel tree = loadImageFromTheInternet("https://parcdn.onjax.com/exitsioux/images/Lynda/Blog%20Pictures/christmas-tree-isolated_venplz.jpg");
		images.add(tree);
		JLabel food = loadImageFromTheInternet("https://cdn.xl.thumbs.canstockphoto.com/christmas-food-vector-set-set-of-traditional-christmas-food-and-desserts-holiday-decoration-image_csp41539571.jpg");
		images.add(food);
		panel.addMouseListener(this);
		//panel.add(tree);
		//panel.add(presents);
		panel.add(food);
		frame.pack();

	}
	
	public static void main(String[] args) {
		SantaList theList = new SantaList();
		theList.setup();
	}
	
	
	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) { 
			e.printStackTrace();
		}
		return null;
		
	}
	
	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	//Add pictures of things that you want for Christmas to the List.
	//2.1. Create and initialize an ArrayList of JLabels.
	//2.2. Use the methods above to load images from the Internet or from your default package.
	//2.3. Add the JLabels to the List. When the mouse is clicked, show a random image from the List.

	@Override
	public void mouseClicked(MouseEvent e) {
		picker = new Random().nextInt(3);
		System.out.println(picker);
		panel.removeAll();
		panel.add(images.get(picker));
		frame.pack();
		
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
