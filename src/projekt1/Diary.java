package projekt1;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Diary extends JFrame
{
  public static void main(String [] args)
  {
      new Diary();
  }
  private JButton buttonOK;   
  private JRadioButton add, delete, print;
  private JCheckBox sort, deadlines, plusday;
  String printning;
  int uppgift;
  //
  public Diary()
  {
	//  this.setSize(1920,1080);
	  this.setSize(920,480);
      this.setTitle("Vad vill du göra ?");
      this.setDefaultCloseOperation(
          JFrame.EXIT_ON_CLOSE);
      JPanel mainPanel = new JPanel();   
      JPanel sizePanel = new JPanel();   
      Border b1 =   
          BorderFactory.createTitledBorder("Kalender");
      sizePanel.setBorder(b1);   
      ButtonGroup sizeGroup = new ButtonGroup();   
      add = new JRadioButton("Lägga till post");
      add.setSelected(true);
      sizePanel.add(add);
      sizeGroup.add(add);
      delete = new JRadioButton("Ta bort en post");
      sizePanel.add(delete);
      sizeGroup.add(delete);
      print = new JRadioButton("Skriva ut");
      sizePanel.add(print);
      sizeGroup.add(print);
      mainPanel.add(sizePanel);   
      JPanel topPanel = new JPanel();
      Border b2 =
          BorderFactory.createTitledBorder(
              "Övrigt");
      topPanel.setBorder(b2);
      sort = new JCheckBox("Sortera"); 
      topPanel.add(sort);
      deadlines = new JCheckBox("Kolla deadlines");
      topPanel.add(deadlines);
      plusday = new JCheckBox("En dag fram i tiden");
      topPanel.add(plusday);
      mainPanel.add(topPanel);   
      buttonOK = new JButton("OK");
      buttonOK.addActionListener(e -> buttonOKClick() );
      System.out.println("rad 54");
      mainPanel.add(buttonOK);
      this.add(mainPanel);   
      this.setVisible(true);
      System.out.println("rad 58");
  }

  public void buttonOKClick()
  {
      String tops = "";   
      if (sort.isSelected())
          tops += "Sortera\n";
      if (deadlines.isSelected())
          tops += "Kolla deadlines\n";
      if (plusday.isSelected())
          tops += "Lägga till dag\n";
      String msg = "Du ville ";   
      if (add.isSelected()) {
          msg += "lägga till en post och "; 	
      		uppgift = 1;
      }
      if (delete.isSelected()) {
          msg += "ta bort en post och "; 		
      		uppgift = 2; 
      }
      if (print.isSelected()) {
          msg += "skriva ut och ";		
      		uppgift = 3;
      }
      if (tops.equals(""))   
          msg += "inget mer.";
      else
          msg += "med följande tillägg:\n"
              + tops;
      JOptionPane.showMessageDialog(   
          buttonOK, msg, " ",
          JOptionPane.INFORMATION_MESSAGE);
      System.out.println("rad 86");
      printning = "Nästa text "
      		+ "qwertyuiopåasdfghjklzxcvbnmqwertyhgfdsazxcvbnmjuiklop111111"
      		+ "112222333334444555566666667777888899990000"
      		+ "001111222333334445566666666667778899";
      JOptionPane.showMessageDialog(null, "Uppgift: " + uppgift +printning);
   //   JOptionPane.showMessageDialog(null, printning);
   //   JOptionPane.showMessageDialog(null, printning);
      sort.setSelected(false);   
      deadlines.setSelected(false);
      plusday.setSelected(false);
      add.setSelected(true);
  }
}

