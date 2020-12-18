package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class EditScheduleUI extends JFrame{
    private JLabel inputGroupNumberLabel = new JLabel("Введите номер группы");
    private JTextField groupNumberInput = new JTextField();
    private JButton saveButton = new JButton("Сохранить");

    public EditScheduleUI(){
        super("Редактировать расписание");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.inputGroupNumberLabel.setBounds(100, 15, 200, 50);
        this.groupNumberInput.setBounds(90, 60, 200, 25);
        this.saveButton.setBounds(150,520, 100, 25);

        container.add(inputGroupNumberLabel);
        container.add(groupNumberInput);
        container.add(saveButton);
    }
}
