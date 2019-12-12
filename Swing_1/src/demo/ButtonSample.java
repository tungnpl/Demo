import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonSample {

  public static void main(final String args[]) {
    Runnable runner = new Runnable() {
      public void run() {
        JFrame frame = new JFrame("Button Sample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(2, 2));

        JButton button1 = new JButton("Text Button");
        button1.setMnemonic(KeyEvent.VK_B);
        frame.add(button1);

        Icon warnIcon = new ImageIcon("images/Warn.gif");
        JButton button2 = new JButton(warnIcon);
        frame.add(button2);

        JButton button3 = new JButton("Warning", warnIcon);
        frame.add(button3);

        String htmlButton = "<html><sup>HTML</sup> <sub><em>Button</em></sub><br>" +
          "<font color=\"#FF0080\"><u>Multi-line</u></font>";
        JButton button4 = new JButton(htmlButton);
        frame.add(button4);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 200);
        frame.setVisible(true);
      }
    };
    EventQueue.invokeLater(runner);
  }
}
