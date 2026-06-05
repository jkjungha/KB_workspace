package com.example.jdbc.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest {
    @Test
    @DisplayName("Person 객체의 getter, setter, toString을 확인한다")
    void personBasicMethods() {
        Person person = new Person();
        person.setId(10);
        person.setName("김자바");

        assertEquals(10, person.getId());
        assertEquals("김자바", person.getName());
        assertTrue(person.toString().contains("김자바"));
    }
}
