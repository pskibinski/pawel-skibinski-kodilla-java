package com.kodilla.spring.reader;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReaderTestSuite {

    @Test
    public void testRead() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderCongif.class);
        Reader reader = context.getBean(Reader.class);
        //When
        reader.read();
    }

    @Test
    public void testConditional() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderCongif.class);
        //When
        boolean book2Exists = context.containsBean("book2");
        //Then
        System.out.println("Been book2 was found in container: " + book2Exists);
    }
}
