/*
 * *
 * *
 * Email  : casperadam91@gmail.com
 * *
 * IDE    : netbeans 7.1.0
 * NOTEOOK ACER ASPIRE 4738
 */
package app.model;

import app.entity.Aplikasi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author casper
 */
public class TableModelAplikasi extends AbstractTableModel {

    private List<Aplikasi> list = new ArrayList<>();
    private TableRowSorter<TableModelAplikasi> sorter;

    public TableModelAplikasi() {
        sorter = new TableRowSorter<>(this);
        sorter.setComparator(0, new Comparator<Aplikasi>() {
            @Override
            public int compare(Aplikasi o1, Aplikasi o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
    }

    public void setList(List<Aplikasi> list) {
        this.list = list;
        sorter.setModel(this);
    }

    public boolean add(Aplikasi e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount() - 1, getRowCount() - 1);
        }
    }

    public Aplikasi update(int index, Aplikasi element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Aplikasi remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    public Aplikasi get(int index) {
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getPembuat();
            case 3:
                return list.get(rowIndex).getSumber();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "NAMA";
            case 2:
                return "PEMBUAT";
            case 3:
                return "SUMBER";
            default:
                return null;
        }
    }

    public void setFilter(String key, int column) {
        this.sorter.setRowFilter(RowFilter.regexFilter("(?i)" + key.trim(), column));
    }

    public TableRowSorter<TableModelAplikasi> getSorter() {
        return sorter;
    }
}
