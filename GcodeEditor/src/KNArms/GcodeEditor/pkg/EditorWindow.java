/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KNArms.GcodeEditor.pkg;

import javax.swing.JFrame;

/**
 *
 * @author miczyg
 */
public class EditorWindow extends JFrame {

    public EditorWindow()
    {
        setSize(800,600);
        setTitle("PUMA G-code Editor by KN Arms");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        EditorWindow mainWindow = new EditorWindow();
        mainWindow.setVisible(true);
    }
    
}
