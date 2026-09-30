package com.ex.BootP01.Controller;

import com.ex.BootP01.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping("/welcome")
    public String welcome(){

       return studentService.getStudentData();
    }


}





















