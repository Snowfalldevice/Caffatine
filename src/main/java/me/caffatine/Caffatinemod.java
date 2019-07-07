package me.caffatine;

import io.github.cottonmc.cotton.logging.ModLogger;
import me.caffatine.block.coffee_bush;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.CropBlock;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Caffatinemod implements ModInitializer
    {
    public static final String MOD_ID = "caffatinemod";
    public static final String MOD_NAME = "Caffatine";

    public static final ModLogger LOG = new ModLogger(Caffatinemod.MOD_ID, Caffatinemod.MOD_NAME);


	  public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
		new Identifier("caffatinemod", "cafe_shop"))
    .icon(() -> new ItemStack(Caffatinemod.CUP_WITH_COFFEE))
    .appendItems(stacks ->
		{
			stacks.add(new ItemStack(Caffatinemod.COFFEE_BERRIES));
			stacks.add(new ItemStack(Caffatinemod.CUP_WITH_COFFEE));
      stacks.add(new ItemStack(Caffatinemod.COFFEE_CUP));
      stacks.add(new ItemStack(Caffatinemod.PORCELAIN_CLAY));

		})
		.build();
    //
    public static final Item CUP_WITH_COFFEE = new Item(new Item.Settings().group(ItemGroup.FOOD));
    public static final Item COFFEE_BEANS = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item COFFEE_BERRIES = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item COFFEE_CUP = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item STEAMED_MILK = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item CHOCOLATE_SYRUP = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item SIMPLE_SYRUP = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item PORCELAIN_CLAY = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item UNBAKED_CUP = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item LIGHT_ROAST = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item MEDIUM_ROAST = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item DARK_ROAST = new Item(new Item.Settings().group(ItemGroup.MISC));

    //Blocks
    public static final Block COFFEE_MACHINE = new Block(FabricBlockSettings.of(Material.METAL).build());
    //public static final Block COFFEE_BUSH = new CropBlock(FabricBlockSettings.of(Material.PLANT).build());

        @Override
    public void onInitialize() {

        LOG.info("Restocking supplies...");

        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "cup_of_coffee"), CUP_WITH_COFFEE);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "coffee_beans"), COFFEE_BEANS); 
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "coffee_berries"), COFFEE_BERRIES); 
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "cup"), COFFEE_CUP);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "steamed_milk_bucket"), STEAMED_MILK);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "bottle_of_chocolate_syrup"), CHOCOLATE_SYRUP);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "bottle_of_simple_syrup"), SIMPLE_SYRUP);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "porcelain_clay_ball"), PORCELAIN_CLAY);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "unbaked_cup"), UNBAKED_CUP);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "coffee_beans_light_roast"), LIGHT_ROAST);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "coffee_beans_medium_roast"), MEDIUM_ROAST);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "coffee_beans_dark_roast"), DARK_ROAST);

        // block registration

        LOG.info("Setting up the Coffee Machine...");

        //Registry.register(Registry.BLOCK, new Identifier("caffatinemod", "coffee_bush"), COFFEE_BUSH);
        Registry.register(Registry.BLOCK, new Identifier("caffatinemod", "coffee_machine"), COFFEE_MACHINE);
        Registry.register(Registry.ITEM, new Identifier("caffatinemod", "coffee_machine"), new BlockItem(COFFEE_MACHINE, new Item.Settings().group(ItemGroup.MISC)));

        //Growing the coffee plant
           coffee_bush.init();
        }
}