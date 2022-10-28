package com.jxareas.solver;

import com.jxareas.solver.ui.MainFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
            mainFrame.setLocationRelativeTo(null);
        });
    }
    
}
