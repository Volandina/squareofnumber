package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void specificrange() {
        SQRService service = new SQRService();

        int actual = service.calcsqr(400, 500);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void negativerange() {
        SQRService service = new SQRService();

        int actual = service.calcsqr(-500, -400);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

