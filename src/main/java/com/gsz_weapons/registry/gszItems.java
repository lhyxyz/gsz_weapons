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

    /* Genshin Impact */
    // 单手剑
    public static final Item absolution = registerItem("absolution", new SwordItem(gszToolMaterials.EMERALD, 45, -2.4F, new FabricItemSettings()));
    public static final Item freedom_sworn = registerItem("freedom_sworn", new SwordItem(gszToolMaterials.EMERALD, 43, -2.4F, new FabricItemSettings()));
    public static final Item skyward_blade = registerItem("skyward_blade", new SwordItem(gszToolMaterials.EMERALD, 43, -2.4F, new FabricItemSettings()));
    public static final Item haran_geppaku_futsu = registerItem("haran_geppaku_futsu", new SwordItem(gszToolMaterials.EMERALD, 43, -2.4F, new FabricItemSettings()));
    public static final Item mistsplitter_reforged = registerItem("mistsplitter_reforged", new SwordItem(gszToolMaterials.EMERALD, 45, -2.4F, new FabricItemSettings()));
    public static final Item light_of_foliar_incision = registerItem("light_of_foliar_incision", new SwordItem(gszToolMaterials.EMERALD, 41, -2.4F, new FabricItemSettings()));
    public static final Item splendor_of_tranquil_waters = registerItem("splendor_of_tranquil_waters", new SwordItem(gszToolMaterials.EMERALD, 41, -2.4F, new FabricItemSettings()));
    public static final Item aquila_favonia = registerItem("aquila_favonia", new SwordItem(gszToolMaterials.EMERALD, 45, -2.4F, new FabricItemSettings()));
    public static final Item key_of_khaj_nisut = registerItem("key_of_khaj_nisut", new SwordItem(gszToolMaterials.EMERALD, 41, -2.4F, new FabricItemSettings()));
    public static final Item primordial_jade_cutter = registerItem("primordial_jade_cutter", new SwordItem(gszToolMaterials.EMERALD, 41, -2.4F, new FabricItemSettings()));
    public static final Item summit_shaper = registerItem("summit_shaper", new SwordItem(gszToolMaterials.EMERALD, 43, -2.4F, new FabricItemSettings()));
    // 弓

    // 大剑

    // 长柄武器

    /* Star Rail */

    /* Zenless Zero Zone */

    public static void registerModItems() {
        Gsz_weapons.LOGGER.info("Registering Mod Items for " + Gsz_weapons.MOD_ID);
    }
}
