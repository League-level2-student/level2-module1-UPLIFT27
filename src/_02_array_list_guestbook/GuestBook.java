package _02_array_list_guestbook;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuestBook implements ActionListener {
	ArrayList<String> list = new ArrayList<String>();
	JButton AddName = new JButton();
	JButton ViewNames = new JButton();

	void StartClass()

	{

		JFrame frame = new JFrame();

		JPanel panel = new JPanel();

		AddName.setText("Add Name");

		AddName.addActionListener(this);

		ViewNames.setText("View Names");

		ViewNames.addActionListener(this);

		panel.add(AddName);
		panel.add(ViewNames);

		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(0);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton button = (JButton) e.getSource();

		if (button == AddName) {

			String name = JOptionPane.showInputDialog("Enter your name");

			list.add(name);

		}

		if (button == ViewNames) {
			String names = "";

			for (int i = 0; i < list.size(); i++) {
				names+= "Guest #" + (i+1) + " " + list.get(i) + "\n"; 
				
			}
			JOptionPane.showMessageDialog(null, names);
		}

	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

}
