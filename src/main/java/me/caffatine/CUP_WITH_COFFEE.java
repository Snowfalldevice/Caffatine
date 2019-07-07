package me.caffatine;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;


public class CUP_WITH_COFFEE extends Item{

	public CUP_WITH_COFFEE(Settings settings) {
		super(new Item.Settings().food((new FoodComponent.Builder()
		.hunger(4)
		.saturationModifier(0.5F)
		.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 90, 0), 1.0F)
		.alwaysEdible()
		.build())));
	}
}
	