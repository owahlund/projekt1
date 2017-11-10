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
  public Diary()
  {
      this.setSize(420,200);
      this.setTitle("Vad göra ?");
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
      delete = new JRadioButton("Ta bort en post ");   
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
      mainPanel.add(buttonOK);
      this.add(mainPanel);   
      this.setVisible(true);
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
      if (add.isSelected())
          msg += "lägga till en post och ";
      if (delete.isSelected())
          msg += "ta bort en post ";
      if (print.isSelected())
          msg += "skriva ut och ";

      if (tops.equals(""))   
          msg += "inget mer.";
      else
          msg += "med följande tillägg:\n"
              + tops;
      JOptionPane.showMessageDialog(   
          buttonOK, msg, "",
          JOptionPane.INFORMATION_MESSAGE);

      sort.setSelected(false);   
      deadlines.setSelected(false);
      plusday.setSelected(false);
      add.setSelected(true);
  }
}

