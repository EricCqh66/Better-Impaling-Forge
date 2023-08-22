package com.ericcqh66.better_impaling_forge.mixin;

import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.math.EntityRayTraceResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import com.ericcqh66.better_impaling_forge.BetterImpalingForge;

@Mixin(TridentEntity.class)
public abstract class TridentEntityMixin{
    @Inject(
        method = "onHitEntity",
        at = @At(value = "HEAD")
    )
    private void onHitEntityMixin(EntityRayTraceResult p_213868_1_, CallbackInfo ci) {
        BetterImpalingForge.is_in_water_or_rain = p_213868_1_.getEntity().isInWaterOrRain();
        // System.out.println("注入成功");
    }
}
