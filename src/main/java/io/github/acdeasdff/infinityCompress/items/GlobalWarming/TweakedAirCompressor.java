package io.github.acdeasdff.infinityCompress.items.GlobalWarming;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.mooy1.infinitylib.machines.AbstractMachineBlock;
import io.github.mooy1.infinitylib.machines.TickingMenuBlock;
import io.github.thebusybiscuit.slimefun4.api.events.AsyncMachineOperationFinishEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineProcessHolder;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineOperation;
import io.github.thebusybiscuit.slimefun4.core.machines.MachineProcessor;
import io.github.thebusybiscuit.slimefun4.implementation.operations.MiningOperation;
import io.github.thebusybiscuit.slimefun4.libraries.dough.blocks.BlockPosition;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.Setter;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.poma123.globalwarming.GlobalWarmingPlugin;
import me.poma123.globalwarming.api.PollutionManager;
import me.poma123.globalwarming.api.events.AsyncWorldPollutionChangeEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

import static io.github.acdeasdff.infinityCompress.InfinityCompress.globalwarming;
import static org.bukkit.plugin.java.JavaPlugin.getProvidingPlugin;

/**
 * Machines that generate materials at the cost of energy
 *
 * @author Mooy1
 */
//public final class TweakedAirCompressor extends AbstractMachineBlock implements RecipeDisplayItem{

public final class TweakedAirCompressor extends AbstractMachineBlock implements RecipeDisplayItem{

    private static final String DATA_PATH = "data.pollution";
    private static final int[] OUTPUT_SLOTS = { 13 };
    private static final int STATUS_SLOT = 4;
    double absorptionValue;

    @Setter
    private int speed;
    @Setter
    private SlimefunItemStack material;

    double oldValue;

    Config config;

    double newValue;

    String itemid;
    AsyncWorldPollutionChangeEvent event;


    public TweakedAirCompressor(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe, double absorptionValueMultipier) {
        super(category, item, type, recipe);
        this.absorptionValue = absorptionValueMultipier * 0.05;
        this.itemid = itemid;
    }

    @Override
    protected void setup(@Nonnull BlockMenuPreset blockMenuPreset) {
        blockMenuPreset.drawBackground(new int[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 14, 15, 16, 17
        });
    }

    @Override
    protected int getStatusSlot() {
        return STATUS_SLOT;
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return OUTPUT_SLOTS;
    }

    @Override
    public void onNewInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
//        private MachineProcessor machineProcessor = new MachineProcessor();
        config = new Config(globalwarming, "worlds/" + b.getWorld().getName() + ".yml");
    }

//    @Override
//    public ItemStack getProgressBar() {
//        return null;
//    }
//
//    @Nonnull
//    @Override
//    public String getMachineIdentifier() {
//        return itemid;
//    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();
        items.add(null);
        items.add(new SlimefunItemStack(this.material, this.speed));
        return items;
    }

    @Nonnull
    @Override
    public String getRecipeSectionLabel(@Nonnull Player p) {
        return "&7Generates";
    }

    @Override
    protected boolean process(@Nonnull Block b, @Nonnull BlockMenu inv) {

        ItemStack output = new SlimefunItemStack(this.material, this.speed);

        if (!inv.fits(output, OUTPUT_SLOTS)) {

            if (inv.hasViewer()) {
                inv.replaceExistingItem(STATUS_SLOT, NO_ROOM_ITEM);
            }
            return false;

        }

        inv.pushItem(output, OUTPUT_SLOTS);

        try{
//            config.reload();
            if (config.getValue(DATA_PATH) == null) {
                config.setValue(DATA_PATH, 0.0);
                config.save();
            }
            oldValue = config.getDouble(DATA_PATH);
            if ((oldValue > 0.0)) {
                newValue = Math.max(oldValue - absorptionValue, 0.0);
                event = new AsyncWorldPollutionChangeEvent(b.getWorld(), oldValue, newValue);
                Bukkit.getScheduler().runTaskAsynchronously(globalwarming, () -> Bukkit.getPluginManager().callEvent(event));
//                config.setValue(DATA_PATH, newValue);
//                config.save();
            }
            PollutionManager.descendPollutionInWorld(b.getWorld(), absorptionValue);
        }catch (Exception e){
            e.printStackTrace();
        }
//        won't work because of java's feature for threads

        if (inv.hasViewer()) {
            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, "&aGenerating..."));
        }

        return true;
    }

}


