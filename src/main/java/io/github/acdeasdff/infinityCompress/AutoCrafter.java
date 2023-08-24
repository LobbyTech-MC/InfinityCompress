package io.github.acdeasdff.infinityCompress;

import io.github.mooy1.infinityexpansion.infinitylib.machines.MachineRecipeType;
import io.github.mooy1.infinityexpansion.items.blocks.InfinityWorkbench;
import io.github.thebusybiscuit.slimefun4.api.events.BlockPlacerPlaceEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockBreakHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockPlaceHandler;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.ItemStackSnapshot;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import io.github.thebusybiscuit.slimefun4.utils.SlimefunUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.*;


//almost all from fluffymachines(io.ncbpfluffybear)
//is is only for AutoInfinityWorkbench
public class AutoCrafter extends SlimefunItem implements EnergyNetComponent {


    Player p = null;
    private final List<CraftingBlockRecipe> recipes;
//    protected MachineLayout layout;
    public static final int ENERGY_CONSUMPTION = 1000000;
    public static final int CAPACITY = ENERGY_CONSUMPTION * 3;



    private final int[] border = new int[] {

            15, 16, 17,
            24, 25, 26
    };

    private final int[] outputBorder = new int[] {
            33, 34, 35,
            42,
            51, 52 ,53
    };
//    private final int[] border = {0, 1, 3, 4, 5, 7, 8, 13, 14, 15, 16, 17, 50, 51, 52, 53};
//    private final int[] inputBorder = {9, 10, 11, 12, 13, 18, 22, 27, 31, 36, 40, 45, 46, 47, 48, 49};

    public static final int[] inputSlots = {
            0, 1, 2, 3, 4, 5,
            9, 10, 11, 12, 13, 14,
            18, 19, 20, 21, 22, 23,
            27, 28, 29, 30, 31, 32,
            36, 37, 38, 39, 40, 41,
            45, 46, 47, 48, 49, 50
    };
    private final int[] outputSlots = {43,44};
    private final String machineName;
    private final Material material;
//    private final MultiBlockMachine mblock;

    Map<ItemStack[], ItemStack> INFWB_TYPE = getRecipesFrom(InfinityWorkbench.TYPE);

    public AutoCrafter(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, String displayName, Material material, String machineName, RecipeType machineRecipes) {
        super(category, item, recipeType, recipe);

        this.machineName = machineName;
        this.material = material;
//        this.mblock = (MultiBlockMachine) machineRecipes.getMachine();

        constructMenu(displayName);
        addItemHandler(onPlace());
        addItemHandler(onBreak());
        this.recipes = new ArrayList();
    }

