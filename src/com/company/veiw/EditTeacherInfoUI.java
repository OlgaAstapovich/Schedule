package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class EditTeacherInfoUI extends JFrame{
    private JLabel inputTeacherNameLabel = new JLabel("Введите ФИО пеподавателя");
    private JTextField teacherNameInput = new JTextField();
    private JButton saveButton = new JButton("Сохранить");

    public EditTeacherInfoUI(){
        super("Редактировать информацию о преподавателе");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.inputTeacherNameLabel.setBounds(100, 15, 200, 50);
        this.teacherNameInput.setBounds(90, 60, 200, 25);
        this.saveButton.setBounds(150, 520, 100, 25);

        container.add(inputTeacherNameLabel);
        container.add(teacherNameInput);
        container.add(saveButton);
    }
}
