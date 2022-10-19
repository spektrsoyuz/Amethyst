package dev.spektrsoyuz.amethyst.handler;

import dev.spektrsoyuz.amethyst.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/*---------------------------------------------------------------------------------------------------------------------+
|                                                                                                                      |
|                                                Player Join Handler                                                   |
|                                                                                                                      |
+---------------------------------------------------------------------------------------------------------------------*/
public class PlayerJoin implements Listener {

    Main plugin;
    public PlayerJoin(Main pl) {
        Bukkit.getPluginManager().registerEvents(this, pl);

        plugin = pl;
    }

    @EventHandler
    public void onJoinMessage(PlayerJoinEvent event) {

        Player p = event.getPlayer();

        // Retrieve player UUID
        String UUID = p.getUniqueId().toString();

        plugin.save();
    }
}