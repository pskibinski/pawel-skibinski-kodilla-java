package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("My name is Paul", (a) ->"ABC " + a + " ABC");
        poemBeautifier.beautify("HULK SMASH!", String::toLowerCase);
        poemBeautifier.beautify("Don't worry be happy!", String::toUpperCase);
        poemBeautifier.beautify("java is hard!", (a -> {
            String result = "";
            int i = 0;
            char[] chars = a.toCharArray();
            for(char c : chars) {
                if(i % 2 == 0) {
                    result = result + String.valueOf(c).toUpperCase();
                } else {
                    result = result + String.valueOf(c);
                }
                i++;
            }
            return result;
        }));
    }
}
