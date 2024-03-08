package net.indevo.simplest_emerald_gear.item;


import net.indevo.simplest_emerald_gear.SimplestEmeraldGear;
import net.indevo.simplest_emerald_gear.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 9f, 3f, 26,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(SimplestEmeraldGear.MOD_ID, "emerald"), List.of(Tiers.IRON), List.of());

}
