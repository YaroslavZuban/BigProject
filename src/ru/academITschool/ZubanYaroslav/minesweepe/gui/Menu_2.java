package ru.academITschool.ZubanYaroslav.minesweepe.gui;

import javax.swing.*;
import java.awt.*;

class Menu_2 extends JFrame {
    private JPanel panel;
    private JButton newGame;
    private JButton recordGame;
    private JButton rulesGame;
    private JButton exit;
    private Container container;

    public Menu_2() {
        super("Сапер");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setIconImage(new
                ImageIcon("C:\\Users\\Ярослав\\IdeaProjects\\Saper\\src\\ru\\academITschool\\" +
                "ZubanYaroslav\\minesweepe\\resources\\icona.jpg").getImage());

        container = new Container();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));

        newGame = new JButton("ИГРАТЬ");
        newGame.setBackground(Color.green);
        newGame.setAlignmentX(Component.CENTER_ALIGNMENT);

        recordGame = new JButton("Рекорд игры");
        recordGame.setBackground(Color.green);
        recordGame.setAlignmentX(Component.CENTER_ALIGNMENT);

        rulesGame = new JButton("Правила игры");
        rulesGame.setBackground(Color.green);
        rulesGame.setAlignmentX(Component.CENTER_ALIGNMENT);

        exit = new JButton("Выход");
        exit.setBackground(Color.green);
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel = new JPanel();

        panel.add(newGame,BorderLayout.LINE_START);
        panel.add(recordGame,BorderLayout.CENTER);
        panel.add(rulesGame,BorderLayout.LINE_END);
        panel.add(exit,BorderLayout.LINE_END);

        add(panel);
    }

    public static void main(String[] args) {
        Menu_2 p = new Menu_2();
        p.setVisible(true);
    }
}

