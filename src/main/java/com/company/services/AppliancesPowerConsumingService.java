package com.company.services;

import com.company.database.Flat;
import com.company.models.ChargingDevices;
import com.company.models.ElectricalAppliances;
import com.company.models.MainsPoweredAppliances;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class AppliancesPowerConsumingService implements Consumable {
    private static final ArrayList<ElectricalAppliances> consumers = new ArrayList<>();


    private static boolean isChargingDeviseConsumerOfElectricity(ChargingDevices device) {
        return device.isPluggedIn() && !device.isFullCharged();
    }

    private static boolean isMainsPoweredApplianceConsumerOfElectricity(MainsPoweredAppliances appliance) {
        return appliance.isPluggedIn() && !appliance.isInSleepMode();
    }

    private static boolean isElectricalApplianceConsumerOfElectricity(ElectricalAppliances appliance) {
        if (appliance instanceof ChargingDevices) {
            return AppliancesPowerConsumingService.isChargingDeviseConsumerOfElectricity((ChargingDevices) appliance);
        }
        if (appliance instanceof MainsPoweredAppliances) {
            return AppliancesPowerConsumingService.isMainsPoweredApplianceConsumerOfElectricity((MainsPoweredAppliances) appliance);
        }
        return false;
    }

    private static List<ElectricalAppliances> getAllElectricityConsumers(List<ElectricalAppliances> appliances) {
        for (ElectricalAppliances appliance : appliances) {
            if (isElectricalApplianceConsumerOfElectricity(appliance)) {
                consumers.add(appliance);
            }
        }
        return consumers;
    }

    @Override
    public int getTotalPowerConsumptionInFlat(List<ElectricalAppliances> appliances) {
        int totalPowerConsumption = 0;
        for (ElectricalAppliances consumer : AppliancesPowerConsumingService.getAllElectricityConsumers(appliances)) {
            totalPowerConsumption += consumer.getPowerConsumption();
        }
        return totalPowerConsumption;
    }

    @Override
    public ElectricalAppliances findAppliance(List<ElectricalAppliances> appliancesInFlat, String name) {
        return appliancesInFlat
                .stream()
                .filter(electricalAppliances -> electricalAppliances.getName().equals(name))
                .findAny()
                .orElse(null);
    }

    @Override
    public List<ElectricalAppliances> sortByPowerConsumption(List<ElectricalAppliances> appliancesInFlat) {
        return appliancesInFlat.stream().sorted().collect(Collectors.toList());
    }
}
