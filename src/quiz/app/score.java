package quiz.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class score extends JFrame {
    score(String name , int score){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(200,150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(60,200,200,150);
        add(image);

        JLabel heading = new JLabel("Thank You "+ name+ "for taking the QUIZ");
        heading.setBounds(100,80,700,30);
        heading.setFont(new Font("Tahoma",Font.BOLD,26));
        add(heading);

        JLabel Score = new JLabel("Your score is  "+score +"/100");
        Score.setBounds(350,200,300,30);
        Score.setFont(new Font("Tahoma",Font.BOLD,26));
        add(Score);

        JButton exit = new JButton("EXIT");
        exit.setBounds(380,270,120,30);
        exit.setBackground(new Color(22,99,54));
        exit.setForeground(Color.WHITE);
        add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });

        ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i22 = i12.getImage().getScaledInstance(750,550,Image.SCALE_DEFAULT);
        ImageIcon i32 = new ImageIcon(i22);
        JLabel image2 = new JLabel(i32);
        image2.setBounds(0,0,750,550);
        add(image2);



        setSize(750,550);
        setUndecorated(true);
        setLocation(400,150);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new score("user",0);
    }
}
