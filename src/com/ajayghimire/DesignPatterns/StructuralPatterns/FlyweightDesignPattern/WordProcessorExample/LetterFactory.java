package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.WordProcessorExample;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
  private static Map<Character, ILetter> letterCache = new HashMap<>();

  public static ILetter createLetter(char charValue) {
    if (letterCache.containsKey(charValue)) {
      System.out.println("Returning back the already exist charValue " + charValue);
      return letterCache.get(charValue);
    } else {
      ILetter letter = new DocumentCharacter(charValue, "New Times Roman", 12);
      letterCache.put(charValue, letter);
      return letter;
    }
  }
}
