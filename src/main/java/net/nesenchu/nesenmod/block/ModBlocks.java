package net.nesenchu.nesenmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nesenchu.nesenmod.NesenMod;
import net.nesenchu.nesenmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NesenMod.MOD_ID);

    public static final RegistryObject<Block> CRYOSTAL_BLOCK = registerBlock("cryostal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength((float) 7.0F, 8.0F)));

    public static final RegistryObject<Block> PYROCLAST_BLOCK = registerBlock("pyroclast_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)));

    public static final RegistryObject<Block> CRYOSTAL_ORE = registerBlock("cryostal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    public static final RegistryObject<Block> DEEPSLATE_CRYOSTAL_ORE = registerBlock("deepslate_cryostal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final RegistryObject<Block> PYROCLAST_ORE = registerBlock("pyroclast_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
