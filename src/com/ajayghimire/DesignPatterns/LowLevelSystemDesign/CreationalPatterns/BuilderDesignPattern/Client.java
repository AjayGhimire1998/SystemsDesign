package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.BuilderDesignPattern;

public class Client {
  public static void main(String[] args) {
    Director director1 = new Director(new SoftwareEngineeringStudentBuilder());
    Director director2 = new Director(new MBAStudentBuilder());

    Student softwareEngStudent = director1.createStudent();
    Student mbaStudent = director2.createStudent();

    System.out.println(softwareEngStudent);
    System.out.println(mbaStudent);
  }
}
