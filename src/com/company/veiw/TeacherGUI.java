package com.company.veiw;

import com.company.model.ClassSchedule;
import com.company.model.Examination;
import com.company.model.Teacher;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class TeacherGUI extends JFrame{
    Teacher searchForATeacher(String teacher){return null;}
    List<ClassSchedule> searchForASchedule(){return Collections.emptyList();}
    List<Examination> searchForExams(){return Collections.emptyList();}
    void createANote(){}
    void settings(){}
    void createAbsenceList(){}
    void createMarksList(){}

    private JButton searchForATeacherButton = new JButton("Поиск преподавателя");
    private JButton searchForAScheduleButton = new JButton("Поиск расписания");
    private JButton searchForExamsButton = new JButton("Экзамены");
    private JButton createANoteButton = new JButton("Создать заметку");
    private JButton settingsButton = new JButton("Настройки");
    private JButton createAbsenceListButton = new JButton("Создать список отсутсвующих");
    private JButton createMarksListButton = new JButton("Создать список оценок");


}
