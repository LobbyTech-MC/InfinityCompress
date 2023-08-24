package io.github.acdeasdff.infinityCompress.items.blocks;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.acdeasdff.infinityCompress.categories.Groups;
import io.github.acdeasdff.infinityCompress.fixbug.newInfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.SlimefunExtension;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.mooy1.infinityexpansion.items.generators.EnergyGenerator;
import io.github.mooy1.infinityexpansion.items.generators.GenerationType;
import io.github.mooy1.infinityexpansion.items.machines.GearTransformer;
import io.github.mooy1.infinityexpansion.items.machines.GeoQuarry;
import io.github.mooy1.infinityexpansion.items.machines.MaterialGenerator;
import io.github.mooy1.infinityexpansion.items.materials.Materials;
import io.github.mooy1.infinityexpansion.items.materials.Singularity;
import io.github.mooy1.infinitylib.machines.MachineLore;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import static io.github.acdeasdff.infinityCompress.categories.Groups.BASIC_MACHINES;
import static io.github.acdeasdff.infinityCompress.categories.Groups.INFINITY_MATERIALS;
import static io.github.mooy1.infinityexpansion.items.SlimefunExtension.ADVANCED_SMELTERY;
import static io.github.mooy1.infinityexpansion.items.blocks.Blocks.INFINITY_FORGE;
import static io.github.mooy1.infinityexpansion.items.generators.Generators.*;
import static io.github.mooy1.infinityexpansion.items.machines.Machines.*;
import static io.github.mooy1.infinityexpansion.items.materials.Materials.*;
import static io.github.mooy1.infinityexpansion.items.mobdata.MobData.*;
import static io.github.mooy1.infinityexpansion.items.quarries.Quarries.INFINITY_QUARRY;
import static io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems.*;

@UtilityClass
public final class Blocks {


