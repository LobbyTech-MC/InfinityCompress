package io.github.acdeasdff.infinityCompress.items.blocks;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.acdeasdff.infinityCompress.categories.Groups;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static io.github.acdeasdff.infinityCompress.items.blocks.Blocks.*;
import static io.github.mooy1.infinityexpansion.items.SlimefunExtension.VOID_CAPACITOR;
import static io.github.mooy1.infinityexpansion.items.gear.Gear.PICKAXE;
import static io.github.mooy1.infinityexpansion.items.materials.Materials.MACHINE_PLATE;
import static io.github.mooy1.infinityexpansion.items.quarries.Quarries.*;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.GEO_MINER;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.REINFORCED_PLATE;

public class Blocks2 {

    public static final SlimefunItemStack ONE_PER_TICK_GEO_MINER = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_GEO_MINER",
            Material.PURPLE_CONCRETE,
            "&bGEO矿机组装机(单刻)",
            "&7自动产出GEO矿机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2984911)
    );

    public static final SlimefunItemStack ONE_PER_TICK_BASIC_QUARRY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BASIC_QUARRY",
            Material.CHISELED_SANDSTONE,
            "&b基础矿机组装机(单刻)",
            "&7自动产出基础矿机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(12636907)
    );

    public static final SlimefunItemStack ONE_PER_TICK_ADVANCED_QUARRY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ADVANCED_QUARRY",
            Material.CHISELED_RED_SANDSTONE,
            "&b进阶矿机组装机(单刻)",
            "&7自动产出进阶矿机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(265712556)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOID_QUARRY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOID_QUARRY",
            Material.CHISELED_NETHER_BRICKS,
            "&b虚空矿机组装机(单刻)",
            "&7自动产出虚空矿机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(410087790)
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_QUARRY_STEP1 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_QUARRY_STEP1",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b无尽矿机组装机(整合次数:0)(单刻)",
            "&7自动产出无尽矿机(合成物品--不可直接使用)",
            "&c每slimefun tick的功率达到了4,169,626,660J,无法在slimefun电网中工作",
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_QUARRY_STEP2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_QUARRY_STEP2",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b无尽矿机组装机(整合次数:1)(单刻)",
            "&7自动产出无尽矿机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2103575060)
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_QUARRY_STEP3 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_QUARRY_STEP3",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b无尽矿机组装机(整合次数:2)(单刻)",
            "&7自动产出无尽矿机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1),
            "&7电力消耗为0会导致报错"
    );

    public static final SlimefunItemStack ONE_PER_TICK_REINFORCED_PLATE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_REINFORCED_PLATE",
            Material.IRON_BLOCK,
            "&b强化合金板机(单刻)",
            "&7自动产出钢筋板",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1239064)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MACHINE_PLATE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MACHINE_PLATE",
            Material.GOLD_BLOCK,
            "&b机器板材机(单刻)",
            "&7自动产出机器板材",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(45989321)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOID_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOID_CAPACITOR",
            Material.BLACK_WOOL,
            "&b虚空电容组装机(单刻)",
            "&7自动产出虚空电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(44102052)
    );

    public static final SlimefunItemStack ONE_PER_TICK_WORLD_BREAKER = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_WORLD_BREAKER",
            Material.BLACKSTONE,
            "&b世界崩解之镐组装机(单刻)",
            "&7自动产出世界崩解之镐",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(403974192)
    );
    public static void setup(InfinityCompress plugin){
        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_GEO_MINER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_DIAMOND_PICKAXE,ONE_PER_TICK_MEDIUM_CAPACITOR,new ItemStack(Material.AIR),
                ONE_PER_TICK_SMALL_REINFORCED_ALLOY,ONE_PER_TICK_OIL_PUMP,ONE_PER_TICK_SMALL_REINFORCED_ALLOY,
                new ItemStack(Material.AIR),ONE_PER_TICK_ELECMOTOR,new ItemStack(Material.AIR)
        }).material(GEO_MINER).speed(1).energyPerTick(2984911).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_BASIC_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGPLATE,ONE_PER_TICK_CARBONADO_CAPACITOR,ONE_PER_TICK_MAGPLATE,
                ONE_PER_TICK_IRON_PICKAXE,ONE_PER_TICK_GEO_MINER,new ItemStack(Material.AIR),
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CORE,ONE_PER_TICK_MACHINE_CIRCUIT
        }).material(BASIC_QUARRY).speed(1).energyPerTick(12636907).register(plugin);


        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_REINFORCED_PLATE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_REINFORCED_ALLOY,ONE_PER_TICK_REINFORCED_ALLOY,new ItemStack(Material.AIR),
                ONE_PER_TICK_REINFORCED_ALLOY,ONE_PER_TICK_REINFORCED_ALLOY,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(REINFORCED_PLATE).speed(1).energyPerTick(1239064).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MACHINE_PLATE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_REINFORCED_ALLOY,ONE_PER_TICK_REINFORCED_PLATE,ONE_PER_TICK_REINFORCED_ALLOY,
                ONE_PER_TICK_MAGPLATE,ONE_PER_TICK_SMALL_TITANIUM,ONE_PER_TICK_MAGPLATE,
                new ItemStack(Material.AIR),ONE_PER_TICK_REINFORCED_PLATE,new ItemStack(Material.AIR)
        }).material(MACHINE_PLATE).speed(1).energyPerTick(43432931).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_ADVANCED_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MACHINE_PLATE,ONE_PER_TICK_ENERGIZED_CAPACITOR,ONE_PER_TICK_MACHINE_PLATE,
                ONE_PER_TICK_DIAMOND_PICKAXE,ONE_PER_TICK_BASIC_QUARRY,new ItemStack(Material.AIR),
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CORE,ONE_PER_TICK_MACHINE_CIRCUIT
        }).material(ADVANCED_QUARRY).speed(1).energyCapacity(265712556).energyPerTick(135985771).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_VOID_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED,ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_ENERGIZED_CAPACITOR,ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED,ONE_PER_TICK_VOIDINGOT
        }).material(VOID_CAPACITOR).speed(1).energyCapacity(108712200).energyPerTick(44102052).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_VOID_QUARRY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_VOID_CAPACITOR,ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_NETHERITE_PICKAXE,ONE_PER_TICK_ADVANCED_QUARRY,new ItemStack(Material.AIR),
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CORE,ONE_PER_TICK_MACHINE_CIRCUIT
        }).material(VOID_QUARRY).speed(1).energyCapacity(410087790).energyPerTick(208783319).register(plugin);

        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_WORLD_BREAKER, InfinityWorkbench.TYPE, new ItemStack[] {
                null, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, null,
                null, null, null, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_INFINITY_INGOT,
                null, null, null, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT,
                null, null, ONE_PER_TICK_VOIDINGOT, null, null, ONE_PER_TICK_INFINITY_INGOT,
                null, ONE_PER_TICK_VOIDINGOT, null, null, null, ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_VOIDINGOT, null, null, null, null, null,
        }).material(PICKAXE).speed(1).energyCapacity(881572128).energyPerTick(403974192).register(plugin);

        new UnplaceableBlock(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_QUARRY_STEP1, InfinityWorkbench.TYPE, new ItemStack[] {
                null, ONE_PER_TICK_MACHINE_PLATE, ONE_PER_TICK_MACHINE_PLATE, ONE_PER_TICK_MACHINE_PLATE, ONE_PER_TICK_MACHINE_PLATE, null,
                ONE_PER_TICK_MACHINE_PLATE, ONE_PER_TICK_WORLD_BREAKER, ONE_PER_TICK_INFINITY_CIRCUIT, ONE_PER_TICK_INFINITY_CIRCUIT, ONE_PER_TICK_WORLD_BREAKER, ONE_PER_TICK_MACHINE_PLATE,
                ONE_PER_TICK_MACHINE_PLATE, ONE_PER_TICK_VOID_QUARRY, ONE_PER_TICK_INFINITY_CORE, ONE_PER_TICK_INFINITY_CORE, ONE_PER_TICK_VOID_QUARRY, ONE_PER_TICK_MACHINE_PLATE,
                ONE_PER_TICK_VOIDINGOT, null, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, null, ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_VOIDINGOT, null, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, null, ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_VOIDINGOT, null, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, null, ONE_PER_TICK_VOIDINGOT,
        }, new SlimefunItemStack(ONE_PER_TICK_INFINITY_QUARRY_STEP1, 1)).register(plugin);
//                .material(INFINITY_QUARRY).speed(1).energyCapacity(881572128).energyPerTick(4_230_884_694).register(plugin);
        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_QUARRY_STEP2, InfinityWorkbench.TYPE, new ItemStack[]{
                ONE_PER_TICK_INFINITY_QUARRY_STEP1,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,null,null,
                null,null,null,null,null,null
        }).material(INFINITY_QUARRY).speed(1).energyCapacity(2131875971).energyPerTick(2029951316).register(plugin);
        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_QUARRY_STEP3, InfinityWorkbench.TYPE, new ItemStack[]{
                ONE_PER_TICK_INFINITY_QUARRY_STEP2,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,null,null,null,
                null,null,null,null,null,null
        }).material(INFINITY_QUARRY).speed(1).energyCapacity(0).energyPerTick(1).register(plugin);
    }
}
