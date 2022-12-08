import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.12.2022
 * @author 
 */

public class schadenersatz extends JFrame {
  // Anfang Attribute
  private JNumberField j1 = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JNumberField j2 = new JNumberField();
  private JLabel jLabel3 = new JLabel();
  private JNumberField jans = new JNumberField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public schadenersatz() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("schadenersatz");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    j1.setBounds(119, 16, 75, 20);
    j1.setText("");
    cp.add(j1);
    jLabel1.setBounds(6, 15, 110, 20);
    jLabel1.setText("Schaden");
    cp.add(jLabel1);
    jLabel2.setBounds(8, 46, 110, 20);
    jLabel2.setText("Selbstbeteiligung");
    cp.add(jLabel2);
    j2.setBounds(119, 44, 75, 20);
    j2.setText("");
    cp.add(j2);
    jLabel3.setBounds(7, 119, 110, 20);
    jLabel3.setText("Schadenersatz");
    cp.add(jLabel3);
    jans.setBounds(119, 120, 75, 20);
    jans.setText("");
    cp.add(jans);
    jButton1.setBounds(118, 82, 75, 25);
    jButton1.setText("berechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public schadenersatz
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new schadenersatz();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  double schaden;
  double selbstbeteiligung = 0;
  double schadenersatz;
  // schaden = j1
  //selbstbeteiligung = j2
  // schadenersatz = jans
    
    schaden = j1.getDouble();
    
    if (schaden > 500) {
      selbstbeteiligung = schaden * 0.2;
      if (selbstbeteiligung < 1000) {
      selbstbeteiligung = schaden * 0.2;
        
      } // end of if
      
    } // end of if
    schadenersatz = schaden - selbstbeteiligung;
    
    j2.setDouble(selbstbeteiligung);
    jans.setDouble(schadenersatz);
  } // end of jButton1_ActionPerformed
  // Ende Methoden
} // end of class schadenersatz

