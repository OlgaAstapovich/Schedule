package com.company.controller;

import com.company.model.Teacher;

import java.util.List;

public class TeacherDAOImpl implements TeacherDAO{

    private List<Teacher> teachers;
    private DBConnection dbConnection;

    public TeacherDAOImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void create(Teacher teacher) {

    }

    @Override
    public Teacher getTheTeacherByName(String name) {
        return null;
    }
}
