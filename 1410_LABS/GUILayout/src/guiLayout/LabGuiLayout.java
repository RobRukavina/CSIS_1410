package guiLayout;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LabGuiLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiLayout frame = new LabGuiLayout();
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
	public LabGuiLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211, 211, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 5));
		
		JLabel lblDemoLayout = lblDemo();
		contentPane.add(lblDemoLayout, BorderLayout.NORTH);
				
		JLabel lblOne = mainLblOne(Color.YELLOW);
		JLabel lblTwo = mainLblTwo(Color.BLUE);
		JLabel lblThree = mainLblThree(Color.YELLOW);
		JLabel lblFour = mainLblFour(Color.YELLOW);
		
		controlPanel(lblOne, lblTwo, lblThree, lblFour);
		mainPanel(lblOne, lblTwo, lblThree, lblFour);
	}

	/**
	 * Creates the control panel where two buttons reside to 
	 * that are used to change the background colors of the labels passed
	 * based on which label is blue and which button is clicked
	 * 
	 * @param lblOne
	 * @param lblTwo
	 * @param lblThree
	 * @param lblFour
	 */
	private void controlPanel(JLabel lblOne, JLabel lblTwo, JLabel lblThree, JLabel lblFour) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		
		GridBagConstraints blc = new GridBagConstraints();
		GridBagConstraints brc = new GridBagConstraints();
		
		panel.setLayout(new GridBagLayout());
		
		contentPane.add(panel, BorderLayout.WEST);
		
		JButton btnLeft = btnLeft(blc, lblOne, lblTwo, lblThree, lblFour);
		panel.add(btnLeft, blc);
		
		JButton btnRight = btnRight(brc, lblOne, lblTwo, lblThree, lblFour);
		panel.add(btnRight, brc);
		
	}
	
	/**
	 * Holds the four labels with different background colors that
	 * will be changed by clicking buttons in the control panel pane.
	 * 
	 * @param lblOne
	 * @param lblTwo
	 * @param lblThree
	 * @param lblFour
	 */
	private void mainPanel(JLabel lblOne, JLabel lblTwo, JLabel lblThree, JLabel lblFour) {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		contentPane.add(panel, BorderLayout.CENTER);
		
		panel.setLayout(new GridLayout(1, 0, 8, 0));
			
		panel.add(lblOne);
		panel.add(lblTwo);
		panel.add(lblThree);
		panel.add(lblFour);
	}

	/**
	 * Creates label four for main panel
	 * 
	 * @return
	 */
	private JLabel mainLblFour(Color color) {
		JLabel lblFour = new JLabel("4");
		
		lblFour.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFour.setBackground(color);
		lblFour.setOpaque(true);
		lblFour.setHorizontalAlignment(SwingConstants.CENTER);
		
		return lblFour;
	}

	/**
	 * Creates label three for main panel
	 * 
	 * @return
	 */
	private JLabel mainLblThree(Color color) {
		JLabel lblThree = new JLabel("3");
		
		lblThree.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblThree.setBackground(color);
		lblThree.setOpaque(true);
		lblThree.setHorizontalAlignment(SwingConstants.CENTER);
		
		return lblThree;
	}

	/**
	 * Creates label two for main panel
	 * 
	 * @return
	 */
	private JLabel mainLblTwo(Color color) {
		JLabel lblTwo = new JLabel("2");
		
		lblTwo.setOpaque(true);
		lblTwo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblTwo.setBackground(color);
		lblTwo.setHorizontalAlignment(SwingConstants.CENTER);
		
		return lblTwo;
	}

	/**
	 * Creates label one for main panel
	 * 
	 * @return
	 */
	private JLabel mainLblOne(Color color) {
		JLabel lblOne = new JLabel("1");
		
		lblOne.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblOne.setBackground(color);
		lblOne.setOpaque(true);
		lblOne.setHorizontalAlignment(SwingConstants.CENTER);
		
		return lblOne;
	}

	

	/**
	 * Creates the right button which moves the blue background color
	 * one label to the right
	 * 
	 * @param brc
	 * @param lblOne
	 * @param lblTwo
	 * @param lblThree
	 * @param lblFour
	 * 
	 * @return JButton
	 */
	private JButton btnRight(GridBagConstraints brc, JLabel lblOne, JLabel lblTwo, JLabel lblThree, JLabel lblFour) {
		JButton btnRight = new JButton("==>");
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblOne.getBackground() == Color.BLUE) {
					lblTwo.setBackground(Color.BLUE);
					lblOne.setBackground(Color.YELLOW);
				} else if(lblTwo.getBackground() == Color.BLUE) {
					lblThree.setBackground(Color.BLUE);
					lblTwo.setBackground(Color.YELLOW);
				} else if(lblThree.getBackground() == Color.BLUE) {
					lblFour.setBackground(Color.BLUE);
					lblThree.setBackground(Color.YELLOW);
				} else if(lblFour.getBackground() == Color.BLUE) {
					lblOne.setBackground(Color.BLUE);
					lblFour.setBackground(Color.YELLOW);
				}
			}
		});
		btnRight.setFocusPainted(false);

		brc.weighty = 0.0;
		brc.gridheight = 1;
		brc.gridwidth = 1;
		brc.gridy = 1;
		brc.gridx = 1;
		brc.insets = new Insets(5,0,90,8);
		
		return btnRight;
	}

	/**
	 * Creates the left button which moves the blue background color
	 * one label to the left
	 * 
	 * @param blc
	 * @param lblOne
	 * @param lblTwo
	 * @param lblThree
	 * @param lblFour
	 * 
	 * @return JButton
	 */
	private JButton btnLeft(GridBagConstraints blc, JLabel lblOne, JLabel lblTwo, JLabel lblThree, JLabel lblFour) {
		JButton btnLeft = new JButton("<==");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblOne.getBackground() == Color.BLUE) {
					lblFour.setBackground(Color.BLUE);
					lblOne.setBackground(Color.YELLOW);
				} else if(lblTwo.getBackground() == Color.BLUE) {
					lblOne.setBackground(Color.BLUE);
					lblTwo.setBackground(Color.YELLOW);
				} else if(lblThree.getBackground() == Color.BLUE) {
					lblTwo.setBackground(Color.BLUE);
					lblThree.setBackground(Color.YELLOW);
				} else if(lblFour.getBackground() == Color.BLUE) {
					lblThree.setBackground(Color.BLUE);
					lblFour.setBackground(Color.YELLOW);
				}
			}
		});
		
		btnLeft.setFocusPainted(false);

		blc.weighty = 0.0;
		blc.gridheight = 1;
		blc.gridwidth = 1;
		blc.gridy = 0;
		blc.gridx = 1;
		blc.insets = new Insets(0,0,0,8);
		
		return btnLeft;
	}

	/**
	 * Creates a label that displays Demo Layout
	 * 
	 * @return JLabel
	 */
	private JLabel lblDemo() {
		JLabel lblDemoLayout = new JLabel("Demo Layout");
		
		lblDemoLayout.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblDemoLayout.setHorizontalAlignment(SwingConstants.CENTER);
		
		return lblDemoLayout;
	}

}
