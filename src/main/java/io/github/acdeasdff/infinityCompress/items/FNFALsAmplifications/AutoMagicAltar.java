package io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.multiblocks.FnMagicAltar;

public class AutoMagicAltar extends Multiblock_Autocrafter {
    public AutoMagicAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&d自动FN魔法祭坛", Material.ENCHANTING_TABLE, "&dFN魔法祭坛", FnMagicAltar.RECIPE_TYPE);
    }
}
