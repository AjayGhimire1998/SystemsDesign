package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.CreationalPatterns.PrototypeDesignPattern.StudentsExample;

public class Student implements Prototype {
  public int rollNumber;
  public String name;
  private int age;
  private int fees;

  public Student(int rollNumber, String name, int age, int fees) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.age = age;
    this.fees = fees;
  }

  /**
   * @return
   */
  @Override
  public Prototype clone() {
    return new Student(this.rollNumber, this.name, this.age, this.fees);
  }
}
