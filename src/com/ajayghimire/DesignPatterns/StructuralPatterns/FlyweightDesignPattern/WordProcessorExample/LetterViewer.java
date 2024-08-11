package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.WordProcessorExample;

import java.util.ArrayList;

public class LetterViewer {
  private static ArrayList<ArrayList<Character>> charMatrix = new ArrayList(new ArrayList());

  public static void displayMatrix(char charValue, int row, int column) {
    insertToMatrix(charValue, row, column);
    System.out.println(charMatrix);
  }

  private static void insertToMatrix(char charValue, int row, int column) {
    // Ensure that the matrix has enough rows
    while (charMatrix.size() <= row) {
      charMatrix.add(new ArrayList<>());
    }

    // Ensure that the row has enough columns
    ArrayList<Character> rowList = charMatrix.get(row);
    while (rowList.size() <= column) {
      rowList.add(' '); // Fill with space or any placeholder character
    }

    // Insert the character at the specified position
    rowList.set(column, charValue);
  }
}
