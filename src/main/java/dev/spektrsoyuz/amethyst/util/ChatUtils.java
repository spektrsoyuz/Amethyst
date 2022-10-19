package dev.spektrsoyuz.amethyst.util;

import org.bukkit.ChatColor;

/*---------------------------------------------------------------------------------------------------------------------+
|                                                                                                                      |
|                                                     Chat Utils                                                       |
|                                                                                                                      |
+---------------------------------------------------------------------------------------------------------------------*/
public class ChatUtils {

    public static String format(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}