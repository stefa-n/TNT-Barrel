package xyz.stefa9.item;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;
import xyz.stefa9.tntbarrel;

public class RecipeManager {
    public static void init() {
        TNTBarrel();
    }

    static void TNTBarrel() {
        Plugin plugin = tntbarrel.getPlugin(tntbarrel.class);

        ShapelessRecipe sr = new ShapelessRecipe(new NamespacedKey(plugin, "tntbarrel"), ItemManager.TNTBarrel);
        sr.addIngredient(1, Material.BARREL);
        sr.addIngredient(1, Material.TNT);
        Bukkit.addRecipe(sr);
    }
}