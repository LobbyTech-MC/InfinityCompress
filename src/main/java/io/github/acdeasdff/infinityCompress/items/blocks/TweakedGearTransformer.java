package io.github.acdeasdff.infinityCompress.items.blocks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinityexpansion.InfinityExpansion;
import io.github.mooy1.infinitylib.common.StackUtils;
import io.github.mooy1.infinitylib.machines.AbstractMachineBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.RecipeDisplayItem;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.protection.Interaction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;

/**
 * Machine that changes the material of gear and tools
 *
 * @author Mooy1
 */
@ParametersAreNonnullByDefault
public final class TweakedGearTransformer extends AbstractMachineBlock implements RecipeDisplayItem {

    private static final boolean SF = InfinityExpansion.config().getBoolean("balance-options.allow-sf-item-transform");
    private static final int[] OUTPUT_SLOTS = { 40 };
    private static final int[] INPUT_SLOTS = { 10, 16 };
    private static final int STATUS_SLOT = 13;
    private static final ItemStack[] TOOL_RECIPE = {
            new ItemStack(Material.OAK_PLANKS, 4),
            new ItemStack(Material.COBBLESTONE, 4),
            new ItemStack(Material.IRON_INGOT, 4),
            new ItemStack(Material.GOLD_INGOT, 4),
            new ItemStack(Material.DIAMOND, 4),
            new ItemStack(Material.NETHERITE_INGOT, 2)
    };
    private static final ItemStack[] ARMOR_RECIPE = {
            new ItemStack(Material.LEATHER, 9),
            new ItemStack(Material.CHAIN, 9),
            new ItemStack(Material.IRON_INGOT, 9),
            new ItemStack(Material.GOLD_INGOT, 9),
            new ItemStack(Material.DIAMOND, 9),
            new ItemStack(Material.NETHERITE_INGOT, 2)
    };

    private static List<Material> SUPPORT_MATERIALS = Arrays.asList(Material.LEATHER, Material.CHAIN, Material.IRON_INGOT,
            Material.GOLD_INGOT, Material.DIAMOND,
            Material.NETHERITE_INGOT, Material.OAK_PLANKS,
            Material.COBBLESTONE);
    private static final String[] ARMOR_TYPES = {
            "_HELMET",
            "_CHESTPLATE",
            "_LEGGINGS",
            "_BOOTS"
    };
    private static final String[] TOOL_TYPES = {
            "_SWORD",
            "_PICKAXE",
            "_AXE",
            "_SHOVEL",
            "_HOE"
    };
    private static final String[] TOOL_MATERIALS = {
            "WOODEN",
            "STONE",
            "IRON",
            "GOLDEN",
            "DIAMOND",
            "NETHERITE"
    };
    private static final String[] ARMOR_MATERIALS = {
            "LEATHER",
            "CHAINMAIL",
            "IRON",
            "GOLDEN",
            "DIAMOND",
            "NETHERITE"
    };

    public TweakedGearTransformer(ItemGroup category, SlimefunItemStack item, RecipeType type, ItemStack[] recipe) {
//        super(category, item, type, recipe, energy, STATUS_SLOT);
        super(category, item, type, recipe);
    }

