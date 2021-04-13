package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ScrollPaneConstants;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Controller.ControllerAdd;
import model.DSSV;
import javax.swing.JButton;
import javax.swing.ImageIcon;
//lớp viewmain để hiện thị giao diện chính
public class viewmain extends JFrame {

	public static JPanel contentPane;
	public static JTable table;
	public static JButton btnAdd;
	public static JButton btnUp;
	public static JButton btnDele;
	
	public static viewmain frame ;

	/**
	 * Launch the application.
	 */
	//hàm viewmain() để thực thi hiển thị viewmain
   public static void viewmain(Boolean them) {
	   EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new viewmain();
					frame.setVisible(them);
					ControllerAdd.addControl();
					ControllerAdd.addDelete();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
   }
	/**
	 * Create the frame.
	 */
	public viewmain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		setTitle("Danh sách sinh viên");
		contentPane = new JPanel();
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 101, 664, 350);
		contentPane.add(scrollPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		List<DSSV> dssv = DSSV.DssvDB();
		modeltable modelTable = new modeltable(dssv);
		table = new JTable(modelTable);
		
		
		
		
		table.setDefaultRenderer(Object.class,new xulianh());
		table.setRowHeight(41);
	
		scrollPane.setViewportView(table);
		
		JLabel lblDanhSchSn = new JLabel("Danh Sách Sinh Viên");
		lblDanhSchSn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblDanhSchSn.setIcon(new ImageIcon("E:\\Ảnh Livertorrard\\student40.png"));
		lblDanhSchSn.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanhSchSn.setBounds(161, 11, 364, 79);
		contentPane.add(lblDanhSchSn);
		
		btnAdd = new JButton("Add Data");
		btnAdd.setIcon(new ImageIcon("E:\\Ảnh Livertorrard\\addjava.png"));
		btnAdd.setBounds(410, 550, 120, 40);
		contentPane.add(btnAdd);
		
		 btnUp = new JButton("Update");
		 btnUp.setIcon(new ImageIcon("E:\\Ảnh Livertorrard\\updatejava.png"));
		 btnUp.setBounds(550, 550, 120, 40);
		contentPane.add(btnUp);
		
		 btnDele = new JButton("Delete Data");
		 btnDele.setIcon(new ImageIcon("E:\\Ảnh Livertorrard\\deletjava.png"));
		 btnDele.setBounds(270, 550, 120, 40);
		contentPane.add(btnDele);
		
			
		//}
		
	}
	
	public static void reset() {
		frame.repaint();
	
	}
}
