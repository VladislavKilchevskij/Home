package com.company.models;

import com.company.database.Flat;

public abstract class ElectricalAppliances implements Comparable<ElectricalAppliances> {
    private String name;
    private int powerConsumption;
    private boolean pluggedIn;

    protected ElectricalAppliances(String name, int powerConsumption, boolean pluggedIn) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.pluggedIn = pluggedIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(ElectricalAppliances e) {
        return e.powerConsumption - this.powerConsumption;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", powerConsumption=" + powerConsumption +
                ", pluggedIn=" + pluggedIn +
                '}';
    }
}
