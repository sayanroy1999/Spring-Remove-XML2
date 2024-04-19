package com.example.demo15;


import org.springframework.context.annotation.Bean;

//Creating class that will return me the object of student class
public class Javaconfig {

    //This will tell IOC that from this method we need to take the object

   //Bean for my exam class
    @Bean
   public Exam getExam()
   {
       return new Exam();
   }

    @Bean(name={"student","temp","obj"}) //So all these names we can use in main class to call the bean
    public Student getStudent()
    {
        Student student=new Student(getExam()); //Injecting that previous method
        return  student;
    }

}