    public static final SlimefunItemStack GEO_QUARRY_1 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER1",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier1)",
            "&7更快的获取地理资源",
            "",
            MachineLore.energyPerSecond(3600)
    );

    public static final SlimefunItemStack GEO_QUARRY_2 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER2",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier2)",
            "&7更快的获取地理资源",
            "",
            MachineLore.energyPerSecond(18000)
    );

    public static final SlimefunItemStack GEO_QUARRY_3 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER3",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier3)",
            "&7更快的获取地理资源",
            "",
            MachineLore.energyPerSecond(90000)
    );

    public static final SlimefunItemStack GEO_QUARRY_4 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER4",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier4)",
            "&7极快的获取地理资源",
            "",
            MachineLore.energyPerSecond(180000)
    );

    public static final SlimefunItemStack GEO_QUARRY_5 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER5",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier5)",
            "&7极快的获取地理资源",
            "",
            MachineLore.energyPerSecond(1440000)
    );

    public static final SlimefunItemStack GEO_QUARRY_6 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER6",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier6)",
            "&7极快的获取地理资源",
            "&7能够获得石油",
            "不要太贪心",
            "",
            MachineLore.energyPerSecond(11520000)
    );

    public static final SlimefunItemStack GEO_QUARRY_7 = new SlimefunItemStack(
            "INFCP_GEO_QUARRY_TIER7",
            Material.QUARTZ_BRICKS,
            "&f压缩地理资源矿机(Tier7)",
            "&7极快的获取地理资源",
            "&7能够获得石油,将期望物品置于机器界面右上角以启用过滤功能",
            "不要太贪心",
            "",
            MachineLore.energyPerSecond(11520000)
    );

    public static final SlimefunItemStack T_GEAR_TRANSFORMER = new SlimefunItemStack(
            "INFCP_T_GEAR_TRANSFORMER",
            Material.EMERALD_BLOCK,
            "&f装备材质转换机(货运改造)",
            "&7支持货运系统的装备材质转换机",
            "",
            MachineLore.energy(12000)
    );

    public static final SlimefunItemStack INFINITY_INFINITE_PANEL = new SlimefunItemStack(
            "INFCP_INFINITY_INFINITE_PANEL",
            Material.LIGHT_BLUE_TERRACOTTA,
            "&b压缩无尽发电机",
            "&7无尽无尽发电机",
            "",
            MachineLore.energyBuffer(360000*6 * 100),
            MachineLore.energyPerSecond(2160000)
    );

    public static final SlimefunItemStack INFINITY_INFINITY_INFINITE_PANEL = new SlimefunItemStack(
            "INFCP_INFINITY_INFINITY_INFINITE_PANEL",
            Material.LIGHT_BLUE_CONCRETE,
            "&b二重压缩无尽发电机",
            "&7无尽无尽无尽发电机",
            "",
//            MachineLore.energyBuffer(360000*6*36 * 100),
            MachineLore.energyPerSecond(77760000)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSED_COBBLE_1 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSED_COBBLE_1",
            Material.MOSSY_STONE_BRICKS,
            "&b压缩圆石生成器",
            "&7生产压缩圆石",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(216)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSED_COBBLE_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSED_COBBLE_2",
            Material.CRACKED_STONE_BRICKS,
            "&b二重压缩圆石生成器",
            "&7生产二重压缩圆石",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1944)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSED_COBBLE_3 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSED_COBBLE_3",
            Material.STONE_BRICKS,
            "&b三重压缩圆石生成器",
            "&7生产三重压缩圆石",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(17496)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSED_COBBLE_4 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSED_COBBLE_4",
            Material.CHISELED_STONE_BRICKS,
            "&b四重压缩圆石生成器",
            "&7生产四重压缩圆石",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(157464)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESSED_COBBLE_5 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESSED_COBBLE_5",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b五重压缩圆石生成器",
            "&7生产五重压缩圆石",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1417176)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COPPER_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_COPPER_SINGULARITY",
            Material.BRICKS,
            "&6铜矿机奇点"
    );

    public static final SlimefunItemStack ONE_PER_TICK_ZINC_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_ZINC_SINGULARITY",
            Material.IRON_BLOCK,
            "&7锌矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_TIN_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_TIN_SINGULARITY",
            Material.IRON_BLOCK,
            "&7锡矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_ALUMINUM_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_ALUMINUM_SINGULARITY",
            Material.IRON_BLOCK,
            "&7铝矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_SILVER_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_SILVER_SINGULARITY",
            Material.IRON_BLOCK,
            "&7银矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_MAGNESIUM_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_MAGNESIUM_SINGULARITY",
            Material.NETHER_BRICKS,
            "&5镁矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_LEAD_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_LEAD_SINGULARITY",
            Material.IRON_BLOCK,
            "&8铅矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_GOLD_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_GOLD_SINGULARITY",
            Material.GOLD_BLOCK,
            "&6金矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_IRON_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_IRON_SINGULARITY",
            Material.IRON_BLOCK,
            "&7铁矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_DIAMOND_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_DIAMOND_SINGULARITY",
            Material.DIAMOND_BLOCK,
            "&b钻石矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_EMERALD_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_EMERALD_SINGULARITY",
            Material.EMERALD_BLOCK,
            "&a绿宝石矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_NETHERITE_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_NETHERITE_SINGULARITY",
            Material.NETHERITE_BLOCK,
            "&4下界合金矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_COAL_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_COAL_SINGULARITY",
            Material.COAL_BLOCK,
            "&8煤炭矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_REDSTONE_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_REDSTONE_SINGULARITY",
            Material.REDSTONE_BLOCK,
            "&c红石矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_LAPIS_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_LAPIS_SINGULARITY",
            Material.LAPIS_BLOCK,
            "&9青金石矿机奇点"
    );
    public static final SlimefunItemStack ONE_PER_TICK_QUARTZ_SINGULARITY = new SlimefunItemStack(
            "ONE_PER_TICK_QUARTZ_SINGULARITY",
            Material.QUARTZ_BLOCK,
            "&f石英矿机奇点"
    );

    public static final SlimefunItemStack ONE_PER_TICK_COPPER_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_COPPER_SINGULARITY_ACTIVATED",
            Material.BRICKS,
            "&6激活的铜矿机奇点",
            MachineLore.energyPerSecond(712500)
    );

    public static final SlimefunItemStack ONE_PER_TICK_ZINC_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_ZINC_SINGULARITY_ACTIVATED",
            Material.IRON_BLOCK,
            "&7激活的锌矿机奇点",
            MachineLore.energyPerSecond(712500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_TIN_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_TIN_SINGULARITY_ACTIVATED",
            Material.IRON_BLOCK,
            "&7激活的锡矿机奇点",
            MachineLore.energyPerSecond(712500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_ALUMINUM_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_ALUMINUM_SINGULARITY_ACTIVATED",
            Material.IRON_BLOCK,
            "&7激活的铝矿机奇点",
            MachineLore.energyPerSecond(712500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_SILVER_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_SILVER_SINGULARITY_ACTIVATED",
            Material.IRON_BLOCK,
            "&7激活的银矿机奇点",
            MachineLore.energyPerSecond(712500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_MAGNESIUM_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_MAGNESIUM_SINGULARITY_ACTIVATED",
            Material.NETHER_BRICKS,
            "&5激活的镁矿机奇点",
            MachineLore.energyPerSecond(712500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_LEAD_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_LEAD_SINGULARITY_ACTIVATED",
            Material.IRON_BLOCK,
            "&8激活的铅矿机奇点",
            MachineLore.energyPerSecond(712500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_GOLD_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_GOLD_SINGULARITY_ACTIVATED",
            Material.GOLD_BLOCK,
            "&6激活的金矿机奇点",
            MachineLore.energyPerSecond(475000)
    );
    public static final SlimefunItemStack ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED",
            Material.IRON_BLOCK,
            "&7激活的铁矿机奇点",
            MachineLore.energyPerSecond(475000)
    );
    public static final SlimefunItemStack ONE_PER_TICK_DIAMOND_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_DIAMOND_SINGULARITY_ACTIVATED",
            Material.DIAMOND_BLOCK,
            "&b激活的钻石矿机奇点",
            MachineLore.energyPerSecond(2812500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_EMERALD_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_EMERALD_SINGULARITY_ACTIVATED",
            Material.EMERALD_BLOCK,
            "&a激活的绿宝石矿机奇点",
            MachineLore.energyPerSecond(2812500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_NETHERITE_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_NETHERITE_SINGULARITY_ACTIVATED",
            Material.NETHERITE_BLOCK,
            "&4激活的下界合金矿机奇点",
            MachineLore.energyPerSecond(1125000)
    );
    public static final SlimefunItemStack ONE_PER_TICK_COAL_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_COAL_SINGULARITY_ACTIVATED",
            Material.COAL_BLOCK,
            "&8激活的煤炭矿机奇点",

            MachineLore.energyPerSecond(8_437_500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED",
            Material.REDSTONE_BLOCK,
            "&c激活的红石矿机奇点",

            MachineLore.energyPerSecond(8_437_500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_LAPIS_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_LAPIS_SINGULARITY_ACTIVATED",
            Material.LAPIS_BLOCK,
            "&9激活的青金石矿机奇点",
            MachineLore.energyPerSecond(8_437_500)
    );
    public static final SlimefunItemStack ONE_PER_TICK_QUARTZ_SINGULARITY_ACTIVATED = new SlimefunItemStack(
            "ONE_PER_TICK_QUARTZ_SINGULARITY_ACTIVATED",
            Material.QUARTZ_BLOCK,
            "&f激活的石英矿机奇点",

            MachineLore.energyPerSecond(8_437_500)
    );

    public static final SlimefunItemStack AutoInfinityWorkbench = new SlimefunItemStack(
            "INFINITYCOMPRESS_AUTOCRAFTER",
            Material.RESPAWN_ANCHOR,
            "&6自动无尽合成台",
            "&7自动合成无尽物品",
            "",
            MachineLore.energy(10000000) + "每个物品"
    );
    public static final SlimefunItemStack AutoInfinityWorkbench2 = new SlimefunItemStack(
            "INFINITYCOMPRESS_AUTOCRAFTER2",
            Material.RESPAWN_ANCHOR,
            "&6自动无尽合成台",
            "&7自动合成无尽物品",
            "",
            MachineLore.energy(10000000) + "每个物品"
    );

    public static final SlimefunItemStack NEW_INFINITY_FORGE = new SlimefunItemStack(
            "INFINITYCOMPRESS_NEW_INF_FORGE",
            Material.RESPAWN_ANCHOR,
            "&6无尽合成台",
            "&7合成无尽物品(经过改进,只检查slimefun物品id)",
            "",
            MachineLore.energy(10000000) + "每个物品"
    );

    //玻璃厂
    public static final SlimefunItemStack BASIC_GLASS = new SlimefunItemStack(
            "INFCP_BASIC_GLASS_GEN",
            Material.SMOOTH_STONE,
            "&9基础&8玻璃厂",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1440)
    );

    public static final SlimefunItemStack ADVANCED_GLASS = new SlimefunItemStack(
            "INFCP_ADVANCED_GLASS_GEN",
            Material.SMOOTH_STONE,
            "&9高级&8玻璃厂",
            "",
            MachineLore.speed(8),
            MachineLore.energyPerSecond(11520)
    );

    public static final SlimefunItemStack INFINITY_GLASS = new SlimefunItemStack(
            "INFCP_INFINITY_GLASS_GEN",
            Material.SMOOTH_STONE,
            "&9无尽&8玻璃厂",
            "",
            MachineLore.speed(64),
            MachineLore.energyPerSecond(92160)
    );

//    矿机
    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_QUARTZ = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_QUARTZ",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b石英矿机(单刻)",
            "&7自动产出石英(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_COAL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_COAL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b煤炭矿机(单刻)",
            "&7自动产出煤炭(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_IRON = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_IRON",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b铁矿机(单刻)",
            "&7自动产出铁锭(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_GOLD = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_GOLD",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b金矿机(单刻)",
            "&7自动产出金锭(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_DIAMOND = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_DIAMOND",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b钻石矿机(单刻)",
            "&7自动产出钻石(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_LAPIS = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_LAPIS",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b青金石矿机(单刻)",
            "&7自动产出青金石(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_REDSTONE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_REDSTONE",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b红石矿机(单刻)",
            "&7自动产出红石(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_REDSTONE_BLOCK = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_REDSTONE_BLOCK",
            Material.REDSTONE_BLOCK,
            "&b红石块机(单刻)",
            "&7自动产出红石块",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(50625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_EMERALD = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_EMERALD",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b绿宝石矿机(单刻)",
            "&7自动产出绿宝石(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_NETHERITE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_NETHERITE",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b下界合金矿机(单刻)",
            "&7自动产出下界合金(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(5625)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_NETHERRACK = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_NETHERRACK",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b地狱岩矿机(单刻)",
            "&7自动产出地狱岩(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(5625*2)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_MG = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_MG",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bMg矿机(单刻)",
            "&7自动产出Mg(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_SN = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_SN",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bSn矿机(单刻)",
            "&7自动产出Sn(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_ZN = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_ZN",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bZn矿机(单刻)",
            "&7自动产出Zn(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_CU = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_CU",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bCu矿机(单刻)",
            "&7自动产出Cu(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_AU = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_AU",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bAu矿机(单刻)",
            "&7自动产出Au(slimefun)(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_AG = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_AG",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bAg矿机(单刻)",
            "&7自动产出Ag(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_AL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_AL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bAl矿机(单刻)",
            "&7自动产出Al(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );

    public static final SlimefunItemStack ONE_PER_TICK_QUARRY_PB = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_QUARRY_PB",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bPb矿机(单刻)",
            "&7自动产出Pb(合成材料--不可直接使用)",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(475)
    );


    public static final SlimefunItemStack ONE_PER_TICK_SILCON = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SILCON",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bSi矿机(单刻)",
            "&7自动产出硅",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(22740)
    );

    public static final SlimefunItemStack ONE_PER_TICK_NI = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_NI",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bNi矿机(单刻)",
            "&7自动产出Ni",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(1905)
    );

    public static final SlimefunItemStack ONE_PER_TICK_CO = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CO",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bCo矿机(单刻)",
            "&7自动产出Co",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(3810)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MAGNET = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MAGNET",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b磁铁机(单刻)",
            "&7自动产出磁铁",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(7145)
    );
    public static final SlimefunItemStack ONE_PER_TICK_MAGNET_SMALL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MAGNET_SMALL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b小磁铁机(单刻)",
            "&7自动产出磁铁(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(3572)//3572.5
    );

    public static final SlimefunItemStack ONE_PER_TICK_S = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_S",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&bS机(单刻)",
            "&7自动产出S(合成材料--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(90000)//3572.5
    );

    public static final SlimefunItemStack ONE_PER_TICK_BATTERY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BATTERY",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b电池机(单刻)",
            "&7自动产出电池",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(186575)//3572.5
    );

    public static final SlimefunItemStack ONE_PER_TICK_BATTERY_SMALL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BATTERY_SMALL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b小电池机(单刻)",
            "&7自动产出电池(合成物品--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(93_287)//93,287.5
    );

    public static final SlimefunItemStack ONE_PER_TICK_ELECMAG = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ELECMAG",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b电磁铁机(单刻)",
            "&7自动产出电磁铁",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(75781)// - ~ = 123654
    );

    public static final SlimefunItemStack ONE_PER_TICK_ELECMAG_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ELECMAG_2",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b电磁铁机(单刻)",
            "&7自动产出电磁铁",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(75781)// - ~ = 123654
    );

    public static final SlimefunItemStack ONE_PER_TICK_ELECMAG_SMALL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ELECMAG_SMALL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b小电磁铁机(单刻)",
            "&7自动产出电磁铁(合成物品--不可直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(37890)//99,717.5 - 37890 = 61827
    );

    public static final SlimefunItemStack ONE_PER_TICK_ELECMOTOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ELECMOTOR",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b电动马达机(单刻)",
            "&7自动产出电动马达",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(38365)//100192.5
    );

    public static final SlimefunItemStack ONE_PER_TICK_SIIRON = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SIIRON",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b硅铁机(单刻)",
            "&7自动产出硅铁",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(23215)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_PANEL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_PANEL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b太阳能板机(单刻)",
            "&7自动产出太阳能板",
            "不采用资源合成器功率(因为更高)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(142_185)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_PANEL_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_PANEL_2",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b太阳能板机(单刻)",
            "&7自动产出太阳能板",
            "不采用资源合成器功率(因为更高)",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(142_185)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_BASIC = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_BASIC",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b基础太阳能发电机组装机(单刻)",
            "&7自动产出基础太阳能发电机(无尽扩展)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1_074_306)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_ADVANCED = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_ADVANCED",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b高级太阳能发电机组装机(单刻)",
            "&7自动产出高级太阳能发电机(无尽扩展)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(38415665)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_CELESTIAL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_CELESTIAL",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b超级太阳能发电机组装机(单刻)",
            "&7自动产出超级太阳能发电机(无尽扩展)",
            "要想组装无尽发电机,还需要额外的处理",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(118811857)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOID_GENERATOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOID_GENERATOR",
            Material.WHITE_CONCRETE,
            "&b虚空发电机组装机(单刻)",
            "&7自动产出虚空发电机",
            "要想组装无尽发电机,还需要额外的处理",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(401769021)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_GENERATOR_1 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_GENERATOR_1",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b太阳能发电机组装机(单刻)",
            "&7自动产出太阳能发电机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(465395)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_GENERATOR_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_GENERATOR_2",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b进阶太阳能发电机组装机(单刻)",
            "&7自动产出进阶太阳能发电机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1868155)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_GENERATOR_3 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_GENERATOR_3",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b黑钻太阳能发电机组装机(单刻)",
            "&7自动产出黑钻太阳能发电机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(8176695)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLAR_GENERATOR_4 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLAR_GENERATOR_4",
            Material.CHISELED_POLISHED_BLACKSTONE,
            "&b充能太阳能发电机组装机(单刻)",
            "&7自动产出充能太阳能发电机",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(42536766)
    );


    public static final SlimefunItemStack ONE_PER_TICK_CARBON = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CARBON",
            Material.BLACK_STAINED_GLASS,
            "&b碳机(单刻)",
            "&7自动产出碳",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(45000)
    );

    public static final SlimefunItemStack ONE_PER_TICK_COMPRESS_CARBON = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_COMPRESS_CARBON",
            Material.BLACK_STAINED_GLASS,
            "&b压缩碳机(单刻)",
            "&7自动产出压缩碳",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(180000)
    );

    public static final SlimefunItemStack ONE_PER_TICK_CARBON_CHUNK = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CARBON_CHUNK",
            Material.BLACK_STAINED_GLASS,
            "&b碳块机(单刻)",
            "&7自动产出碳块",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1440450)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SYNTHETIC_DIAMOND = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SYNTHETIC_DIAMOND",
            Material.DIAMOND_BLOCK,
            "&b人造钻石机(单刻)",
            "&7自动产出人造钻石",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1441350)
    );

    public static final SlimefunItemStack ONE_PER_TICK_RAW_CARBONADO = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_RAW_CARBONADO",
            Material.BLACK_TERRACOTTA,
            "&b生黑钻机(单刻)",
            "&7自动产出生黑钻",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2_882_280)
    );
    public static final SlimefunItemStack ONE_PER_TICK_CARBONADO = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CARBONADO",
            Material.BLACK_GLAZED_TERRACOTTA,
            "&b黑钻机(单刻)",
            "&7自动产出黑钻",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(703125)//2883180
    );

    public static final SlimefunItemStack ONE_PER_TICK_CARBONADO_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CARBONADO_2",
            Material.BLACK_GLAZED_TERRACOTTA,
            "&b黑钻机(单刻)",
            "&7自动产出黑钻",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(703125)//2883180
    );

    public static final SlimefunItemStack ONE_PER_TICK_AU24K = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_AU24K",
            Material.GOLD_BLOCK,
            "&bAU24K机(单刻)",
            "&7自动产出24K金",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(475*6)
    );

    public static final SlimefunItemStack ONE_PER_TICK_URANIUM = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_URANIUM",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&b铀机(单刻)",
            "&7自动产出铀",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(3520)
    );

    public static final SlimefunItemStack ONE_PER_TICK_URANIUM_SMALL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_URANIUM_SMALL",
            Material.GREEN_TERRACOTTA,
            "&b小铀机(单刻)",
            "&7自动产出铀(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1760)
    );

    public static final SlimefunItemStack ONE_PER_TICK_NETHERSTAR_PART = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_NETHERSTAR_PART",
            Material.WHITE_TERRACOTTA,
            "&b1/5 下界之星机(单刻)",
            "&7自动产出下界之星(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(4500*4)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOIDDUST_PART = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOIDDUST_PART",
            Material.PURPLE_CONCRETE,
            "&b1/5 末影龙机(单刻)",
            "&7(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(9000*4)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOIDDUST = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOIDDUST",
            Material.PURPLE_CONCRETE,
            "&b末影龙机(单刻)",
            "&7自动产出虚空粉",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(9000*20)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOIDDUST_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOIDDUST_2",
            Material.PURPLE_CONCRETE,
            "&b末影龙机(单刻)",
            "&7自动产出虚空粉",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(9000*20)
    );

    public static final SlimefunItemStack ONE_PER_TICK_ENDER_ESSENCE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ENDER_ESSENCE",
            Material.PURPLE_CONCRETE,
            "&b4x 末影龙机(单刻)",
            "&7自动产出末地精华",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(9000*20*4)
    );

    public static final SlimefunItemStack ONE_PER_TICK_VOIDINGOT = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_VOIDINGOT",
            Material.PURPLE_CONCRETE,
            "&b9x 末影龙机(单刻)",
            "&7自动产出虚空锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1620000)
    );

    public static final SlimefunItemStack ONE_PER_TICK_NETHERSTAR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_NETHERSTAR",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&b下界之星机(单刻)",
            "&7自动产出下界之星",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(90000)
    );

    public static final SlimefunItemStack ONE_PER_TICK_BLISTERING_INGOT = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BLISTERING_INGOT",
            Material.LIME_GLAZED_TERRACOTTA,
            "&b起泡锭机(单刻)",
            "&7自动产出起泡锭",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(267_969)//2975204
    );

    public static final SlimefunItemStack ONE_PER_TICK_BLISTERING_INGOT_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BLISTERING_INGOT_2",
            Material.LIME_GLAZED_TERRACOTTA,
            "&b起泡锭机(单刻)",
            "&7自动产出起泡锭",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(267_969)
    );

    public static final SlimefunItemStack ONE_PER_TICK_STEEL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_STEEL",
            Material.GRAY_CONCRETE,
            "&b钢机(单刻)",
            "&7自动产出钢锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1430)
    );
    public static final SlimefunItemStack ONE_PER_TICK_DAMASCUS_STEEL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_DAMASCUS_STEEL",
            Material.GRAY_CONCRETE,
            "&b大马士革钢机(单刻)",
            "&7自动产出大马士革钢锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2860)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SOLDER_INGOT = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SOLDER_INGOT",
            Material.GRAY_CONCRETE,
            "&b焊锡锭机(单刻)",
            "&7自动产出焊锡锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(1905)
    );
    public static final SlimefunItemStack ONE_PER_TICK_BRONZE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BRONZE",
            Material.TERRACOTTA,
            "&b青铜机(单刻)",
            "&7自动产出青铜锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(1905)
    );

    public static final SlimefunItemStack ONE_PER_TICK_BRASS = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BRASS",
            Material.TERRACOTTA,
            "&b黄铜机(单刻)",
            "&7自动产出黄铜锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(1905)
    );
    public static final SlimefunItemStack ONE_PER_TICK_CORBRONZE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CORBRONZE",
            Material.TERRACOTTA,
            "&b科林斯青铜机(单刻)",
            "&7自动产出科林斯青铜锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(3300)
    );

    public static final SlimefunItemStack ONE_PER_TICK_AL_BRONZE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_AL_BRONZE",
            Material.YELLOW_TERRACOTTA,
            "&b铝青铜机(单刻)",
            "&7自动产出铝青铜锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(2825)
    );

    public static final SlimefunItemStack ONE_PER_TICK_AL_BRASS = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_AL_BRASS",
            Material.YELLOW_TERRACOTTA,
            "&b铝黄铜机(单刻)",
            "&7自动产出铝黄铜锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(2825)
    );
    public static final SlimefunItemStack ONE_PER_TICK_BILLON = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BILLON",
            Material.ORANGE_TERRACOTTA,
            "&b银铜合金机(单刻)",
            "&7自动产出银铜合金锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(1905)
    );

    public static final SlimefunItemStack ONE_PER_TICK_DURALMIN = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_DURALMIN",
            Material.BROWN_TERRACOTTA,
            "&b硬铝机(单刻)",
            "&7自动产出硬铝锭",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(1905)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SMALL_BRONZE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SMALL_BRONZE",
            Material.ORANGE_TERRACOTTA,
            "&b小青铜机(单刻)",
            "&7自动产出青铜(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(952)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SMALL_BRASS = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SMALL_BRASS",
            Material.YELLOW_TERRACOTTA,
            "&b小黄铜机(单刻)",
            "&7自动产出黄铜(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(952)
    );

    public static final SlimefunItemStack ONE_PER_TICK_HARDENED_METAL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_HARDENED_METAL",
            Material.CYAN_TERRACOTTA,
            "&b硬化金属机(单刻)",
            "&7自动产出硬化金属",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(370930)
    );

    public static final SlimefunItemStack ONE_PER_TICK_REDALLOY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_REDALLOY",
            Material.CYAN_TERRACOTTA,
            "&b红石合金机(单刻)",
            "&7自动产出红石合金锭",
            "不采用资源合成器功率(因为更高)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(264930)
    );

    public static final SlimefunItemStack ONE_PER_TICK_REDALLOY_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_REDALLOY_2",
            Material.CYAN_TERRACOTTA,
            "&b红石合金机(单刻)",
            "&7自动产出红石合金锭",
            "不采用资源合成器功率(因为更高)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(264930)
    );

    public static final SlimefunItemStack ONE_PER_TICK_ADAMANTITE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ADAMANTITE",
            Material.PINK_TERRACOTTA,
            "&b精金机(单刻)",
            "&7自动产出精金",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(3079815)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MAGNONIUM = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MAGNONIUM",
            Material.PURPLE_TERRACOTTA,
            "&b磁金机(单刻)",
            "&7自动产出磁金",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1434885)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MYTHRIL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MYTHRIL",
            Material.BLUE_TERRACOTTA,
            "&b秘银机(单刻)",
            "&7自动产出秘银",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(821058)
    );


    public static final SlimefunItemStack ONE_PER_TICK_FORTUNE_SINGULARITY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_FORTUNE_SINGULARITY",
            Material.PINK_GLAZED_TERRACOTTA,
            "&b时运奇点机(单刻)",
            "&7自动产出时运奇点",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(10304815)
    );

    public static final SlimefunItemStack ONE_PER_TICK_METAL_SINGULARITY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_METAL_SINGULARITY",
            Material.LIGHT_GRAY_GLAZED_TERRACOTTA,
            "&b金属奇点机(单刻)",
            "&7自动产出金属奇点",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(3326737)
    );

    public static final SlimefunItemStack ONE_PER_TICK_EARTH_SINGULARITY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_EARTH_SINGULARITY",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&b地球(大地)奇点机(单刻)",
            "&7自动产出地球(大地)奇点",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(10019964)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MAGIC_SINGULARITY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MAGIC_SINGULARITY",
            Material.RED_GLAZED_TERRACOTTA,
            "&b魔法奇点机(单刻)",
            "&7自动产出魔法奇点",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(10019964)
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_INGOT = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_INGOT",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&b无尽锭机(单刻)",
            "&7自动产出无尽锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(53552939)
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_CIRCUIT = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_CIRCUIT",
            Material.WHITE_WOOL,
            "&b无尽晶格机(单刻)",
            "&7自动产出无尽晶格",
            "注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(451232016)
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_CORE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_CORE",
            Material.GRAY_WOOL,
            "&b无尽核心机(单刻)",
            "&7自动产出无尽电路",
            "注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(668265176)
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_GENERATOR_CORE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_GENERATOR_CORE",
            Material.NETHERITE_BLOCK,
            "&b无尽发电机组装机核心(整合次数:0)(单刻)",
            "&7自动产出无尽发电机(合成物品--不可直接使用)",
            "&c组装机核心每slimefun tick的功率达到了6,605,267,152J,无法在slimefun电网中工作",
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_GENERATOR_STEP1 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_STEP1",
            Material.NETHERITE_BLOCK,
            "&b无尽发电机组装机(整合次数:1)(单刻)",
            "&7自动产出无尽发电机(合成物品--不可直接使用)",
            "&c每slimefun tick的功率达到了3,889,267,152J,无法在slimefun电网中工作",
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_GENERATOR_STEP2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_STEP2",
            Material.NETHERITE_BLOCK,
            "&b无尽发电机组装机(整合次数:2)(单刻)",
            "&7自动产出无尽发电机",
            MachineLore.energyPerSecond(2100787152),
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_GENERATOR_STEP3 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_STEP3",
            Material.NETHERITE_BLOCK,
            "&b无尽发电机组装机(整合次数:2)(单刻)",
            "&7自动产出无尽发电机",
            MachineLore.energyPerSecond(1),
            "&7电力消耗为0会导致报错",
            ""
    );

    public static final SlimefunItemStack ONE_PER_TICK_INFINITY_GENERATOR_STEP4 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_INFINITY_STEP4",
            Material.NETHERITE_BLOCK,
            "&b无尽发电机组装机(整合次数:2)(单刻)",
            "&7自动产出无尽发电机",
            MachineLore.energyPerSecond(1),
            "&7电力消耗为0会导致报错",
            "&7(其实我想删掉,但是怕哪个人才能在我删掉之前光速做出来)"
    );

    public static final SlimefunItemStack ONE_PER_TICK_SMALL_HARDENED_METAL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SMALL_HARDENED_METAL",
            Material.CYAN_TERRACOTTA,
            "&b小硬化金属机(单刻)",
            "&7自动产出硬化金属(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(185465)
    );

    public static final SlimefunItemStack ONE_PER_TICK_REINFORCED_ALLOY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_REINFORCED_ALLOY",
            Material.CYAN_GLAZED_TERRACOTTA,
            "&b强化合金机(单刻)",
            "&7自动产出强化合金锭",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(309765 )//-255,639
    );

    public static final SlimefunItemStack ONE_PER_TICK_REINFORCED_ALLOY_2 = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_REINFORCED_ALLOY_2",
            Material.CYAN_GLAZED_TERRACOTTA,
            "&b强化合金机(单刻)",
            "&7自动产出强化合金锭",
            "取资源合成器方法功耗",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(309765)//-255,639
    );
    public static final SlimefunItemStack ONE_PER_TICK_SMALL_REINFORCED_ALLOY = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SMALL_REINFORCED_ALLOY",
            Material.CYAN_GLAZED_TERRACOTTA,
            "&b小强化合金机(单刻)",
            "&7自动产出强化合金锭(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(160593)//-127,819
    );

    public static final SlimefunItemStack ONE_PER_TICK_MAGSTEEL = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MAGSTEEL",
            Material.GRAY_CONCRETE,
            "&b磁钢机(单刻)",
            "&7自动产出磁钢锭",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2385)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MACHINE_CIRCUIT = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MACHINE_CIRCUIT",
            Material.GRAY_GLAZED_TERRACOTTA,
            "&b机器电路机(单刻)",
            "&7自动产出机器电路",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(146_622)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MAGPLATE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MAGPLATE",
            Material.PURPLE_GLAZED_TERRACOTTA,
            "&b磁钢板机(单刻)",
            "&7自动产出磁钢板",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(203115)
    );

    public static final SlimefunItemStack ONE_PER_TICK_TITANIUM = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_TITANIUM",
            Material.GRAY_CONCRETE,
            "&b钛机(单刻)",
            "&7自动产出钛",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(689276)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SMALL_TITANIUM = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SMALL_TITANIUM",
            Material.GRAY_CONCRETE,
            "&b小钛机(单刻)",
            "&7自动产出钛(合成物品--无法直接使用)",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(468167)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MACHINE_CORE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MACHINE_CORE",
            Material.GRAY_CONCRETE,
            "&b机器核心机(单刻)",
            "&7自动产出机器核心",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(2_662_273)
    );

    public static final SlimefunItemStack ONE_PER_TICK_E_CONNECTOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_E_CONNECTOR",
            Material.YELLOW_WOOL,
            "&b能源连接器组装机(单刻)",
            "&7自动产出能源连接器(合成材料--不可直接使用)",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(28887)
    );

    public static final SlimefunItemStack ONE_PER_TICK_SMALL_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_SMALL_CAPACITOR",
            Material.ORANGE_WOOL,
            "&b小型电容组装机(单刻)",
            "&7自动产出小型电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(658182)
    );

    public static final SlimefunItemStack ONE_PER_TICK_MEDIUM_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_MEDIUM_CAPACITOR",
            Material.PINK_WOOL,
            "&b中型电容组装机(单刻)",
            "&7自动产出中型电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1203102)
    );

    public static final SlimefunItemStack ONE_PER_TICK_BIG_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_BIG_CAPACITOR",
            Material.PURPLE_WOOL,
            "&b大型电容组装机(单刻)",
            "&7自动产出大型电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1749932)
    );

    public static final SlimefunItemStack ONE_PER_TICK_LARGE_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_LARGE_CAPACITOR",
            Material.BLUE_WOOL,
            "&b巨型电容组装机(单刻)",
            "&7自动产出巨型电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(3444690)
    );

    public static final SlimefunItemStack ONE_PER_TICK_CARBONADO_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_CARBONADO_CAPACITOR",
            Material.LIGHT_BLUE_WOOL,
            "&b黑钻电容组装机(单刻)",
            "&7自动产出黑钻电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(6798300)
    );

    public static final SlimefunItemStack ONE_PER_TICK_ENERGIZED_CAPACITOR = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_ENERGIZED_CAPACITOR",
            Material.LIME_WOOL,
            "&b充能电容组装机(单刻)",
            "&7自动产出充能电容",
            "&7注意防火",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(19040880)
    );

    public static final SlimefunItemStack ONE_PER_TICK_STICK = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_STICK",
            Material.OAK_WOOD,
            "&b木棍机(单刻)",
            "&7自动产出木棍",
            "&7注意防火",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(900)
    );

    public static final SlimefunItemStack ONE_PER_TICK_IRON_PICKAXE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_IRON_PICKAXE",
            Material.IRON_BLOCK,
            "&b铁镐组装机(单刻)",
            "&7自动产出铁镐",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(3225)
    );

    public static final SlimefunItemStack ONE_PER_TICK_DIAMOND_PICKAXE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_DIAMOND_PICKAXE",
            Material.DIAMOND_BLOCK,
            "&b钻石镐组装机(单刻)",
            "&7自动产出钻石镐",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(18675)
    );

    public static final SlimefunItemStack ONE_PER_TICK_NETHERITE_PICKAXE = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_NETHERITE_PICKAXE",
            Material.NETHERITE_BLOCK,
            "&b下界合金镐组装机(单刻)",
            "&7自动产出下界合金镐",
            "",
            MachineLore.speed(2),
            MachineLore.energyPerSecond(41925)
    );

    public static final SlimefunItemStack ONE_PER_TICK_OIL_PUMP = new SlimefunItemStack(
            "INFCP_ONE_PER_TICK_OIL_PUMP",
            Material.PURPLE_CONCRETE,
            "&b石油泵组装机(单刻)",
            "&7自动产出石油泵",
            "",
            MachineLore.speed(1),
            MachineLore.energyPerSecond(1209772)
    );

    public static void setup(InfinityCompress plugin){
        new AutoInfinityWorkbench(
                BASIC_MACHINES,
                AutoInfinityWorkbench,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        MACHINE_CIRCUIT, CRAFTING_MOTOR, MACHINE_CIRCUIT,
                        MACHINE_CIRCUIT, INFINITY_FORGE, MACHINE_CIRCUIT,
                        MACHINE_CIRCUIT, MACHINE_CORE, MACHINE_CIRCUIT,
                }
        ).register(plugin);

        new newInfinityWorkbench(BASIC_MACHINES,
                NEW_INFINITY_FORGE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        INFINITY_FORGE,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                        new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                        new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
                },
                10000000).register(plugin);
        new UnplaceableBlock(BASIC_MACHINES,AutoInfinityWorkbench2,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        MACHINE_CIRCUIT, CRAFTING_MOTOR, MACHINE_CIRCUIT,
                        MACHINE_CIRCUIT, NEW_INFINITY_FORGE, MACHINE_CIRCUIT,
                        MACHINE_CIRCUIT, MACHINE_CORE, MACHINE_CIRCUIT,
                }, new SlimefunItemStack(AutoInfinityWorkbench, 1)).register(plugin);

        //玻璃厂

        new MaterialGenerator(Groups.BASIC_MACHINES, BASIC_GLASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                STONEWORKS_FACTORY, STONEWORKS_FACTORY, STONEWORKS_FACTORY,
                new ItemStack(Material.AIR), new ItemStack(Material.GLASS), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), Materials.MACHINE_CIRCUIT, new ItemStack(Material.AIR)
        }).material(Material.GLASS).speed(1).energyPerTick(1440).register(plugin);

        new MaterialGenerator(Groups.ADVANCED_MACHINES, ADVANCED_GLASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                BASIC_GLASS, BASIC_GLASS, BASIC_GLASS,
                BASIC_GLASS, Materials.MACHINE_CIRCUIT, BASIC_GLASS,
                BASIC_GLASS, BASIC_GLASS, BASIC_GLASS
        }).material(Material.GLASS).speed(8).energyPerTick(11520).register(plugin);

        new MaterialGenerator(Groups.ADVANCED_MACHINES, INFINITY_GLASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                ADVANCED_GLASS, ADVANCED_GLASS, ADVANCED_GLASS,
                ADVANCED_GLASS, Materials.MACHINE_CIRCUIT, ADVANCED_GLASS,
                ADVANCED_GLASS, ADVANCED_GLASS, ADVANCED_GLASS
        }).material(Material.GLASS).speed(64).energyPerTick(92160).register(plugin);

        //矿机(合成材料)
        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_QUARTZ, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, QUARTZ_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_QUARTZ, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_COAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, COAL_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_COAL, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_IRON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_INGOT_FORMER, IRON_SINGULARITY, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_IRON, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_GOLD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, GOLD_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_GOLD, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_DIAMOND, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, DIAMOND_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_DIAMOND, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_LAPIS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, LAPIS_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_LAPIS, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_REDSTONE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, REDSTONE_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_REDSTONE, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_EMERALD, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, EMERALD_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_EMERALD, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_NETHERITE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, NETHERITE_SINGULARITY, INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_NETHERITE, 32)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_NETHERRACK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                INFINITY_QUARRY, new ItemStack(Material.NETHERRACK), INFINITY_QUARRY,
                INFINITY_QUARRY, Materials.MACHINE_CIRCUIT, INFINITY_QUARRY,
                new ItemStack(Material.AIR), INFINITY_QUARRY, new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_NETHERRACK, 16)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_MG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), MAGNESIUM_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_MG, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_SN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), TIN_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_SN, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_ZN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), ZINC_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_ZN, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_CU, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), COPPER_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_CU, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_AU, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), GOLD_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_AU, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_AG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), SILVER_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_AG, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_AL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), ALUMINUM_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_AL, 64)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_QUARRY_PB, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), LEAD_SINGULARITY, new ItemStack(Material.AIR),
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER,
                INFINITY_COBBLE, INFINITY_DUST_EXTRACTOR, INFINITY_INGOT_FORMER
        }, new SlimefunItemStack(ONE_PER_TICK_QUARRY_PB, 64)).register(plugin);
        //矿机,结束

        //矿机奇点
        new Singularity(ONE_PER_TICK_COPPER_SINGULARITY, ONE_PER_TICK_QUARRY_CU, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_ZINC_SINGULARITY, ONE_PER_TICK_QUARRY_ZN, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_TIN_SINGULARITY, ONE_PER_TICK_QUARRY_SN, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_ALUMINUM_SINGULARITY, ONE_PER_TICK_QUARRY_AL, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_SILVER_SINGULARITY, ONE_PER_TICK_QUARRY_AG, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_MAGNESIUM_SINGULARITY, ONE_PER_TICK_QUARRY_MG, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_LEAD_SINGULARITY, ONE_PER_TICK_QUARRY_PB, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_GOLD_SINGULARITY, ONE_PER_TICK_QUARRY_AU, 1000).register(plugin);
        new Singularity(ONE_PER_TICK_IRON_SINGULARITY, ONE_PER_TICK_QUARRY_IRON, 1000).register(plugin);
        new Singularity(ONE_PER_TICK_DIAMOND_SINGULARITY, ONE_PER_TICK_QUARRY_DIAMOND, 500).register(plugin);
        new Singularity(ONE_PER_TICK_EMERALD_SINGULARITY, ONE_PER_TICK_QUARRY_EMERALD, 500).register(plugin);
        new Singularity(ONE_PER_TICK_NETHERITE_SINGULARITY, ONE_PER_TICK_QUARRY_NETHERITE, 200).register(plugin);
        new Singularity(ONE_PER_TICK_COAL_SINGULARITY, ONE_PER_TICK_QUARRY_COAL, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_REDSTONE_SINGULARITY, ONE_PER_TICK_QUARRY_REDSTONE, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_LAPIS_SINGULARITY, ONE_PER_TICK_QUARRY_LAPIS, 1500).register(plugin);
        new Singularity(ONE_PER_TICK_QUARTZ_SINGULARITY, ONE_PER_TICK_QUARRY_QUARTZ, 1500).register(plugin);
        new Singularity2(ONE_PER_TICK_VOIDDUST_2, INFINITE_VOID_HARVESTER, 144, new SlimefunItemStack(ONE_PER_TICK_VOIDDUST, 1)).register(plugin);
        //矿机奇点 结束

        //奇点矿机

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_COPPER_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COPPER_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(COPPER_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_MAGNESIUM_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGNESIUM_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MAGNESIUM_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_TIN_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_TIN_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(TIN_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_ZINC_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_ZINC_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ZINC_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_SILVER_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SILVER_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(SILVER_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_LEAD_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_LEAD_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(LEAD_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_ALUMINUM_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_ALUMINUM_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ALUMINUM_SINGULARITY).speed(1).energyPerTick(712500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_IRON_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(IRON_SINGULARITY).speed(1).energyPerTick(475000).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_GOLD_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_GOLD_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(GOLD_SINGULARITY).speed(1).energyPerTick(475000).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_DIAMOND_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_DIAMOND_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(DIAMOND_SINGULARITY).speed(1).energyPerTick(2812500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_EMERALD_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_EMERALD_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(EMERALD_SINGULARITY).speed(1).energyPerTick(2812500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_NETHERITE_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_NETHERITE_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(NETHERITE_SINGULARITY).speed(1).energyPerTick(1125000).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_REDSTONE_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(REDSTONE_SINGULARITY).speed(1).energyPerTick(8437500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_LAPIS_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_LAPIS_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(LAPIS_SINGULARITY).speed(1).energyPerTick(8437500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_QUARTZ_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARTZ_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(QUARTZ_SINGULARITY).speed(1).energyPerTick(8437500).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_COAL_SINGULARITY_ACTIVATED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COAL_SINGULARITY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(COAL_SINGULARITY).speed(1).energyPerTick(8437500).register(plugin);
        //奇点矿机 结束

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_AU24K, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_AU,ONE_PER_TICK_QUARRY_AU,ONE_PER_TICK_QUARRY_AU,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                ONE_PER_TICK_QUARRY_AU,ONE_PER_TICK_QUARRY_AU,ONE_PER_TICK_QUARRY_AU
        }).material(GOLD_24K).speed(1).energyPerTick(475*6).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_URANIUM, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                URANIUM_EXTRACTOR,URANIUM_EXTRACTOR,URANIUM_EXTRACTOR,
                URANIUM_EXTRACTOR,INFINITY_COBBLE,URANIUM_EXTRACTOR,
                URANIUM_EXTRACTOR,URANIUM_EXTRACTOR,URANIUM_EXTRACTOR
        }).material(URANIUM).speed(2).energyPerTick(3_520).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_URANIUM_SMALL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                ONE_PER_TICK_URANIUM, new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_URANIUM_SMALL, 2)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_NETHERSTAR_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                CHAMBER, WITHER, CHAMBER,
                WITHER, new ItemStack(Material.AIR), WITHER,
                CHAMBER, WITHER, CHAMBER
        }, new SlimefunItemStack(ONE_PER_TICK_NETHERSTAR_PART, 1)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_VOIDDUST_PART, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                CHAMBER, ENDER_DRAGON, CHAMBER,
                ENDER_DRAGON, new ItemStack(Material.AIR), ENDER_DRAGON,
                CHAMBER, ENDER_DRAGON,CHAMBER
        }, new SlimefunItemStack(ONE_PER_TICK_VOIDDUST_PART, 1)).register(plugin);

        new MaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_NETHERSTAR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_NETHERSTAR_PART,new ItemStack(Material.AIR),ONE_PER_TICK_NETHERSTAR_PART,
                new ItemStack(Material.AIR),ONE_PER_TICK_NETHERSTAR_PART,new ItemStack(Material.AIR),
                ONE_PER_TICK_NETHERSTAR_PART,new ItemStack(Material.AIR),ONE_PER_TICK_NETHERSTAR_PART
        }).material(Material.NETHER_STAR).speed(1).energyPerTick(90000).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_VOIDDUST, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_VOIDDUST_PART,new ItemStack(Material.AIR),ONE_PER_TICK_VOIDDUST_PART,
                new ItemStack(Material.AIR),ONE_PER_TICK_VOIDDUST_PART,new ItemStack(Material.AIR),
                ONE_PER_TICK_VOIDDUST_PART,new ItemStack(Material.AIR),ONE_PER_TICK_VOIDDUST_PART
        }).material(VOID_DUST).speed(1).energyPerTick(9000*20).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_VOIDINGOT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_VOIDDUST,ONE_PER_TICK_VOIDDUST,ONE_PER_TICK_VOIDDUST,
                ONE_PER_TICK_VOIDDUST,ONE_PER_TICK_VOIDDUST,ONE_PER_TICK_VOIDDUST,
                ONE_PER_TICK_VOIDDUST,ONE_PER_TICK_VOIDDUST,ONE_PER_TICK_VOIDDUST
        }).material(VOID_INGOT).speed(1).energyPerTick(9000*20*9).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_ENDER_ESSENCE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_VOIDDUST,new ItemStack(Material.AIR),ONE_PER_TICK_VOIDDUST,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                ONE_PER_TICK_VOIDDUST,new ItemStack(Material.AIR),ONE_PER_TICK_VOIDDUST
        }).material(ENDER_ESSENCE).speed(1).energyPerTick(9000*204).register(plugin);

        //carbonado
        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_CARBON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_COAL,ONE_PER_TICK_QUARRY_COAL,ONE_PER_TICK_QUARRY_COAL,
                ONE_PER_TICK_QUARRY_COAL,CARBON_PRESS_3,ONE_PER_TICK_QUARRY_COAL,
                ONE_PER_TICK_QUARRY_COAL,ONE_PER_TICK_QUARRY_COAL,ONE_PER_TICK_QUARRY_COAL
        }).material(CARBON).speed(1).energyPerTick(45000).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_COMPRESS_CARBON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CARBON,ONE_PER_TICK_CARBON,new ItemStack(Material.AIR),
                ONE_PER_TICK_CARBON,ONE_PER_TICK_CARBON,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(COMPRESSED_CARBON).speed(1).energyPerTick(180_000).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_CARBON_CHUNK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COMPRESS_CARBON,ONE_PER_TICK_COMPRESS_CARBON,ONE_PER_TICK_COMPRESS_CARBON,
                ONE_PER_TICK_COMPRESS_CARBON,STONEWORKS_FACTORY,ONE_PER_TICK_COMPRESS_CARBON,
                ONE_PER_TICK_COMPRESS_CARBON,ONE_PER_TICK_COMPRESS_CARBON,ONE_PER_TICK_COMPRESS_CARBON
        }).material(CARBON_CHUNK).speed(1).energyPerTick(1_440_450).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SYNTHETIC_DIAMOND, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CARBON_CHUNK,CARBON_PRESS_3,CARBON_PRESS_3,
                CARBON_PRESS_3,CARBON_PRESS_3,CARBON_PRESS_3,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
        }).material(SYNTHETIC_DIAMOND).speed(1).energyPerTick(1_441_350).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_RAW_CARBONADO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CARBON_CHUNK,STONEWORKS_FACTORY,ONE_PER_TICK_SYNTHETIC_DIAMOND,
                new ItemStack(Material.AIR),ADVANCED_SMELTERY,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
        }).material(RAW_CARBONADO).speed(1).energyPerTick(2_882_280).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_CARBONADO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                CARBON_PRESS_3,ONE_PER_TICK_RAW_CARBONADO,CARBON_PRESS_3,
                CARBON_PRESS_3,CARBON_PRESS_3,CARBON_PRESS_3,
        }).material(CARBONADO).speed(1).energyPerTick(703125).register(plugin);
