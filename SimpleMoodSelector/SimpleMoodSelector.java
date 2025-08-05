
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleMoodSelector extends JFrame implements ActionListener {

    JRadioButton happyBtn, sadBtn, tiredBtn, excitedBtn, angryBtn;
    JButton showBtn, restartBtn;
    JLabel messageLabel;

    public SimpleMoodSelector() {
        setTitle("Mood Selector");
        setSize(450, 350);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(245, 255, 250));

        JLabel titleLabel = new JLabel("Select Your Mood");
        titleLabel.setBounds(140, 20, 200, 30);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        new SimpleMoodSelector();
    }
}
