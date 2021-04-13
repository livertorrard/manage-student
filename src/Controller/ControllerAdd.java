package Controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.naming.Context;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

import model.DSSV;
import view.addView;
import view.deleteView;
import view.viewmain;

public class ControllerAdd {
    //hàm addControl : Khi button click vào sẽ thực hiện hàm addview
	public static void addControl() {
		viewmain.btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addView.addview();
		
			}
		});
	}
	// hàm addControl : Khi button click vào sẽ thực thi themsinhvien() và đóng mà hình thêm thông tin
	public static void adddataControl() {
		addView.btnAddData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//   String abc =  addView.file.getAbsolutePath() ;
				
			//    System.out.println(abc);
			//	addView.file = addView.jFileChooser.getSelectedFile();
			 if(addView.textimg.getText().isEmpty() ){
		      addView.message1.setText("Bạn chưa điền đủ thông tin");
		 }	else 
				   if(addView.textAge.getText().toString().isEmpty()) {
				  addView.message1.setText("Bạn chưa điền đủ thông tin"); 
			  }else if(addView.textName.getText().toString().isEmpty()) {
				  addView.message1.setText("Bạn chưa điền đủ thông tin"); 
			  }else if(addView.textStcode.getText().toString().isEmpty()) {
				  addView.message1.setText("Bạn chưa điền đủ thông tin"); 
			  }else if(addView.txtadrr.getText().toString().isEmpty()) {
				  addView.message1.setText("Bạn chưa điền đủ thông tin"); 
			  }
			  else {
	      DSSV.themsinhvien();
		   addView.frame.dispose();
		   view.viewmain.frame.dispose();
		   viewmain.viewmain(true);
		 //  addView.message1.setText("Bạn chưa điền đủ thông tin"); 
			  
			}
			}
		});
	}
	// Hàm addDirect(): Khi button click sẽ thực thi hàm addanh() trong class addView
	public static void addDirect() {
		addView.bntDirec.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addView.addanh();
					
		
				
			}
		});
		
		
	} 
	public static void cancelAdd() {
		addView.btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 view.addView.frame.dispose();
			}
		});
	}
	
	public static void addDelete() {
		viewmain.btnDele.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				deleteView.viewdele();
			}
		});
	}
	public static void delete() {
		deleteView.btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String stcode = deleteView.textcode.getText();
				for(int i = 0;i<DSSV.DssvDB().size();i++) {
					String stdb = DSSV.DssvDB().get(i).getStcode();
					if(stcode.equals(stdb)) {
						DSSV.deletesinhvien(stcode);
						deleteView.lblNewLabel.setText("Xóa thành công");
						view.viewmain.frame.dispose();
						viewmain.viewmain(true);
						break ;
					}
					deleteView.lblNewLabel.setText("Vui lòng kiểm tra STcode");
				}
				
				
				
				
			}
		});
	}
	public static void canceldelte() {
		deleteView.btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.deleteView.frame.dispose();
			}
		});
	}
	
}
