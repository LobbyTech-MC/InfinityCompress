package io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications;

import io.github.acdeasdff.infinityCompress.items.Multiblock_Autocrafter;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import ne.fnfal113.fnamplifications.multiblocks.FnMysteryStickAltar;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class AutoStickAltar extends Multiblock_Autocrafter {
    public AutoStickAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe, "&d自动FN神秘棍棒组装机", Material.WHITE_STAINED_GLASS,"&dFN神秘棍棒", FnMysteryStickAltar.RECIPE_TYPE);
    }
}
