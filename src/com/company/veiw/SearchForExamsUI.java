package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class SearchForExamsUI extends JFrame{
    private JLabel inputGroupNumberLabel = new JLabel("Введите номер группы");
    private JTextField groupNumberInput = new JTextField();

    public SearchForExamsUI(){
        super("Экзамены");
        setBounds(400,50, 400, 600);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.inputGroupNumberLabel.setBounds(100, 15, 200, 50);
        this.groupNumberInput.setBounds(90, 60, 200, 25);

        container.add(inputGroupNumberLabel);
        container.add(groupNumberInput);
    }
}
