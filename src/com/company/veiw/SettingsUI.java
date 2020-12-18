package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class SettingsUI extends JFrame{
    private JLabel textSizeLabel = new JLabel("Размер текста");
    private JLabel fontLabel = new JLabel("Шрифт");
    private JLabel colorLabel = new JLabel("Цвет");
    private JLabel languageLabel = new JLabel("Язык");
    private JTextField textSizeInput = new JTextField();
    private JTextField fontInput = new JTextField();
    private JTextField colorInput = new JTextField();
    private JTextField languageInput = new JTextField();
    private JButton saveButton = new JButton("Сохранить");

    public SettingsUI(){
        super("Настройки");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.textSizeLabel.setBounds(50, 25, 100, 25);
        this.fontLabel.setBounds(50, 80, 100, 25);
        this.colorLabel.setBounds(50, 135, 100, 25);
        this.languageLabel.setBounds(50,190, 100, 25);
        this.textSizeInput.setBounds(200, 25, 100, 25);
        this.fontInput.setBounds(200,80, 100, 25);
        this.colorInput.setBounds(200, 135, 100, 25);
        this.languageInput.setBounds(200, 190, 100, 25);
        this.saveButton.setBounds(130, 270, 100, 25);

        container.add(this.textSizeLabel);
        container.add(this.fontLabel);
        container.add(this.colorLabel);
        container.add(this.languageLabel);
        container.add(this.textSizeInput);
        container.add(this.fontInput);
        container.add(this.colorInput);
        container.add(this.languageInput);
        container.add(this.saveButton);
    }

}
