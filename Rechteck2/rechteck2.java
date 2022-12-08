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

public class rechteck2 extends JFrame {
  // Anfang Attribute
  private JNumberField zBreite = new JNumberField();
  private JNumberField zLaenge = new JNumberField();
  private JButton jButton1 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JNumberField zUmfang = new JNumberField();
  private JNumberField zFlaeche = new JNumberField();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  // Ende Attribute
  
  public rechteck2() { 
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
    setTitle("rechteck2");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    zBreite.setBounds(139, 17, 75, 20);
    zBreite.setText("");
    cp.add(zBreite);
    zLaenge.setBounds(141, 49, 75, 20);
    zLaenge.setText("");
    cp.add(zLaenge);
    jButton1.setBounds(138, 83, 75, 25);
    jButton1.setText("Berechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jLabel1.setBounds(20, 17, 110, 20);
    jLabel1.setText("Breite");
    cp.add(jLabel1);
    jLabel2.setBounds(21, 50, 110, 20);
    jLabel2.setText("Länge");
    cp.add(jLabel2);
    zUmfang.setBounds(138, 127, 75, 20);
    zUmfang.setText("");
    cp.add(zUmfang);
    zFlaeche.setBounds(139, 162, 75, 20);
    zFlaeche.setText("");
    cp.add(zFlaeche);
    jLabel3.setBounds(14, 128, 110, 20);
    jLabel3.setText("Umfang");
    cp.add(jLabel3);
    jLabel4.setBounds(14, 162, 110, 20);
    jLabel4.setText("Fläche");
    cp.add(jLabel4);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public rechteck2
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new rechteck2();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  //Variablen
  double breite;
  double laenge;
  double umfang;
  double flaeche;
    //Eingabe
  breite = zBreite.getDouble();
  laenge = zLaenge.getDouble();
    //Rechnung
  umfang = 2 * (laenge + breite);
  flaeche = laenge * breite;
    //Ausgabe
  zUmfang.setDouble(umfang);
  zFlaeche.setDouble(flaeche);
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class rechteck2

