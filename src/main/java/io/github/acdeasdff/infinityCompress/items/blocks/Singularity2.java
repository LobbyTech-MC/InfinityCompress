package io.github.acdeasdff.infinityCompress.items.blocks;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinityexpansion.categories.Groups;
import io.github.mooy1.infinityexpansion.items.machines.SingularityConstructor;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import static io.github.acdeasdff.infinityCompress.categories.Groups.MAIN_MATERIALS;

/**
 * Singularities and there recipe displays
 *
 * @author Mooy1
 */
public final class Singularity2 extends UnplaceableBlock {

    private static final double COST_MULTIPLIER = 1;

    public Singularity2(SlimefunItemStack item, SlimefunItemStack recipe, int amount) {
        super(MAIN_MATERIALS, item, SingularityConstructor.TYPE,
                makeRecipe(recipe, (int) (amount * COST_MULTIPLIER)));
    }

    public Singularity2(SlimefunItemStack item, Material recipe, int amount) {
        super(MAIN_MATERIALS, item, SingularityConstructor.TYPE,
                makeRecipe(new ItemStack(recipe), (int) (amount * COST_MULTIPLIER)));
    }

    public Singularity2(SlimefunItemStack item, SlimefunItemStack recipe, int amount, @Nullable ItemStack recipeOutput) {
        super(MAIN_MATERIALS, item, SingularityConstructor.TYPE,
                makeRecipe(recipe, (int) (amount * COST_MULTIPLIER)), recipeOutput);
    }

    public Singularity2(SlimefunItemStack item, Material recipe, int amount, @Nullable ItemStack recipeOutput) {
        super(MAIN_MATERIALS, item, SingularityConstructor.TYPE,
                makeRecipe(new ItemStack(recipe), (int) (amount * COST_MULTIPLIER)), recipeOutput);
    }

    @Nonnull
    private static ItemStack[] makeRecipe(ItemStack item, int amount) {
        List<ItemStack> recipe = new ArrayList<>();

        int stacks = (int) Math.floor(amount / 64D);
        int extra = amount % 64;

        for (int i = 0 ; i < stacks ; i++) {
            recipe.add(new CustomItemStack(item, 64));
        }

        recipe.add(new CustomItemStack(item, extra));

        while (recipe.size() < 9) {
            recipe.add(null);
        }

        return recipe.toArray(new ItemStack[9]);
    }

}
