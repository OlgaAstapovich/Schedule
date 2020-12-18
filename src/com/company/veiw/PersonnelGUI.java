package com.company.veiw;

import com.company.model.ClassSchedule;
import com.company.model.Examination;
import com.company.model.Teacher;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.List;

public class PersonnelGUI extends JFrame{
    Teacher searchForATeacher(String teacher){return null;}
    List<ClassSchedule> searchForASchedule(){return Collections.emptyList();}
    List<Examination> searchForExams(){return Collections.emptyList();}
    void createANote(){}
    void settings(){}
    void editTeacherInformation(){}
    void editGroupSchedule(){}

    private JButton searchForATeacherButton = new JButton("Поиск преподавателя");
    private JButton searchForAScheduleButton = new JButton("Поиск расписания");
    private JButton searchForExamsButton = new JButton("Экзамены");
    private JButton createANoteButton = new JButton("Создать заметку");
    private JButton settingsButton = new JButton("Настройки");
    private JButton editTeacherInformationButton = new JButton("Редактировать инофрмацию о преподавателе");
    private JButton editGroupScheduleButton = new JButton("Редактировать расписание группы");

    private JLabel notes= new JLabel("Заметки:");

    public PersonnelGUI(){
        super("Главное меню");
        setBounds(400,50, 400, 600);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(null);

        this.searchForATeacherButton.setBounds(25, 20,100, 50);
        this.searchForExamsButton.setBounds(140, 20, 100, 50);
        this.searchForAScheduleButton.setBounds(255, 20, 100, 50);
        this.createANoteButton.setBounds(85, 75, 100, 50);
        this.settingsButton.setBounds(195, 75, 100, 50);
        this.editTeacherInformationButton.setBounds(35, 135, 150, 50);
        this.editGroupScheduleButton.setBounds(195, 135, 150, 50);
        this.notes.setBounds(15, 370, 360, 25);
        this.notes.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));


        container.add(this.searchForATeacherButton);
        container.add(this.searchForAScheduleButton);
        container.add(this.searchForExamsButton);
        container.add(this.createANoteButton);
        container.add(this.settingsButton);
        container.add(this.editTeacherInformationButton);
        container.add(this.editGroupScheduleButton);
        container.add(this.notes);
    }
}
