package windowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFirstButton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFirstButton frame = new MyFirstButton();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFirstButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnMyFirstButton = newButtonMyFirstButton();
		contentPane.add(btnMyFirstButton, BorderLayout.CENTER);
	}

	private JButton newButtonMyFirstButton() {
		JButton btnMyFirstButton = new JButton("My First Button");
		btnMyFirstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnMyFirstButton.getBackground().equals(Color.GREEN)) {
					btnMyFirstButton.setBackground(new Color(139, 0, 0));
				} else {
					btnMyFirstButton.setBackground(Color.GREEN);					
				}
			}
		});
		
		btnMyFirstButton.setBackground(new Color(139, 0, 0));
		btnMyFirstButton.setForeground(new Color(211, 211, 211));
		btnMyFirstButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		return btnMyFirstButton;
	}

}
