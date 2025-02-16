package net.nesenchu.nesenmod;

import com.mojang.datafixers.kinds.IdF;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nesenchu.nesenmod.item.ModCreativeModTabs;
import net.nesenchu.nesenmod.item.ModItems;
import org.slf4j.Logger;


@Mod(NesenMod.MOD_ID)
public class NesenMod
{
    public static final String MOD_ID = "nesenmod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public NesenMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);

        modEventBus.addListener(NesenMod::addCreativeTabs);


        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private static void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) { // Или другая вкладка
            event.accept(ModItems.CRYOSTAL_INGOT.get());
            event.accept(ModItems.CRYOSTAL_NUGGET.get());
            event.accept(ModItems.CRYOSTAL_PICKAXE.get());
            event.accept(ModItems.PYROCLAST_INGOT.get());
            event.accept(ModItems.PYROCLAST_NUGGET.get());
            event.accept(ModItems.PYROCLAST_AXE.get());
            event.accept(ModItems.PYROCLAST_HOE.get());
            event.accept(ModItems.PYROCLAST_PICKAXE.get());
            event.accept(ModItems.PYROCLAST_SHOVEL.get());
            event.accept(ModItems.PYROCLAST_SWORD.get());
        }
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
