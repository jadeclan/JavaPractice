import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * This file contains  JavaPractice
 * Written by jberg475 during 2019.
 * Date of last save Apr 4, 2019
 * Time of Last save 10:42:14 AM
 */

/**
 * @author jberg475
 * @version
 */
@SuppressWarnings("serial")
public class BattleShips5 extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	private JTextField text6;
	private JTextField text7;
	SimpleBattleShips battleShips;
	int numberOfGuesses;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleShips5 frame = new BattleShips5();
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
	public BattleShips5() {
		battleShips = new SimpleBattleShips();
		numberOfGuesses=0;

		int randomNum = (int) (Math.random()*5);
		int [] locations = {randomNum, randomNum+1, randomNum+2};
		battleShips.setLocationCells(locations);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text1 = new JTextField();
		text1.setForeground(Color.BLACK);
		text1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("1");
				if (result == "kill") {
					text1.setBackground(Color.RED);
					text1.setForeground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text1.setText(null);;
					if(result == "miss") {
						text1.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text1.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");
					}
				}
			}
		});
		text1.setEditable(false);
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setText("1");
		text1.setBackground(Color.CYAN);
		text1.setBounds(145, 95, 29, 20);
		contentPane.add(text1);
		text1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Battleships Prototype");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(123, 26, 244, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblSelectTarget = new JLabel("Click on Target to Fire");
		lblSelectTarget.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectTarget.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSelectTarget.setBounds(145, 126, 196, 31);
		contentPane.add(lblSelectTarget);
		
		text2 = new JTextField();
		text2.setForeground(Color.BLACK);
		text2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("2");
				if (result == "kill") {
					text2.setForeground(Color.RED);
					text2.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text2.setText(null);
					if(result == "miss") {
						text2.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text2.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");
					}
				}
			}
		});

		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setText("2");
		text2.setEditable(false);
		text2.setColumns(10);
		text2.setBackground(Color.CYAN);
		text2.setBounds(173, 95, 29, 20);
		contentPane.add(text2);
		
		text3 = new JTextField();
		text3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("3");
				if (result == "kill") {
					text3.setForeground(Color.RED);
					text3.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text3.setText(null);
					if(result == "miss") {
						text3.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text3.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");

					}
				}
			}
		});
		text3.setText("3");
		text3.setHorizontalAlignment(SwingConstants.CENTER);
		text3.setEditable(false);
		text3.setColumns(10);
		text3.setBackground(Color.CYAN);
		text3.setBounds(201, 95, 29, 20);
		contentPane.add(text3);
		
		text4 = new JTextField();
		text4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("4");
				if (result == "kill") {
					text4.setForeground(Color.RED);
					text4.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text4.setText(null);;
					if(result == "miss") {
						text4.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text4.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");
					}
				}
			}
		});
		text4.setText("4");
		text4.setHorizontalAlignment(SwingConstants.CENTER);
		text4.setEditable(false);
		text4.setColumns(10);
		text4.setBackground(Color.CYAN);
		text4.setBounds(229, 95, 29, 20);
		contentPane.add(text4);
		
		text5 = new JTextField();
		text5.setText("5");
		text5.setHorizontalAlignment(SwingConstants.CENTER);
		text5.setEditable(false);
		text5.setColumns(10);
		text5.setBackground(Color.CYAN);
		text5.setBounds(257, 95, 29, 20);
		contentPane.add(text5);
		text5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("5");
				if (result == "kill") {
					text5.setForeground(Color.RED);
					text5.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text5.setText(null);;
					if(result == "miss") {
						text5.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text5.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");
					}
				}
			}
		});
		
		text6 = new JTextField();
		text6.setText("6");
		text6.setHorizontalAlignment(SwingConstants.CENTER);
		text6.setEditable(false);
		text6.setColumns(10);
		text6.setBackground(Color.CYAN);
		text6.setBounds(285, 95, 29, 20);
		contentPane.add(text6);
		text6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("6");
				if (result == "kill") {
					text6.setForeground(Color.RED);
					text6.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text6.setText(null);;
					if(result == "miss") {
						text6.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text6.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");
					}
				}
			}
		});
		
		text7 = new JTextField();
		text7.setText("7");
		text7.setHorizontalAlignment(SwingConstants.CENTER);
		text7.setEditable(false);
		text7.setColumns(10);
		text7.setBackground(Color.CYAN);
		text7.setBounds(312, 95, 29, 20);
		contentPane.add(text7);
		text7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				numberOfGuesses++;
				String result = battleShips.checkStatus("7");
				if (result == "kill") {
					text7.setForeground(Color.RED);
					text7.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "You won!.  It only took you " + numberOfGuesses + " to sink the opponent.");
				} else {
					text7.setText(null);;
					if(result == "miss") {
						text7.setBackground(Color.BLUE);
						JOptionPane.showMessageDialog(null, "Missed!");
					} else {
						text7.setBackground(Color.RED);
						JOptionPane.showMessageDialog(null, "A hit!");
					}
				}
			}
		});
		
	}
}
