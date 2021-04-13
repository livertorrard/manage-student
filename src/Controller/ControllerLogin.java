package Controller;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.connect;
import main.main;
import model.User;
import view.Login;
import view.viewmain;

public class ControllerLogin {

	public static void xulidangnhap() {
		Login.dangnhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
				
					String username = Login.textField.getText().toString().trim();
					String pass = Login.passwordField.getText().toString().trim();
					
				//	System.out.println(username+"  "+pass);
					if(pass.isEmpty() && username.isEmpty()) {
						Login.lblNewLabel.setText(" Bạn chưa điền User Name và Password !");
					}else if(pass.isEmpty()) {
						Login.lblNewLabel.setText(" Bạn chưa điền Password !");
					}else if (username.isEmpty()) {
						Login.lblNewLabel.setText(" Bạn chưa điền UserName !");
					}else if(username!=null && pass!=null){
					     User.listuser();
					     for(int i = 0 ;i<User.users.size();i++) {
					    	 String userdb = User.users.get(i).getUsername();
					    	 String passdb = User.users.get(i).getPass();
					    	// System.out.println(userdb+" "+passdb);
					    	if(username.equals(userdb) && pass.equals(passdb)) {
					    	//	Login.lblNewLabel.setText(" Đăng nhập thành công !");
					    		main.frame.dispose();
					    		viewmain.viewmain(true);
					    		break ;
					    	}
					    	Login.lblNewLabel.setText(" Đăng nhập thất bại !");
					     }
					 //	
					}
					
			
				}});	
		}
	

}

