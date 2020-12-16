package com.company.controller;

import com.company.model.Teacher;

public interface TeacherDAO {
    void create(Teacher teacher);
    Teacher getTheTeacherByName(String name);
}
