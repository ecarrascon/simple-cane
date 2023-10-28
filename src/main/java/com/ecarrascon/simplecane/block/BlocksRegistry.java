package com.ecarrascon.simplecane.block;

import com.ecarrascon.simplecane.SimpleCane;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SugarCaneBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlocksRegistry {


    public static final Block SIMPLE_SUGAR_CANE = registerBlock("simple_sugar_cane",
            new SugarCaneBlock(FabricBlockSettings.copyOf(Blocks.SUGAR_CANE).sounds(BlockSoundGroup.GRASS)));
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SimpleCane.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SimpleCane.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerBlocks() {
        SimpleCane.LOGGER.info("Registering blocks");
    }

}
