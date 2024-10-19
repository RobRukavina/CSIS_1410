package guiIntro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTextField;

public class LabGuiIntro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiIntro frame = new LabGuiIntro();
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
	public LabGuiIntro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 562);
		
		contentPane = new JPanel();
 		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblTitle = newLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JButton btnNewButton = newButtonWest();
		contentPane.add(btnNewButton, BorderLayout.WEST);
		newTextPanel();
	}

	private void newTextPanel() {
		JPanel textPanel = new JPanel();
		textPanel.setBackground(new Color(128, 128, 128));
		contentPane.add(textPanel, BorderLayout.SOUTH);
		{
			JLabel lblNameTextField = new JLabel("Name: ");
			lblNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textPanel.add(lblNameTextField);
		}
		{
			nameTextField = new JTextField();
			nameTextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
			textPanel.add(nameTextField);
			nameTextField.setColumns(16);
		}
		{
			JLabel lblHi = new JLabel("Hi");
			lblHi.setOpaque(true);
			lblHi.setBackground(new Color(255, 0, 0));
			lblHi.setHorizontalAlignment(SwingConstants.CENTER);
			lblHi.setFont(new Font("Snap ITC", Font.BOLD, 77));
			contentPane.add(lblHi, BorderLayout.CENTER);
		}
	}

	private JButton newButtonWest() {
		JButton btnNewButton = new JButton("WEST");
		return btnNewButton;
	}

	private JLabel newLblTitle() {
		JLabel lblTitle = new JLabel("#1 GUI");
		lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblTitle.setOpaque(true);
		lblTitle.setFont(new Font("Poor Richard", Font.PLAIN, 33));
		lblTitle.setForeground(new Color(0, 255, 0));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBackground(new Color(0, 0, 128));
		return lblTitle;
	}

}