//carbonado end

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_BLISTERING_INGOT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                HEATED_PRESSURE_CHAMBER_2,HEATED_PRESSURE_CHAMBER_2,HEATED_PRESSURE_CHAMBER_2,
                ONE_PER_TICK_URANIUM_SMALL,ONE_PER_TICK_CARBONADO,ONE_PER_TICK_NETHERSTAR,
                HEATED_PRESSURE_CHAMBER_2,HEATED_PRESSURE_CHAMBER_2,HEATED_PRESSURE_CHAMBER_2
        }).material(BLISTERING_INGOT_3).speed(1).energyPerTick(267969).register(plugin);


        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_SILCON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_QUARTZ,ADVANCED_SMELTERY,ONE_PER_TICK_QUARRY_QUARTZ,
                ONE_PER_TICK_QUARRY_QUARTZ,CRAFTING_MOTOR,ONE_PER_TICK_QUARRY_QUARTZ,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(SILICON).speed(1).energyPerTick(22740).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_NI, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_IRON,ADVANCED_SMELTERY,ONE_PER_TICK_QUARRY_IRON,
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_CU,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ADVANCED_SMELTERY,new ItemStack(Material.AIR)
        }).material(NICKEL_INGOT).speed(2).energyPerTick(1905).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_CO, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_IRON,new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_IRON,
                ADVANCED_SMELTERY,ONE_PER_TICK_QUARRY_CU,ADVANCED_SMELTERY,
                ADVANCED_SMELTERY,ONE_PER_TICK_NI,ADVANCED_SMELTERY
        }).material(COBALT_INGOT).speed(2).energyPerTick(3810).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_MAGNET, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_IRON,ADVANCED_SMELTERY,ONE_PER_TICK_QUARRY_AL,
                ONE_PER_TICK_NI,ADVANCED_SMELTERY,ONE_PER_TICK_CO,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MAGNET).speed(2).energyPerTick(7145).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_MAGNET_SMALL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGNET,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_MAGNET_SMALL, 2)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_S, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_NETHERRACK,ONE_PER_TICK_QUARRY_NETHERRACK,ONE_PER_TICK_QUARRY_NETHERRACK,
                ONE_PER_TICK_QUARRY_NETHERRACK,DUST_EXTRACTOR,ONE_PER_TICK_QUARRY_NETHERRACK,
                ONE_PER_TICK_QUARRY_NETHERRACK,ONE_PER_TICK_QUARRY_NETHERRACK,ONE_PER_TICK_QUARRY_NETHERRACK},
                new SlimefunItemStack(ONE_PER_TICK_S, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_BATTERY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_S,ONE_PER_TICK_QUARRY_ZN,
                new ItemStack(Material.AIR),ONE_PER_TICK_S,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_REDSTONE,new ItemStack(Material.AIR)
        }).material(BATTERY).speed(2).energyPerTick(186575).register(plugin);
        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_BATTERY_SMALL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_BATTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_BATTERY_SMALL, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_ELECMAG, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CO,            ONE_PER_TICK_MAGNET,    ONE_PER_TICK_NI,
                new ItemStack(Material.AIR),ONE_PER_TICK_BATTERY,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ELECTRO_MAGNET).speed(2).energyPerTick(199435).register(plugin);
        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_ELECMAG_SMALL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_ELECMAG,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_ELECMAG_SMALL, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_ELECMOTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),ONE_PER_TICK_ELECMAG_SMALL,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_CU,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ELECTRIC_MOTOR).speed(1).energyPerTick(38365).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_SIIRON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),ONE_PER_TICK_SILCON,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_IRON,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(FERROSILICON).speed(1).energyPerTick(23215).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_PANEL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                BASIC_GLASS,BASIC_GLASS,BASIC_GLASS,
                ONE_PER_TICK_SILCON,ONE_PER_TICK_SILCON,ONE_PER_TICK_SILCON,
                ONE_PER_TICK_SIIRON,ONE_PER_TICK_SIIRON,ONE_PER_TICK_SIIRON
        }).material(SOLAR_PANEL).speed(1).energyPerTick(142_185).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MACHINE_CIRCUIT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_CU,
                ONE_PER_TICK_SILCON,ONE_PER_TICK_ELECMAG,ONE_PER_TICK_SILCON,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MACHINE_CIRCUIT).speed(1).energyPerTick(146_622).register(plugin);
