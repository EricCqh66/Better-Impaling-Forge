package com.ericcqh66.better_impaling_forge.mixin;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.ericcqh66.better_impaling_forge.BetterImpalingForge;

@Mixin(Player.class)
public abstract class PlayerMixin{
    @Inject(
        method = "attack",
        at = @At(value = "HEAD")
    )
    private void attackMixin(Entity p_36347_, CallbackInfo ci) {
        BetterImpalingForge.is_in_water_or_rain = p_36347_.isInWaterOrRain();
    }
}
