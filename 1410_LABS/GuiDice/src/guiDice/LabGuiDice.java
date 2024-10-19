package guiDice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class LabGuiDice extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiDice frame = new LabGuiDice();
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
	public LabGuiDice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDiceImg = myLblDiceImg();
		contentPane.add(lblDiceImg, BorderLayout.CENTER);
		
		JButton btnNewButton = newBtnRollEm(lblDiceImg);
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
	}

	private JButton newBtnRollEm(JLabel lblDiceImg) {
		JButton btnNewButton =  new JButton("Roll 'Em");
		
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 215, 0));
		btnNewButton.setFont(new Font("Unispace", Font.BOLD, 30));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random random = new Random();
				int ran = random.nextInt(6) + 1;
				lblDiceImg.setIcon(new ImageIcon(LabGuiDice.class.getResource("/img/die-"+ ran + ".png")));
			}
		});
		
		return btnNewButton;
	}

	private JLabel myLblDiceImg() {
		JLabel lblDiceImg = new JLabel("");
		
		lblDiceImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiceImg.setIcon(new ImageIcon(LabGuiDice.class.getResource("/img/die-6.png")));
		
		return lblDiceImg;
	}

}
