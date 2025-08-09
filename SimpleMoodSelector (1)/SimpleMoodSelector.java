import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMoodSelector extends JFrame implements ActionListener {

    JRadioButton happyBtn, sadBtn, tiredBtn, excitedBtn, angryBtn;
    JTextField nameField;

    public SimpleMoodSelector() {
        setTitle("Mood Selector");
        setSize(450, 350);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 255, 250));

        JLabel titleLabel = new JLabel("Welcome to Mood Checker!");
        titleLabel.setBounds(130, 20, 300, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);

        JLabel nameLabel = new JLabel("Type your name:");
        nameLabel.setBounds(50, 70, 120, 25);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(180, 70, 200, 25);
        add(nameField);

       

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        new SimpleMoodSelector();
    }
}
