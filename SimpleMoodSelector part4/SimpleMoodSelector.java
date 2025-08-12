import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMoodSelector extends JFrame implements ActionListener {

    JRadioButton happyBtn, sadBtn, tiredBtn, excitedBtn, angryBtn;
    JTextField nameField;
    JButton showBtn, restartBtn;
    JTextArea messageArea;

    public SimpleMoodSelector() {
        setTitle("Mood Selector");
        setSize(450, 450);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 255, 250));

        JLabel titleLabel = new JLabel("Welcome to Mood Checker!");
        titleLabel.setBounds(75, 20, 300, 30);
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

        happyBtn.setBackground(new Color(255, 250, 205));
        happyBtn.setForeground(new Color(85, 107, 47));

        sadBtn.setBackground(new Color(176, 224, 230));
        sadBtn.setForeground(new Color(25, 25, 112));

        tiredBtn.setBackground(new Color(211, 211, 211));
        tiredBtn.setForeground(new Color(105, 105, 105));

        excitedBtn.setBackground(new Color(255, 228, 196));
        excitedBtn.setForeground(new Color(205, 92, 92));

        angryBtn.setBackground(new Color(255, 182, 193));
        angryBtn.setForeground(new Color(139, 0, 0));

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
        showBtn.setBackground(new Color(60, 179, 113));
        showBtn.setForeground(Color.WHITE);
        showBtn.addActionListener(this);
        add(showBtn);

        restartBtn = new JButton("Restart");
        restartBtn.setBounds(250, 160, 150, 30);
        restartBtn.setBackground(new Color(70, 130, 180));
        restartBtn.setForeground(Color.WHITE);
        restartBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new SimpleMoodSelector();
            }
        });
        add(restartBtn);

        messageArea = new JTextArea();
        messageArea.setBounds(50, 280, 350, 100);
        messageArea.setFont(new Font("Arial", Font.PLAIN, 14));
        messageArea.setEditable(false);
        add(messageArea);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText().trim();

        if (name.isEmpty()) {
            messageArea.setText("Please enter your name.");
            return;
        }

        String line1 = "Hello " + name + "!";
        String line2 = "";
        String line3 = "";

        if (happyBtn.isSelected()) {
            line2 = "You are feeling great!";
            line3 = "Keep smiling always ";
        } else if (sadBtn.isSelected()) {
            line2 = "It's okay to feel sad.";
            line3 = "Better days are coming. ";
        } else if (tiredBtn.isSelected()) {
            line2 = "Take a rest and recharge.";
            line3 = "You deserve a break. ";
        } else if (excitedBtn.isSelected()) {
            line2 = "Your energy is amazing!";
            line3 = "Enjoy every moment! ";
        } else if (angryBtn.isSelected()) {
            line2 = "Take a deep breath.";
            line3 = "Stay calm and peaceful. ";
        } else {
            line2 = "Please select a mood.";
        }

        messageArea.setText(line1 + "\n" + line2 + "\n" + line3);
    }

    public static void main(String[] args) {
        new SimpleMoodSelector();
    }
}