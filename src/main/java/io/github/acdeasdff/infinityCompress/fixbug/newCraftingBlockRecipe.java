package io.github.acdeasdff.infinityCompress.fixbug;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemStackSnapshot;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import lombok.Getter;

@Getter
public final class newCraftingBlockRecipe {

    private final ItemStack[] recipe;
    final ItemStack output;
    final SlimefunItem item;

    newCraftingBlockRecipe(ItemStack output, ItemStack[] recipe) {
        this.output = output;
        this.recipe = ItemStackSnapshot.wrapArray(recipe);
        this.item = SlimefunItem.getByItem(output);
    }

    boolean check(ItemStackSnapshot[] input) {
        for (int i = 0; i < recipe.length; i++) {
            boolean similar = SlimefunUtils.isItemSimilar(input[i], recipe[i], false);
            if (!similar || (recipe[i] != null && recipe[i].getAmount() > input[i].getAmount())) {
                return false;
            }
        }
        return true;
    }

    boolean check(Player p) {
        return item == null || item.canUse(p, true);
    }

    void consume(ItemStack[] input) {
        for (int i = 0; i < recipe.length; i++) {
            if (recipe[i] != null) {
                ItemUtils.consumeItem(input[i], recipe[i].getAmount(), true);
            }
        }
    }

}

