import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.09.2022
 * @author 
 */

public class Rechteck extends JFrame {
  // Anfang Attribute
  private JButton btnBerechnung = new JButton();
  private JNumberField nfLaenge = new JNumberField();
  private JNumberField nfBreite = new JNumberField();
  private JNumberField nfFlaeche = new JNumberField();
  private JNumberField nfUmfang = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JButton btnEingabe = new JButton();
  private JButton btnAusgabe = new JButton();
  // Ende Attribute
  //Variablen 
  double laenge;
  double breite;
  double flaeche;
  double umfang;
  public Rechteck() { 
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
    setTitle("Rechteck");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    btnBerechnung.setBounds(90, 113, 107, 25);
    btnBerechnung.setText("Berechnung");
    btnBerechnung.setMargin(new Insets(2, 2, 2, 2));
    btnBerechnung.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnBerechnung_ActionPerformed(evt);
      }
    });
    cp.add(btnBerechnung);
    nfLaenge.setBounds(121, 11, 75, 20);
    nfLaenge.setText("");
    cp.add(nfLaenge);
    nfBreite.setBounds(120, 39, 75, 20);
    nfBreite.setText("");
    cp.add(nfBreite);
    nfFlaeche.setBounds(121, 191, 75, 20);
    nfFlaeche.setText("");
    cp.add(nfFlaeche);
    nfUmfang.setBounds(122, 218, 75, 20);
    nfUmfang.setText("");
    cp.add(nfUmfang);
    jLabel1.setBounds(5, 10, 110, 20);
    jLabel1.setText("Länge in cm");
    cp.add(jLabel1);
    jLabel2.setBounds(5, 38, 110, 20);
    jLabel2.setText("Breite in cm");
    cp.add(jLabel2);
    jLabel3.setBounds(6, 186, 110, 20);
    jLabel3.setText("Fläche:");
    cp.add(jLabel3);
    jLabel4.setBounds(6, 217, 110, 20);
    jLabel4.setText("Umfang");
    cp.add(jLabel4);
    btnEingabe.setBounds(87, 79, 107, 25);
    btnEingabe.setText("Eingabe");
    btnEingabe.setMargin(new Insets(2, 2, 2, 2));
    btnEingabe.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnEingabe_ActionPerformed(evt);
      }
    });
    cp.add(btnEingabe);
    btnAusgabe.setBounds(89, 146, 107, 25);
    btnAusgabe.setText("Ausgabe");
    btnAusgabe.setMargin(new Insets(2, 2, 2, 2));
    btnAusgabe.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        btnAusgabe_ActionPerformed(evt);
      }
    });
    cp.add(btnAusgabe);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Rechteck
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Rechteck();
  } // end of main
  
  public void btnBerechnung_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  //Daten einlesen
  laenge = nfLaenge.getDouble();
  breite = nfBreite.getDouble();
  //Daten verarbeiten
  flaeche = breite * laenge;
  umfang = 2 * (laenge + breite);
  //Daten ausgeben
  nfFlaeche.setDouble(flaeche);
  nfUmfang.setDouble(umfang);
  } // end of btnBerechnung_ActionPerformed

  public void btnEingabe_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  //Daten einlesen
  laenge = nfLaenge.getDouble();
  breite = nfBreite.getDouble();  
  } // end of btnEingabe_ActionPerformed

  public void btnAusgabe_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  //Daten ausgeben
  nfFlaeche.setDouble(flaeche);
  nfUmfang.setDouble(umfang);  
  } // end of btnAusgabe_ActionPerformed

  // Ende Methoden
} // end of class Rechteck

