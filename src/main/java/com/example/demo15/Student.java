package com.example.demo15;

public class Student {

    //Creating a dependency
    //Now we need to create object or bean for this Exam class as well
    private Exam exam;

    public Student() {
    }

    public Student(Exam exam) {
        this.exam = exam;
    }

    public void study()
    {
        exam.display();
        System.out.println("Student is studying");
    }
}
