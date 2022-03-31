package com.company.services;

import static org.junit.jupiter.api.Assertions.*;

import com.company.models.ChargingDevices;
import com.company.models.ElectricalAppliances;
import com.company.models.MainsPoweredAppliances;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class AppliancesPowerConsumingServiceTest {
    protected AppliancesPowerConsumingService testService;
    protected List<ElectricalAppliances> testList;
    protected ChargingDevices testChargingDeviceOne;
    protected ChargingDevices testChargingDeviceTwo;
    protected ChargingDevices testChargingDeviceThree;
    protected ChargingDevices testChargingDeviceFour;
    protected MainsPoweredAppliances testMainsPoweredApplianceOne;
    protected MainsPoweredAppliances testMainsPoweredApplianceTwo;
    protected MainsPoweredAppliances testMainsPoweredApplianceThree;

    @BeforeEach
    void initTestingVariables() {
        testList = new ArrayList<>();
        testChargingDeviceOne = new ChargingDevices("Smartphone Poco", 40, true, false);
        testChargingDeviceTwo = new ChargingDevices("iPad", 50, false, false);
        testChargingDeviceThree = new ChargingDevices("Power bank", 10, true, true);
        testChargingDeviceFour = new ChargingDevices("Watch", 20, false, true);
        testMainsPoweredApplianceOne = new MainsPoweredAppliances("Microvave", 55, true, false);
        testMainsPoweredApplianceTwo = new MainsPoweredAppliances("TV", 80, true, true);
        testMainsPoweredApplianceThree = new MainsPoweredAppliances("Play Station", 60, false, false);
        testList.add(testChargingDeviceOne);
        testList.add(testChargingDeviceTwo);
        testList.add(testChargingDeviceThree);
        testList.add(testChargingDeviceFour);
        testList.add(testMainsPoweredApplianceOne);
        testList.add(testMainsPoweredApplianceTwo);
        testList.add(testMainsPoweredApplianceThree);
        testService = new AppliancesPowerConsumingService();
    }

    @Test
    void getTotalPowerConsumptionInFlatTest() {
        assertEquals(95, testService.getTotalPowerConsumptionInFlat(testList));

    }

    @Test
    void findApplianceTest() {
        assertEquals(testChargingDeviceTwo, testService.findAppliance(testList, "iPad"));
    }

    @Test
    void sortByPowerConsumptionTest() {
        ElectricalAppliances[] sortedArrayExample = new ElectricalAppliances[]{testMainsPoweredApplianceTwo,
                testMainsPoweredApplianceThree,
                testMainsPoweredApplianceOne,
                testChargingDeviceTwo,
                testChargingDeviceOne,
                testChargingDeviceFour,
                testChargingDeviceThree
        };
        assertArrayEquals(sortedArrayExample, testService.sortByPowerConsumption(testList).toArray());
    }
}