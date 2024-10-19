package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class DemoWindowBuilder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoWindowBuilder frame = new DemoWindowBuilder();
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
	public DemoWindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1561, 725);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JLabel lblHelloWorld = newLblHelloWorld();
		contentPane.add(lblHelloWorld, BorderLayout.CENTER);
		
	}

	private JLabel newLblHelloWorld() {
		JLabel lblHelloWorld = new JLabel("Hello World");
		
		lblHelloWorld.setOpaque(true);
		lblHelloWorld.setBackground(new Color(255, 215, 0));
		lblHelloWorld.setForeground(new Color(0, 0, 128));
		lblHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelloWorld.setFont(new Font("Showcard Gothic", Font.BOLD, 24));
		
		return lblHelloWorld;
	}

}
