package ru.academITschool.ZubanYaroslav.minesweepe.gui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


class Sound extends JButton {
    private final FileInputStream f;
    private static int i=0;

    public Sound() throws FileNotFoundException {
        super("Звук");
        f= new FileInputStream("C:\\Users\\Ярослав\\IdeaProjects\\Saper\\src\\ru\\academITschool\\ZubanYaroslav\\minesweepe\\resources\\Play.flac");

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(i%2==0){

                }else {

                }
            }
        });
    }

    void on(){

        i++;
    }

    void off(){

    }
}
