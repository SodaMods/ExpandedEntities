package com.sodadev.expandedentities.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class SoulItemBase extends Item {
    public SoulItemBase() {
        super(new Item.Properties().maxStackSize(12)
                .group(ItemGroup.MISC));
    }
}
