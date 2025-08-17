package io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.multiblocks.FnScrapRecycler;

public class AutoScrapRecycler extends Multiblock_Autocrafter {
    public AutoScrapRecycler(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&d自动护生废料回收机", Material.IRON_BLOCK, "&d护生废料回收机", FnScrapRecycler.RECIPE_TYPE);
    }
}