    private void constructMenu(String displayName) {
        new BlockMenuPreset(getId(), displayName) {

            @Override
            public void init() {
                constructMenu(this);
            }

            @Override
            public void newInstance(@Nonnull BlockMenu menu, @Nonnull Block b) {
                if (!BlockStorage.hasBlockInfo(b)
                        || BlockStorage.getLocationInfo(b.getLocation(), "enabled") == null
                        || BlockStorage.getLocationInfo(b.getLocation(), "enabled").equals(String.valueOf(false))) {
                    menu.replaceExistingItem(6, new CustomItemStack(Material.GUNPOWDER, "&7未开启: &4\u2718", "",
                            "&e> 点击开启机器")
                    );
                    menu.addMenuClickHandler(6, (p, slot, item, action) -> {
                        BlockStorage.addBlockInfo(b, "enabled", String.valueOf(true));
                        newInstance(menu, b);
                        return false;
                    });
                } else {
                    menu.replaceExistingItem(6, new CustomItemStack(Material.REDSTONE, "&7已开启: &2\u2714",
                            "", "&e> 点击关闭机器")
                    );
                    menu.addMenuClickHandler(6, (p, slot, item, action) -> {
                        BlockStorage.addBlockInfo(b, "enabled", String.valueOf(false));
                        newInstance(menu, b);
                        return false;
                    });
                }

                if (!BlockStorage.hasBlockInfo(b)
                        || BlockStorage.getLocationInfo(b.getLocation(), "recipeLocked") == null
                        || BlockStorage.getLocationInfo(b.getLocation(), "recipeLocked").equals(String.valueOf(false))){
                    menu.replaceExistingItem(8, new CustomItemStack(Material.GUNPOWDER, "&7未开启: &4\u2718", "",
                            "&e> 点击解锁合成")
                    );
                    menu.addMenuClickHandler(8, (p, slot, item, action) -> {
                        BlockStorage.addBlockInfo(b, "recipeLocked", String.valueOf(true));
                        newInstance(menu, b);
                        return false;
                    });
                    for (int i:inputSlots){
                        if(menu.getItemInSlot(i) == null){
                            menu.replaceExistingItem(i, new CustomItemStack(Material.BARRIER, "&4占位符 -- 锁定合成用"));
                            menu.addMenuClickHandler(i, (p, slot, item, action) -> {
                                return false;
                            });
                        }
                    }
                }else {
                    menu.replaceExistingItem(8, new CustomItemStack(Material.GLOWSTONE, "&7已开启: &2\u2714",
                            "", "&e> 点击锁定合成")
                    );
                    menu.addMenuClickHandler(8, (p, slot, item, action) -> {
                        BlockStorage.addBlockInfo(b, "recipeLocked", String.valueOf(false));
                        newInstance(menu, b);
                        return false;
                    });
                    for (int i:inputSlots){
                        if(menu.getItemInSlot(i) != null){
                            if(menu.getItemInSlot(i).getType().equals(Material.BARRIER)){
                                menu.replaceExistingItem(i, null);
                                menu.addMenuClickHandler(i, null);
                            }
                        }
                    }
                }

            }

            @Override
            public boolean canOpen(@Nonnull Block b, @Nonnull Player p) {
                return p.hasPermission("slimefun.inventory.bypass")
                        || Slimefun.getProtectionManager().hasPermission(p, b.getLocation(),
                        Interaction.INTERACT_BLOCK);
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(ItemTransportFlow flow) {
                return new int[0];
            }

            @Override
            public int[] getSlotsAccessedByItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
                return getCustomItemTransport(menu, flow, item);
            }
        };
    }

    protected int[] getCustomItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
        if (flow == ItemTransportFlow.WITHDRAW) {
            return getOutputSlots();
        }

        if (item.getMaxStackSize() == 1){
            return getInputSlots();
        }

        List<Integer> slots = new ArrayList<>();
        for (int slot : getInputSlots()) {
            if (menu.getItemInSlot(slot) != null) {
                slots.add(slot);
            }
        }

        slots.sort(compareSlots(menu));

        int[] array = new int[slots.size()];

        for (int i = 0; i < slots.size(); i++) {
            array[i] = slots.get(i);
        }

