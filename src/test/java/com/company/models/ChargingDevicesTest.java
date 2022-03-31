package com.company.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ChargingDevicesTest{
    ChargingDevices test;

    @BeforeEach
    void initTestingObject() {
        test = new ChargingDevices("Test",
                1,
                true,
                true);
    }

    @Test
    void isFullChargedTest() {
        assertTrue(test.isFullCharged());
    }

    @Test
    void setFullChargedTest() {
        test.setFullCharged(false);
        assertFalse(test.isFullCharged());
    }
}