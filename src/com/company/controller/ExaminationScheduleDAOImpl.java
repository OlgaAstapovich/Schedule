package com.company.controller;

import com.company.model.ClassSchedule;
import com.company.model.Examination;

import java.util.Collections;
import java.util.List;

public class ExaminationScheduleDAOImpl implements ExaminationScheduleDAO {
    private List<Examination> examinations;
    private DBConnection dbConnection;

    public ExaminationScheduleDAOImpl(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void create(Examination examination) {
    }

    @Override
    public List<Examination> getAllTheExaminations() {
        return Collections.emptyList();
    }

    @Override
    public Examination getTheExamByGroup() {
        return null;
    }
}
