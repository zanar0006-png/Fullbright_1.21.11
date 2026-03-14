package com.zanar0006.fullbright.client;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class FullbrightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Code for ore visualization and rendering
        // This would typically include registering event listeners and rendering logic
        MinecraftClient client = MinecraftClient.getInstance();
        // Additional logic for visualization can be added here
    }
}