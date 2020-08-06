package com.automate.automate.Service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestServiceTest {

    @BeforeEach
    void setUp() {
        TestService testService = new TestService("hello");
    }

    @Test
    void shouldRunTest1() {
        assertTrue(true);
    }

    @Test
    void shouldRunTest2() {
        assertTrue(true);
    }

    @Test
    void shouldRunTest3() {
        assertTrue(true);
    }

    @Test
    void shouldRunTest4() {
        assertTrue(true);
    }

    @Test
    void shouldRunTest5() {
        assertTrue(true);
    }
}