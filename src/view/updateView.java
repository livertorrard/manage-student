package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class updateView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					updateView frame = new updateView();
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
	public updateView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImage = new JLabel("Image :");
		lblImage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(50, 50, 100, 30);
		contentPane.add(lblImage);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(160, 50, 140, 30);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("E:\\\u1EA2nh Livertorrard\\Anhthijava\\direc.png"));
		btnNewButton.setBounds(310, 56, 40, 24);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(50, 120, 100, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAge.setBounds(50, 190, 100, 30);
		contentPane.add(lblAge);
		
		JLabel lblAdress = new JLabel("Adress :");
		lblAdress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdress.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblAdress.setBounds(50, 260, 100, 30);
		contentPane.add(lblAdress);
		
		JLabel lblStcode = new JLabel("STCode :");
		lblStcode.setHorizontalAlignment(SwingConstants.CENTER);
		lblStcode.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblStcode.setBounds(50, 330, 100, 30);
		contentPane.add(lblStcode);
		
		textField = new JTextField();
		textField.setBounds(160, 260, 140, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 330, 140, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 191, 140, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(160, 120, 140, 30);
		contentPane.add(textField_3);
		
		JButton btnUpData = new JButton("Update Data");
		btnUpData.setIcon(new ImageIcon("E:\\\u1EA2nh Livertorrard\\addjava.png"));
		btnUpData.setBounds(259, 415, 123, 35);
		contentPane.add(btnUpData);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(392, 415, 65, 35);
		contentPane.add(btnCancel);
	}

}
