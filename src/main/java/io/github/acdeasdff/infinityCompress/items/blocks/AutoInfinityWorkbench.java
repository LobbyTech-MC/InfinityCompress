package io.github.acdeasdff.infinityCompress.items.blocks;

import io.github.acdeasdff.infinityCompress.AutoCrafter;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoInfinityWorkbench extends AutoCrafter {

    public AutoInfinityWorkbench(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&6自动无尽合成台", Material.RESPAWN_ANCHOR,
                "&6AutoInfinityWorkbench", InfinityWorkbench.TYPE);
    }

}