        return array;
    }

    private BlockPlaceHandler onPlace() {
        return new BlockPlaceHandler(true) {

            @Override
            public void onPlayerPlace(@Nonnull BlockPlaceEvent e) {
                BlockStorage.addBlockInfo(e.getBlock(), "enabled", String.valueOf(false));
                BlockStorage.addBlockInfo(e.getBlock(), "recipeLocked", String.valueOf(false));
                p = e.getPlayer();
            }

            @Override
            public void onBlockPlacerPlace(@Nonnull BlockPlacerPlaceEvent e) {
                BlockStorage.addBlockInfo(e.getBlock(), "enabled", String.valueOf(false));
                BlockStorage.addBlockInfo(e.getBlock(), "recipeLocked", String.valueOf(false));
            }
        };
    }

    private BlockBreakHandler onBreak() {
        return new BlockBreakHandler(false, false) {
            @Override
            public void onPlayerBreak(@Nonnull BlockBreakEvent e, @Nonnull ItemStack i, @Nonnull List<ItemStack> list) {
                Block b = e.getBlock();
                BlockMenu inv = BlockStorage.getInventory(b);

                if (inv != null) {
                    for (int ite : getInputSlots()){
                        if (inv.getItemInSlot(ite) != null){if (inv.getItemInSlot(ite).getType() == Material.BARRIER){inv.replaceExistingItem(ite, null);}}
                    }
                    inv.dropItems(b.getLocation(), getInputSlots());
                    inv.dropItems(b.getLocation(), getOutputSlots());
                }
            }
        };
    }

    protected Comparator<Integer> compareSlots(DirtyChestMenu menu) {
        return Comparator.comparingInt(slot -> menu.getItemInSlot(slot).getAmount());
    }

    protected void constructMenu(BlockMenuPreset preset) {
        borders(preset, border, outputBorder);

        for (int i : getOutputSlots()) {
            preset.addMenuClickHandler(i, new ChestMenu.AdvancedMenuClickHandler() {

                @Override
                public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
                    return false;
                }

                @Override
                public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor,
                                       ClickAction action) {
                    if (cursor == null) return true;
                    return cursor.getType() == Material.AIR;
                }
            });
        }

        preset.addItem(7, new CustomItemStack(new ItemStack(material), "&e合成配方",
                "", "&b放入你想合成的配方","(仅支持无尽合成配方)"
            ),
            (p, slot, item, action) -> false);
    }

    public int getEnergyConsumption() {
        return ENERGY_CONSUMPTION;
    }

    public int getCapacity() {
        return CAPACITY;
    }

    public int[] getInputSlots() {
        return inputSlots;
    }

    public int[] getOutputSlots() {
        return outputSlots;
    }

    @Nonnull
    @Override
    public EnergyNetComponentType getEnergyComponentType() {
        return EnergyNetComponentType.CONSUMER;
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {

            @Override
            public void tick(Block b, SlimefunItem sf, Config data) {
                AutoCrafter.this.tick(b);
            }

            @Override
            public boolean isSynchronized() {
                return false;
            }
        });
    }

    protected void tick(Block block) {
        if (BlockStorage.getLocationInfo(block.getLocation(), "enabled").equals(String.valueOf(false))) {
            return;
        }

        if (getCharge(block.getLocation()) < getEnergyConsumption()) {
            return;
        }

        craftIfValid(block);
    }

    private void craftIfValid(Block block) {
        BlockMenu menu = BlockStorage.getInventory(block);

//        craft(menu, p);

        // Make sure at least 1 slot is free
//        Scheduler.run(() -> log(Level.WARNING,"checking slots"));
        for (int outSlot : getOutputSlots()) {
            ItemStack outItem = menu.getItemInSlot(outSlot);
            if (outItem == null || outItem.getAmount() < outItem.getMaxStackSize()) {
                break;
            } else if (outSlot == getOutputSlots()[1]) {
                return;
            }
        }

        // Find matching recipe
//        Scheduler.run(() -> log(Level.WARNING,"finding recipe"));
        try{
            for (ItemStack[] input : INFWB_TYPE.keySet()) {
                if (isCraftable(menu, input)) {
                    ItemStack output = INFWB_TYPE.get(input).clone();
                    if (!menu.fits(output, getOutputSlots())) {
//                        Scheduler.run(() -> log(Level.WARNING, "couldn't find recipe"));
                        return;
                    }
//                    Scheduler.run(() -> log(Level.WARNING, "crafting"));
                    craft(output, menu);
                    removeCharge(block.getLocation(), getEnergyConsumption());
                    return;
                }
            }
        }catch (Exception e){e.printStackTrace();}
        // we're only executing the last possible shaped recipe
        // we don't want to allow this to be pressed instead of the default timer-based
        // execution to prevent abuse and auto clickers
    }

//    private boolean isCraftable(BlockMenu inv, ItemStack[] recipe) {
//        for (int j = 0; j < 9; j++) {
//            ItemStack item = inv.getItemInSlot(getInputSlots()[j]);
//            if ((item != null && item.getAmount() == 1 && item.getType().getMaxStackSize() != 1)
//                || !SlimefunUtils.isItemSimilar(inv.getItemInSlot(getInputSlots()[j]), recipe[j], true)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

