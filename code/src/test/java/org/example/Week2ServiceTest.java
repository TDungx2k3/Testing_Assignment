package org.example;

import constant.TestConstant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Week2ServiceTest {
    public final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        originalOut = System.out;
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCalculateShippingCost_Path1() {
        int weight = -1;
        int distance = 0;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_Path2() {
        int weight = 4;
        int distance = 160;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_MinWeight() {
        int weight = 5;
        int distance = 50;
        long expectedCost = 120000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }


}