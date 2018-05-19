/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNArms.GcodeEditor.pkg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Damian
 */
public class CustomMenuBar extends JMenuBar implements ActionListener, ItemListener {
    
    private JMenu file;
    private JMenu edit;
    private JMenu help;
    
    private JMenuItem open;
    private JMenuItem save;
    private JMenuItem saveAs;
    private JMenuItem exit;
    
    private JMenuItem cut;
    private JMenuItem copy;
    private JMenuItem paste;
    private JMenuItem find;
    private JMenuItem undo;
    private JMenuItem selectAll;
    
    private JMenuItem about;
    
    public CustomMenuBar()
    {
        setPreferredSize(new Dimension(800,25));
        setMinimumSize(new Dimension(800,25));
        
        setUpMenus();
        
        setUpMenuItems();
    }

    private void setUpMenus() {
        createMenu("file");
        createMenu("edit");
        createMenu("help");
    }
    
    private void createMenu(String name)
    {
        switch(name)
        {
            case "file":
                file = new JMenu("File");
                file.setMnemonic(KeyEvent.VK_F);
                this.add(file);
                break;
            case "edit":
                edit = new JMenu("Edit");
                edit.setMnemonic(KeyEvent.VK_E);
                this.add(edit);
                break;
            case "help":
                help = new JMenu("Help");
                help.setMnemonic(KeyEvent.VK_H);
                this.add(help);
                break;
            default : break;
        }
    }

    private void setUpMenuItems() {
        createMenuItem("open");
        createMenuItem("save");
        createMenuItem("saveAs");
        createMenuItem("exit");
        
        createMenuItem("cut");
        createMenuItem("copy");
        createMenuItem("paste");
        createMenuItem("find");
        createMenuItem("undo");
        createMenuItem("selectAll");
        
        createMenuItem("about");      
    }
    
    private void createMenuItem(String name)
    {
        switch(name)
        {
            case "open":
                open = new JMenuItem("Open");
                open.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_O, ActionEvent.CTRL_MASK));
                open.addActionListener(this);
                file.add(open);
                break;
            case "save":
                save = new JMenuItem("Save");
                save.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_S, ActionEvent.CTRL_MASK));
                save.addActionListener(this);
                file.add(save);
                break;
            case "saveAs":  //dodać shift
                saveAs = new JMenuItem("Save As");
                saveAs.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_S, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
                saveAs.addActionListener(this);
                file.add(saveAs);
                break;
            case "exit":
                exit = new JMenuItem("Exit");
                exit.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_F4, ActionEvent.ALT_MASK));
                exit.addActionListener(this);
                file.add(exit);
                break;
            
            case "cut":
                cut = new JMenuItem("Cut");
                cut.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_X, ActionEvent.CTRL_MASK));
                cut.addActionListener(this);
                edit.add(cut);
                break;
            case "copy":
                copy = new JMenuItem("Copy");
                copy.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_C, ActionEvent.CTRL_MASK));
                copy.addActionListener(this);
                edit.add(copy);
                break;
            case "paste":
                paste = new JMenuItem("Paste");
                paste.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_V, ActionEvent.CTRL_MASK));
                paste.addActionListener(this);
                edit.add(paste);
                break;
            case "find":
                find = new JMenuItem("Find");
                find.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_F, ActionEvent.CTRL_MASK));
                find.addActionListener(this);
                edit.add(find);
                break;
            case "undo":
                undo = new JMenuItem("Undo");
                undo.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
                undo.addActionListener(this);
                edit.add(undo);
                break;
            case "selectAll":
                selectAll = new JMenuItem("Select All");
                selectAll.setAccelerator(KeyStroke.getKeyStroke(
                         KeyEvent.VK_A, ActionEvent.CTRL_MASK));
                selectAll.addActionListener(this);
                edit.add(selectAll);
                break;
                
            case "about":
                about = new JMenuItem("About");
                //about.setAccelerator(KeyStroke.getKeyStroke(
                        // KeyEvent.VK_A, ActionEvent.CTRL_MASK));
                about.addActionListener(this);
                help.add(about);
                break;
            default: break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == open) 
        {
            JOptionPane.showMessageDialog(null,"open");
        }
        if (source == save) 
        {
            JOptionPane.showMessageDialog(null,"save");
        }
        if (source == saveAs) 
        {
            JOptionPane.showMessageDialog(null,"saveAs");
        }
        if (source == exit) 
        {
            JOptionPane.showMessageDialog(null,"exit");
            //EditorWindow.closeMainWindow();
        }
        
        if (source == cut) 
        {
            JOptionPane.showMessageDialog(null,"cut");
        }
        if (source == copy) 
        {
            JOptionPane.showMessageDialog(null,"copy");
        }
        if (source == paste) 
        {
            JOptionPane.showMessageDialog(null,"paste");
        }
        if (source == find) 
        {
            JOptionPane.showMessageDialog(null,"find");
        }
        if (source == undo) 
        {
            JOptionPane.showMessageDialog(null,"undo");
        }
        if (source == selectAll) 
        {
            JOptionPane.showMessageDialog(null,"selectAll");
        }
        
        if (source == about) 
        {
            JOptionPane.showMessageDialog(null,"about");
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
    
}
