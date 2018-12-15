package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList();
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	public static void main(String[] args) {
		_02_GuestBook gb = new _02_GuestBook();
		gb.run();
	}
	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button);
		panel.add(button2);
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
		String s = JOptionPane.showInputDialog("Whose name will you add?");
		names.add(s);
		}
	if(e.getSource() == button2) {
		for (int i = 0; i < names.size(); i++) {
			JOptionPane.showMessageDialog(frame,"Guest # " + i + 1 + " " + names.get(i) + "\n");
		} 
		
	}
	}
	}

	
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	
	


