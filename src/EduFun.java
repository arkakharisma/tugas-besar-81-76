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
        JButton play = new JButton("PLAY");

        JPanel p1 = new JPanel();
            p1.setLayout(new GridLayout(0, 1));
            p1.add(play);
                play.addActionListener(new listenerPlay());


        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("src/Lighthouse.jpg")));

        setLayout(new FlowLayout());
        add(p1);
    }


    class listenerPlay implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Game Start");
        }
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
}
