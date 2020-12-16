package com.company.controller;

import com.company.model.ClassSchedule;
import com.company.model.Examination;

import java.util.List;

public interface ExaminationScheduleDAO {
    void create(Examination examination);
    List<Examination> getAllTheExaminations();
    Examination getTheExamByGroup();
}
