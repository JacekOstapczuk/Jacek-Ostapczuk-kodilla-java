package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String textToBeautify, String textBeBeautifier,  PoemDecorator  poemDecorator) {
      String result = poemDecorator.decorate(textToBeautify,textBeBeautifier );
        System.out.println("Text after beautifier: " + result);
    }
}
