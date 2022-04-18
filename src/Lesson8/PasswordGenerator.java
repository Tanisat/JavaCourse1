package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordGenerator extends JFrame {
    public PasswordGenerator() {
        setBounds(300,300,250,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Генератор Пароля");
        setResizable(false);

        JButton generate = new JButton("Сгенерировать");
        JTextField password = new JTextField(SwingConstants.CENTER);
        Font font = new Font("Arial", Font.BOLD, 32);

        password.setFont(font);

        generate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Random random = new Random();
                String[] popularPasswords = {"qwerty", "hello", "password", "java", "cat"};
                String result = " ";

                result = popularPasswords[random.nextInt(5)];
                result += random.nextInt(90) + 10;

                password.setText(result);

            }
        });
    add(generate, BorderLayout.NORTH);
    add(password, BorderLayout.CENTER);
    setVisible(true);
    }

    public static void main(String[] args) {
    new PasswordGenerator();
    }
}
