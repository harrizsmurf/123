import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 23.09.2022
 * @author 
 */

public class mwst extends JFrame {
  // Anfang Attribute
  private JNumberField zRechnung = new JNumberField();
  private JNumberField zMwst = new JNumberField();
  private JNumberField zGb = new JNumberField();
  private JButton jButton1 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  // Ende Attribute
  
  public mwst() { 
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
    setTitle("mwst");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    zRechnung.setBounds(147, 37, 75, 20);
    zRechnung.setText("");
    cp.add(zRechnung);
    zMwst.setBounds(148, 123, 75, 20);
    zMwst.setText("");
    cp.add(zMwst);
    zGb.setBounds(150, 159, 75, 20);
    zGb.setText("");
    cp.add(zGb);
    jButton1.setBounds(145, 75, 75, 25);
    jButton1.setText("Berechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jLabel1.setBounds(13, 36, 110, 20);
    jLabel1.setText("Rechnungsbetrag");
    cp.add(jLabel1);
    jLabel2.setBounds(15, 122, 110, 20);
    jLabel2.setText("jLabel2");
    cp.add(jLabel2);
    jLabel3.setBounds(19, 158, 110, 20);
    jLabel3.setText("Gesamtbetrag");
    cp.add(jLabel3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public mwst
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new mwst();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  //V
  double rechnung;
  double mehrwertsteuer;
  double gesamtbetrag;
    
    //Eingabe
  rechnung = zRechnung.getDouble();
    
    //rechnung
  mehrwertsteuer = rechnung * 0.19;
  gesamtbetrag = rechnung + mehrwertsteuer;
    
    //Ausgabe
  zMwst.setDouble(mehrwertsteuer);
  zGb.setDouble(gesamtbetrag);
  
    
    
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class mwst

