package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.WordProcessorExample;

import java.util.ArrayList;

public class LetterViewer {
  private static ArrayList<ArrayList<Character>> charMatrix = new ArrayList(new ArrayList());

  public static void displayMatrix(char charValue, int row, int column) {
    insertToMatrix(charValue, row, column);
    System.out.println(charMatrix);
  }

  private static void insertToMatrix(char charValue, int row, int column){
    for(int i = 0; i< row; i++){
      ArrayList<Character> rowList = new ArrayList<>();
      for(int j = 0; j< column; j++){
        rowList.add(charValue);
      }
      charMatrix.add(rowList);
    }
  }
}
