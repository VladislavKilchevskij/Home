package com.company.models;

import com.company.database.Flat;

public final class ChargingDevices extends ElectricalAppliances {
    private boolean fullCharged;

    public ChargingDevices(String name, int powerConsumption, boolean pluggedIn, boolean fullCharged) {
        super(name, powerConsumption, pluggedIn);
        this.fullCharged = fullCharged;
        Flat.getAppliancesInFlat().add(this);
    }

    public boolean isFullCharged() {
        return fullCharged;
    }

    public void setFullCharged(boolean fullCharged) {
        this.fullCharged = fullCharged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ChargingDevices that = (ChargingDevices) o;

        return fullCharged == that.fullCharged;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (fullCharged ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "fullCharged=" + fullCharged +
                '}';
    }
}
