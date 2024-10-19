package com.ericcqh66.better_impaling_forge.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class BetterImpalingForgeConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> aquatic_effective;

    static {
        BUILDER.push("Better Impaling Forge Config");

        aquatic_effective = BUILDER.comment("Whether the Impaling enchantment is always also effctive to aquatic mobs.")
            .define("Aquatic Effctive", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
