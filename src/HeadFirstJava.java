import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Image;

public class HeadFirstJava {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeadFirstJava window = new HeadFirstJava();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HeadFirstJava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeadFirstJava = new JLabel("Head First Java");
		lblHeadFirstJava.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeadFirstJava.setFont(new Font("FreeSans", Font.BOLD, 22));
		lblHeadFirstJava.setBounds(123, 12, 205, 39);
		frame.getContentPane().add(lblHeadFirstJava);
		
		JLabel lblChapterExercises = new JLabel("Chapter Exercises");
		lblChapterExercises.setHorizontalAlignment(SwingConstants.CENTER);
		lblChapterExercises.setBounds(133, 62, 195, 15);
		frame.getContentPane().add(lblChapterExercises);
		
		JButton btnChapter = new JButton("Chapter 2");
		btnChapter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ChapterTwo secondChapter = new ChapterTwo();
				secondChapter.setVisible(true);
			}
		});
		btnChapter.setBounds(35, 93, 117, 25);
		frame.getContentPane().add(btnChapter);
	}
}
