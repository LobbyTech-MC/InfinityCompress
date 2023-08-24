package io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static io.github.acdeasdff.infinityCompress.categories.Groups.INFINITY_FNAMP;

public class BlocksFN {
    public static final SlimefunItemStack AUTO_ASSEMBLING_STATION = new SlimefunItemStack(
            "INFCP_FN_AUTO_ASSEMBLING_STATION",
            Material.CRAFTING_TABLE,
            "&d自动FN组装台",
            "&7自动合成&bFN组装台&7配方",
            ""
    );

    public static final SlimefunItemStack AUTO_SCRAP_RECYCLER= new SlimefunItemStack(
            "INFCP_FN_AUTO_SCRAP_RECYCLER",
            Material.IRON_BLOCK,
            "&d自动FN废料回收机",
            "&7自动合成&bFN废料回收机&7配方",
            ""
    );

    public static final SlimefunItemStack AUTO_MAGIC_ALTAR= new SlimefunItemStack(
            "INFCP_FN_AUTO_MAGIC_ALTAR",
            Material.ENCHANTING_TABLE,
            "&d自动FN魔法祭坛",
            "&7自动合成&bFN魔法祭坛&7配方",
            ""
    );

    public static final SlimefunItemStack AUTO_GEM_ALTAR= new SlimefunItemStack(
            "INFCP_FN_AUTO_GEM_ALTAR",
            Material.ENCHANTING_TABLE,
            "&d自动FN宝石祭坛",
            "&7自动合成&bFN宝石祭坛&7配方",
            ""
    );

    public static final SlimefunItemStack AUTO_STICK_ALTAR= new SlimefunItemStack(
            "INFCP_FN_AUTO_STICK_ALTAR",
            Material.ENCHANTING_TABLE,
            "&d自动FN魔棒祭坛",
            "&7自动合成&bFN魔棒祭坛&7配方",
            ""
    );
    public static void setup(InfinityCompress plugin){
        new AutoAssemblyStation(INFINITY_FNAMP, AUTO_ASSEMBLING_STATION, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.ACACIA_FENCE),new ItemStack(Material.AIR),
                new ItemStack(Material.CRAFTING_TABLE), new ItemStack(Material.DISPENSER), new ItemStack(Material.CRAFTING_TABLE)
        }).register(plugin);

        new AutoScrapRecycler(INFINITY_FNAMP, AUTO_SCRAP_RECYCLER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.ACACIA_FENCE),new ItemStack(Material.AIR),
                new ItemStack(Material.ANVIL), new ItemStack(Material.DISPENSER), new ItemStack(Material.CRAFTING_TABLE)
        }).register(plugin);

        new AutoMagicAltar(INFINITY_FNAMP, AUTO_MAGIC_ALTAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.ACACIA_FENCE),new ItemStack(Material.AIR),
                new ItemStack(Material.ENCHANTING_TABLE), new ItemStack(Material.DISPENSER), new ItemStack(Material.SMITHING_TABLE)
        }).register(plugin);

        new AutoGemAltar(INFINITY_FNAMP, AUTO_GEM_ALTAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.ACACIA_FENCE),new ItemStack(Material.AIR),
                new ItemStack(Material.ANVIL), new ItemStack(Material.DISPENSER), new ItemStack(Material.SMITHING_TABLE)
        }).register(plugin);

        new AutoStickAltar(INFINITY_FNAMP, AUTO_STICK_ALTAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.ACACIA_FENCE),new ItemStack(Material.AIR),
                new ItemStack(Material.ENCHANTING_TABLE), new ItemStack(Material.DISPENSER), new ItemStack(Material.ENCHANTING_TABLE)
        }).register(plugin);
    }
}
