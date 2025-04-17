package io.github.acdeasdff.infinityCompress.categories;

import org.bukkit.Material;

import io.github.acdeasdff.infinityCompress.InfinityCompress;
import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;

/**
 * Categories for this addon
 *
 * @author Mooy1
 */

//copied from infinityExpansion (io.github.mooy1)
public final class Groups {

//    public static final ItemGroup INFINITY = new InfinityGroup(InfinityCompress.createKey("infinitycompress_recipes"),
//            new CustomItemStack(Material.RESPAWN_ANCHOR, "&b[无尽压缩]&7配方"), 3);
    public static final ItemGroup MAIN_MATERIALS = new SubGroup("infinitycompress_basic_materials",
            new CustomItemStack(Material.NETHER_STAR, "&b[无尽压缩]&7材料"));
    public static final ItemGroup BASIC_MACHINES = new SubGroup("infinitycompress_basic_machines",
            new CustomItemStack(Material.LOOM, "&b[无尽压缩]&9基础&7机器"));
    public static final ItemGroup ADVANCED_MACHINES = new SubGroup("infinitycompress_advanced_machines",
            new CustomItemStack(Material.BLAST_FURNACE, "&b[无尽压缩]&c高级&7机器"));
//    public static final ItemGroup STORAGE = new SubGroup("storage",
//            new CustomItemStack(Material.BEEHIVE, "&6Storage"));
//    public static final ItemGroup MOB_SIMULATION = new SubGroup("infinitycompress_mob_simulation",
//            new CustomItemStack(Material.BEACON, "&b[无尽压缩]&7生物模拟"));
    public static final ItemGroup INFINITY_MATERIALS = new SubGroup("infinitycompress_infinity_materials",
            new CustomItemStack(Material.NETHERITE_BLOCK, "&b[无尽压缩]&a额外配方"));
    public static final ItemGroup INFINITY_GLOBALWARMING = new SubGroup("infinitycompress_infinity_globalwarming",
            new CustomItemStack(Material.GLASS, "&b[无尽压缩]&a全球变暖","&7不参与无尽压缩其它产线合成"));

    public static final ItemGroup INFINITY_LITEXPANSION = new SubGroup("infinitycompress_infinity_litexpansion",
            new CustomItemStack(
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode("3f87fc5cbb233743a82fb0fa51fe739487f29bcc01c9026621ecefad197f4fb1"))
                    , "&b[无尽压缩]&aLiteXpansion"
                    ,"&7不参与无尽压缩其它产线合成")
    );

    public static final ItemGroup INFINITY_FNAMP = new SubGroup("infinitycompress_infinity_fnamplifications",
            new CustomItemStack(
                    PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                            "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5"))
                    , "&b[无尽压缩]&e&lFN &b&lAmpli&c&lfications"
                    ,"&7不参与无尽压缩其它产线合成")
    );

    public static final ItemGroup MAIN_CATEGORY = new MultiGroup("infinitycompress_main",
            new CustomItemStack(Material.NETHER_STAR, "&7无尽压缩"), 3,
            MAIN_MATERIALS, BASIC_MACHINES, ADVANCED_MACHINES, INFINITY_MATERIALS, INFINITY_GLOBALWARMING, INFINITY_LITEXPANSION, INFINITY_FNAMP);
    public static final ItemGroup INFINITY_CHEAT = new SubGroup("infinitycompress_cheat",
            new CustomItemStack(Material.RESPAWN_ANCHOR, "&b[无尽压缩]&7配方 &c- 错误的配方"));

    public static void setup(InfinityCompress inst) {
//        INFINITY.register(inst);
        MAIN_CATEGORY.register(inst);
//        MOB_SIMULATION.setCrossAddonItemGroup(true);
        INFINITY_CHEAT.register(inst);
    }

}