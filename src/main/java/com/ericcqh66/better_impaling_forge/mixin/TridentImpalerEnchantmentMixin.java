package com.ericcqh66.better_impaling_forge.mixin;

import net.minecraft.world.item.enchantment.TridentImpalerEnchantment;
import net.minecraft.world.entity.MobType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.ericcqh66.better_impaling_forge.BetterImpalingForge;

@Mixin(TridentImpalerEnchantment.class)
public abstract class TridentImpalerEnchantmentMixin {
    @Inject(
        method = "getDamageBonus",
        at = @At(value = "HEAD"),
        cancellable = true
    )
    private void getDamageBonusMixin(int p_45235_, MobType p_45236_, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(BetterImpalingForge.is_in_water_or_rain ? (float)p_45235_ * 2.5F : 0.0F);
    }
}
