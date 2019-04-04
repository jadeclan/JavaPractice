import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChapterFive extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChapterFive frame = new ChapterFive();
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
	public ChapterFive() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Head First Java");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("FreeSans", Font.BOLD, 22));
		label.setBounds(123, 12, 205, 39);
		contentPane.add(label);
		
		JLabel lblChapterFiveExercises = new JLabel("Chapter Five Exercises");
		lblChapterFiveExercises.setHorizontalAlignment(SwingConstants.CENTER);
		lblChapterFiveExercises.setBounds(133, 49, 195, 15);
		contentPane.add(lblChapterFiveExercises);
		
		JButton btnNewButton = new JButton("Simple Battleships");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		Image img2 = new ImageIcon(this.getClass().getResource("/battleship.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img2));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BattleShips5 game = new BattleShips5();
				game.setVisible(true);
			}
			
		});
		btnNewButton.setBounds(58, 74, 222, 57);
		contentPane.add(btnNewButton);
	}

}
