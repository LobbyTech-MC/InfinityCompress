package io.github.acdeasdff.infinityCompress;
import io.github.mooy1.infinitylib.common.StackUtils;
import io.github.mooy1.infinitylib.machines.MachineRecipeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemStackSnapshot;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemUtils;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

//from infinitylib
public class CraftingBlockRecipe {
    private final ItemStack[] recipe;
    final ItemStack output;
    final SlimefunItem item;

    public CraftingBlockRecipe(ItemStack[] recipe, ItemStack output) {
        this.output = output;
        this.recipe = ItemStackSnapshot.wrapArray(recipe);
        this.item = SlimefunItem.getByItem(output);
    }

    public CraftingBlockRecipe(ItemStack output,ItemStack[] recipe) {
        this.output = output;
        this.recipe = ItemStackSnapshot.wrapArray(recipe);
        this.item = SlimefunItem.getByItem(output);
    }

    public CraftingBlockRecipe(ItemStack output, MachineRecipeType machineRecipeType, ItemStack[] recipe) {
        this.output = output;
        this.recipe = ItemStackSnapshot.wrapArray(recipe);
        this.item = SlimefunItem.getByItem(output);
    }

    boolean check(ItemStackSnapshot[] input) {
        for(int i = 0; i < this.recipe.length; ++i) {
            boolean similar = StackUtils.isSimilar(input[i], this.recipe[i]);
            if (!similar || this.recipe[i] != null && this.recipe[i].getAmount() > input[i].getAmount()) {
                return false;
            }
        }

        return true;
    }

    boolean check(Player p) {
        return this.item == null || this.item.canUse(p, false);
    }

    void consume(ItemStack[] input) {
        for(int i = 0; i < this.recipe.length; ++i) {
            if (this.recipe[i] != null) {
                ItemUtils.consumeItem(input[i], this.recipe[i].getAmount(), true);
            }
        }

    }

    public ItemStack[] recipe() {
        return this.recipe;
    }

    public ItemStack output() {
        return this.output;
    }

    public SlimefunItem item() {
        return this.item;
    }
}
