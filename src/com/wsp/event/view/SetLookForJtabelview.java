package com.wsp.event.view;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class SetLookForJtabelview extends JLabel implements TableCellRenderer{
	
    private JButton button;

    public SetLookForJtabelview() {
        button = new JButton("х╥хо");
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        return button;
    }
}

