package ballon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GuiBallon extends JFrame {

	private JPanel contentPane;
	private BalloonPanel leftBalloonPanel;
	private BalloonPanel rightBalloonPanel;
	private JLabel lblEqual;
	private JPanel displayPanel;
	private final Random r = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiBallon frame = new GuiBallon();
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
	public GuiBallon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitle = createLblTitle();
		contentPane.add(lblTitle, BorderLayout.NORTH);
		
		JPanel displayPanel = createDisplayPanel();
		contentPane.add(displayPanel, BorderLayout.CENTER);
		
		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.SOUTH);

	}

	private JPanel createDisplayPanel() {
		displayPanel = new JPanel();
		displayPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
		displayPanel.setLayout(new GridLayout(1, 0, 10, 0));
		
		leftBalloonPanel = new BalloonPanel(getRandomBalloon());
		displayPanel.add(leftBalloonPanel);
		
		rightBalloonPanel = new BalloonPanel(getRandomBalloon());
		displayPanel.add(rightBalloonPanel);
		
		return displayPanel;
	}

	private Balloon getRandomBalloon() {
		BalloonSize[] sizes = BalloonSize.values();
		BalloonType[] types = BalloonType.values();

		int rdx = r.nextInt(0, sizes.length);
		BalloonSize randSize = sizes[rdx];
		
		rdx = r.nextInt(0, types.length);
		BalloonType randType = types[rdx];	
		
		return new Balloon(randSize, randType);
	}

	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		
		JButton compareBtn = new JButton("Compare");
		compareBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				leftBalloonPanel.updateBalloon(getRandomBalloon());
				rightBalloonPanel.updateBalloon(getRandomBalloon());
				
				checkEquals();
			}
		});
		
		
		lblEqual = new JLabel();
		checkEquals();
		
		controlPanel.add(compareBtn);
		controlPanel.add(lblEqual);
		
		return controlPanel;
	}

	private JLabel createLblTitle() {
		JLabel lblTitle = new JLabel("Balloon Demo");
		lblTitle.setBorder(new EmptyBorder(8, 0, 8, 0));
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		return lblTitle;
	}

	private void checkEquals() {
		Balloon left = leftBalloonPanel.getBalloon();
		Balloon right = rightBalloonPanel.getBalloon();
		
		if(left.equals(right)) {
			lblEqual.setText("Equal");
		} else {
			lblEqual.setText("Not Equal");
		}
	}

}
