package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class GraphicalUserInterface extends JFrame {
    void chooseTeacherMode(){}
    void chooseStudentMode(){}
    void choosePersonnelMode(){}

    private JButton chooseTeacherModeButton = new JButton("Войти как преподавтель");
    private JButton chooseStudentModeButton = new JButton("Войти как студент");
    private JButton choosePersonnelModeButton = new JButton("Войти как персонал");

    public GraphicalUserInterface(){
        super("Вход в приложение");
        setBounds(400,200, 400, 200);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(null);

        this.chooseStudentModeButton.setBounds(25, 50,100, 50);
        this.chooseTeacherModeButton.setBounds(140, 50, 100, 50);
        this.choosePersonnelModeButton.setBounds(255, 50, 100, 50);

        container.add(this.chooseStudentModeButton);
        container.add(this.chooseTeacherModeButton);
        container.add(this.choosePersonnelModeButton);
    }
}
