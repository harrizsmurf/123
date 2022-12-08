import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 04.11.2022
 * @author 
 */

public class verzweigung extends JFrame {
  // Anfang Attribute
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JButton jButton1 = new JButton();
  private JNumberField zahlans = new JNumberField();
  private JNumberField na = new JNumberField();
  private JNumberField nb = new JNumberField();
  private JNumberField nc = new JNumberField();
  // Ende Attribute
  
  public verzweigung() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 331; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("verzweigung");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel2.setBounds(16, 42, 110, 20);
    jLabel2.setText("nr1");
    cp.add(jLabel2);
    jLabel3.setBounds(18, 61, 110, 20);
    jLabel3.setText("nr2");
    cp.add(jLabel3);
    jLabel4.setBounds(25, 83, 110, 20);
    jLabel4.setText("nr3");
    cp.add(jLabel4);
    jButton1.setBounds(95, 143, 75, 25);
    jButton1.setText("Kleinste Zahl");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    zahlans.setBounds(104, 201, 75, 20);
    zahlans.setText("");
    cp.add(zahlans);
    na.setBounds(144, 40, 75, 20);
    na.setText("");
    cp.add(na);
    nb.setBounds(146, 64, 75, 20);
    nb.setText("");
    cp.add(nb);
    nc.setBounds(143, 84, 75, 20);
    nc.setText("");
    cp.add(nc);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public verzweigung
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new verzweigung();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  int zahla= na.getInt();
  int zahlb= nb.getInt();
  int zahlc= nc.getInt();
    
  if (zahla<zahlb && zahla<zahlc) {
      zahlans.setInt(zahla);
  } // end of if
  if (zahlb<zahla && zahlb<zahlc) {
      zahlans.setInt(zahlb);
  } // end of if
  if (zahlc<zahla && zahlc<zahla) {
      zahlans.setInt(zahlc);
    
  } // end of if  
    
    
    
    
  } // end of jButton1_ActionPerformed
 
  // Ende Methoden
} // end of class verzweigung

