package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    public List<Student> getStudents() {
        return students;
    }

    private List<Student> students = new ArrayList<Student>();

    public void AddStudent(Student student){
        boolean isExist = studentIsExist(student.getId());
        if(!isExist){
            this.students.add(student);
            System.out.println("öğrenci eklendi");
        }
        else {
            System.out.println("Bu öğrenci zaten kayıtlı");
        }
    }

    public Student FindStudent(int id){
        for ( Student student : students) {
            if (student.getId()==id){
                return student;
            }
        }
        return null;
    }

    public List<Student> FindStudent(String name, String lastName){

        List<Student> findingStudents = new ArrayList<Student>();
        for ( Student student : students) {
            if (student.getName()==name && student.getLastName()==lastName){
                findingStudents.add(student);
            }
        }
        return findingStudents;
    }

    public int getStudentsCount(){
        return this.students.size();
    }

    private boolean studentIsExist(int id){
        boolean isExist = false;
        for ( Student student : students) {
            if (student.getId()==id){
                isExist = true;
                 break;
            }
        }

        return  isExist;
    }

}
