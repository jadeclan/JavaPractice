import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class ChapterTwo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChapterTwo frame = new ChapterTwo();
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
	public ChapterTwo() {
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
		
		JLabel lblChapterTwoExercises = new JLabel("Chapter Two Exercises");
		lblChapterTwoExercises.setHorizontalAlignment(SwingConstants.CENTER);
		lblChapterTwoExercises.setBounds(133, 49, 195, 15);
		contentPane.add(lblChapterTwoExercises);
		
		JButton btnGuessGame = new JButton("Guess Game");
		btnGuessGame.setFont(new Font("Tahoma", Font.BOLD, 14));
		Image img = new ImageIcon(this.getClass().getResource("/Help-icon.png")).getImage();
		btnGuessGame.setIcon(new ImageIcon(img));
		btnGuessGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GuessGame game = new GuessGame();
				game.startGame();
			}
		});
		btnGuessGame.setBounds(29, 91, 158, 59);
		contentPane.add(btnGuessGame);
		
		JButton btnNewButton = new JButton("Drum Kit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		Image img2 = new ImageIcon(this.getClass().getResource("/Drum-icon.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img2));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DrumKit drum= new DrumKit();
				drum.startDrum();
				drum.setSnare(false);
				drum.playTopHat();
			}
		});
		btnNewButton.setBounds(243, 91, 158, 59);
		contentPane.add(btnNewButton);
	}

}
