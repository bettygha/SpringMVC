package com.example.mvcdemo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mvcdemo.models.Student;

@Service
public class StudentService {
    List<Student> students =new ArrayList<>(Arrays.asList(
        new Student ("S2", "Betty" , "Software"),
        new Student ("S1", "Kal","Accounting"),
        new Student ("S3", "Libe", "Managment")
    ));
    public List<Student> getAllStudents (){
        return students;

    }

    public Student getStudentById(String Id){
        Student s= students.stream()
        .filter(student ->Id.equals(student.getId()))
        .findAny().orElse(null);

        return s ;

    }
    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(String Id, Student student) {
        for(Student s: students){
            if(Id.equals(s.getId())){
                s.setDepartment(student.getDepartment());
                s.setName(student.getName());
            }
        }
    }

    public void deleteStudent(String Id) {
        students.removeIf(student -> Id.equals(student.getId()));

    }

   
    
}
