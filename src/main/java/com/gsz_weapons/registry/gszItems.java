package com.gsz_weapons.registry;

import com.gsz_weapons.Gsz_weapons;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class gszItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Gsz_weapons.MOD_ID, name), item);
    }
    public static final Item absolution = registerItem("absolution", new SwordItem(gszToolMaterials.EMERALD, 10, -2.4F, new FabricItemSettings()));
    public static final Item freedom_sworn = registerItem("freedom_sworn", new SwordItem(gszToolMaterials.EMERALD, 10, -2.4F, new FabricItemSettings()));
    public static final Item skyward_blade = registerItem("skyward_blade", new SwordItem(gszToolMaterials.EMERALD, 17, -2.4F, new FabricItemSettings()));
    public static final Item haran_geppaku_futsu = registerItem("haran_geppaku_futsu", new SwordItem(gszToolMaterials.EMERALD, 10, -2.4F, new FabricItemSettings()));
    public static final Item mistsplitter_reforged = registerItem("mistsplitter_reforged", new SwordItem(gszToolMaterials.EMERALD, 10, -2.4F, new FabricItemSettings()));
    public static final Item light_of_foliar_incision = registerItem("light_of_foliar_incision", new SwordItem(gszToolMaterials.EMERALD, 10, -2.4F, new FabricItemSettings()));
    public static final Item splendor_of_tranquil_waters = registerItem("splendor_of_tranquil_waters", new SwordItem(gszToolMaterials.EMERALD, 10, -2.4F, new FabricItemSettings()));

    public static void registerModItems() {
        Gsz_weapons.LOGGER.info("Registering Mod Items for " + Gsz_weapons.MOD_ID);
    }
}