//sf solar generator
        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_GENERATOR_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),ONE_PER_TICK_SOLAR_PANEL,new ItemStack(Material.AIR),
                ONE_PER_TICK_SOLAR_PANEL,ONE_PER_TICK_ELECMOTOR,ONE_PER_TICK_SOLAR_PANEL,
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_AL,new ItemStack(Material.AIR)
        }).material(SOLAR_GENERATOR).speed(1).energyPerTick(465395).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_GENERATOR_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SOLAR_GENERATOR_1,new ItemStack(Material.AIR),ONE_PER_TICK_SOLAR_GENERATOR_1,
                ONE_PER_TICK_QUARRY_AL,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_AL,
                ONE_PER_TICK_SOLAR_GENERATOR_1,new ItemStack(Material.AIR),ONE_PER_TICK_SOLAR_GENERATOR_1
        }).material(SOLAR_GENERATOR_2).speed(1).energyPerTick(1868155).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_GENERATOR_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SOLAR_GENERATOR_2,new ItemStack(Material.AIR),ONE_PER_TICK_SOLAR_GENERATOR_2,
                ONE_PER_TICK_QUARRY_AL,ONE_PER_TICK_CARBONADO,ONE_PER_TICK_QUARRY_AL,
                ONE_PER_TICK_SOLAR_GENERATOR_2,new ItemStack(Material.AIR),ONE_PER_TICK_SOLAR_GENERATOR_2
        }).material(SOLAR_GENERATOR_3).speed(1).energyPerTick(8176695).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_GENERATOR_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SOLAR_GENERATOR_3,ONE_PER_TICK_BLISTERING_INGOT,ONE_PER_TICK_SOLAR_GENERATOR_3,
                ONE_PER_TICK_BLISTERING_INGOT,ONE_PER_TICK_ELECMAG_SMALL,ONE_PER_TICK_BLISTERING_INGOT,
                ONE_PER_TICK_SOLAR_GENERATOR_3,ONE_PER_TICK_BLISTERING_INGOT,ONE_PER_TICK_SOLAR_GENERATOR_3
        }).material(SOLAR_GENERATOR_4).speed(1).energyPerTick(42536766).register(plugin);
