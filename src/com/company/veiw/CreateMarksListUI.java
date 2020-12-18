package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class CreateMarksListUI extends JFrame{
    private JTextArea marksList = new JTextArea();
    private JButton saveButton = new JButton("Сохранить");

    public CreateMarksListUI(){
        super("Создать список оценок");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.marksList.setBounds(15, 15, 360, 400);
        this.saveButton.setBounds(143, 470, 100, 25);

        container.add(marksList);
        container.add(saveButton);
    }
}
