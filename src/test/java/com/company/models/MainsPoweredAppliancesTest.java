package com.company.models;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainsPoweredAppliancesTest {
    MainsPoweredAppliances test;

    @BeforeEach
    void initTestingObject() {
        test = new MainsPoweredAppliances("Test",
                1,
                true,
                true);
    }

    @Test
    void isInSleepModeTest() {
        assertTrue(test.isInSleepMode());
    }

    @Test
    void setInSleepModeTest() {
        test.setInSleepMode(false);
        assertFalse(test.isInSleepMode());
    }
}