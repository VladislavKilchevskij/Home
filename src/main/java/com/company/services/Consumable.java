package com.company.services;

import com.company.models.ElectricalAppliances;

import java.util.List;

public interface Consumable {

    int getTotalPowerConsumptionInFlat(List<ElectricalAppliances> appliances);

    ElectricalAppliances findAppliance(List<ElectricalAppliances> appliancesInFlat, String name);

    List<ElectricalAppliances> sortByPowerConsumption(List<ElectricalAppliances> appliancesInFlat);
}