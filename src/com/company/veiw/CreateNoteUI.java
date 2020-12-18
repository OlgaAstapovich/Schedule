package com.company.veiw;

import javax.swing.*;
import java.awt.*;

public class CreateNoteUI extends JFrame{

    private JLabel noteNameLabel = new JLabel("Название");
    private JLabel noteTypeLabel = new JLabel("Тип");
    private JLabel noteDateLabel = new JLabel("Дата");
    private JLabel noteIntervalLabel = new JLabel("Интервал");
    private JTextField noteNameInput = new JTextField();
    private JTextField noteTypeInput = new JTextField();
    private JTextField noteDateInput = new JTextField();
    private JTextField noteIntervalInput = new JTextField();
    private JButton saveButton = new JButton("Сохранить");

    public CreateNoteUI(){
        super("Создать заметку");
        setBounds(400,50, 400, 550);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);

        this.noteNameLabel.setBounds(50, 25, 100, 25);
        this.noteTypeLabel.setBounds(50, 80, 100, 25);
        this.noteDateLabel.setBounds(50, 135, 100, 25);
        this.noteIntervalLabel.setBounds(50,190, 100, 25);
        this.noteNameInput.setBounds(200, 25, 100, 25);
        this.noteTypeInput.setBounds(200,80, 100, 25);
        this.noteDateInput.setBounds(200, 135, 100, 25);
        this.noteIntervalInput.setBounds(200, 190, 100, 25);
        this.saveButton.setBounds(130, 270, 100, 25);

        container.add(noteNameLabel);
        container.add(noteTypeLabel);
        container.add(noteDateLabel);
        container.add(noteIntervalLabel);
        container.add(noteNameInput);
        container.add(noteTypeInput);
        container.add(noteDateInput);
        container.add(noteIntervalInput);
        container.add(saveButton);
    }
}
