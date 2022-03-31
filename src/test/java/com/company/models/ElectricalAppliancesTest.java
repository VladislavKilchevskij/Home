package com.company.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricalAppliancesTest {

    ElectricalAppliances test1;
    ElectricalAppliances test2;

    @BeforeEach
    void initTestingObjects() {
        test1 = new ChargingDevices("Test1",
                1,
                true,
                true);
        test2 = new MainsPoweredAppliances("Test2",
                2,
                false,
                false);
    }

    @Test
    void getNameTest() {
        assertEquals("Test1", test1.getName());
        assertEquals("Test2", test2.getName());
    }

    @Test
    void setNameTest() {
        test1.setName("TestName");
        assertEquals("TestName", test1.getName());
        test2.setName("TestNameTwo");
        assertEquals("TestNameTwo", test2.getName());
    }

    @Test
    void getPowerConsumptionTest() {
        assertEquals(1, test1.getPowerConsumption());
        assertEquals(2, test2.getPowerConsumption());
    }

    @Test
    void setPowerConsumptionTest() {
        test1.setPowerConsumption(34);
        assertEquals(34, test1.getPowerConsumption());
        test2.setPowerConsumption(56);
        assertEquals(56, test2.getPowerConsumption());
    }

    @Test
    void isPluggedInTest() {
        assertTrue(test1.isPluggedIn());
        assertFalse(test2.isPluggedIn());
    }

    @Test
    void setPluggedInTest() {
        test1.setPluggedIn(false);
        assertFalse(test1.isPluggedIn());
        test2.setPluggedIn(true);
        assertTrue(test2.isPluggedIn());
    }
}


