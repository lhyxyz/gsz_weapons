package com.gsz_weapons.registry;

import com.gsz_weapons.Gsz_weapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class gszGroup {
    public static final ItemGroup GSZGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Gsz_weapons.MOD_ID, "weapons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.weapons"))
                    .icon(() -> new ItemStack(gszItems.mistsplitter_reforged)).entries((displayContext, entries) -> {
                        entries.add(gszItems.absolution);
                        entries.add(gszItems.freedom_sworn);
                        entries.add(gszItems.skyward_blade);
                        entries.add(gszItems.haran_geppaku_futsu);
                        entries.add(gszItems.mistsplitter_reforged);
                        entries.add(gszItems.light_of_foliar_incision);
                        entries.add(gszItems.splendor_of_tranquil_waters);
                    }).build());

    public static void registerModItemGroup(){
        Gsz_weapons.LOGGER.debug("Registering mod item group for"+ Gsz_weapons.MOD_ID);
    }
}
