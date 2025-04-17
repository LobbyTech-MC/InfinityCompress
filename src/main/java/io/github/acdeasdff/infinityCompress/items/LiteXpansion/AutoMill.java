package io.github.acdeasdff.infinityCompress.items.LiteXpansion;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import dev.j3fftw.litexpansion.machine.multiblock.ManualMill;
import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class AutoMill extends Multiblock_Autocrafter {
    public AutoMill(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&7自动研磨机", Material.GRINDSTONE, "&7研磨机(LiteXpansion)", ManualMill.RECIPE_TYPE);
    }
}
