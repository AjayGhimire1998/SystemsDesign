package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.FlyweightDesignPattern.WordProcessorExample;

public class ClientMain {
  public static void main(String[] args) {
    ILetter letter1 = LetterFactory.createLetter('A');
    letter1.display(0, 0);

    ILetter letter2 = LetterFactory.createLetter('J');
    letter2.display(0, 2);

    ILetter letter3 = LetterFactory.createLetter('A');
    letter3.display(0, 4);
  }
}
