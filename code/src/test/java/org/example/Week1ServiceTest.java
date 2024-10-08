package org.example;

import constant.TestConstant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Week1ServiceTest {
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
    public void testCalculateShippingCost_MinWeight() {
        int weight = 0;
        int distance = 50;
        long expectedCost = 80000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MinPlusWeight() {
        int weight = 1;
        int distance = 50;
        long expectedCost = 88000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_NomWeight() {
        int weight = 5;
        int distance = 50;
        long expectedCost = 120000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MaxMinusWeight() {
        int weight = 9;
        int distance = 50;
        long expectedCost = 152000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MaxWeight() {
        int weight = 10;
        int distance = 50;
        long expectedCost = 160000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MinDistance() {
        int weight = 5;
        int distance = 0;
        long expectedCost = 40000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MinPlusDistance() {
        int weight = 5;
        int distance = 1;
        long expectedCost = 41600;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MaxMinusDistance() {
        int weight = 5;
        int distance = 99;
        long expectedCost = 198400;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_MaxDistance() {
        int weight = 5;
        int distance = 100;
        long expectedCost = 200000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_InvalidInput1() {
        int weight = -1;
        int distance = -1;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_InvalidInput2() {
        int weight = 5;
        int distance = -1;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_InvalidInput3() {
        int weight = 15;
        int distance = -1;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_InvalidInput4() {
        int weight = -1;
        int distance = 5;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_InvalidInput5() {
        int weight = -1;
        int distance = 150;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_Overload1() {
        int weight = 5;
        int distance = 150;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_Overload2() {
        int weight = 15;
        int distance = 50;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_Overload3() {
        int weight = 15;
        int distance = 150;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_ValidInput() {
        int weight = 5;
        int distance = 50;
        long expectedCost = 120000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }
}