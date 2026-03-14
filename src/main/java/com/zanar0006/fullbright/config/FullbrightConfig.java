package com.zanar0006.fullbright.config;

public class FullbrightConfig {
    private int chunkRange;
    private boolean oreVisibility;
    private double brightnessMultiplier;

    public FullbrightConfig(int chunkRange, boolean oreVisibility, double brightnessMultiplier) {
        this.chunkRange = chunkRange;
        this.oreVisibility = oreVisibility;
        this.brightnessMultiplier = brightnessMultiplier;
    }

    public int getChunkRange() {
        return chunkRange;
    }

    public void setChunkRange(int chunkRange) {
        this.chunkRange = chunkRange;
    }

    public boolean isOreVisibility() {
        return oreVisibility;
    }

    public void setOreVisibility(boolean oreVisibility) {
        this.oreVisibility = oreVisibility;
    }

    public double getBrightnessMultiplier() {
        return brightnessMultiplier;
    }

    public void setBrightnessMultiplier(double brightnessMultiplier) {
        this.brightnessMultiplier = brightnessMultiplier;
    }
}