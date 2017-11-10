package projekt1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowMessage implements Runnable {
  private JFrame frame = new JFrame("Output from Java");
  private String longMessage = " \r\n" + 
          "Man har ofta erfarit huru sv�rt det �r att finna de r�tta\r\n" + 
          "orsakerna till misslyckandet af s�dana krigsf�retag, vid\r\n" + 
          "hvilkas utf�rande trupperna hafva gjort sin skyldighet, samt\r\n" + 
          "ingen, genast anst�lld juridisk unders�kning, visar, om och i\r\n" + 
          "hvad m�n felet kunnat ligga hos de befallande.\r\n" + 
          "\r\n" + 
          "Samtiden missledes l�tt genom de olika ber�ttelsernas\r\n" + 
          "m�ngd, och d� efterkommande ransaka officiella handlingar\r\n" + 
          "samt enskildas anteckningar eller, om tillf�lle dertill\r\n" + 
          "erbjuder sig, lyssna till �gonvittnens utsagor, �r ingendera af\r\n" + 
          "dessa urkunder obetingadt p�litlig.\r\n" + 
          "\r\n" + 
          "S� framt ej uppenbart f�rr�deri blifvit beg�nget,\r\n" + 
          "meddelar styrelsen blott de embets-underr�ttelser, som den sjelf\r\n" + 
          "erh�ller; och den f�rsta ibland dessa innefattar s�llan mera\r\n" + 
          "�n ett p� stridsplatsen hastigt gjordt utkast till de b�ttre\r\n" + 
          "ordnade uppgifter, som of�rt�fvadt utlofvas. Den\r\n" + 
          "h�gstkommenderandes, n�gon dag derefter inlemnade, slutredog�relser\r\n" + 
          "blifva v�l utf�rligare; men st�dse variationer p� det urgamla\r\n" + 
          "themat: �Olyckan �r en f�ljd af fiendens �fverl�gsenhet jemte\r\n" + 
          "of�rutsedda h�ndelser; likv�l har krigs�ran kunnat bevaras.�\r\n" + 
          "\r\n" + 
          "Under retr�tten efter f�rlorade drabbningar lossna,\r\n" + 
          "mer�ndels, om icke just disciplinens, dock tungans band, och\r\n" + 
          "missn�jet stegras med hvarje framkastad anm�rkning �fver\r\n" + 
          "verkliga eller f�rmodade felaktigheter uti anordningarne och\r\n" + 
          "deras utf�rande. Den, som d� eller kort derefter antecknar\r\n" + 
          "hvad han i s�dan sinnesst�mning f�rnummit, utan att\r\n" + 
          "sedermera vid lugnare besinning noga �fverv�ga alla f�rh�llanden,\r\n" + 
          "kan, mot sin vilja, beg� stora misstag. \r\n" + 
          "Man har ofta erfarit huru sv�rt det �r att finna de r�tta\r\n" + 
          "orsakerna till misslyckandet af s�dana krigsf�retag, vid\r\n" + 
          "hvilkas utf�rande trupperna hafva gjort sin skyldighet, samt\r\n" + 
          "ingen, genast anst�lld juridisk unders�kning, visar, om och i\r\n" + 
          "hvad m�n felet kunnat ligga hos de befallande.\r\n" + 
          "\r\n" + 
          "Samtiden missledes l�tt genom de olika ber�ttelsernas\r\n" + 
          "m�ngd, och d� efterkommande ransaka officiella handlingar\r\n" + 
          "samt enskildas anteckningar eller, om tillf�lle dertill\r\n" + 
          "erbjuder sig, lyssna till �gonvittnens utsagor, �r ingendera af\r\n" + 
          "dessa urkunder obetingadt p�litlig.\r\n" + 
          "\r\n" + 
          "S� framt ej uppenbart f�rr�deri blifvit beg�nget,\r\n" + 
          "meddelar styrelsen blott de embets-underr�ttelser, som den sjelf\r\n" + 
          "erh�ller; och den f�rsta ibland dessa innefattar s�llan mera\r\n" + 
          "�n ett p� stridsplatsen hastigt gjordt utkast till de b�ttre\r\n" + 
          "ordnade uppgifter, som of�rt�fvadt utlofvas. Den\r\n" + 
          "h�gstkommenderandes, n�gon dag derefter inlemnade, slutredog�relser\r\n" + 
          "blifva v�l utf�rligare; men st�dse variationer p� det urgamla\r\n" + 
          "themat: �Olyckan �r en f�ljd af fiendens �fverl�gsenhet jemte\r\n" + 
          "of�rutsedda h�ndelser; likv�l har krigs�ran kunnat bevaras.�\r\n" + 
          "\r\n" + 
          "Under retr�tten efter f�rlorade drabbningar lossna,\r\n" + 
          "mer�ndels, om icke just disciplinens, dock tungans band, och\r\n" + 
          "missn�jet stegras med hvarje framkastad anm�rkning �fver\r\n" + 
          "verkliga eller f�rmodade felaktigheter uti anordningarne och\r\n" + 
          "deras utf�rande. Den, som d� eller kort derefter antecknar\r\n" + 
          "hvad han i s�dan sinnesst�mning f�rnummit, utan att\r\n" + 
          "sedermera vid lugnare besinning noga �fverv�ga alla f�rh�llanden,\r\n" + 
          "kan, mot sin vilja, beg� stora misstag. \r\n" + 
          "Man har ofta erfarit huru sv�rt det �r att finna de r�tta\r\n" + 
          "orsakerna till misslyckandet af s�dana krigsf�retag, vid\r\n" + 
          "hvilkas utf�rande trupperna hafva gjort sin skyldighet, samt\r\n" + 
          "ingen, genast anst�lld juridisk unders�kning, visar, om och i\r\n" + 
          "hvad m�n felet kunnat ligga hos de befallande.\r\n" + 
          "\r\n" + 
          "Samtiden missledes l�tt genom de olika ber�ttelsernas\r\n" + 
          "m�ngd, och d� efterkommande ransaka officiella handlingar\r\n" + 
          "samt enskildas anteckningar eller, om tillf�lle dertill\r\n" + 
          "erbjuder sig, lyssna till �gonvittnens utsagor, �r ingendera af\r\n" + 
          "dessa urkunder obetingadt p�litlig.\r\n" + 
          "\r\n" + 
          "S� framt ej uppenbart f�rr�deri blifvit beg�nget,\r\n" + 
          "meddelar styrelsen blott de embets-underr�ttelser, som den sjelf\r\n" + 
          "erh�ller; och den f�rsta ibland dessa innefattar s�llan mera\r\n" + 
          "�n ett p� stridsplatsen hastigt gjordt utkast till de b�ttre\r\n" + 
          "ordnade uppgifter, som of�rt�fvadt utlofvas. Den\r\n" + 
          "h�gstkommenderandes, n�gon dag derefter inlemnade, slutredog�relser\r\n" + 
          "blifva v�l utf�rligare; men st�dse variationer p� det urgamla\r\n" + 
          "themat: �Olyckan �r en f�ljd af fiendens �fverl�gsenhet jemte\r\n" + 
          "of�rutsedda h�ndelser; likv�l har krigs�ran kunnat bevaras.�\r\n" + 
          "\r\n" + 
          "Under retr�tten efter f�rlorade drabbningar lossna,\r\n" + 
          "mer�ndels, om icke just disciplinens, dock tungans band, och\r\n" + 
          "missn�jet stegras med hvarje framkastad anm�rkning �fver\r\n" + 
          "verkliga eller f�rmodade felaktigheter uti anordningarne och\r\n" + 
          "deras utf�rande. Den, som d� eller kort derefter antecknar\r\n" + 
          "hvad han i s�dan sinnesst�mning f�rnummit, utan att\r\n" + 
          "sedermera vid lugnare besinning noga �fverv�ga alla f�rh�llanden,\r\n" + 
          "kan, mot sin vilja, beg� stora misstag.  ";
  
  public static void main(String[] args)
  {
    ShowMessage example = new ShowMessage();
    SwingUtilities.invokeLater(example);
  }

  public void run()
  {
    // start building a jframe
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(450, 300));

    // add a button to the jframe
    JButton button = new JButton("Click Me");
    button.addActionListener(new ShowDialogListener());
    frame.getContentPane().add(button);

    // display the jframe
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  
  /**
   * Our button listener. Show a scrolling text area in a 
   * JOptionPane showMessageDialog dialog.
   */
  class ShowDialogListener implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      // create a JTextArea
      JTextArea textArea = new JTextArea(36, 72);
      textArea.setText(longMessage);
      textArea.setEditable(false);
      
      // wrap a scrollpane around it
      JScrollPane scrollPane = new JScrollPane(textArea);
      
      // display them in a message dialog
      JOptionPane.showMessageDialog(frame, scrollPane);
    }
  }
}  