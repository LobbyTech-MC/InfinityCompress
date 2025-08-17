package io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.multiblocks.FnGemAltar;

public class AutoGemAltar extends Multiblock_Autocrafter {
    public AutoGemAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&d自动护生宝石祭坛", Material.ENCHANTING_TABLE, "&d护生宝石祭坛", FnGemAltar.RECIPE_TYPE);
    }
}
