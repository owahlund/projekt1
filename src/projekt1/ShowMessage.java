package projekt1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShowMessage implements Runnable {
  private JFrame frame = new JFrame("Output from Java");
  private String longMessage = " \r\n" + 
          "Man har ofta erfarit huru svårt det är att finna de rätta\r\n" + 
          "orsakerna till misslyckandet af sådana krigsföretag, vid\r\n" + 
          "hvilkas utförande trupperna hafva gjort sin skyldighet, samt\r\n" + 
          "ingen, genast anställd juridisk undersökning, visar, om och i\r\n" + 
          "hvad mån felet kunnat ligga hos de befallande.\r\n" + 
          "\r\n" + 
          "Samtiden missledes lätt genom de olika berättelsernas\r\n" + 
          "mängd, och då efterkommande ransaka officiella handlingar\r\n" + 
          "samt enskildas anteckningar eller, om tillfälle dertill\r\n" + 
          "erbjuder sig, lyssna till ögonvittnens utsagor, är ingendera af\r\n" + 
          "dessa urkunder obetingadt pålitlig.\r\n" + 
          "\r\n" + 
          "Så framt ej uppenbart förräderi blifvit begånget,\r\n" + 
          "meddelar styrelsen blott de embets-underrättelser, som den sjelf\r\n" + 
          "erhåller; och den första ibland dessa innefattar sällan mera\r\n" + 
          "än ett på stridsplatsen hastigt gjordt utkast till de bättre\r\n" + 
          "ordnade uppgifter, som oförtöfvadt utlofvas. Den\r\n" + 
          "högstkommenderandes, någon dag derefter inlemnade, slutredogörelser\r\n" + 
          "blifva väl utförligare; men städse variationer på det urgamla\r\n" + 
          "themat: ”Olyckan är en följd af fiendens öfverlägsenhet jemte\r\n" + 
          "oförutsedda händelser; likväl har krigsäran kunnat bevaras.”\r\n" + 
          "\r\n" + 
          "Under reträtten efter förlorade drabbningar lossna,\r\n" + 
          "merändels, om icke just disciplinens, dock tungans band, och\r\n" + 
          "missnöjet stegras med hvarje framkastad anmärkning öfver\r\n" + 
          "verkliga eller förmodade felaktigheter uti anordningarne och\r\n" + 
          "deras utförande. Den, som då eller kort derefter antecknar\r\n" + 
          "hvad han i sådan sinnesstämning förnummit, utan att\r\n" + 
          "sedermera vid lugnare besinning noga öfverväga alla förhållanden,\r\n" + 
          "kan, mot sin vilja, begå stora misstag. \r\n" + 
          "Man har ofta erfarit huru svårt det är att finna de rätta\r\n" + 
          "orsakerna till misslyckandet af sådana krigsföretag, vid\r\n" + 
          "hvilkas utförande trupperna hafva gjort sin skyldighet, samt\r\n" + 
          "ingen, genast anställd juridisk undersökning, visar, om och i\r\n" + 
          "hvad mån felet kunnat ligga hos de befallande.\r\n" + 
          "\r\n" + 
          "Samtiden missledes lätt genom de olika berättelsernas\r\n" + 
          "mängd, och då efterkommande ransaka officiella handlingar\r\n" + 
          "samt enskildas anteckningar eller, om tillfälle dertill\r\n" + 
          "erbjuder sig, lyssna till ögonvittnens utsagor, är ingendera af\r\n" + 
          "dessa urkunder obetingadt pålitlig.\r\n" + 
          "\r\n" + 
          "Så framt ej uppenbart förräderi blifvit begånget,\r\n" + 
          "meddelar styrelsen blott de embets-underrättelser, som den sjelf\r\n" + 
          "erhåller; och den första ibland dessa innefattar sällan mera\r\n" + 
          "än ett på stridsplatsen hastigt gjordt utkast till de bättre\r\n" + 
          "ordnade uppgifter, som oförtöfvadt utlofvas. Den\r\n" + 
          "högstkommenderandes, någon dag derefter inlemnade, slutredogörelser\r\n" + 
          "blifva väl utförligare; men städse variationer på det urgamla\r\n" + 
          "themat: ”Olyckan är en följd af fiendens öfverlägsenhet jemte\r\n" + 
          "oförutsedda händelser; likväl har krigsäran kunnat bevaras.”\r\n" + 
          "\r\n" + 
          "Under reträtten efter förlorade drabbningar lossna,\r\n" + 
          "merändels, om icke just disciplinens, dock tungans band, och\r\n" + 
          "missnöjet stegras med hvarje framkastad anmärkning öfver\r\n" + 
          "verkliga eller förmodade felaktigheter uti anordningarne och\r\n" + 
          "deras utförande. Den, som då eller kort derefter antecknar\r\n" + 
          "hvad han i sådan sinnesstämning förnummit, utan att\r\n" + 
          "sedermera vid lugnare besinning noga öfverväga alla förhållanden,\r\n" + 
          "kan, mot sin vilja, begå stora misstag. \r\n" + 
          "Man har ofta erfarit huru svårt det är att finna de rätta\r\n" + 
          "orsakerna till misslyckandet af sådana krigsföretag, vid\r\n" + 
          "hvilkas utförande trupperna hafva gjort sin skyldighet, samt\r\n" + 
          "ingen, genast anställd juridisk undersökning, visar, om och i\r\n" + 
          "hvad mån felet kunnat ligga hos de befallande.\r\n" + 
          "\r\n" + 
          "Samtiden missledes lätt genom de olika berättelsernas\r\n" + 
          "mängd, och då efterkommande ransaka officiella handlingar\r\n" + 
          "samt enskildas anteckningar eller, om tillfälle dertill\r\n" + 
          "erbjuder sig, lyssna till ögonvittnens utsagor, är ingendera af\r\n" + 
          "dessa urkunder obetingadt pålitlig.\r\n" + 
          "\r\n" + 
          "Så framt ej uppenbart förräderi blifvit begånget,\r\n" + 
          "meddelar styrelsen blott de embets-underrättelser, som den sjelf\r\n" + 
          "erhåller; och den första ibland dessa innefattar sällan mera\r\n" + 
          "än ett på stridsplatsen hastigt gjordt utkast till de bättre\r\n" + 
          "ordnade uppgifter, som oförtöfvadt utlofvas. Den\r\n" + 
          "högstkommenderandes, någon dag derefter inlemnade, slutredogörelser\r\n" + 
          "blifva väl utförligare; men städse variationer på det urgamla\r\n" + 
          "themat: ”Olyckan är en följd af fiendens öfverlägsenhet jemte\r\n" + 
          "oförutsedda händelser; likväl har krigsäran kunnat bevaras.”\r\n" + 
          "\r\n" + 
          "Under reträtten efter förlorade drabbningar lossna,\r\n" + 
          "merändels, om icke just disciplinens, dock tungans band, och\r\n" + 
          "missnöjet stegras med hvarje framkastad anmärkning öfver\r\n" + 
          "verkliga eller förmodade felaktigheter uti anordningarne och\r\n" + 
          "deras utförande. Den, som då eller kort derefter antecknar\r\n" + 
          "hvad han i sådan sinnesstämning förnummit, utan att\r\n" + 
          "sedermera vid lugnare besinning noga öfverväga alla förhållanden,\r\n" + 
          "kan, mot sin vilja, begå stora misstag.  ";
  
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