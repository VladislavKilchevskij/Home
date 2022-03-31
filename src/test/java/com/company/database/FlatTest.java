package com.company.database;

import static org.junit.jupiter.api.Assertions.*;

import com.company.models.ChargingDevices;
import com.company.models.ElectricalAppliances;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class FlatTest {

    @Test
    void getAppliancesInFlatTest() {
        List<ElectricalAppliances> appliancesInFlat = new ArrayList<>();
        ElectricalAppliances testAppliance = new ChargingDevices("test", 1, true, true);
        assertArrayEquals(new ElectricalAppliances[]{testAppliance}, Flat.getAppliancesInFlat().toArray());
    }
}