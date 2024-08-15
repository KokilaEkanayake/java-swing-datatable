/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author SCORFi3LD
 */
public class DataTable {

    private final JTable table;
    private final JTextComponent tc;
    private DefaultTableModel dtm;
    private TableRowSorter<DefaultTableModel> rowSorter;

    public DataTable(JTable table, JTextComponent tc) {
        this.table = table;
        this.tc = tc; 
    }

    public void addDataTable() {
        dtm = (DefaultTableModel) table.getModel();
        rowSorter = new TableRowSorter<>(dtm);
        table.setRowSorter(rowSorter);
        tc.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                filterTable(tc.getText());
            }
        });
    }

    private void filterTable(String query) {
        try {
            rowSorter.setRowFilter(RowFilter.regexFilter(query));
        } catch (Exception e) {
        }
    }
    
}
