package dev.spektrsoyuz.amethyst.handler;

import dev.spektrsoyuz.amethyst.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/*---------------------------------------------------------------------------------------------------------------------+
|                                                                                                                      |
|                                                Chat Message Handler                                                  |
|                                                                                                                      |
+---------------------------------------------------------------------------------------------------------------------*/
public class ChatMessage implements Listener {

    Main plugin;
    public ChatMessage(Main pl) {
        Bukkit.getPluginManager().registerEvents(this, pl);

        plugin = pl;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

        Player p = event.getPlayer();

        // Retrieve player UUID
        String UUID = p.getUniqueId().toString();

        // Check if chat formatting is enabled in config
        if (plugin.getConfig().getBoolean("format-chat")) {

            // Custom chat format
            String message = event.getMessage();



            event.setMessage("");
        }

        plugin.save();
    }
}