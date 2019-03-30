import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		btnGuessGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GuessGame game = new GuessGame();
				game.startGame();
			}
		});
		btnGuessGame.setBounds(29, 91, 127, 25);
		contentPane.add(btnGuessGame);
	}

}