//sf solar generator end

//        compresssed cobble
        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_COMPRESSED_COBBLE_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                BASIC_COBBLE,BASIC_COBBLE,BASIC_COBBLE,
                BASIC_COBBLE,BASIC_COBBLE,BASIC_COBBLE,
                BASIC_COBBLE,BASIC_COBBLE,BASIC_COBBLE
        }).material(COBBLE_1).speed(1).energyPerTick(216).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_COMPRESSED_COBBLE_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COMPRESSED_COBBLE_1,ONE_PER_TICK_COMPRESSED_COBBLE_1,ONE_PER_TICK_COMPRESSED_COBBLE_1,
                ONE_PER_TICK_COMPRESSED_COBBLE_1,ONE_PER_TICK_COMPRESSED_COBBLE_1,ONE_PER_TICK_COMPRESSED_COBBLE_1,
                ONE_PER_TICK_COMPRESSED_COBBLE_1,ONE_PER_TICK_COMPRESSED_COBBLE_1,ONE_PER_TICK_COMPRESSED_COBBLE_1
        }).material(COBBLE_2).speed(1).energyPerTick(1944).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_COMPRESSED_COBBLE_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COMPRESSED_COBBLE_2,ONE_PER_TICK_COMPRESSED_COBBLE_2,ONE_PER_TICK_COMPRESSED_COBBLE_2,
                ONE_PER_TICK_COMPRESSED_COBBLE_2,ONE_PER_TICK_COMPRESSED_COBBLE_2,ONE_PER_TICK_COMPRESSED_COBBLE_2,
                ONE_PER_TICK_COMPRESSED_COBBLE_2,ONE_PER_TICK_COMPRESSED_COBBLE_2,ONE_PER_TICK_COMPRESSED_COBBLE_2
        }).material(COBBLE_3).speed(1).energyPerTick(17496).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_COMPRESSED_COBBLE_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COMPRESSED_COBBLE_3,ONE_PER_TICK_COMPRESSED_COBBLE_3,ONE_PER_TICK_COMPRESSED_COBBLE_3,
                ONE_PER_TICK_COMPRESSED_COBBLE_3,ONE_PER_TICK_COMPRESSED_COBBLE_3,ONE_PER_TICK_COMPRESSED_COBBLE_3,
                ONE_PER_TICK_COMPRESSED_COBBLE_3,ONE_PER_TICK_COMPRESSED_COBBLE_3,ONE_PER_TICK_COMPRESSED_COBBLE_3
        }).material(COBBLE_4).speed(1).energyPerTick(157464).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_COMPRESSED_COBBLE_5, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COMPRESSED_COBBLE_4,ONE_PER_TICK_COMPRESSED_COBBLE_4,ONE_PER_TICK_COMPRESSED_COBBLE_4,
                ONE_PER_TICK_COMPRESSED_COBBLE_4,ONE_PER_TICK_COMPRESSED_COBBLE_4,ONE_PER_TICK_COMPRESSED_COBBLE_4,
                ONE_PER_TICK_COMPRESSED_COBBLE_4,ONE_PER_TICK_COMPRESSED_COBBLE_4,ONE_PER_TICK_COMPRESSED_COBBLE_4
        }).material(COBBLE_5).speed(1).energyPerTick(1417176).register(plugin);
