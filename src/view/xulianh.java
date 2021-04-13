package view;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.List;

import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

import model.DSSV;
import view.modeltable;

public class xulianh implements TableCellRenderer {
	List<DSSV> dssv ;
	// set cho tất cả các cell trong Jtable đề là Jlabel để dễ dàng custom chúng
	// viết câu điều kiện để set hình ảnh cho tất cả các cell ở hàng 1
	// canh lề cho toàn bộ dữ liệu trong Jtable 
	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		
		
		JLabel ava = new JLabel();
		
		if(column == 0){
            Icon ic = new ImageIcon(value.toString());
            ava.setIcon(ic);
            ava.setHorizontalAlignment(SwingConstants.CENTER);
            ava.setVerticalAlignment(SwingConstants.CENTER);
        }else{            
            ava.setText(value.toString());    
            ava.setHorizontalAlignment(SwingConstants.CENTER);
            ava.setVerticalAlignment(SwingConstants.CENTER);
        }
        return ava;
		
	}
	
	
}