//    private void craft(ItemStack output, BlockMenu inv) {
//        for (int j = 0; j < 9; j++) {
//            ItemStack item = inv.getItemInSlot(getInputSlots()[j]);
//
//            if (item != null && item.getType() != Material.AIR) {
//                inv.consumeItem(getInputSlots()[j]);
//            }
//        }
//
//        inv.pushItem(output, outputSlots);
//    }

    static void borders(BlockMenuPreset preset, int[] border,  int[] outputBorder) {
        for (int i : border) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "),
                (p, slot, item, action) -> false);
        }

//        for (int i : inputBorder) {
//            preset.addItem(i, new CustomItemStack(new ItemStack(Material.CYAN_STAINED_GLASS_PANE), " "),
//                (p, slot, item, action) -> false);
//        }

        for (int i : outputBorder) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), " "),
                (p, slot, item, action) -> false);
        }
    }


    private void craft(ItemStack output, BlockMenu inv) {
//        System.out.println("craftingItem");
//        Scheduler.run(() -> log(Level.WARNING,"craftingItem"));
        for (int j = 0; j < getInputSlots().length; j++) {
            ItemStack item = inv.getItemInSlot(getInputSlots()[j]);

            if (item != null && item.getType() != Material.AIR && item.getType() != Material.BARRIER) {
                inv.consumeItem(getInputSlots()[j]);
            }
        }

        inv.pushItem(output, outputSlots);
    }

//    //from infinitylib(io.github.mooy1)
//    protected void craft(BlockMenu menu, Player p) {
//        int[] slots = inputSlots;
//        ItemStack[] input = new ItemStack[slots.length];
//
//        for(int i = 0; i < slots.length; ++i) {
//            input[i] = menu.getItemInSlot(slots[i]);
//        }
//
//        CraftingBlockRecipe recipe = this.getOutput(input);
//        if (recipe != null) {
//            if (recipe.check(p)) {
//                if (menu.fits(recipe.output, outputSlots)) {
//                    ItemStack output = recipe.output.clone();
//                    this.onSuccessfulCraft(menu, output);
//                    menu.pushItem(output, outputSlots);
//                    recipe.consume(input);
////                    p.sendMessage(ChatColor.GREEN + "Successfully Crafted: " + ItemUtils.getItemName(output));
//                }
////                else {
//////                    p.sendMessage(ChatColor.GOLD + "Not Enough Room!");
////                }
//            }
//        }
////        else {
////            p.sendMessage(ChatColor.RED + "Invalid Recipe!");
////        }
//
//    }

    protected final CraftingBlockRecipe getOutput(ItemStack[] input) {
        ItemStackSnapshot[] snapshots = ItemStackSnapshot.wrapArray(input);
        Iterator var3 = this.recipes.iterator();

        CraftingBlockRecipe recipe;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            recipe = (CraftingBlockRecipe)var3.next();
        } while(!recipe.check(snapshots));

        return recipe;
    }


    protected void onSuccessfulCraft(BlockMenu menu, ItemStack toOutput) {
        setCharge(menu.getLocation(), getCharge(menu.getLocation()) - ENERGY_CONSUMPTION);
    }


    private boolean isCraftable(BlockMenu inv, ItemStack[] recipe) {
        for (int j = 0; j < inputSlots.length; j++) {
            ItemStack item = inv.getItemInSlot(getInputSlots()[j]);
            if (item != null){if (item.getType() ==Material.BARRIER){item = null;}}
            if ((item != null && item.getAmount() == 1 && item.getType().getMaxStackSize() != 1)
                    || !SlimefunUtils.isItemSimilar(item, recipe[j], false)) {
                return false;
            }
        }

        return true;
    }


    @Nonnull
    public Map<ItemStack[], ItemStack> getRecipesFrom(MachineRecipeType recipeType) {
//        List<CraftingBlockRecipe> recipes = new ArrayList<>();
        Map<ItemStack[], ItemStack> recipes = new HashMap<>();
        recipeType.sendRecipesTo(recipes::put);
        return recipes;
    }
}

