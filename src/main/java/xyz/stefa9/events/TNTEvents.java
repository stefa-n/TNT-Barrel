package xyz.stefa9.events;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import xyz.stefa9.item.ItemManager;

public class TNTEvents implements Listener {
    @EventHandler
    public static void onPlayerUse(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if(event.getItem() == null) return;
        if(!(event.getItem().getItemMeta().equals(ItemManager.TNTBarrel.getItemMeta()))) return;
        if(event.getAction() != Action.RIGHT_CLICK_AIR) return;

        event.setCancelled(true);

        World world = player.getWorld();

        TNTPrimed tnt = (TNTPrimed) world.spawnEntity(player.getLocation(), EntityType.PRIMED_TNT);
        tnt.setFuseTicks(60);
        tnt.setVelocity(player.getLocation().getDirection().multiply(2).add(player.getVelocity()));

        if(event.getHand().equals(EquipmentSlot.HAND))
            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
        else
            player.getInventory().getItemInOffHand().setAmount(player.getInventory().getItemInOffHand().getAmount() - 1);
    }
}
