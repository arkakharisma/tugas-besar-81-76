/*
    Aplikasi EduFun Untuk Media Belajar Bagi Anak-Anak

    Developer : - Muhammad Arka Kharisma (151402081)
                - Virliansi Adrisa Utami (151402076)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EduFun extends JFrame {
    //private JButton play;

    public EduFun()
    {
        setTitle("Edu-Fun: Great Education for Kids");
        JLabel title = new JLabel("Edu-Fun");
        JButton play = new JButton("PLAY");

        setLayout(null);
        setContentPane(new JLabel(new ImageIcon("src/Lighthouse.jpg")));
        Dimension sizeTitle = title.getPreferredSize();
        play.setSize(200, 50);

        title.setBounds(600, 100, sizeTitle.width, sizeTitle.height);
        play.setBounds(550, 300, play.getWidth(), play.getHeight());
        add(title);
        add(play);

//        JPanel p1 = new JPanel();
//            p1.setLayout(new GridLayout(0, 1));
//            p1.add(play);
//                play.addActionListener(new listenerPlay());
//
//
//        setLayout(new BorderLayout());
//        setContentPane(new JLabel(new ImageIcon("src/Lighthouse.jpg")));
//
//        setLayout(new FlowLayout());
//        add(p1);
    }

    public static void main(String[] args)
    {
        EduFun app = new EduFun();
        app.pack(); //Agar ukuran frame menyesuaikan
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    class listenerPlay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Game Start");
        }
    }
}
