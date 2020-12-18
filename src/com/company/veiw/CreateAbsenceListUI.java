package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class CreateAbsenceListUI extends JFrame{
    private JTextArea absenceList = new JTextArea();
    private JButton saveButton = new JButton("Сохранить");

    public CreateAbsenceListUI(){
        super("Создать список отсутствующих");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.absenceList.setBounds(15, 15, 360, 400);
        this.saveButton.setBounds(143, 470, 100, 25);

        container.add(absenceList);
        container.add(saveButton);
    }
}
