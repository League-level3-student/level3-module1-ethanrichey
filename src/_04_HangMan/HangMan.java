package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Dictionary;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.omg.Messaging.SyncScopeHelper;

public class HangMan implements KeyListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
Stack <String> words = new Stack<String>();
String under = "_";
	public static void main(String[]args) {
		HangMan hm = new HangMan();
		hm.run();
	}
	
	public void run() {
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel.add(label);
		String userType = JOptionPane.showInputDialog("How many words do you want to solve?");
		Integer num = new Integer(userType);
		for(int i = 0; i < num; i ++) {
			String word = Utilities.readRandomLineFromFile("dictionary.txt");
			words.push(word);
			
		}
		wordBlanks();
	}

	public void wordBlanks() {
		System.out.println(words);
		String ward = words.pop();
		String display = ward;
		label.setText(display);
		for (int i = 0; i < display.length(); i++) {
			
			
		}
		
		
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char key = e.getKeyChar();
		System.out.println(key);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
