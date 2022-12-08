import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 11.11.2022
 * @author 
 */

public class schulnoten extends JFrame {
  // Anfang Attribute
  private JNumberField j1 = new JNumberField();
  private JTextField jans = new JTextField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public schulnoten() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 427; 
    int frameHeight = 408;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("schulnoten");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    j1.setBounds(131, 43, 75, 20);
    j1.setText("");
    cp.add(j1);
    jans.setBounds(117, 148, 150, 20);
    cp.add(jans);
    jButton1.setBounds(133, 90, 75, 25);
    jButton1.setText("Berechnung");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public schulnoten
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new schulnoten();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  int eingabe = j1.getInt();
  String ausgabe = "";  
    
    switch (eingabe) {
      case  1: ausgabe = "sehr gut" ;
        
        break;
      case 2 : ausgabe = "gut" ;
      break;  
      case  3: ausgabe = "befriedigend";  
        
        break;
        case  4: ausgabe = "ausreichend" ;
        break;
        case 5: ausgabe = "mangelhaft" ;
        break;
        case 6: ausgabe = "ungenügend" ;
        break;
        
        
    } // end of switch
    jans.setText(ausgabe);
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class schulnoten

