package dev.noderyos.codinggouter;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class Foods {
    public static FoodComponent HOT_CHOCOLATE = new FoodComponent
            .Builder()
            .hunger(10)
            .saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 10*60*20,2), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5*60*20,1), 0.5f)
            .build();
}
