package ru.academITschool.ZubanYaroslav.minesweepe.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Menu extends JFrame {
    private JLabel nameText;
    private JButton ok;
    private JPanel panelFan;
    private JButton preservation;
    private JTextField name;

    private JButton newGame;
    private JButton recordGame;
    private JButton rulesGame;
    private JButton exit;

    private JButton standardGame;

    private JButton yourParameters;
    private JLabel fieldSize;
    private JLabel numberBombs;
    private JButton play;

    private BufferedImage image;

    public Menu() throws IOException {
        super("Сапер");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("C:\\Users\\Ярослав\\IdeaProjects\\Saper\\src\\ru\\academITschool\\ZubanYaroslav\\minesweepe\\resources\\icona.jpg").getImage());

        ok=new JButton("Создать игрока");
        ok.setBackground(Color.green);

        name=new JTextField(15);
        name.setBackground(Color.lightGray);

        panelFan=new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelFan.add(name);
        panelFan.add(ok);

        add(panelFan,BorderLayout.CENTER);
        pack();
    }


    public static void main(String[] args) {
        Menu menu= null;

        try {
            menu = new Menu();
        } catch (IOException e) {
            e.printStackTrace();
        }

        menu.setVisible(true);
    }
}
