package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {

    @Test
    public void testUpdate() {
        //Given
        Homework homework = new Homework("Johanna's homework");
        Homework homework1 = new Homework("Lukas' homework");
        Mentor billGates = new Mentor("Bill Gates");
        Mentor markZuckerberg = new Mentor("Mark Zuckerberg");
        homework.registerObserver(billGates);
        homework1.registerObserver(markZuckerberg);
        //When
        homework.addTask("Module 20. Task 1: Facade design pattern");
        homework.addTask("Module 20. Task 2: Decorator design pattern");
        homework.addTask("Module 20. Task 3: AOP design pattern");
        homework1.addTask("Module 11. Task 1: Singleton design pattern");
        homework1.addTask("Module 11. Task 2: Prototype design pattern");
        //Then
        assertEquals(3, billGates.getUpdateCount());
        assertEquals(2, markZuckerberg.getUpdateCount());

    }
}
