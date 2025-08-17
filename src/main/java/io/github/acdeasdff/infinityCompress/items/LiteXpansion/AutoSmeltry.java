package io.github.acdeasdff.infinityCompress.items.LiteXpansion;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dev.j3fftw.litexpansion.machine.multiblock.RefinedSmeltery;
import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class AutoSmeltry extends Multiblock_Autocrafter {
    public AutoSmeltry(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "自动冶炼厂(纳米科技)", Material.BLAST_FURNACE, "冶炼厂(纳米科技)", RefinedSmeltery.RECIPE_TYPE);
    }
}
