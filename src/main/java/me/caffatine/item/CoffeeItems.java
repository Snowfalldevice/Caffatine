package me.caffatine.item;

import me.caffatine.Caffatine;
import me.caffatine.block.crop.CaffatineCrops;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CoffeeItems {
    public static Item.Settings defaultSettings() {
        return new Item.Settings().group(Caffatine.CAFFATINE_GROUP);
    }

    public static Item.Settings foodSettings(int hunger, float saturation) {
        return defaultSettings().food(new FoodComponent.Builder().hunger(hunger).saturationModifier(saturation).build());
    }

    //New code
    public static final Item CUP_OF_COFFEE = register("cup_of_coffee", new BrewedItem(4, 1.2F, foodSettings(10, 0.5f)));
    public static final Item BOTTLE_OF_SIMPLE_SYRUP = register("bottle_of_simple_syrup", new BrewedItem(1, 0.1f, StatusEffects.SPEED, defaultSettings()));
    //
    public static Item COFFEE_BEANS;
    public static final Item UNBAKED_CUP = register("unbaked_cup", new Item(defaultSettings()));
    public static final Item CUP = register("cup", new Item(defaultSettings()));
    public static final Item STEAMED_MILK_BUCKET = register("steamed_milk_bucket", new Item(defaultSettings()));
    public static final Item PORCELAIN_CLAY_BALL = register("porcelain_clay_ball", new Item(defaultSettings()));
    public static final Item BOTTLE_OF_CHOCOLATE_SYRUP = register("bottle_of_chocolate_syrup", new BrewedItem(1, 0.1f, StatusEffects.SLOW_FALLING, defaultSettings()));
    public static final Item COFFEE_BERRIES = register("coffee_berries", new Item(defaultSettings()));
    public static final Item COFFEE_BEANS_DARK_ROAST = register("coffee_beans_dark_roast", new Item(defaultSettings()));
    public static final Item COFFEE_BEANS_MEDIUM_ROAST = register("coffee_beans_medium_roast", new Item(defaultSettings()));
    public static final Item COFFEE_BEANS_LIGHT_ROAST = register("coffee_beans_light_roast", new Item(defaultSettings()));

    public static Item register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Caffatine.MOD_ID, name), item);
        return item;
    }

    public static void init () {
        COFFEE_BEANS = register("coffee_beans", new AliasedBlockItem(CaffatineCrops.COFFEE_BUSH, defaultSettings()));

        CompostingChanceRegistry.INSTANCE.add(CUP_OF_COFFEE, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(COFFEE_BERRIES, 0.1f);
        CompostingChanceRegistry.INSTANCE.add(COFFEE_BEANS, 0.15f);
        CompostingChanceRegistry.INSTANCE.add(COFFEE_BEANS_LIGHT_ROAST, 0.2f);
        CompostingChanceRegistry.INSTANCE.add(COFFEE_BEANS_MEDIUM_ROAST, 0.25f);
        CompostingChanceRegistry.INSTANCE.add(COFFEE_BEANS_DARK_ROAST, 0.3f);

    }
}