    @Override
    protected void setup(@Nonnull BlockMenuPreset blockMenuPreset) {
        blockMenuPreset =
            new BlockMenuPreset(getId(), "装备材质转换器") {
            @Override
            public void init() {
                constructMenu(this);
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
//        blockMenuPreset.drawBackground(new int[] {
//                3, 4, 5,
//                12, STATUS_SLOT, 14,
//                21, 22 , 23,
//                27, 29, 33, 35,
//                36, 44,
//                45, 46, 47, 51, 52, 53
//        });
//        blockMenuPreset.drawBackground(OUTPUT_BORDER, new int[] {
//                28, 30, 31, 32, 34,
//                37, 38, 39, 41, 42, 43,
//                48, 49, 50
//        });
//        blockMenuPreset.drawBackground(new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, "&9Tool Input"), new int[] {
//                0, 1, 2,
//                9, 11,
//                18, 19, 20
//        });
//        blockMenuPreset.drawBackground(new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, "&9Material Input"), new int[] {
//                6, 7, 8,
//                15, 17,
//                24, 25, 26
//        });
    }

    @Override
    protected int[] getInputSlots() {
        return INPUT_SLOTS;
    }

    @Override
    protected int[] getOutputSlots() {
        return OUTPUT_SLOTS;
    }

    @Nullable
    private static Pair<Material, Integer> getOutput(ItemStack inputMaterial, String inputToolType) {

        for (String toolType : TOOL_TYPES) {
            if (inputToolType.equals(toolType)) { //make sure its a tool

                for (int i = 0 ; i < TOOL_RECIPE.length ; i++) { //compare to each recipe
                    ItemStack recipe = TOOL_RECIPE[i];

                    if (inputMaterial.getType() == recipe.getType() && inputMaterial.getAmount() >= recipe.getAmount()) {

                        return new Pair<>(Material.getMaterial(TOOL_MATERIALS[i] + toolType), recipe.getAmount());
                    }
                }

                break;
            }
        }

        for (String armorType : ARMOR_TYPES) {
            if (inputToolType.equals(armorType)) { //make sure its a armor

                for (int i = 0 ; i < ARMOR_RECIPE.length ; i++) { //compare to each recipe
                    ItemStack recipe = ARMOR_RECIPE[i];

                    if (inputMaterial.getType() == recipe.getType() && inputMaterial.getAmount() >= recipe.getAmount()) {

                        return new Pair<>(Material.getMaterial(ARMOR_MATERIALS[i] + armorType), recipe.getAmount());
                    }
                }

                break;
            }
        }

        return null;
    }

    @Nullable
    private static String getType(ItemStack item) {
        Material material = item.getType();

        for (String armorType : ARMOR_TYPES) {

            for (String armorMaterial : ARMOR_MATERIALS) {

                if (material == Material.getMaterial(armorMaterial + armorType)) {
                    return armorType;
                }
            }
        }

        for (String toolType : TOOL_TYPES) {

            for (String toolMaterial : TOOL_MATERIALS) {

                if (material == Material.getMaterial(toolMaterial + toolType)) {
                    return toolType;
                }
            }
        }
        return null;

    }

    @Nonnull
    @Override
    public List<ItemStack> getDisplayRecipes() {
        List<ItemStack> items = new ArrayList<>();

        for (int i = 0 ; i < TOOL_RECIPE.length ; i++) {
            items.add(TOOL_RECIPE[i]);
            items.add(ARMOR_RECIPE[i]);
        }

        return items;
    }

    @Override
    public boolean process(Block b, @Nonnull BlockMenu inv) {
        ItemStack inputItem = inv.getItemInSlot(INPUT_SLOTS[0]);

        if (inputItem == null) { //no input

            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, "&9此处放入装备"));
            return false;

        }

        if (!SF && StackUtils.getId(inputItem) != null) {
            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.RED_STAINED_GLASS_PANE, "&c粘液科技物品不能被转换"));
            return false;
        }

        String inputToolType = getType(inputItem);

        if (inputToolType == null) { //invalid input

            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.BARRIER, "&c不受支持的物品"));
            return false;

        }

        ItemStack inputMaterial = inv.getItemInSlot(INPUT_SLOTS[1]);

        if (inputMaterial == null) { //no material

            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.BLUE_STAINED_GLASS_PANE, "&9放入材料"));
            return false;

        }

        Pair<Material, Integer> pair = getOutput(inputMaterial, inputToolType);

        if (pair == null) { //invalid material

            inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.BARRIER, "&c不受支持的材料"));
            return false;

        }

        if (inv.getItemInSlot(OUTPUT_SLOTS[0]) != null) { //valid material, not enough room

            inv.replaceExistingItem(STATUS_SLOT, NO_ROOM_ITEM);
            return false;

        }

        //output
        setCharge(inv.getLocation(), 0);

        inputItem.setType(pair.getFirstValue());
        inv.pushItem(inputItem, OUTPUT_SLOTS);

        inv.replaceExistingItem(INPUT_SLOTS[0], null);
        inv.consumeItem(INPUT_SLOTS[1], pair.getSecondValue());

        inv.replaceExistingItem(STATUS_SLOT, new CustomItemStack(Material.LIME_STAINED_GLASS_PANE, "&a物品已转换"));
        return true;
    }

    @Override
    protected int getStatusSlot() {
        return STATUS_SLOT;
    }

    protected void constructMenu(BlockMenuPreset preset) {
        borders(preset, new int[] {
                3, 4, 5,
                12, STATUS_SLOT, 14,
                21, 22 , 23,
                27, 29, 33, 35,
                36, 44,
                45, 46, 47, 51, 52, 53
        }, new int[] {
                6, 7, 8,
                15, 17,
                24, 25, 26,
                0, 1, 2,
                9, 11,
                18, 19, 20
        }, new int[] {
                28, 30, 31, 32, 34,
                37, 38, 39, 41, 42, 43,
                48, 49, 50
        });

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

//        preset.addItem(2, new CustomItemStack(new ItemStack(material), "&eRecipe",
//                        "", "&bPut in the Recipe you want to craft", machineName + " Recipes ONLY"
//                ),
//                (p, slot, item, action) -> false);
    }

    static void borders(BlockMenuPreset preset, int[] border, int[] inputBorder, int[] outputBorder) {
        for (int i : border) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.GRAY_STAINED_GLASS_PANE), " "),
                    (p, slot, item, action) -> false);
        }

        for (int i : inputBorder) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.CYAN_STAINED_GLASS_PANE), " "),
                    (p, slot, item, action) -> false);
        }

        for (int i : outputBorder) {
            preset.addItem(i, new CustomItemStack(new ItemStack(Material.ORANGE_STAINED_GLASS_PANE), " "),
                    (p, slot, item, action) -> false);
        }
    }

    protected int[] getCustomItemTransport(DirtyChestMenu menu, ItemTransportFlow flow, ItemStack item) {
        if (flow == ItemTransportFlow.WITHDRAW) {
            return getOutputSlots();
        }

        if (SUPPORT_MATERIALS.contains(item.getType())){
            return new int[]{getInputSlots()[1]};
        }
        else {
            return new int[]{getInputSlots()[0]};
        }
    }

    protected Comparator<Integer> compareSlots(DirtyChestMenu menu) {
        return Comparator.comparingInt(slot -> menu.getItemInSlot(slot).getAmount());
    }

}

