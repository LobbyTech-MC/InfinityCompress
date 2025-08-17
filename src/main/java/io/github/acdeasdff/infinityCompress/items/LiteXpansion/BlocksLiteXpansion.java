package io.github.acdeasdff.infinityCompress.items.LiteXpansion;

import static dev.j3fftw.litexpansion.Items.MASS_FABRICATOR_MACHINE;
import static dev.j3fftw.litexpansion.Items.RECYCLER;
import static dev.j3fftw.litexpansion.Items.UU_MATTER;
import static io.github.acdeasdff.infinityCompress.categories.Groups.INFINITY_LITEXPANSION;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.acdeasdff.infinityCompress.items.blocks.TweakedMaterialGenerator;
import io.github.mooy1.infinityexpansion.items.materials.Singularity;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class BlocksLiteXpansion {

    public static final SlimefunItemStack RECYCLER_SINGULARITY = new SlimefunItemStack(
            "INFCP_RECYCLER_SINGULARITY",
            Material.BLACK_STAINED_GLASS,
            "&b回收机奇点",
            "&7从别的服务器索要清理掉的掉落物并回收(合成物品--不可直接使用)",
            MachineLore.energyPerSecond(400000),
            ""
    );
    public static final SlimefunItemStack MASSFABRICATOR_SINGULARITY = new SlimefunItemStack(
            "INFCP_MASSFABRICATOR_SINGULARITY",
            Material.PURPLE_STAINED_GLASS,
            "&b质量生成机奇点(未完成)",
            "&7从大量废料中产生纳米物质(合成物品--不可直接使用)",
            MachineLore.energyPerSecond(1666600),
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_UU_MATTER = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_UU_MATTER",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&b质量生成机奇点(初级)",
            "&7从大量废料中产生纳米物质",
            MachineLore.energyPerSecond(2066600),
            ""
    );
    public static final SlimefunItemStack ONE_PER_TICK_UU_MATTER_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_UU_MATTER_2",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&b质量生成机奇点(中级)",
            "&7从大量废料中产生纳米物质",
            MachineLore.energyPerSecond(16532800),
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_UU_MATTER_3 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_UU_MATTER_3",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&b质量生成机奇点(高级)",
            "&7从大量废料中产生纳米物质",
            MachineLore.energyPerSecond(132262400),
            ""
    );

    public static final SlimefunItemStack AUTO_METAL_FORGE = new SlimefunItemStack(
            "INFCP_AUTO_METAL_FORGE",
            Material.SMITHING_TABLE,
            "&b自动金属锻造台",
            "&7自动合成金属锻造台(纳米科技)配方",
            ""
    );

    public static final SlimefunItemStack AUTO_MILL = new SlimefunItemStack(
            "INFCP_AUTO_MILL",
            Material.GRINDSTONE,
            "&b自动研磨机",
            "&7自动合成研磨机(纳米科技)配方",
            ""
    );

    public static final SlimefunItemStack AUTO_SMELTRY = new SlimefunItemStack(
            "INFCP_AUTO_SMELTRY",
            Material.BLAST_FURNACE,
            "&b自动冶炼炉",
            "&7自动合成冶炼炉(纳米科技)配方",
            ""
    );

    public static void setup(InfinityCompress plugin){

        new Singularity(RECYCLER_SINGULARITY, RECYCLER, 2000).register(plugin);
        new Singularity(MASSFABRICATOR_SINGULARITY, MASS_FABRICATOR_MACHINE, 200).register(plugin);

        new TweakedMaterialGenerator(INFINITY_LITEXPANSION, ONE_PER_TICK_UU_MATTER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                RECYCLER_SINGULARITY, MASSFABRICATOR_SINGULARITY, new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
        }).material(UU_MATTER).speed(1).energyPerTick(2066600).register(plugin);
        new TweakedMaterialGenerator(INFINITY_LITEXPANSION, ONE_PER_TICK_UU_MATTER_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_UU_MATTER, ONE_PER_TICK_UU_MATTER, ONE_PER_TICK_UU_MATTER,
                ONE_PER_TICK_UU_MATTER,new ItemStack(Material.AIR),ONE_PER_TICK_UU_MATTER,
                ONE_PER_TICK_UU_MATTER,ONE_PER_TICK_UU_MATTER,ONE_PER_TICK_UU_MATTER,
        }).material(UU_MATTER).speed(8).energyPerTick(16532800).register(plugin);
        new TweakedMaterialGenerator(INFINITY_LITEXPANSION, ONE_PER_TICK_UU_MATTER_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_UU_MATTER_2, ONE_PER_TICK_UU_MATTER_2, ONE_PER_TICK_UU_MATTER_2,
                ONE_PER_TICK_UU_MATTER_2,new ItemStack(Material.AIR),ONE_PER_TICK_UU_MATTER_2,
                ONE_PER_TICK_UU_MATTER_2,ONE_PER_TICK_UU_MATTER_2,ONE_PER_TICK_UU_MATTER_2,
        }).material(UU_MATTER).speed(64).energyPerTick(132262400).register(plugin);


        new AutoMetalForge(INFINITY_LITEXPANSION, AUTO_METAL_FORGE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.ANVIL), new ItemStack(Material.STONE_BRICK_WALL), new ItemStack(Material.ANVIL),
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.DISPENSER), new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.AIR), new ItemStack(Material.DIAMOND_BLOCK), new ItemStack(Material.AIR)
        }).register(plugin);

        new AutoMill(INFINITY_LITEXPANSION, AUTO_MILL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.ANVIL), new ItemStack(Material.STONE_BRICK_WALL), new ItemStack(Material.ANVIL),
                new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.DISPENSER), new ItemStack(Material.IRON_BLOCK),
                new ItemStack(Material.AIR), new ItemStack(Material.IRON_BLOCK), new ItemStack(Material.AIR)
        }).register(plugin);

        new AutoSmeltry(INFINITY_LITEXPANSION, AUTO_SMELTRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), new ItemStack(Material.STONE_BRICK_WALL), new ItemStack(Material.AIR),
                new ItemStack(Material.STONE_BRICKS), new ItemStack(Material.DISPENSER), new ItemStack(Material.STONE_BRICKS),
                new ItemStack(Material.AIR), new ItemStack(Material.FLINT_AND_STEEL), new ItemStack(Material.AIR)
        }).register(plugin);

    }
}
