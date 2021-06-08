package com.demo.controller;

import com.demo.bean.Student;
import com.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getHello(){
        return "Hello";
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentRepository.findById(id).get();
    }

    @RequestMapping(value = "/students/", method = RequestMethod.POST)
    public Student saveStudentById(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(value = "/students/", method = RequestMethod.PUT)
    public Student updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentRepository.deleteById(id);
    }
}
