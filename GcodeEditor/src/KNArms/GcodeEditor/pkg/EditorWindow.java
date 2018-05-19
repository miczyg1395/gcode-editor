/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNArms.GcodeEditor.pkg;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author miczyg
 */
public class EditorWindow extends JFrame {
    
    private CustomMenuBar menuBar;
    private JScrollPane outputScrollPane;
    private JScrollPane editorScrollPane;
    
    public EditorWindow()
    {
        setSize(800,600);
        setTitle("PUMA G-code Editor by KN Arms");
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void addComponents(Container pane)
    {
        BorderLayout bLayout = new BorderLayout();
        pane.setLayout(bLayout);

        this.menuBar = new CustomMenuBar();       
        pane.add(this.menuBar, BorderLayout.PAGE_START);
        
        JTextArea editorArea = new JTextArea();
        this.editorScrollPane = new JScrollPane(editorArea);
        this.editorScrollPane .setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.editorScrollPane .setPreferredSize(new Dimension(800, 400));
        this.editorScrollPane .setMinimumSize(new Dimension(50, 50));
        
        pane.add(this.editorScrollPane , BorderLayout.CENTER);
        
        JTextPane outputField = new JTextPane();
        outputField.setEditable(false);
        this.outputScrollPane = new JScrollPane(outputField);
        this.outputScrollPane.setVerticalScrollBarPolicy(
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.outputScrollPane.setPreferredSize(new Dimension(800, 175));
        this.outputScrollPane.setMinimumSize(new Dimension(800, 100));
        
        pane.add(this.outputScrollPane, BorderLayout.PAGE_END);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        EditorWindow mainWindow = new EditorWindow();
        mainWindow.addComponents(mainWindow.getContentPane());
        mainWindow.pack();
        mainWindow.setVisible(true);
    }
}
