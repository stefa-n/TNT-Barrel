package xyz.stefa9.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {
    public static ItemStack TNTBarrel;

    public static void init()
    {
        CreateBarrel();
    }

    static void CreateBarrel()
    {
        ItemStack item = new ItemStack(Material.TNT);
        ItemMeta meta = item.getItemMeta();
        meta.setCustomModelData(1);
        meta.setDisplayName("TNT Barrel");
        item.setItemMeta(meta);

        TNTBarrel = item;
    }
}
