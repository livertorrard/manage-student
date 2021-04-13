package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControllerAdd;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class deleteView extends JFrame {

	private JPanel contentPane;
	public static JTextField textcode;
	public static deleteView frame ;
	public static 	JButton btnDelete ;
	public static JLabel lblNewLabel;
	public static JButton btnCancel ;

	/**
	 * Launch the application.
	 */
	public static void viewdele() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new deleteView();
					frame.setVisible(true);	
					ControllerAdd.delete();
					ControllerAdd.canceldelte();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public deleteView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Delete Student");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStCode = new JLabel("ST Code ");
		lblStCode.setBounds(34, 56, 60, 14);
		contentPane.add(lblStCode);
		
		textcode = new JTextField();
		textcode.setBounds(141, 53, 86, 20);
		contentPane.add(textcode);
		textcode.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(34, 170, 176, 29);
		contentPane.add(lblNewLabel);
		
		btnDelete = new JButton("DELETE");
		btnDelete.setBounds(292, 163, 89, 23);
		contentPane.add(btnDelete);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(296, 203, 89, 23);
		contentPane.add(btnCancel);
	}
}
