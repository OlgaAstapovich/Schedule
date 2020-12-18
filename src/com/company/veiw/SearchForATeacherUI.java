package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class SearchForATeacherUI extends JFrame{
    private JLabel inputTeacherNameLabel = new JLabel("Введите ФИО пеподавателя");
    private JTextField teacherNameInput = new JTextField();
    private Image image;
    private JLabel imageLabel = new JLabel("Image");
    private JLabel description = new JLabel("Описание:");

    public SearchForATeacherUI(){
        super("Поиск преподавателя");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.inputTeacherNameLabel.setBounds(100, 15, 200, 50);
        this.teacherNameInput.setBounds(90, 60, 200, 25);
        this.description.setBounds(15, 350, 360, 25);
        this.imageLabel.setBounds(170, 190, 100,25);
        this.description.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));

        container.add(this.inputTeacherNameLabel);
        container.add(this.teacherNameInput);
        container.add(this.description);
        container.add(this.imageLabel);
    }
}
