package me.caffatine.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;


public class BrewedItem extends Item {
    private int hungerRestored;
    private float saturationModifier;
    private StatusEffect effect;


    public BrewedItem(int hungerRestored, float saturationModifier, Settings settings) {
        super(settings);
        this.hungerRestored = hungerRestored;
        this.saturationModifier = saturationModifier;
    }

    public BrewedItem(int hungerRestored, float saturationModifier, StatusEffect effect, Settings settings) {
        this(hungerRestored, saturationModifier, settings);
        this.effect = effect;
    }

    @Override
    public boolean hasRecipeRemainder() {
        return false;
    }

}



