package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import main.connect;
import view.addView;

public class DSSV {
private String avatar ;
private String name ;
private int age ;
private String address ;
private String stcode ;
public DSSV(String avatar, String name, int age, String address, String stcode) {
	super();
	this.avatar = avatar;
	this.name = name;
	this.age = age;
	this.address = address;
	this.stcode = stcode;
}
public String getAvatar() {
	return avatar;
}
public void setAvatar(String avatar) {
	this.avatar = avatar;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getStcode() {
	return stcode;
}
public void setStcode(String stcode) {
	this.stcode = stcode;
}
public static List<DSSV> DssvDB(){
	String sql = "SELECT * From dssv";
	List<DSSV> dssvDB = new LinkedList<DSSV>();
	try {
		Statement st = connect.getCN().createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String img = rs.getString(2);
			String name = rs.getString(3);
			int age = rs.getInt(4);
			String address = rs.getString(5);
			String Stcode  = rs.getString(6);
			dssvDB.add(new DSSV(img,name,age,address,Stcode));
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return dssvDB ;
}
public static void themsinhvien () {
	//INSERT INTO `banhang`.`dssv` (`Id`, `Img`, `Name`, `Age`, `Address`, `Stcode`) VALUES ('3', 'E:\\Ảnh Livertorrard\\Anhthijava\\person3.png', 'Quý Trâm', '20', 'Gia Lai', '18IT212');
	String sql = "INSERT INTO dssv (Img,Name,Age,Address,Stcode) VALUES (?,?,?,?,?)";
	try {
		PreparedStatement pre = connect.getCN().prepareStatement(sql);
		pre.setString(1, addView.file.getAbsolutePath());
		pre.setString(2, addView.textName.getText());
		pre.setInt(3, Integer.parseInt(addView.textAge.getText()));
		pre.setString(4, addView.txtadrr.getText());
		pre.setString(5,addView.textStcode.getText());
		pre.execute();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public static void deletesinhvien(String stcode) {
	String sql = "DELETE FROM dssv WHERE Stcode= ?";
	try {
		PreparedStatement pre = connect.getCN().prepareStatement(sql);
		pre.setString(1, stcode);
		pre.execute();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}
