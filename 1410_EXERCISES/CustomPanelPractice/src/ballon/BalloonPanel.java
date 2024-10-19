package ballon;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class BalloonPanel extends JPanel {
	private Balloon balloon;
	private JLabel lblBalloon;
	private JLabel lblType;
	
	/**
	 * Creates the BalloonPanel that displays an image corresponding
	 * to the size of the balloon.
	 * Also displays a label that displays if the balloon is filled
	 * with Helium or air.
	 */
	public BalloonPanel(Balloon balloon) {
		this.balloon = balloon;
		
		setLayout(new BorderLayout(0, 0));
		
		lblBalloon = createLblBalloon();
		add(lblBalloon, BorderLayout.CENTER);
		
		lblType = createTypeLbl();
		add(lblType, BorderLayout.SOUTH);

	}

	public Balloon getBalloon() {
		return balloon;
	}

	private JLabel createTypeLbl() {
		JLabel lblType = new JLabel(balloon.getType().toString());
		lblType.setBorder(new EmptyBorder(8, 8, 8, 8));
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		return lblType;
	}

	private JLabel createLblBalloon() {
		JLabel lblBalloon = new JLabel("");
		lblBalloon.setOpaque(true);
		lblBalloon.setBackground(new Color(255, 255, 255));
		lblBalloon.setIcon(getBalloonIcon());
		lblBalloon.setHorizontalAlignment(SwingConstants.CENTER);
		return lblBalloon;
	}

	private Icon getBalloonIcon() {
		String path;

		switch(balloon.getSize()) {
			case XL:
				path = "/ballon/Images/balloon100-1.jpg";
				break;
			case L:
				path = "/ballon/Images/balloon80-1.jpg";
				break;
			case M:
				path = "/ballon/Images/balloon60-1.jpg";
				break;
			case S:
				path = "/ballon/Images/balloon40-1.jpg";
				break;
			case XS:
				path = "/ballon/Images/balloon20-1.jpg";
				break;
			default:
				path = null;
				break;
		}
		
		return new ImageIcon(BalloonPanel.class.getResource(path));

	}

	public void updateBalloon(Balloon balloon) {
		this.balloon = balloon;
		lblBalloon.setIcon(getBalloonIcon());
		lblType.setText(balloon.getType().toString());
	}
	
}
