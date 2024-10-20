package guiImagePanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

/**
 * Creates a program that allows a user see a default image
 * then they can select checkbox's and click a button to change
 * different parts of the image.
 * 
 * @author Rob R
 */
public class ChangingImages extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ImagePanel imagePanel;
	private JCheckBox chbxRoof;
	private JCheckBox chbxChangeWall;
	private JCheckBox chbxChangeTrees;
	private Color[] colors = { Color.LIGHT_GRAY, Color.blue, Color.orange, Color.gray, Color.cyan };
	private int cIdx = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangingImages frame = new ChangingImages();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame with several different images from an Image Panel.
	 */
	public ChangingImages() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		imagePanel = new ImagePanel();
		contentPane.add(imagePanel, BorderLayout.CENTER);
		
		JPanel controlPanel = createControlPanel();
		contentPane.add(controlPanel, BorderLayout.SOUTH);
	}

	/**
	 * Create the Control Panel which houses controls for changing
	 * the image based on a users check box selection on click of the "Go" button
	 * 
	 * @return
	 */
	private JPanel createControlPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		
		JButton btnGo = new JButton("Go");
		btnGo.setOpaque(false);
		btnGo.setBorder(UIManager.getBorder("Button.border"));
		btnGo.setFocusPainted(false);
		btnGo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int[] selects = {0,0,0};
				if(chbxRoof.isSelected()) {
					selects[0] = 1;
				}
				if(chbxChangeWall.isSelected()) {
					selects[1] = 1;
				}
				if(chbxChangeTrees.isSelected()) {
					selects[2] = 1;
				}
				if(selects[0] == 0 && selects[1] == 0 && selects[2] == 0) {
					cIdx = ++cIdx % colors.length;
					imagePanel.setBackground(colors[cIdx]);
				}
				imagePanel.changeImage(selects[0], selects[1], selects[2]);
			}
		});
		
		chbxRoof = new JCheckBox("Change Roof");
		chbxRoof.setOpaque(false);
		chbxRoof.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chbxRoof);
		
		chbxChangeWall = new JCheckBox("Change Wall");
		chbxChangeWall.setOpaque(false);
		chbxChangeWall.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chbxChangeWall);
		
		chbxChangeTrees = new JCheckBox("Change Trees");
		chbxChangeTrees.setOpaque(false);
		chbxChangeTrees.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(chbxChangeTrees);
		panel.add(btnGo);
		return panel;
	}

}
