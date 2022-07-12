import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JPanel implements ActionListener, DocumentListener {

    JButton button1;
    JButton button2;
    JTextField username;
    JFrame mainFrame = new JFrame("Main Frame");
    JPanel menu;
    JPanel login;

    public GUI(int width, int height) {
        System.out.println("SQUENCE: GUI constructor");
        this.setPreferredSize(new Dimension(width, height));
        //JFrame mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
    }

    public void login(int width, int height) {

        JPanel login = new JPanel();
        login.setBounds(100, 500, 1000, 700);

        username = new JTextField("enter username");
        username.setBounds(20, 60, 40, 200);
        username.getDocument().addDocumentListener(this);

        button1 = new JButton("Login");
        button1.setBounds(20, 60, 40, 200);
        button1.addActionListener(this);

        button2 = new JButton("Exit");
        button2.setBounds(120, 0, 100, 40);
        button2.addActionListener(this);

        login.add(username);
        login.add(button1);
        login.add(button2);

        mainFrame.setVisible(true);
        mainFrame.add(login);
        login.setVisible(true);
    }

    public void menu(int width, int height) {

        button1 = new JButton("Login");
        username = new JTextField("enter username");
        username.setBounds(20, 69, 40, 200);
        username.getDocument().addDocumentListener(this);
        username.setBounds(20,60,200,40);
        button1.setBounds(0,0, 100, 40);
        button2 = new JButton("Exit");
        button2.setBounds(120,0, 100, 40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        username.getDocument().addDocumentListener(this);
        add(button1);
        add(username);
        add(button2);
        mainFrame.add(this);
        mainFrame.pack();
        mainFrame.setVisible(true);

    }
    @Override public void insertUpdate(DocumentEvent e){System.out.println("Insert");
    }
    @Override public void removeUpdate(DocumentEvent e) {System.out.println("remove");
    }
    @Override public void changedUpdate(DocumentEvent e) {System.out.println("changed");
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand() == "Login"){
        System.out.println("Username = " + username.getText());
    }
        else{
            System.out.println("Password = " + username.getText());
        }
    }
}