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
		
		setTitle("�뿩 ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// Ÿ��Ʋ�� ����
		
		title_lbl = new JLabel("�뿩 ���");
		title_lbl.setFont(new Font("����", Font.BOLD, 20));
		title_lbl.setBounds(171, 25, 105, 23);
		contentPane.add(title_lbl);
		// title_lbl ����

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String header[] = {"å �̸�", "�뿩 �Ⱓ", "�뿩 ��¥", "�뿩 Ƚ��", "������", "�뿩��"};
		String contents[][] = {
				{"����","17","2022-08-11","3","ȫ�浿","���ѹ�"},
				{"����","21","2022-03-04","7","���ѹ�","ȫ�浿"},
				{"����","3","2022-05-25","1","ö��","����"}
		};
		
		rentalHistoryTable = new JTable(contents, header);
		rentalHistoryTable.setBounds(12, 26, 412, 243);
		contentPane.add(rentalHistoryTable);
		// rentalHistoryTable ����
		
		JScrollPane scrollPane = new JScrollPane(rentalHistoryTable);
		scrollPane.setBounds(10, 64, 412, 167);
		contentPane.add(scrollPane);
		
		search_btn = new JButton("�˻�");
		search_btn.setBounds(278, 239, 63, 23);
		contentPane.add(search_btn);
		// search_btn ����
		
		ok_btn = new JButton("Ȯ��");
		ok_btn.setBounds(171, 284, 95, 23);
		contentPane.add(ok_btn);
		
		bookName_txtField = new JTextField();
		bookName_txtField.setBounds(83, 241, 183, 21);
		contentPane.add(bookName_txtField);
		bookName_txtField.setColumns(10);
		// bookName_txtField ����
		
	
		bookName_lbl = new JLabel("å �̸�");
		bookName_lbl.setBounds(32, 247, 52, 15);
		contentPane.add(bookName_lbl);
		// bookName_lbl ����
		
	}
}
