package com.example.mvcdemo.models;

public class Student {
    String Id;
    String name ;
    String department;

    public Student(){
        
    }

    public Student(String id, String name, String department) {
        Id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
