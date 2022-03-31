package com.company.database;

import com.company.models.ElectricalAppliances;

import java.util.ArrayList;
import java.util.List;

public final class Flat {
    private static final List<ElectricalAppliances> appliancesInFlat = new ArrayList<>();

    private Flat() {
    }

    public static List<ElectricalAppliances> getAppliancesInFlat() {
        return appliancesInFlat;
    }
}

