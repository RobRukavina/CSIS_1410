package counter;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

/**
 * Creates a Counter JFrame
 * 
 * @author Rob R.
 */
public class Counter extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JButton btnClickMe = new JButton("Click Me");
	private int counter = 00;
	
	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		ArrayList<Color> colors = new ArrayList<Color>(5);
		colors.add(Color.RED);
		colors.add(Color.BLUE);
		colors.add(Color.GREEN);
		colors.add(Color.ORANGE);
		colors.add(Color.MAGENTA);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter frame = new Counter(colors);
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
	public Counter(ArrayList<Color> colors) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCountRed = lblRedCounter();
		contentPane.add(lblCountRed);
		
		JLabel lblGUI = lblRobsGUI();
		contentPane.add(lblGUI);
		
		btn_ClickMe(lblCountRed, colors);
		contentPane.add(btnClickMe);
	}

	/**
	 * Creates a label that display's Rob's GUI
	 * 
	 * @return
	 */
	private JLabel lblRobsGUI() {
		JLabel lblGUI = new JLabel("Rob's GUI");
		lblGUI.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblGUI.setOpaque(true);
		lblGUI.setBackground(new Color(245, 245, 245));
		lblGUI.setBounds(0, 133, 484, 28);
		lblGUI.setHorizontalAlignment(SwingConstants.CENTER);
		
		return lblGUI;
	}

	/**
	 * Creates a label called Red Counter that displays
	 * how many times a red background is displayed on the 
	 * Click Me button
	 * 
	 * @return a new label
	 */
	private JLabel lblRedCounter() {
		JLabel lblCountRed = new JLabel("Red Counter: 00");
		
		lblCountRed.setFont(new Font("Monospaced", Font.PLAIN, 20));
		lblCountRed.setBounds(0, 0, 239, 134);
		lblCountRed.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountRed.setOpaque(true);
		lblCountRed.setBackground(new Color(211, 211, 211));
		
		return lblCountRed;
	}

	/**
	 * Creates a button labeled Click Me that changes colors on click
	 * and updates the Red Counter label with the number of times
	 * a red background is displayed on this button.
	 * 
	 * @param lblNewLabel
	 * @param colors
	 */
	private void btn_ClickMe(JLabel lblCountRed, ArrayList<Color> colors) {
		btnClickMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int r = rand.nextInt(0, 5);
				
				btnClickMe.setBackground(colors.get(r));
				btnClickMe.setForeground(Color.BLACK);
				
				if(btnClickMe.getBackground().equals(Color.RED)) {
					lblCountRed.setText("Red Counter: " + ++counter);	
				}
			}
		});
		
		btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClickMe.setBackground(new Color(0, 0, 255));
		btnClickMe.setFocusPainted(false);
		btnClickMe.setBorderPainted(false);
		btnClickMe.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnClickMe.setBounds(239, 0, 245, 134);
		btnClickMe.setForeground(new Color(255, 255, 255));
	}

}
