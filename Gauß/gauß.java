import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.11.2022
 * @author 
 */

public class gauﬂ extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JNumberField jZahl = new JNumberField();
  private JNumberField jSumme = new JNumberField();
  // Ende Attribute
  
  public gauﬂ() { 
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
    setTitle("gauﬂ");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(78, 113, 107, 25);
    jButton1.setText("Rechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jZahl.setBounds(90, 30, 75, 20);
    jZahl.setText("100");
    cp.add(jZahl);
    jSumme.setBounds(90, 183, 75, 20);
    jSumme.setText("");
    cp.add(jSumme);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public gauﬂ
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new gauﬂ();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf¸gen
    int zahl = 0;
    int summe = 0;
    zahl = jZahl.getInt();
    
    for (int i = 0; i <= zahl ;i++ ) {
      summe = i + summe;
      //Kontrollausgabe
      System.out.println(summe);
    } // end of for
    
    jSumme.setInt(summe);
    
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class gauﬂ

