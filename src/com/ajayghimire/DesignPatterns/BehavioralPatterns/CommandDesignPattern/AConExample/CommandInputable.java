package com.ajayghimire.DesignPatterns.BehavioralPatterns.CommandDesignPattern.AConExample;

public interface CommandInputable {
  <T> void execute(T t);
}
