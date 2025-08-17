package io.github.acdeasdff.infinityCompress.items.GlobalWarming;

import static io.github.acdeasdff.infinityCompress.categories.Groups.INFINITY_GLOBALWARMING;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.CARBON;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.CARBON_CHUNK;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.COMPRESSED_CARBON;
import static me.poma123.globalwarming.Items.AIR_COMPRESSOR;
import static me.poma123.globalwarming.Items.EMPTY_CANISTER;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;

public class BlocksGlobalWarming {

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSOR_1 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSOR_1",
            Material.GLASS,
            "&b空气压缩处理机(初级)(单刻)",
            "&7自动产出碳(20台)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(320)
    );
    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSOR_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSOR_2",
            Material.GRAY_STAINED_GLASS,
            "&b空气压缩处理机(中级)(单刻)",
            "&7自动产出碳(160台)",
            "",
            MachineLore.speed(8),
            MachineLore.energyPerSecond(2560)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSOR_3 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSOR_3",
            Material.BLACK_CONCRETE,
            "&b空气压缩处理机(高级)(单刻)",
            "&7自动产出碳",
            "&7有效对抗全球变暖(1280台)",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(20480)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSOR_4 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSOR_4",
            Material.BLACK_GLAZED_TERRACOTTA,
            "&b空气压缩处理机(终极)(单刻)",
            "&7自动产出压缩碳",
            "&7有效对抗全球变暖(5120台)",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(81920)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSOR_5 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSOR_5",
            Material.BLACK_STAINED_GLASS,
            "&b空气压缩处理机(神极)(单刻)",
            "&7自动产出碳块",
            "&7有效对抗全球变暖(40960台)",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(655360)
    );

    public static void setup(InfinityCompress plugin){
        new TweakedAirCompressor(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_COMPRESSOR_1, InfinityWorkbench.TYPE, new ItemStack[] {
                AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,EMPTY_CANISTER,EMPTY_CANISTER,
                AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,EMPTY_CANISTER,EMPTY_CANISTER,
                AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,EMPTY_CANISTER,EMPTY_CANISTER,
                AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,EMPTY_CANISTER,EMPTY_CANISTER,
                AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,AIR_COMPRESSOR,EMPTY_CANISTER,EMPTY_CANISTER,
                null,null,null,null,null,null
        }, plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_1",0.0,2147483647.0))
                .material(CARBON).speed(1).energyPerTick(320).register(plugin);

//        Bukkit.getPluginManager().getPlugin("GlobalWarming").getConfig().setDefaults();
        new TweakedAirCompressor(INFINITY_GLOBALWARMING , ONE_PER_TICK_COMPRESSOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                ONE_PER_TICK_COMPRESSOR_1,ONE_PER_TICK_COMPRESSOR_1,ONE_PER_TICK_COMPRESSOR_1,
                ONE_PER_TICK_COMPRESSOR_1,new ItemStack(Material.AIR),ONE_PER_TICK_COMPRESSOR_1,
                ONE_PER_TICK_COMPRESSOR_1,ONE_PER_TICK_COMPRESSOR_1,ONE_PER_TICK_COMPRESSOR_1
        }, plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_2",0.0,2147483647.0))
                .material(CARBON).speed(8).energyPerTick(2560).register(plugin);

        new TweakedAirCompressor(INFINITY_GLOBALWARMING , ONE_PER_TICK_COMPRESSOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                ONE_PER_TICK_COMPRESSOR_2,ONE_PER_TICK_COMPRESSOR_2,ONE_PER_TICK_COMPRESSOR_2,
                ONE_PER_TICK_COMPRESSOR_2,new ItemStack(Material.AIR),ONE_PER_TICK_COMPRESSOR_2,
                ONE_PER_TICK_COMPRESSOR_2,ONE_PER_TICK_COMPRESSOR_2,ONE_PER_TICK_COMPRESSOR_2
        }, plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_3",0.0,2147483647.0))
                .material(CARBON).speed(64).energyPerTick(20480).register(plugin);

        new TweakedAirCompressor(INFINITY_GLOBALWARMING , ONE_PER_TICK_COMPRESSOR_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                ONE_PER_TICK_COMPRESSOR_3,ONE_PER_TICK_COMPRESSOR_3,new ItemStack(Material.AIR),
                ONE_PER_TICK_COMPRESSOR_3,ONE_PER_TICK_COMPRESSOR_3,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_4",0.0,2147483647.0))
                .material(COMPRESSED_CARBON).speed(64).energyPerTick(81920).register(plugin);

        new TweakedAirCompressor(INFINITY_GLOBALWARMING , ONE_PER_TICK_COMPRESSOR_5, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                ONE_PER_TICK_COMPRESSOR_4,ONE_PER_TICK_COMPRESSOR_4,ONE_PER_TICK_COMPRESSOR_4,
                ONE_PER_TICK_COMPRESSOR_4,new ItemStack(Material.AIR),ONE_PER_TICK_COMPRESSOR_4,
                ONE_PER_TICK_COMPRESSOR_4,ONE_PER_TICK_COMPRESSOR_4,ONE_PER_TICK_COMPRESSOR_4
        }, plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_5",0.0,2147483647.0))
                .material(CARBON_CHUNK).speed(64).energyPerTick(655360).register(plugin);

//        globalwarming.getConfig().set("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_1",
//                plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_1",0.0,2147483647.0));
//        globalwarming.getConfig().set("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_2",
//                plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_2",0.0,2147483647.0));
//        globalwarming.getConfig().set("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_3",
//                plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_3",0.0,2147483647.0));
//        globalwarming.getConfig().set("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_4",
//                plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_4",0.0,2147483647.0));
//        globalwarming.getConfig().set("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_5",
//                plugin.getConfig().getDouble("pollution.absorption.machines.INFCP_ONE_PER_TICK_COMPRESSOR_5",0.0,2147483647.0));
//
//        globalwarming.saveConfig();

    }
}
