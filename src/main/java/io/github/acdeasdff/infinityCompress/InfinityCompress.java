package io.github.acdeasdff.infinityCompress;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import io.github.acdeasdff.infinityCompress.categories.Groups;
import io.github.acdeasdff.infinityCompress.commands.GiveRecipe;
import io.github.acdeasdff.infinityCompress.commands.PrintItem;
import io.github.acdeasdff.infinityCompress.commands.SetData;
import io.github.acdeasdff.infinityCompress.items.FNFALsAmplifications.BlocksFN;
import io.github.acdeasdff.infinityCompress.items.GlobalWarming.BlocksGlobalWarming;
import io.github.acdeasdff.infinityCompress.items.LiteXpansion.BlocksLiteXpansion;
import io.github.acdeasdff.infinityCompress.items.blocks.Blocks;
import io.github.acdeasdff.infinityCompress.items.blocks.Blocks2;
import io.github.mooy1.infinitylib.commands.AddonCommand;
import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.core.AddonConfig;
import io.github.mooy1.infinitylib.core.Environment;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;

public class InfinityCompress extends AbstractAddon {

    public static JavaPlugin globalwarming;
    public static JavaPlugin LiteXpansion;
    public static JavaPlugin FNAmplifications;
    private static AbstractAddon instance;
    private GitHubBuildsUpdater updater;
    private Environment environment;
    private String githubUserName;
    private String githubRepo;
    private String autoUpdateBranch;
    private String autoUpdateKey;
    private String bugTrackerURL;
    private AddonCommand command;
    private AddonConfig config;
    private int slimefunTickCount;
    private boolean autoUpdatesEnabled;
    private boolean disabling;
    private boolean enabling;
    private boolean loading;

    public InfinityCompress(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file,
                "acdeasdff", "InfinityCompress", "master", "auto-update");
    }

    public InfinityCompress() {
        super("acdeasdff", "InfinityCompress", "master", "auto-update");
//        StorageSaveFix.fixStuff(getLogger());
    }


    @Override
    protected void enable() {
        getAddonCommand()
                .addSub(new GiveRecipe())
                .addSub(new SetData())
                .addSub(new PrintItem());
        Groups.setup(this);
//        MobData.setup(this);
//        Materials.setup(this);
//        Machines.setup(this);
//        Quarries.setup(this);
//        Gear.setup(this);
        Blocks.setup(this);
        Blocks2.setup(this);
        if(Bukkit.getPluginManager().isPluginEnabled("GlobalWarming")){
            globalwarming = (JavaPlugin) Bukkit.getPluginManager().getPlugin("GlobalWarming");
            BlocksGlobalWarming.setup(this);
        }
//        LiteXpansion
        if(Bukkit.getPluginManager().isPluginEnabled("LiteXpansion")){
            LiteXpansion = (JavaPlugin) Bukkit.getPluginManager().getPlugin("LiteXpansion");
            BlocksLiteXpansion.setup(this);
            if(Bukkit.getPluginManager().isPluginEnabled("FNAmplifications")){
                FNAmplifications = (JavaPlugin) Bukkit.getPluginManager().getPlugin("FNAmplifications");
                BlocksFN.setup(this);
            }
        }
////        Storage.setup(this);
//        Generators.setup(this);
//        SlimefunExtension.setup(this);
    }



    @Override
    protected void disable() {

    }


}
