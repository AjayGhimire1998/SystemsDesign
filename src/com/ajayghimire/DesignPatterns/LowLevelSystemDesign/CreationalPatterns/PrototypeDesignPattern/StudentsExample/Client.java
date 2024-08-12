package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.PrototypeDesignPattern.StudentsExample;

public class Client {
  public static void main(String[] args) {
    Student student = new Student(1, "AJ", 23, 10_000);
    System.out.println(student);

    Student clonedStudent = (Student) student.clone();
    System.out.println(clonedStudent);
  }
}
