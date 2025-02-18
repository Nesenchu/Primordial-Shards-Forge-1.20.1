package net.nesenchu.nesenmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nesenchu.nesenmod.NesenMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NesenMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> CRYOSTAL_INGOT = ITEMS.register("cryostalingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTAL_NUGGET = ITEMS.register("cryostalnugget",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTAL_AXE = ITEMS.register("cryostalaxe",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTAL_HOE = ITEMS.register("cryostalhoe",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTAL_PICKAXE = ITEMS.register("cryostalpickaxe",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTAL_SHOVEL = ITEMS.register("cryostalshovel",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYOSTAL_SWORD = ITEMS.register("cryostalsword",
            ()-> new Item(new Item.Properties()));



    public static final RegistryObject<Item> PYROCLAST_INGOT = ITEMS.register("pyroclastingot",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYROCLAST_NUGGET = ITEMS.register("pyroclastnugget",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYROCLAST_AXE = ITEMS.register("pyroclastaxe",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYROCLAST_HOE = ITEMS.register("pyroclasthoe",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYROCLAST_PICKAXE = ITEMS.register("pyroclastpickaxe",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYROCLAST_SHOVEL = ITEMS.register("pyroclastshovel",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PYROCLAST_SWORD = ITEMS.register("pyroclastsword",
            ()-> new Item(new Item.Properties()));

}
