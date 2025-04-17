package io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.multiblocks.FnAssemblyStation;

public class AutoAssemblyStation extends Multiblock_Autocrafter {
    public AutoAssemblyStation(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&d自动FN组装台", Material.CRAFTING_TABLE
                , "&dFN组装台", FnAssemblyStation.RECIPE_TYPE);
    }
}
