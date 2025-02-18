package net.nesenchu.nesenmod.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nesenchu.nesenmod.NesenMod;
import net.nesenchu.nesenmod.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NesenMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRIMORDIAL_TAB = CREATIVE_MOD_TABS.register("primordial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYOSTAL_INGOT.get()))
                    .title(Component.translatable("creativetab.primordial_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.CRYOSTAL_INGOT.get());
                        output.accept(ModItems.CRYOSTAL_NUGGET.get());
                        output.accept(ModItems.CRYOSTAL_AXE.get());
                        output.accept(ModItems.CRYOSTAL_HOE.get());
                        output.accept(ModItems.CRYOSTAL_PICKAXE.get());
                        output.accept(ModItems.CRYOSTAL_SHOVEL.get());
                        output.accept(ModItems.CRYOSTAL_SWORD.get());
                        output.accept(ModBlocks.CRYOSTAL_BLOCK.get());
                        output.accept(ModBlocks.CRYOSTAL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_CRYOSTAL_ORE.get());
                        output.accept(ModItems.PYROCLAST_INGOT.get());
                        output.accept(ModItems.PYROCLAST_NUGGET.get());
                        output.accept(ModItems.PYROCLAST_AXE.get());
                        output.accept(ModItems.PYROCLAST_HOE.get());
                        output.accept(ModItems.PYROCLAST_PICKAXE.get());
                        output.accept(ModItems.PYROCLAST_SHOVEL.get());
                        output.accept(ModItems.PYROCLAST_SWORD.get());
                        output.accept(ModBlocks.PYROCLAST_BLOCK.get());
                        output.accept(ModBlocks.PYROCLAST_ORE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
