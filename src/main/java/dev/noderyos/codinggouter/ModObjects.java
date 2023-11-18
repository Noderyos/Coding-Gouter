package dev.noderyos.codinggouter;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModObjects {

    public static Item HOT_CHOCOLATE = addItem("hot_chocolate", new Item(new FabricItemSettings().food(Foods.HOT_CHOCOLATE)));
    public static Item EMPTY_CUP = addItem("empty_cup", new EmptyCup(new FabricItemSettings()));

    public static Block HOT_CHOCOLATE_BLOCK = addBlock("hot_chocolate_block", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static Item addItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier("codinggouter", name), item);
    }


    public static Block addBlock(String name, Block block){
        addItem(name, new BlockItem(block, new FabricItemSettings()));
        return Registry.register(Registries.BLOCK, new Identifier("codinggouter", name), block);
    }

    public static void registerObjects(){
        CodingGouter.LOGGER.info("Registering Objects");
    }
}
