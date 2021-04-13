package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.ControllerAdd;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ResourceBundle.Control;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class addView extends JFrame {

	private static JPanel contentPane;
	public static JLabel txtimg ;
	public static JTextField txtadrr;
	public static JTextField textStcode;
	public static JTextField textAge;
	public static JTextField textName;
	public static JButton btnAddData ;
    public static JButton btnCancel ;
    public static File file ;
    public static JLabel message1 ;
    public static JFileChooser jFileChooser ;
    public static 	JLabel textimg ;
    public static JButton bntDirec ;
    public static addView frame;
	/**
	 * Launch the application.
	 */
	//hàm addview(): dùng để hiển thị addview và chứa có controller để bắt sự kiện cho button
	public static void addview() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new addView();
					frame.setVisible(true);
					ControllerAdd.addDirect();
					ControllerAdd.adddataControl();
					ControllerAdd.cancelAdd();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		setTitle("Add Data Student");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImage = new JLabel("Image :");
		lblImage.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(50, 50, 100, 30);
		contentPane.add(lblImage);
		
		txtimg = new JLabel("");
		txtimg.setBounds(160, 50, 140, 30);
		contentPane.add(txtimg);
		
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
		
		txtadrr = new JTextField();
		txtadrr.setBounds(160, 260, 140, 30);
		contentPane.add(txtadrr);
		txtadrr.setColumns(10);
		
		textStcode = new JTextField();
		textStcode.setColumns(10);
		textStcode.setBounds(160, 330, 140, 30);
		contentPane.add(textStcode);
		
		textAge = new JTextField();
		textAge.setColumns(10);
		textAge.setBounds(160, 191, 140, 30);
		contentPane.add(textAge);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(160, 120, 140, 30);
		contentPane.add(textName);
		
	    btnAddData = new JButton("Add Data");
		btnAddData.setIcon(new ImageIcon("E:\\Ảnh Livertorrard\\addjava.png"));
		btnAddData.setBounds(267, 415, 115, 35);
		contentPane.add(btnAddData);
		
	    btnCancel  = new JButton("Cancel");
		btnCancel.setBounds(392, 415, 82, 35);
		contentPane.add(btnCancel);
		
	    message1 = new JLabel("");
		message1.setForeground(Color.RED);
		message1.setHorizontalAlignment(SwingConstants.CENTER);
		message1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		message1.setBounds(10, 400, 207, 30);
		contentPane.add(message1);
		
	    textimg = new JLabel("");
		textimg.setBounds(416, 66, 0, 14);
		contentPane.add(textimg);
		
		bntDirec = new JButton("");
		bntDirec.setIcon(new ImageIcon("E:\\Ảnh Livertorrard\\Anhthijava\\direc.png"));
		bntDirec.setBounds(301, 56, 53, 24);
		contentPane.add(bntDirec);
	}
	//hàm add(): dùng Jfilechooser để lấy dữ liệu từ máy tính cá nhân
	//imageFilter: dùng đặt tên cho loại dữ liệu, và kiểu đuôi của dữ liệu
	// sau đó thực thi các câu lệnh để seticon cho Jlabel trong add view
	public static void addanh() {
		// TODO Auto-generated method stub
		jFileChooser = new JFileChooser("E:\\Ảnh Livertorrard\\Anhthijava");
		FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("hinh anh", "jpg","png");
		jFileChooser.setFileFilter(imageFilter);
		jFileChooser.setMultiSelectionEnabled(false);
		
		int x = jFileChooser.showDialog(contentPane, "Chọn file");
		if(x== jFileChooser.APPROVE_OPTION) {
			 file = jFileChooser.getSelectedFile();
			txtimg.setIcon(new ImageIcon(file.getAbsolutePath()));
			textimg.setText(file.getAbsolutePath());
		}
	}
}
