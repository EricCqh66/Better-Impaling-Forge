package com.ericcqh66.better_impaling_forge.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.ericcqh66.better_impaling_forge.BetterImpalingForge;

import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.phys.EntityHitResult;

@Mixin(ThrownTrident.class)
public abstract class ThrownTridentMixin{
    @Inject(
        method = "onHitEntity",
        at = @At(value = "HEAD")
    )
    private void onHitEntityMixin(EntityHitResult p_37573_, CallbackInfo ci) {
        BetterImpalingForge.is_in_water_or_rain = p_37573_.getEntity().isInWaterOrRain();
    }
}
