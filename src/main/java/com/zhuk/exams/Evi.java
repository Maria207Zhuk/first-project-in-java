package com.zhuk.exams;

import com.zhuk.objects.Student;

import java.util.*;

public class Evi {


    private Map<Student, String> participantsMap = new HashMap<>();

    public void registersStudent(Student student) {
        participantsMap.put(student, "0");
    }

    public void printAllParticipants() {
        for(Map.Entry<Student, String> studentToScore : participantsMap.entrySet()) {
            System.out.println(studentToScore.getKey() +" | Score " +studentToScore.getKey());
        }
    }



}