//        compressed cobble end

//        alloys
        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_STEEL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_IRON,ADVANCED_SMELTERY,ONE_PER_TICK_CARBON,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(STEEL_INGOT).speed(1).energyPerTick(1430).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MAGSTEEL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_MG,ADVANCED_SMELTERY,ONE_PER_TICK_STEEL,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MAGSTEEL).speed(1).energyPerTick(2385).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_DAMASCUS_STEEL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_IRON,ADVANCED_SMELTERY,ONE_PER_TICK_CARBON,
                new ItemStack(Material.AIR),ONE_PER_TICK_STEEL,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(DAMASCUS_STEEL_INGOT).speed(1).energyPerTick(2860).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLDER_INGOT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_PB,ONE_PER_TICK_QUARRY_PB,ONE_PER_TICK_QUARRY_SN,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(SOLDER_INGOT).speed(2).energyPerTick(1905).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_BRONZE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_SN,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(BRONZE_INGOT).speed(2).energyPerTick(1905).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_CORBRONZE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_AG,ONE_PER_TICK_QUARRY_AU,
                ONE_PER_TICK_BRONZE,ADVANCED_SMELTERY,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(CORINTHIAN_BRONZE_INGOT).speed(2).energyPerTick(3300).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_AL_BRONZE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_BRONZE,ONE_PER_TICK_QUARRY_AL,ONE_PER_TICK_QUARRY_AL,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ALUMINUM_BRONZE_INGOT).speed(2).energyPerTick(2825).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_BRASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_ZN,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(BRASS_INGOT).speed(2).energyPerTick(1905).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_AL_BRASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_BRASS,ONE_PER_TICK_QUARRY_AL,ONE_PER_TICK_QUARRY_AL,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ALUMINUM_BRASS_INGOT).speed(2).energyPerTick(2825).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_BILLON, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_AG,ONE_PER_TICK_QUARRY_AG,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(BILLON_INGOT).speed(2).energyPerTick(1905).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_DURALMIN, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_QUARRY_AL,ONE_PER_TICK_QUARRY_AL,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(DURALUMIN_INGOT).speed(2).energyPerTick(1905).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_SMALL_BRONZE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_BRONZE,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_SMALL_BRONZE, 2)).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_SMALL_BRASS, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_BRASS,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_SMALL_BRASS, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_HARDENED_METAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_DAMASCUS_STEEL,ONE_PER_TICK_DURALMIN,ONE_PER_TICK_AL_BRONZE,
                ADVANCED_SMELTERY,ONE_PER_TICK_COMPRESS_CARBON,ONE_PER_TICK_COMPRESS_CARBON,
                ONE_PER_TICK_DAMASCUS_STEEL,new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(HARDENED_METAL_INGOT).speed(2).energyPerTick(370930).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_SMALL_HARDENED_METAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_HARDENED_METAL,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_SMALL_HARDENED_METAL, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_REINFORCED_ALLOY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_DAMASCUS_STEEL,ONE_PER_TICK_BILLON,ONE_PER_TICK_AU24K,
                ADVANCED_SMELTERY,ONE_PER_TICK_SOLDER_INGOT,ONE_PER_TICK_HARDENED_METAL,
                ONE_PER_TICK_CORBRONZE,ONE_PER_TICK_AU24K,ONE_PER_TICK_DAMASCUS_STEEL
        }).material(REINFORCED_ALLOY_INGOT).speed(2).energyPerTick(309765).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_SMALL_REINFORCED_ALLOY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_REINFORCED_ALLOY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_SMALL_REINFORCED_ALLOY, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MAGPLATE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_MAGSTEEL,
                ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_SMALL_HARDENED_METAL,ONE_PER_TICK_MAGSTEEL,
                ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_MAGSTEEL
        }).material(MAGSTEEL_PLATE).speed(1).energyPerTick(204545).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_TITANIUM, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_REINFORCED_ALLOY,ONE_PER_TICK_DAMASCUS_STEEL,ONE_PER_TICK_HARDENED_METAL,
                ADVANCED_SMELTERY,ONE_PER_TICK_DAMASCUS_STEEL,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(TITANIUM).speed(2).energyPerTick(689276).register(plugin);

        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_SMALL_TITANIUM, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_TITANIUM,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)},
                new SlimefunItemStack(ONE_PER_TICK_SMALL_TITANIUM, 2)).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MACHINE_CORE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_TITANIUM,ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_HARDENED_METAL,
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MAGPLATE,ONE_PER_TICK_MACHINE_CIRCUIT,
                new ItemStack(Material.AIR),ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_TITANIUM
        }).material(MACHINE_CORE).speed(1).energyPerTick(2672283).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_BASIC, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_MAGPLATE,ONE_PER_TICK_MAGSTEEL,
                ONE_PER_TICK_SOLAR_PANEL,ONE_PER_TICK_SOLAR_PANEL,ONE_PER_TICK_SOLAR_PANEL,
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CIRCUIT
        }).material(BASIC_PANEL).speed(1).energyPerTick(1075736).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_ADVANCED, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SOLAR_BASIC,ONE_PER_TICK_SOLAR_BASIC,ONE_PER_TICK_SOLAR_BASIC,
                ONE_PER_TICK_TITANIUM,ONE_PER_TICK_SOLAR_GENERATOR_4,new ItemStack(Material.AIR),
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CIRCUIT
        }).material(ADVANCED_PANEL).speed(1).energyPerTick(38424245).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_SOLAR_CELESTIAL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGPLATE,ONE_PER_TICK_MAGPLATE,ONE_PER_TICK_MAGPLATE,
                ONE_PER_TICK_SOLAR_ADVANCED,ONE_PER_TICK_SOLAR_ADVANCED,ONE_PER_TICK_SOLAR_ADVANCED,
                ONE_PER_TICK_MACHINE_CIRCUIT,ONE_PER_TICK_MACHINE_CORE,ONE_PER_TICK_MACHINE_CIRCUIT
        }).material(CELESTIAL_PANEL).speed(1).energyPerTick(118860477).register(plugin);


        new EnergyGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, INFINITY_INFINITE_PANEL, InfinityWorkbench.TYPE, new ItemStack[] {
                INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL,
                INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL,
                INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL,
                INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL,
                INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL,
                INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL, INFINITE_PANEL,
        }, 2160000, GenerationType.INFINITY).register(plugin);

        new MaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_QUARRY_REDSTONE_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_REDSTONE,
                ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_REDSTONE,
                ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_QUARRY_REDSTONE
        }).material(Material.REDSTONE_BLOCK).speed(1).energyPerTick(50625).register(plugin);


        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_REDALLOY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SMALL_HARDENED_METAL,ONE_PER_TICK_SIIRON,ONE_PER_TICK_QUARRY_REDSTONE,
                ADVANCED_SMELTERY,ONE_PER_TICK_QUARRY_REDSTONE_BLOCK,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(REDSTONE_ALLOY).speed(1).energyPerTick(264930).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_ADAMANTITE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_DIAMOND_SINGULARITY_ACTIVATED,ONE_PER_TICK_MAGSTEEL,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(ADAMANTITE).speed(1).energyPerTick(3079815).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MAGNONIUM, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGNESIUM_SINGULARITY_ACTIVATED,ONE_PER_TICK_MAGSTEEL,ONE_PER_TICK_ENDER_ESSENCE,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MAGNONIUM).speed(1).energyPerTick(1434885).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MYTHRIL, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED,ONE_PER_TICK_SMALL_REINFORCED_ALLOY,ONE_PER_TICK_SMALL_HARDENED_METAL,
                ADVANCED_SMELTERY,new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MYTHRIL).speed(1).energyPerTick(821058).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_FORTUNE_SINGULARITY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_ADAMANTITE,ONE_PER_TICK_DIAMOND_SINGULARITY_ACTIVATED,ONE_PER_TICK_EMERALD_SINGULARITY_ACTIVATED,
                ADVANCED_SMELTERY,ONE_PER_TICK_GOLD_SINGULARITY_ACTIVATED,ONE_PER_TICK_NETHERITE_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(FORTUNE_SINGULARITY).speed(1).energyPerTick(10304815).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_METAL_SINGULARITY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_ALUMINUM_SINGULARITY_ACTIVATED,ONE_PER_TICK_SILVER_SINGULARITY_ACTIVATED,ONE_PER_TICK_TIN_SINGULARITY_ACTIVATED,
                ADVANCED_SMELTERY,ONE_PER_TICK_ZINC_SINGULARITY_ACTIVATED,ONE_PER_TICK_SMALL_TITANIUM,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(METAL_SINGULARITY).speed(1).energyPerTick(3326737).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_EARTH_SINGULARITY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_COAL_SINGULARITY_ACTIVATED,ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED,ONE_PER_TICK_LEAD_SINGULARITY_ACTIVATED,
                ADVANCED_SMELTERY,ONE_PER_TICK_COPPER_SINGULARITY_ACTIVATED,ONE_PER_TICK_COMPRESSED_COBBLE_4,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(EARTH_SINGULARITY).speed(1).energyPerTick(10019964).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_MAGIC_SINGULARITY, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_MAGNESIUM_SINGULARITY_ACTIVATED,ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED,ONE_PER_TICK_LAPIS_SINGULARITY_ACTIVATED,
                ADVANCED_SMELTERY,ONE_PER_TICK_QUARTZ_SINGULARITY_ACTIVATED,ONE_PER_TICK_MAGNONIUM,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }).material(MAGIC_SINGULARITY).speed(1).energyPerTick(27459885).register(plugin);

        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_INFINITY_INGOT, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_EARTH_SINGULARITY,ONE_PER_TICK_MYTHRIL,ONE_PER_TICK_FORTUNE_SINGULARITY,
                ONE_PER_TICK_MAGIC_SINGULARITY,ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_METAL_SINGULARITY,
                new ItemStack(Material.AIR),ADVANCED_SMELTERY,new ItemStack(Material.AIR)
        }).material(INFINITE_INGOT).speed(1).energyPerTick(53552939).register(plugin);
