package com.sodadev.expandedentities.util;

import com.sodadev.expandedentities.Main;
import com.sodadev.expandedentities.items.SoulItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> WITHERED_SOUL = ITEMS.register("Withered_Soul", SoulItemBase::new);
}
