package com.ericcqh66.better_impaling_forge.mixin;

import net.minecraft.enchantment.ImpalingEnchantment;
import net.minecraft.entity.CreatureAttribute;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import com.ericcqh66.better_impaling_forge.BetterImpalingForge;

@Mixin(ImpalingEnchantment.class)
public abstract class ImpalingEnchantmentMixin {
    @Inject(
        method = "getDamageBonus",
        at = @At(value = "HEAD"),
        cancellable = true
    )
    private void getDamageBonusMixin(int p_152376_1_, CreatureAttribute p_152376_2_, CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(BetterImpalingForge.is_in_water_or_rain ? (float)p_152376_1_ * 2.5F : 0.0F);
        // System.out.println("注入成功");
    }
}
