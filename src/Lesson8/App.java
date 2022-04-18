package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    int count = 0;
    public App () {
        setBounds(300,300,300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Счетчик");
        setResizable(false);
        JLabel counter = new JLabel("0", SwingConstants.CENTER);
        JButton leftButton = new JButton("Уменьшить");
        JButton rightButton = new JButton("Увеличить");

        Font font = new Font("Arial", Font.BOLD, 32);

        counter.setFont(font);
        counter.setAlignmentX(20);

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counter.setText(String.valueOf(count));

            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });
        add(leftButton, BorderLayout.WEST);
        add(rightButton, BorderLayout.EAST);
        add(counter, BorderLayout.CENTER);
        setVisible(true);

    }

    public static void main(String[] args) {
        new App();
    }


}
