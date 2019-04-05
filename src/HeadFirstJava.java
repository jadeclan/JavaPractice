import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		
		JButton btnChapter2 = new JButton("Chapter 2");
		btnChapter2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				ChapterTwo secondChapter = new ChapterTwo();
				secondChapter.setVisible(true);
			}
		});
		btnChapter2.setBounds(35, 93, 117, 25);
		frame.getContentPane().add(btnChapter2);
		
		JButton btnChapter5 = new JButton("Chapter 5");
		btnChapter5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
				ChapterFive fifthChapter = new ChapterFive();
				fifthChapter.setVisible(true);
			}
		});
		btnChapter5.setBounds(240, 94, 117, 23);
		frame.getContentPane().add(btnChapter5);
	}
}
