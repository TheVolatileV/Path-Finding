
 
import java.awt.*;
import javax.swing.*;
 
public class trialrun {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;
 
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
    JButton button;
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    if (shouldFill) {
    //natural height, maximum width
    c.fill = GridBagConstraints.HORIZONTAL;
    }
 
    button = new JButton("Show Best Path");
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.ipady = 50;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Restart");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 50;
    c.gridx = 1;
    c.gridy = 0;
    pane.add(button, c);
    button = new JButton("Player Stat:");
    c.fill = GridBagConstraints.BOTH;
    c.ipady = 250;
    c.gridx = 0;
    c.gridy = 2;
    pane.add(button, c);
    
    button = new JButton("Enemy Stats:");
    c.fill = GridBagConstraints.BOTH;
    c.ipady = 250;
    c.gridx = 1;
    c.gridy = 2;
    pane.add(button, c);
 
    button = new JButton("Grid");
    c.fill = GridBagConstraints.BOTH;
    c.weighty = 1.0;
    c.gridwidth = 2;
    c.gridx = 0;
    c.gridy = 1;
    pane.add(button, c);
    

    
    
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,1000);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}