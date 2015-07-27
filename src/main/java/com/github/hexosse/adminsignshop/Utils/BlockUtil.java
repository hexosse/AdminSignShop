package com.github.hexosse.adminsignshop.Utils;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.DoubleChest;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.material.Attachable;


/**
 * @author Acrobot
 */
public class BlockUtil
{
    /**
     * Checks if the block is a sign
     *
     * @param block Block to check
     * @return Is this block a sign?
     */
    public static boolean isSign(Block block)
    {
        return block.getState() instanceof Sign;
    }

    /**
     * Checks if the block is a chest
     *
     * @param block Block to check
     * @return Is this block a chest?
     */
    public static boolean isChest(Block block)
    {
        return block.getState() instanceof Chest;
    }

    /**
     * Checks if the InventoryHolder is a chest
     *
     * @param holder Inventory holder to check
     * @return Is this holder a chest?
     */
    public static boolean isChest(InventoryHolder holder)
    {
        return holder instanceof Chest || holder instanceof DoubleChest;
    }

    /**
     * Checks if the block is air
     *
     * @param block Block to check
     * @return Is this block air?
     */
    public static boolean isAir(Block block) { return block.getType() == Material.AIR;}

    public static boolean isHalfBlock(Block block)
    {
        return (block.getType()==Material.STEP)
                || (block.getType()==Material.STONE_PLATE)
                || (block.getType()==Material.WOOD_PLATE)
                || (block.getType()==Material.SNOW)
                || (block.getType()==Material.WOOD_STEP)
                || (block.getType()==Material.GOLD_PLATE)
                || (block.getType()==Material.IRON_PLATE)
                || (block.getType()==Material.DAYLIGHT_DETECTOR)
                || (block.getType()==Material.CARPET)
                ;
    }

    /**
     * Gets the block to which the sign is attached
     *
     * @param sign Sign which is attached
     * @return Block to which the sign is attached
     */
    public static Block getAttachedBlock(Sign sign)
    {
        return sign.getBlock().getRelative(((Attachable) sign.getData()).getAttachedFace());
    }

    /**
     * Opens the holder's inventory GUI
     *
     * @param holder Inventory holder
     * @param player Player on whose screen the GUI is going to be shown
     * @return Was the opening successful?
     */
    public static boolean openBlockGUI(InventoryHolder holder, Player player)
    {
        Inventory inventory = holder.getInventory();
        player.openInventory(inventory);

        return true;
    }
}