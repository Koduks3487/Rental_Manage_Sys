package OOP;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class Rental_History extends JFrame {

	private JPanel contentPane;
	private ArrayList<RentalHistoryList> rentalHistoryList; 
	private JLabel title_lbl;
	private JTable rentalHistoryTable;
	private JLabel bookName_lbl;
	private JTextField bookName_txtField;
	private JButton search_btn;
	private JButton ok_btn;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rental_History frame = new Rental_History();
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
	public Rental_History() {
		
		setTitle("대여 기록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// 타이틀바 설정
		
		title_lbl = new JLabel("대여 기록");
		title_lbl.setFont(new Font("굴림", Font.BOLD, 20));
		title_lbl.setBounds(171, 25, 105, 23);
		contentPane.add(title_lbl);
		// title_lbl 설정

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String header[] = {"책 이름", "대여 기간", "대여 날짜", "대여 횟수", "차용인", "대여인"};
		String contents[][] = {
				{"국어","17","2022-08-11","3","홍길동","수한무"},
				{"수학","21","2022-03-04","7","수한무","홍길동"},
				{"과학","3","2022-05-25","1","철수","영희"}
		};
		
		rentalHistoryTable = new JTable(contents, header);
		rentalHistoryTable.setBounds(12, 26, 412, 243);
		contentPane.add(rentalHistoryTable);
		// rentalHistoryTable 설정
		
		JScrollPane scrollPane = new JScrollPane(rentalHistoryTable);
		scrollPane.setBounds(10, 64, 412, 167);
		contentPane.add(scrollPane);
		
		search_btn = new JButton("검색");
		search_btn.setBounds(278, 239, 63, 23);
		contentPane.add(search_btn);
		// search_btn 설정
		
		ok_btn = new JButton("확인");
		ok_btn.setBounds(171, 284, 95, 23);
		contentPane.add(ok_btn);
		
		bookName_txtField = new JTextField();
		bookName_txtField.setBounds(83, 241, 183, 21);
		contentPane.add(bookName_txtField);
		bookName_txtField.setColumns(10);
		// bookName_txtField 설정
		
	
		bookName_lbl = new JLabel("책 이름");
		bookName_lbl.setBounds(32, 247, 52, 15);
		contentPane.add(bookName_lbl);
		// bookName_lbl 설정
		
	}
}
