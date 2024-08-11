package com.ajayghimire.DesignPatterns.StructuralPatterns.FlyweightDesignPattern.WordProcessorExample;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
  private static Map<Character, ILetter> letterCache = new HashMap<>();

  public static ILetter createLetter(char charValue) {
    if (letterCache.containsKey(charValue)) {
      return letterCache.get(charValue);
    } else {
      ILetter letter = new DocumentCharacter();
    }
  }
}
