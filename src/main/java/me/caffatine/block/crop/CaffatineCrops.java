package me.caffatine.block.crop;

import me.caffatine.Caffatine;
import me.caffatine.item.CoffeeItems;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CaffatineCrops {

    public static final Block COFFEE_BUSH = register("coffee_bush", new HarvestableCropBlock(CoffeeItems.COFFEE_BEANS, 2));


    public static Block register(String name, Block block) {
        Registry.register(Registry.BLOCK, new Identifier(Caffatine.MOD_ID, name), block);
        return block;
    }

    public static void init() {
    }
}

