package io.github.acdeasdff.infinityCompress.items.LiteXpansion;

import dev.j3fftw.litexpansion.machine.multiblock.MetalForge;
import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoMetalForge extends Multiblock_Autocrafter {
    public AutoMetalForge(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&7自动金属锻造厂", Material.SMITHING_TABLE, "&7金属锻造厂", MetalForge.RECIPE_TYPE);
    }
}
