package com.company.controller;

import com.company.model.ClassSchedule;

import java.util.List;

public interface ScheduleDAO {
    void create(ClassSchedule classSchedule);
    List<ClassSchedule> getAllTheClasses();
    ClassSchedule getTheClassByGroup();

}
