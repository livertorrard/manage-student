package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Controller.ControllerLogin;
import model.User;
import view.Login;
import view.deleteView;

public class main {
	public static Login frame ;
	public static void main(String[] args) {
	//	deleteView.viewdele();
		
	   mainview();
		
		
	
	}
	public static void mainview() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    frame = new Login();
					frame.setVisible(true);
					ControllerLogin.xulidangnhap();	
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
