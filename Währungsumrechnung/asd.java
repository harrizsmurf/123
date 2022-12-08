import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 01.11.2022
 * @author 
 */

public class asd extends JFrame {
  // Anfang Attribute
  private JNumberField neingabe = new JNumberField();
  private JNumberField nausgabe = new JNumberField();
  private JButton jButton1 = new JButton();
  private JRadioButton jRadioButton1 = new JRadioButton();
  private ButtonGroup buttonGroup1 = new ButtonGroup();
  private JRadioButton beuro = new JRadioButton();
  private JRadioButton bsfr = new JRadioButton();
  // Ende Attribute
  
  public asd() { 
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
    setTitle("asd");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    neingabe.setBounds(54, 33, 75, 20);
    neingabe.setText("");
    cp.add(neingabe);
    nausgabe.setBounds(57, 146, 75, 20);
    nausgabe.setText("");
    cp.add(nausgabe);
    jButton1.setBounds(54, 118, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jRadioButton1.setBounds(96, 136, 1, 33);
    jRadioButton1.setOpaque(false);
    cp.add(jRadioButton1);
    beuro.setBounds(58, 60, 100, 20);
    beuro.setOpaque(false);
    beuro.setText("EUR->SFR");
    cp.add(beuro);
    bsfr.setBounds(60, 87, 100, 20);
    bsfr.setOpaque(false);
    bsfr.setText("SFR->EUR");
    cp.add(bsfr);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public asd
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new asd();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  double eingabe;
  double ausgabe;
    
  eingabe = neingabe.getDouble();
    
  if (beuro.isSelected() == true) {
      ausgabe = eingabe * 1.12;
      }
      else {
        ausgabe = eingabe / 1.12;
      
      } // end of if-else
      
    nausgabe.setDouble(ausgabe,2);  
    
   
  } // end of jButton1_ActionPerformed

  public String buttonGroup1_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  // Ende Methoden
} // end of class asd

