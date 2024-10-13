package org.example;

import constant.TestConstant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Week3ServiceTest {
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
    public void testCalculateShippingCost_DataPath1() {
        int weight = -1;
        int distance = 10;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath2() {
        int weight = 15;
        int distance = 10;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath3() {
        int weight = 5;
        int distance = 50;
        long expectedCost = 120000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_DataPath4() {
        int weight = 25;
        int distance = 10;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath5() {
        int weight = 50;
        int distance = 10;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath6() {
        int weight = 5;
        int distance = -1;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.INVALID_INPUT, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath7() {
        int weight = 5;
        int distance = 150;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath8() {
        int weight = 10;
        int distance = 50;
        long expectedCost = 160000;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCalculateShippingCost_DataPath9() {
        int weight = 5;
        int distance = 200;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCalculateShippingCost_DataPath10() {
        int weight = 5;
        int distance = 500;
        long expectedCost = TestConstant.INVALID_RESULT;

        long actualCost = Week1Service.calculateShippingCost(weight, distance);
        assertEquals(expectedCost, actualCost);

        assertEquals(TestConstant.OVERLOAD, outputStreamCaptor.toString().trim());
    }

}