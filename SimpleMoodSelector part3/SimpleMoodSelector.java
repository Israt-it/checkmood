import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMoodSelector extends JFrame implements ActionListener {

    JRadioButton happyBtn, sadBtn, tiredBtn, excitedBtn, angryBtn;
    JTextField nameField;
    JButton showBtn, restartBtn;

    public SimpleMoodSelector() {
        setTitle("Mood Selector");
        setSize(450, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 255, 250));

        JLabel titleLabel = new JLabel("Welcome to Mood Checker!");
        titleLabel.setBounds(140, 20, 300, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);

        JLabel nameLabel = new JLabel("Type your name:");
        nameLabel.setBounds(50, 70, 120, 25);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(180, 70, 200, 25);
        add(nameField);

        happyBtn = new JRadioButton("😊 Happy");
        sadBtn = new JRadioButton("😢 Sad");
        tiredBtn = new JRadioButton("💤 Tired");
        excitedBtn = new JRadioButton("🎉 Excited");
        angryBtn = new JRadioButton("😠 Angry");

        happyBtn.setBounds(50, 110, 150, 25);
        sadBtn.setBounds(50, 140, 150, 25);
        tiredBtn.setBounds(50, 170, 150, 25);
        excitedBtn.setBounds(50, 200, 150, 25);
        angryBtn.setBounds(50, 230, 150, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(happyBtn);
        group.add(sadBtn);
        group.add(tiredBtn);
        group.add(excitedBtn);
        group.add(angryBtn);

        add(happyBtn);
        add(sadBtn);
        add(tiredBtn);
        add(excitedBtn);
        add(angryBtn);

        showBtn = new JButton("Show Message");
        showBtn.setBounds(250, 110, 150, 30);
        showBtn.addActionListener(this);
        add(showBtn);

        restartBtn = new JButton("Restart");
        restartBtn.setBounds(250, 160, 150, 30);
        add(restartBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
    }

    public static void main(String[] args) {
        new SimpleMoodSelector();
    }
}