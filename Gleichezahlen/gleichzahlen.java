import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 11.11.2022
 * @author 
 */

public class gleichzahlen extends JFrame {
  // Anfang Attribute
  private JNumberField j1 = new JNumberField();
  private JNumberField j2 = new JNumberField();
  private JNumberField j3 = new JNumberField();
  private JButton jButton1 = new JButton();
  private JTextField jans = new JTextField();
  // Ende Attribute
  
  public gleichzahlen() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 485; 
    int frameHeight = 419;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("gleichzahlen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    j1.setBounds(25, 16, 75, 20);
    j1.setText("");
    cp.add(j1);
    j2.setBounds(108, 16, 75, 20);
    j2.setText("");
    cp.add(j2);
    j3.setBounds(196, 17, 75, 20);
    j3.setText("");
    cp.add(j3);
    jButton1.setBounds(107, 75, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jans.setBounds(56, 152, 270, 20);
    cp.add(jans);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public gleichzahlen
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new gleichzahlen();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  double nummera;
  double nummerb;
  double nummerc;
  String nummerans = "";
    
 
    
    nummera = j1.getDouble();
    nummerb = j2.getDouble();
    nummerc = j3.getDouble();
    
    if (nummera == nummerb || nummerb == nummerc || nummerc == nummera) {
       nummerans = "min.2 Zahlen sind gleich";
      
    } // end of if
    if (nummera == nummerb && nummera == nummerc) {
      nummerans = "alle 3 Zahlen sind gleich";
      
    } // end of if
    if (nummera != nummerb && nummera != nummerc) {
      nummerans = "keine Zahlen sind gleich";
      
    } // end of if
    jans.setText(nummerans);
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class gleichzahlen

