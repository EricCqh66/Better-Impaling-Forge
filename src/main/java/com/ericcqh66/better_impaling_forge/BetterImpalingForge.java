package com.ericcqh66.better_impaling_forge;

import com.ericcqh66.better_impaling_forge.config.BetterImpalingForgeConfig;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig.Type;

@Mod("better_impaling_forge")
public class BetterImpalingForge {
    public static final String MOD_ID = "better_impaling_forge";

    public static boolean is_in_water_or_rain;

    public BetterImpalingForge() {
        ModLoadingContext.get().registerConfig(Type.COMMON, BetterImpalingForgeConfig.SPEC, "better_impaling_forge-common.toml");
    }
}