//        alloys end
//        void&... generator
        new TweakedMaterialGenerator(Groups.ADVANCED_MACHINES, ONE_PER_TICK_VOID_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_VOIDINGOT,ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,
                ONE_PER_TICK_MAGNONIUM,ONE_PER_TICK_MAGNONIUM,ONE_PER_TICK_MAGNONIUM
        }).material(VOID_PANEL).speed(1).energyPerTick(480251001).register(plugin);

        new TweakedGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, INFINITY_INFINITY_INFINITE_PANEL, InfinityWorkbench.TYPE, new ItemStack[] {
                INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL,
                INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL,
                INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL,
                INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL,
                INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL,
                INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL, INFINITY_INFINITE_PANEL,
        }, 77760000, io.github.acdeasdff.infinityCompress.items.blocks.GenerationType.INFINITY)
        .register(plugin);

        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_CIRCUIT, InfinityWorkbench.TYPE, new ItemStack[] {
                ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT,
                ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_VOIDINGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_VOIDINGOT,
                ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT,
        }).material(INFINITE_CIRCUIT).speed(1).energyPerTick(450209464).register(plugin);

        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_CORE, InfinityWorkbench.TYPE, new ItemStack[] {
                ONE_PER_TICK_MAGPLATE, ONE_PER_TICK_MACHINE_CORE, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CORE, ONE_PER_TICK_MAGPLATE,
                ONE_PER_TICK_MACHINE_CORE, ONE_PER_TICK_MAGPLATE, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MAGPLATE, ONE_PER_TICK_MACHINE_CORE,
                ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_MACHINE_CORE, ONE_PER_TICK_MAGPLATE, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MACHINE_CIRCUIT, ONE_PER_TICK_MAGPLATE, ONE_PER_TICK_MACHINE_CORE,
                ONE_PER_TICK_MAGPLATE, ONE_PER_TICK_MACHINE_CORE, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_INFINITY_INGOT, ONE_PER_TICK_MACHINE_CORE, ONE_PER_TICK_MAGPLATE
        }).material(INFINITE_CIRCUIT).speed(1).energyPerTick(666731348).register(plugin);

        new UnplaceableBlock(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_GENERATOR_CORE, InfinityWorkbench.TYPE, new ItemStack[]{
                ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,
                ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,ONE_PER_TICK_SOLAR_CELESTIAL,
                ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_CIRCUIT,ONE_PER_TICK_INFINITY_CORE,ONE_PER_TICK_INFINITY_CORE,ONE_PER_TICK_INFINITY_CIRCUIT,ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,ONE_PER_TICK_INFINITY_INGOT,
                ONE_PER_TICK_VOID_GENERATOR,ONE_PER_TICK_VOID_GENERATOR,ONE_PER_TICK_VOID_GENERATOR,ONE_PER_TICK_VOID_GENERATOR,ONE_PER_TICK_VOID_GENERATOR,ONE_PER_TICK_VOID_GENERATOR,},
                new SlimefunItemStack(ONE_PER_TICK_INFINITY_GENERATOR_CORE, 1)).register(plugin);

        new UnplaceableBlock(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_GENERATOR_STEP1, InfinityWorkbench.TYPE, new ItemStack[] {
                ONE_PER_TICK_INFINITY_GENERATOR_CORE,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
        },new SlimefunItemStack(ONE_PER_TICK_INFINITY_GENERATOR_STEP1, 1)).register(plugin);

        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_GENERATOR_STEP2, InfinityWorkbench.TYPE, new ItemStack[] {
                ONE_PER_TICK_INFINITY_GENERATOR_STEP1,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                null,null,null,null,null,null,
                null,null,null,null,null,null
        }).material(INFINITE_PANEL).speed(1).energyPerTick(2100787152).energyCapacity(2100787152).register(plugin);

        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_GENERATOR_STEP3, InfinityWorkbench.TYPE, new ItemStack[] {
                ONE_PER_TICK_INFINITY_GENERATOR_STEP2,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,
                INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,INFINITY_INFINITY_INFINITE_PANEL,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null
        }).material(INFINITE_PANEL).speed(1).energyPerTick(1).energyCapacity(2_147_483_647).register(plugin);

        new TweakedMaterialGenerator(io.github.mooy1.infinityexpansion.categories.Groups.INFINITY_CHEAT, ONE_PER_TICK_INFINITY_GENERATOR_STEP4, InfinityWorkbench.TYPE, new ItemStack[] {
                ONE_PER_TICK_INFINITY_GENERATOR_STEP3,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null,
                null,null,null,null,null,null
        }).material(INFINITE_PANEL).speed(1).energyPerTick(1).energyCapacity(2_147_483_647).register(plugin);

        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY_1, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY, GEO_QUARRY, GEO_QUARRY,
                GEO_QUARRY, new ItemStack(Material.AIR), GEO_QUARRY,
                GEO_QUARRY, GEO_QUARRY, GEO_QUARRY
        }).ticksPerOutput(50).energyPerTick(3600).register(plugin);

        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY_1, new ItemStack(Material.AIR), GEO_QUARRY_1,
                new ItemStack(Material.AIR), GEO_QUARRY_1, new ItemStack(Material.AIR),
                GEO_QUARRY_1, new ItemStack(Material.AIR), GEO_QUARRY_1
        }).ticksPerOutput(10).energyPerTick(18000).register(plugin);

        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY_3, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY_2, new ItemStack(Material.AIR), GEO_QUARRY_2,
                new ItemStack(Material.AIR), GEO_QUARRY_2, new ItemStack(Material.AIR),
                GEO_QUARRY_2, new ItemStack(Material.AIR), GEO_QUARRY_2
        }).ticksPerOutput(2).energyPerTick(90000).register(plugin);

        new GeoQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY_4, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY_3, GEO_QUARRY_3, new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR)
        }).ticksPerOutput(1).energyPerTick(180000).register(plugin);

        new TweakedGEOQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY_5, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY_4, GEO_QUARRY_4, GEO_QUARRY_4,
                GEO_QUARRY_4, new ItemStack(Material.AIR), GEO_QUARRY_4,
                GEO_QUARRY_4, GEO_QUARRY_4, GEO_QUARRY_4
        }, 8).ticksPerOutput(1).energyPerTick(1440000).register(plugin);

        new TweakedGEOQuarry(Groups.ADVANCED_MACHINES, GEO_QUARRY_6, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY_5, GEO_QUARRY_5, GEO_QUARRY_5,
                GEO_QUARRY_5, OIL_PUMP, GEO_QUARRY_5,
                GEO_QUARRY_5, GEO_QUARRY_5, GEO_QUARRY_5
        }, 64).ticksPerOutput(1).energyPerTick(11520000).register(plugin);

        new TweakedGEOQuarry_Filter(Groups.ADVANCED_MACHINES, GEO_QUARRY_7, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                GEO_QUARRY_6, TRASH_CAN, new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
        }, 64).ticksPerOutput(1).energyPerTick(11520000).register(plugin);


        new TweakedGearTransformer(Groups.BASIC_MACHINES, T_GEAR_TRANSFORMER, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR),
                CARGO_MOTOR,GEAR_TRANSFORMER,CARGO_MOTOR,
                new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR)
        }).energyPerTick(12000).register(plugin);


        new UnplaceableBlock(Groups.MAIN_MATERIALS, ONE_PER_TICK_E_CONNECTOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CARBON,ONE_PER_TICK_QUARRY_CU,ONE_PER_TICK_CARBON,
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_REDSTONE_BLOCK,new ItemStack(Material.AIR),
                ONE_PER_TICK_CARBON,new ItemStack(Material.AIR),ONE_PER_TICK_CARBON},
                new SlimefunItemStack(ONE_PER_TICK_E_CONNECTOR, 8)).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_SMALL_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_DURALMIN,ONE_PER_TICK_S,ONE_PER_TICK_DURALMIN,
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_E_CONNECTOR,ONE_PER_TICK_REDALLOY,
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_REDSTONE,new ItemStack(Material.AIR)
        }).material(SMALL_CAPACITOR).speed(1).energyPerTick(658182).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_MEDIUM_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_BILLON,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_BILLON,
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_SMALL_CAPACITOR,ONE_PER_TICK_REDALLOY,
                new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_REDSTONE,new ItemStack(Material.AIR)
        }).material(MEDIUM_CAPACITOR).speed(1).energyPerTick(1203102).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_BIG_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_STEEL,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_STEEL,
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_MEDIUM_CAPACITOR,ONE_PER_TICK_REDALLOY,
                ONE_PER_TICK_STEEL,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_STEEL
        }).material(BIG_CAPACITOR).speed(1).energyPerTick(1749932).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_LARGE_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_SMALL_REINFORCED_ALLOY,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_SMALL_REINFORCED_ALLOY,
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_BIG_CAPACITOR,ONE_PER_TICK_REDALLOY,
                ONE_PER_TICK_SMALL_REINFORCED_ALLOY,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_SMALL_REINFORCED_ALLOY
        }).material(LARGE_CAPACITOR).speed(1).energyPerTick(2933414).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_CARBONADO_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CARBONADO,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_CARBONADO,
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_LARGE_CAPACITOR,ONE_PER_TICK_REDALLOY,
                ONE_PER_TICK_CARBONADO,ONE_PER_TICK_QUARRY_REDSTONE,ONE_PER_TICK_CARBONADO
        }).material(CARBONADO_EDGED_CAPACITOR).speed(1).energyPerTick(6287024).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_ENERGIZED_CAPACITOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_CARBONADO,ONE_PER_TICK_NETHERSTAR,ONE_PER_TICK_CARBONADO,
                ONE_PER_TICK_REDALLOY,ONE_PER_TICK_CARBONADO_CAPACITOR,ONE_PER_TICK_REDALLOY,
                ONE_PER_TICK_CARBONADO,ONE_PER_TICK_NETHERSTAR,ONE_PER_TICK_CARBONADO
        }).material(ENERGIZED_CAPACITOR).speed(1).energyPerTick(18529604).register(plugin);

        new MaterialGenerator(BASIC_MACHINES, ONE_PER_TICK_STICK, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ADVANCED_TREE,new ItemStack(Material.AIR),ADVANCED_TREE,
                new ItemStack(Material.AIR),ADVANCED_TREE,new ItemStack(Material.AIR),
                ADVANCED_TREE,new ItemStack(Material.AIR),ADVANCED_TREE}
                ).material(Material.STICK).speed(2).energyPerTick(900).register(plugin);

        new MaterialGenerator(BASIC_MACHINES, ONE_PER_TICK_IRON_PICKAXE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_IRON,ONE_PER_TICK_QUARRY_IRON,ONE_PER_TICK_QUARRY_IRON,
                new ItemStack(Material.AIR),ONE_PER_TICK_STICK,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ONE_PER_TICK_STICK,new ItemStack(Material.AIR)
        }).material(Material.IRON_PICKAXE).speed(2).energyPerTick(3225).register(plugin);

        new MaterialGenerator(BASIC_MACHINES, ONE_PER_TICK_DIAMOND_PICKAXE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_QUARRY_DIAMOND,ONE_PER_TICK_QUARRY_DIAMOND,ONE_PER_TICK_QUARRY_DIAMOND,
                new ItemStack(Material.AIR),ONE_PER_TICK_STICK,new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ONE_PER_TICK_STICK,new ItemStack(Material.AIR)
        }).material(Material.DIAMOND_PICKAXE).speed(2).energyPerTick(18675).register(plugin);

        new MaterialGenerator(BASIC_MACHINES, ONE_PER_TICK_NETHERITE_PICKAXE, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),ONE_PER_TICK_DIAMOND_PICKAXE,new ItemStack(Material.AIR),
                ONE_PER_TICK_QUARRY_NETHERITE,T_GEAR_TRANSFORMER,ONE_PER_TICK_QUARRY_NETHERITE
        }).material(Material.NETHERITE_PICKAXE).speed(2).energyPerTick(41925).register(plugin);

        new TweakedMaterialGenerator(Groups.BASIC_MACHINES, ONE_PER_TICK_OIL_PUMP, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                ONE_PER_TICK_STEEL,ONE_PER_TICK_MEDIUM_CAPACITOR,ONE_PER_TICK_STEEL,
                ONE_PER_TICK_STEEL,ONE_PER_TICK_ELECMOTOR,ONE_PER_TICK_STEEL,
                ONE_PER_TICK_QUARRY_IRON,new ItemStack(Material.AIR),ONE_PER_TICK_QUARRY_IRON
        }).material(OIL_PUMP).speed(1).energyPerTick(1147945).register(plugin);

        new UnplaceableBlock(INFINITY_MATERIALS,ONE_PER_TICK_BLISTERING_INGOT_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SINGULARITY_CONSTRUCTOR, ONE_PER_TICK_GOLD_SINGULARITY_ACTIVATED, ONE_PER_TICK_EMERALD_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_BLISTERING_INGOT, 16)).register(plugin);

        new UnplaceableBlock(INFINITY_MATERIALS,ONE_PER_TICK_CARBONADO_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SINGULARITY_CONSTRUCTOR, ONE_PER_TICK_DIAMOND_SINGULARITY_ACTIVATED, ONE_PER_TICK_COAL_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_CARBONADO, 16)).register(plugin);

        new UnplaceableBlock(INFINITY_MATERIALS,ONE_PER_TICK_ELECMAG_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SINGULARITY_CONSTRUCTOR, ONE_PER_TICK_COPPER_SINGULARITY_ACTIVATED, ONE_PER_TICK_ZINC_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_ELECMAG, 32)).register(plugin);

        new UnplaceableBlock(INFINITY_MATERIALS,ONE_PER_TICK_SOLAR_PANEL_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SINGULARITY_CONSTRUCTOR, ONE_PER_TICK_QUARTZ_SINGULARITY_ACTIVATED, ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_SOLAR_PANEL, 64)).register(plugin);

        new UnplaceableBlock(INFINITY_MATERIALS,ONE_PER_TICK_REDALLOY_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SINGULARITY_CONSTRUCTOR, ONE_PER_TICK_REDSTONE_SINGULARITY_ACTIVATED, ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_REDALLOY, 32)).register(plugin);

        new UnplaceableBlock(INFINITY_MATERIALS,ONE_PER_TICK_REINFORCED_ALLOY_2, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[] {
                SINGULARITY_CONSTRUCTOR, ONE_PER_TICK_COAL_SINGULARITY_ACTIVATED, ONE_PER_TICK_IRON_SINGULARITY_ACTIVATED,
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR),
                new ItemStack(Material.AIR),new ItemStack(Material.AIR),new ItemStack(Material.AIR)
        }, new SlimefunItemStack(ONE_PER_TICK_REINFORCED_ALLOY, 16)).register(plugin);

    }
}
