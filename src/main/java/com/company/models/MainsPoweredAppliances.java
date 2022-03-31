package com.company.models;

import com.company.database.Flat;

public final class MainsPoweredAppliances extends ElectricalAppliances {
    private boolean inSleepMode;

    public MainsPoweredAppliances(String name, int powerConsumption, boolean pluggedIn, boolean inSleepMode) {
        super(name, powerConsumption, pluggedIn);
        this.inSleepMode = inSleepMode;
        Flat.getAppliancesInFlat().add(this);
    }

    public boolean isInSleepMode() {
        return inSleepMode;
    }

    public void setInSleepMode(boolean inSleepMode) {
        this.inSleepMode = inSleepMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MainsPoweredAppliances that = (MainsPoweredAppliances) o;

        return inSleepMode == that.inSleepMode;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (inSleepMode ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "inSleepMode=" + inSleepMode +
                '}';
    }
}
