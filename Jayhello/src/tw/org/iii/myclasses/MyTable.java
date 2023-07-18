package tw.org.iii.myclasses;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JTable {
	private FoodDB foodDB;
	private MyModel myModel;
	public MyTable() throws Exception{
		foodDB = new FoodDB();
		foodDB.queryData(FoodDB.SQL_QUERY);
		
		myModel = new MyModel();
		setModel(myModel);
		myModel.setColumnIdentifiers(foodDB.getHeader());
	}
	
	public void delRow() {
		
		myModel.removeRow(getSelectedRow());
		repaint();
	}
	
	private class MyModel extends DefaultTableModel{

		@Override
		public void removeRow(int row) {
			foodDB.delRow(row+1);
		}

		@Override
		public int getRowCount() {
			return foodDB.getRows();
		}

		@Override
		public int getColumnCount() {
			return foodDB.getCols();
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO 是否能夠被編輯
			return column > 0;
		}

		@Override
		public Object getValueAt(int row, int column) {
			
			return foodDB.getData(row+1, column+1);//以0為基礎
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			foodDB.updateData(row + 1, column + 1, (String)aValue);
		}
		
	}
}
