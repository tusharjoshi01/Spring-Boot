package com.ex.BootP01.Service;

import com.ex.BootP01.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
    @Autowired
    StudentRepo studentRepo;

    public String getStudentData(){
       return studentRepo.getStudent();
    }

}