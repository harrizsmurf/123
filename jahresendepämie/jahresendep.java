import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.11.2022
 * @author 
 */

public class jahresendep extends JFrame {
  // Anfang Attribute
  private JNumberField jalter = new JNumberField();
  private JNumberField jbetrieb = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JNumberField jans = new JNumberField();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public jahresendep() { 
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
    setTitle("jahresendep");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jalter.setBounds(148, 15, 75, 20);
    jalter.setText("");
    cp.add(jalter);
    jbetrieb.setBounds(148, 41, 75, 20);
    jbetrieb.setText("");
    cp.add(jbetrieb);
    jLabel1.setBounds(16, 42, 129, 20);
    jLabel1.setText("Betriebszugehörigkeit");
    cp.add(jLabel1);
    jLabel2.setBounds(15, 15, 110, 20);
    jLabel2.setText("Alter");
    cp.add(jLabel2);
    jans.setBounds(148, 131, 75, 20);
    jans.setText("");
    cp.add(jans);
    jLabel3.setBounds(27, 132, 110, 20);
    jLabel3.setText("Euro");
    cp.add(jLabel3);
    jButton1.setBounds(113, 84, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public jahresendep
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new jahresendep();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
    double alter;
    double betrieb;
    double euro=0;
    
    alter = jalter.getDouble();
    betrieb = jbetrieb.getDouble();
    
    if (betrieb>1 && betrieb<6) {
      euro = 200;
    }
    if (betrieb>=6) {
      euro = 80+betrieb*20;
      if (alter>=50) {
        euro=euro+50;
        
      }
      
    }
    jans.setDouble(euro);
  } // end of jButton1_ActionPerformed
  
  // Ende Methoden
} // end of class jahresendep

