package com.ericcqh66.better_impaling_forge.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.ericcqh66.better_impaling_forge.BetterImpalingForge;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin{
    @Inject(
        method = "attack",
        at = @At(value = "HEAD")
    )
    private void attackMixin(Entity p_71059_1_, CallbackInfo ci) {
        BetterImpalingForge.is_in_water_or_rain = p_71059_1_.isInWaterOrRain();
        // System.out.println("注入成功");
    }
}
