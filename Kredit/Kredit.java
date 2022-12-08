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

public class Kredit extends JFrame {
  // Anfang Attribute
 private JNumberField zlaufzeit = new JNumberField();
  private JButton jButton1 = new JButton();
  private JNumberField zbetrag = new JNumberField();
  private JNumberField zKredit = new JNumberField();
  private JSpinner jSpinner1 = new JSpinner();
    private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(3, 3, 36, 1);
  // Ende Attribute
  
  public Kredit() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 580; 
    int frameHeight = 404;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Kredit");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    zlaufzeit.setBounds(276, 114, 75, 20);
    zlaufzeit.setText("");
    cp.add(zlaufzeit);
    jButton1.setBounds(279, 143, 75, 25);
    jButton1.setText("Berechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    zbetrag.setBounds(275, 79, 75, 20);
    zbetrag.setText("");
    cp.add(zbetrag);
    zKredit.setBounds(278, 188, 75, 20);
    zKredit.setText("");
    cp.add(zKredit);
    jSpinner1.setBounds(299, 105, 30, 24);
    jSpinner1.setValue(3);
    jSpinner1.setModel(jSpinner1Model);
    cp.add(jSpinner1);

    jLabel2.setBounds(151, 109, 110, 20);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Kredit
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Kredit();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
    double betrag;
    int laufzeit =3;
    double kredit;
    
    betrag = zbetrag.getDouble();
    laufzeit = (int) jSpinner1.getValue();
    
    kredit = betrag / laufzeit;
    
    zKredit.setDouble(kredit);
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class Kredit

