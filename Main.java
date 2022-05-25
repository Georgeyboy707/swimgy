
import javax.swing.*;

public class Main {

   public static void main(String[] args) {
  // demo GUI
       System.out.println("SEQUENCE: Program started");
       JFrame frame = new JFrame("Demo frame");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       GUI myGUI = new GUI(600, 400);
       frame.add(myGUI);
       frame.pack();
       frame.setVisible(true);
   }
}


import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
   // canvas for other GUI widgets

   JButton button1;
   JButton button2;

   public GUI(int width, int height) {
       System.out.println("SQUENCE: GUI constructor");
       this.setPreferredSize(new Dimension(width, height));
       setLayout(null);
       button1 = new JButton("b1");
       button1.setBounds(0,0, 100, 40);
       button2 = new JButton("b2");
       button2.setBounds(120,0, 100, 40);
       add(button1);
       add(button2);
   }
}

