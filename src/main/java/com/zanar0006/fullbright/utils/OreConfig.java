package com.zanar0006.fullbright.utils;

import net.minecraft.world.level.dimension.Dimension;

public class OreConfig {
    public static final String[] overworldOres = {"Coal_Ore", "Iron_Ore", "Gold_Ore"};
    public static final String[] netherOres = {"Netherrack_Ore", "Quartz_Ore"};
    public static final String[] endOres = {"Endstone_Ore", "End_Crystal_Ore"};

    public static String[] getOresForDimension(Dimension dimension) {
        switch (dimension) {
            case OVERWORLD:
                return overworldOres;
            case NETHER:
                return netherOres;
            case THE_END:
                return endOres;
            default:
                return new String[0]; // No ores for unknown dimensions
        }
    }
}