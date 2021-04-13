package view;

import java.util.List;

import javax.swing.table.AbstractTableModel;


import model.DSSV;

//Xử lí để đổ dữ liệu vào Jtable

public class modeltable extends AbstractTableModel{
	
	public List<DSSV> dssv ;
	
	public modeltable(List<DSSV> dssv) {
        this.dssv = dssv;
    }   
    
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 5 ;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
	//	return 6;
		return dssv.size();
	}
    // đổ dữ liệu vào bảng
	@Override
	public Object getValueAt(int arg0,int arg1) {
		DSSV sv = dssv.get(arg0);
        switch(arg1){
            case 0: return sv.getAvatar();
            case 1: return sv.getName();
            case 2: return sv.getAge();
            case 3: return sv.getAddress();
            case 4: return sv.getStcode();
     //       case 5: return "Delete" ;
            default: return null;
        }
	}
	//set cái giá trị title cho bảng
	@Override
	public String getColumnName(int column) {
        switch(column){
            case 0: return "Avatar";
            case 1: return "Name";
            case 2: return "Age";
            case 3: return "Address";
            case 4: return "Student Code";
         //   case 5: return "Delete" ;
            default: return "";
        }
    }
	
	

}
