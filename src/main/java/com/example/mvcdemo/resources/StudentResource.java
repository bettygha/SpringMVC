package com.example.mvcdemo.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mvcdemo.models.Student;

@RestController
@RequestMapping("/crudmvc")
public class StudentResource {

    @Autowired
    private StudentService studentService;

   
    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{Id}")
    public Student getStudentById(@PathVariable("Id") String Id){
        return studentService.getStudentById(Id);

    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping("/students/{Id}")
    public void updateStudent(@PathVariable("Id") String Id ,@RequestBody Student student){
        studentService.updateStudent(Id,student);
        
    }
    @DeleteMapping("/students/{Id}")
    public void deleteStudent(@PathVariable("Id") String Id ){
        studentService.deleteStudent(Id);

        }
    }




