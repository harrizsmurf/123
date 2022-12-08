import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 30.09.2022
 * @author 
 */

public class wassergebührenbescheid extends JFrame {
  // Anfang Attribute
  private JNumberField zalt = new JNumberField();
  private JNumberField zneu = new JNumberField();
  private JNumberField zwv = new JNumberField();
  private JNumberField zmonat = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JButton jButton1 = new JButton();
  private JNumberField znetto = new JNumberField();
  private JNumberField zbrutto = new JNumberField();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  // Ende Attribute
  
  public wassergebührenbescheid() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 607; 
    int frameHeight = 558;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("wassergebührenbescheid");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    zalt.setBounds(180, 23, 75, 20);
    zalt.setText("");
    cp.add(zalt);
    zneu.setBounds(181, 55, 75, 20);
    zneu.setText("");
    cp.add(zneu);
    zwv.setBounds(179, 89, 75, 20);
    zwv.setText("");
    cp.add(zwv);
    zmonat.setBounds(180, 121, 75, 20);
    zmonat.setText("");
    cp.add(zmonat);
    jLabel1.setBounds(37, 23, 110, 20);
    jLabel1.setText("Alt");
    cp.add(jLabel1);
    jLabel2.setBounds(39, 55, 110, 20);
    jLabel2.setText("Neu");
    cp.add(jLabel2);
    jLabel3.setBounds(38, 87, 110, 20);
    jLabel3.setText("WV/m^3");
    cp.add(jLabel3);
    jLabel4.setBounds(40, 121, 110, 20);
    jLabel4.setText("$/M");
    cp.add(jLabel4);
    jButton1.setBounds(180, 164, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    znetto.setBounds(180, 205, 75, 20);
    znetto.setText("");
    cp.add(znetto);
    zbrutto.setBounds(180, 241, 75, 20);
    zbrutto.setText("");
    cp.add(zbrutto);
    jLabel5.setBounds(39, 204, 110, 20);
    jLabel5.setText("Nett");
    cp.add(jLabel5);
    jLabel6.setBounds(41, 242, 110, 20);
    jLabel6.setText("Brutto");
    cp.add(jLabel6);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public wassergebührenbescheid
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new wassergebührenbescheid();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  double Alt;
  double Neu;
  double WV;
  double Monat;
  double Netto;
  double Brutto;
    
  Alt = zalt.getDouble();
  Neu = zneu.getDouble();
  WV = zwv.getDouble();
  Monat = zmonat.getDouble();
    
  Netto = (Neu - Alt) * Monat + (WV * 12);
  Brutto = Netto * 1.07;
    
  znetto.setDouble(Netto);
  zbrutto.setDouble(Brutto);
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class wassergebührenbescheid

