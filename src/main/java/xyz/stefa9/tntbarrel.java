package xyz.stefa9;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.stefa9.events.TNTEvents;
import xyz.stefa9.item.ItemManager;
import xyz.stefa9.item.RecipeManager;

public final class tntbarrel extends JavaPlugin {

    @Override
    public void onEnable() {
        ItemManager.init();
        RecipeManager.init();

        getServer().getPluginManager().registerEvents(new TNTEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
