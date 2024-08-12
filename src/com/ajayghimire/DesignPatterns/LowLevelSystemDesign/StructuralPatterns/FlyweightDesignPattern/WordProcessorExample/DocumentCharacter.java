package com.ajayghimire.DesignPatterns.LowLevelSystemDesign.StructuralPatterns.FlyweightDesignPattern.WordProcessorExample;

public class DocumentCharacter implements ILetter {
  private char character;
  private String fontType;
  private int fontSize;

  public DocumentCharacter(char character, String fontType, int fontSize) {
    this.character = character;
    this.fontType = fontType;
    this.fontSize = fontSize;
  }

  public char getCharacter() {
    return character;
  }

  public String getFontType() {
    return fontType;
  }

  public int getFontSize() {
    return fontSize;
  }

  /** */
  @Override
  public void display(int row, int column) {
    System.out.printf(
        "Entering %s in row position %d and column position %d.\n", this.character, row, column);

    LetterViewer.displayMatrix(this.character, row, column);

  }
}
