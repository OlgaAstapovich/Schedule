package com.company.controller;

import com.company.model.ClassSchedule;

import java.util.List;

public class ScheduleDAOImpl implements ScheduleDAO{
    private List<ClassSchedule> classSchedules;
    private DBConnection dbConnection;

    public ScheduleDAOImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void create(ClassSchedule classSchedule) { }

    @Override
    public List<ClassSchedule> getAllTheClasses() {
        return null;
    }

    @Override
    public ClassSchedule getTheClassByGroup() {
        return null;
    }
}
