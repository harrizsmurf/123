import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 14.10.2022
 * @author 
 */

public class idealgewicht extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel ig = new JLabel();
  private JNumberField zig = new JNumberField();
  private JButton jButton1 = new JButton();
  private JSpinner zkp = new JSpinner();
    private SpinnerNumberModel zkpModel = new SpinnerNumberModel(175, 0, 10000, 1);
  private JRadioButton jfrau = new JRadioButton();
  private JRadioButton jman = new JRadioButton();
  // Ende Attribute
  
  public idealgewicht() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 377; 
    int frameHeight = 336;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("idealgewicht");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jLabel1.setBounds(15, 38, 110, 20);
    jLabel1.setText("Körpergrösse");
    cp.add(jLabel1);
    ig.setBounds(15, 171, 110, 20);
    ig.setText("idealgewicht");
    cp.add(ig);
    zig.setBounds(174, 171, 75, 20);
    zig.setText("");
    cp.add(zig);
    jButton1.setBounds(125, 137, 75, 25);
    jButton1.setText("Berechnen");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    zkp.setBounds(136, 33, 46, 40);
    zkp.setValue(175);
    zkp.setModel(zkpModel);
    cp.add(zkp);

    jfrau.setBounds(182, 77, 100, 20);
    jfrau.setOpaque(false);
    jfrau.setText("Frau");
    cp.add(jfrau);
    jman.setBounds(180, 102, 100, 20);
    jman.setOpaque(false);
    jman.setText("Mann");
    cp.add(jman);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public idealgewicht
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new idealgewicht();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  int koerpergroesse;
  double idealgewicht;
    
  koerpergroesse = (int) zkp.getValue();   
    
  if (jfrau.isSelected() == true) {
       idealgewicht = (koerpergroesse - 100) *0.85;
       }   
      else {
        idealgewicht = (koerpergroesse - 100) *0.9;
      } // end of if-else
    zig.setDouble(idealgewicht);
  } // end of if  
  
    
  
    
   
    
    
  } // end of jButton1_ActionPerformed

  public String buttonGroup1_getSelectedRadioButtonLabel() {
    for (java.util.Enumeration<AbstractButton> e = buttonGroup1.getElements(); e.hasMoreElements();) {
      AbstractButton b = e.nextElement();
      if (b.isSelected()) return b.getText();
    }
    return "";
  }

  // Ende Methoden
} // end of class idealgewicht

