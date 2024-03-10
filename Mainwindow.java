package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainwindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainwindow window = new Mainwindow();
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
	public Mainwindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton RantalListButton = new JButton("대여글 목록");
		RantalListButton.setBounds(57, 81, 100, 60);
		frame.getContentPane().add(RantalListButton);
		
		JButton RequestListButton = new JButton("요청글 목록");
		RequestListButton.setBounds(169, 81, 100, 60);
		frame.getContentPane().add(RequestListButton);
		
		JButton RentalHistoryButton = new JButton("대여기록");
		RentalHistoryButton.setBounds(281, 81, 100, 60);
		frame.getContentPane().add(RentalHistoryButton);
		
		JButton PointChargeButton = new JButton("<충전하기>");
		PointChargeButton.setBounds(169, 207, 100, 23);
		frame.getContentPane().add(PointChargeButton);
		
		JTextPane Title = new JTextPane();
		Title.setBackground(new Color(255, 255, 0));
		Title.setText("[책 대여 프로그램 이름]");
		Title.setBounds(147, 10, 137, 21);
		frame.getContentPane().add(Title);
		
		JButton ProfileButton = new JButton("");
		ProfileButton.setIcon(new ImageIcon("C:\\Users\\LG\\eclipse-workspace\\.metadata\\.plugins\\SWE\\image\\Profile.jpg"));
		ProfileButton.setBounds(390, 10, 34, 35);
		frame.getContentPane().add(ProfileButton);
		
		JButton LogoutButton = new JButton("");
		LogoutButton.setIcon(new ImageIcon("C:\\Users\\LG\\eclipse-workspace\\.metadata\\.plugins\\SWE\\image\\Logout.png"));
		LogoutButton.setBounds(12, 10, 34, 35);
		frame.getContentPane().add(LogoutButton);
	}
}
