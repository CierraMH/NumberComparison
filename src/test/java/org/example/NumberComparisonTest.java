package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test NumberComparison class")
class NumberComparisonTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Before each test method");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After each test method");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After all test methods");
    }

    @Test
    @DisplayName("numberComparison() method test")
    void TestNumberComparison() {

        assertEquals("Numbers are the same", NumberComparison.numberComparison(20,20));
        assertEquals("The first number was larger than the second", NumberComparison.numberComparison(20, 2));
        assertEquals("The second number was larger than the first", NumberComparison.numberComparison(2, 20));
    }
}