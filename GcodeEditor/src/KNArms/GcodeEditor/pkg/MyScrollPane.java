/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNArms.GcodeEditor.pkg;

import java.awt.*;
import javax.swing.*;

public class MyScrollPane extends JScrollPane {
    private JTextPane outputField;
   
    public MyScrollPane() {
        super();
        outputField = new JTextPane();
        outputField.setEditable(false);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        setPreferredSize(new Dimension(800, 175));
        setMinimumSize(new Dimension(800, 100));
    }
   
}
