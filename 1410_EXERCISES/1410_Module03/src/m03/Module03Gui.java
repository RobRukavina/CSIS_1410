package m03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Module03Gui extends JFrame {
	private JPanel contentPane;
	private JLabel lblBrown;
	private JLabel lblCox;
	private JLabel lblHenderson;
	private JLabel lblPeterson;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module03Gui frame = new Module03Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame.
	 */
	public Module03Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.WEST);
		
		JPanel displayPanel = createDisplayPanel();
		contentPane.add(displayPanel, BorderLayout.CENTER);
	}

	/**
	 * Creates the display panel which displays the 
	 * details about each candidate. When a button
	 * in the Control Panel is clicked, it changes the font
	 * color of the corresponding label in the display panel.
	 * 
	 * @return
	 */
	private JPanel createDisplayPanel() {
		JPanel displayPanel = new JPanel();
		displayPanel.setBorder(new EmptyBorder(5, 5, 0, 5));
		contentPane.add(displayPanel, BorderLayout.CENTER);
		displayPanel.setLayout(new GridLayout(4, 0, 0, 5));
		
		lblBrown = new JLabel("Karina Andelin Brown Lt. Gov (D)");
		lblBrown.setFont(new Font("Arial", Font.PLAIN, 18));
		lblBrown.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblBrown.setHorizontalAlignment(SwingConstants.CENTER);
		displayPanel.add(lblBrown);
		
		lblCox = new JLabel("Spencer Cox Gov (R)");
		lblCox.setFont(new Font("Arial", Font.PLAIN, 18));
		lblCox.setHorizontalAlignment(SwingConstants.CENTER);
		lblCox.setBorder(new EmptyBorder(0, 0, 0, 0));
		displayPanel.add(lblCox);
		
		lblHenderson = new JLabel("Deidre Henderson Lt Gov (R)");
		lblHenderson.setHorizontalAlignment(SwingConstants.CENTER);
		lblHenderson.setFont(new Font("Arial", Font.PLAIN, 18));
		lblHenderson.setBorder(new EmptyBorder(0, 0, 0, 0));
		displayPanel.add(lblHenderson);
		
		lblPeterson = new JLabel("Chris Peterson Gov (D)");
		lblPeterson.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPeterson.setHorizontalAlignment(SwingConstants.CENTER);
		displayPanel.add(lblPeterson);
		
		return displayPanel;
	}

	/**
	 * Creates the control panel which houses buttons for
	 * each candidate with their picture on them. When a 
	 * candidate's button is clicked, the font color of that 
	 * candidate's label in the display panel is changed to
	 * either red or blue depending on the candidate's party.
	 * 
	 * @return
	 */
	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setBorder(new EmptyBorder(5, 5, 0, 5));
		controlPanel.setLayout(new GridLayout(4, 0, 0, 5));
		
		JButton btnHenderson = new JButton("");
		btnHenderson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeFontColor(lblHenderson.getText().substring(0, 3));
			}
		});
		btnHenderson.setFocusPainted(false);
		btnHenderson.setBackground(Color.WHITE);
		btnHenderson.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnHenderson.setIcon(new ImageIcon(Module03Gui.class.getResource("/m03/Images/deidre.jpg")));
		controlPanel.add(btnHenderson);
		
		JButton btnBrown = new JButton("");
		btnBrown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeFontColor(lblBrown.getText().substring(0, 3));
			}
		});
		btnBrown.setFocusPainted(false);
		btnBrown.setBackground(Color.WHITE);
		btnBrown.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnBrown.setIcon(new ImageIcon(Module03Gui.class.getResource("/m03/Images/Karina.jpg")));
		controlPanel.add(btnBrown);
		
		JButton btnPeterson = new JButton("");
		btnPeterson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeFontColor(lblPeterson.getText().substring(0, 3));
			}
		});
		btnPeterson.setFocusPainted(false);
		btnPeterson.setBackground(Color.WHITE);
		btnPeterson.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnPeterson.setIcon(new ImageIcon(Module03Gui.class.getResource("/m03/Images/chris.jpg")));
		controlPanel.add(btnPeterson);

		JButton btnCox = new JButton("");
		btnCox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changeFontColor(lblCox.getText().substring(0, 3));
			}
		});
		btnCox.setFocusPainted(false);
		btnCox.setBackground(Color.WHITE);
		btnCox.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnCox.setIcon(new ImageIcon(Module03Gui.class.getResource("/m03/Images/spencer.jpg")));
		controlPanel.add(btnCox);
		
		return controlPanel;
	}

	/**
	 * Changes the font color of a candidate's label to 
	 * the color of that candidates party based on the first
	 * three letters of that candidate's corresponding label text
	 * passed as a string.
	 * 
	 * @param lblTxt
	 */
	private void changeFontColor(String lblTxt) {
		switch(lblTxt) {
			case "Kar":
				lblBrown.setForeground(Color.blue);
				lblPeterson.setForeground(Color.black);
				lblCox.setForeground(Color.black);	
				lblHenderson.setForeground(Color.black);
				break;
			case "Spe":
				lblBrown.setForeground(Color.black);
				lblPeterson.setForeground(Color.black);
				lblCox.setForeground(Color.red);	
				lblHenderson.setForeground(Color.black);
				break;
			case "Dei":
				lblBrown.setForeground(Color.black);
				lblPeterson.setForeground(Color.black);
				lblCox.setForeground(Color.black);	
				lblHenderson.setForeground(Color.red);
				break;
			case "Chr":
				lblBrown.setForeground(Color.black);
				lblPeterson.setForeground(Color.blue);
				lblCox.setForeground(Color.black);	
				lblHenderson.setForeground(Color.black);
				break;
		}
	}
	
	/**
	 * Creates the title label
	 * 
	 * @return
	 */
	private JLabel createLblTitle() {
		JLabel lblTitle = new JLabel("Utah Elections - Who is Who");
		lblTitle.setBorder(new EmptyBorder(7, 0, 7, 0));
		lblTitle.setOpaque(true);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setForeground(new Color(150, 155, 155));
		lblTitle.setFont(new Font("Lucida Sans", Font.PLAIN, 25));
		lblTitle.setBackground(new Color(230, 235, 235));
		return lblTitle;
	}

}
