import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 14.10.2022
 * @author 
 */

public class idealgewicht extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel ig = new JLabel();
  private JNumberField zig = new JNumberField();
  private JButton jButton1 = new JButton();
  private JSpinner zkp = new JSpinner();
    private SpinnerNumberModel zkpModel = new SpinnerNumberModel(175, 0, 10000, 1);
  // Ende Attribute
  
  public idealgewicht() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 377; 
    int frameHeight = 336;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("idealgewicht");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(15, 38, 110, 20);
    jLabel1.setText("Körpergrösse");
    cp.add(jLabel1);
    ig.setBounds(15, 155, 110, 20);
    ig.setText("idealgewicht");
    cp.add(ig);
    zig.setBounds(174, 155, 75, 20);
    zig.setText("");
    cp.add(zig);
    jButton1.setBounds(125, 121, 75, 25);
    jButton1.setText("Berechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    zkp.setBounds(136, 33, 46, 40);
    zkp.setValue(175);
    zkp.setModel(zkpModel);
    cp.add(zkp);

    // Ende Komponenten
    
    setVisible(true);
  } // end of public idealgewicht
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new idealgewicht();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  double koerpergroesse;
  double idealgewicht;
    
  koerpergroesse = (int) zkp.getValue();   
    
  idealgewicht = (koerpergroesse - 100) * 0.9;
    
  zig.setDouble(idealgewicht);
    
   
    
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class idealgewicht

