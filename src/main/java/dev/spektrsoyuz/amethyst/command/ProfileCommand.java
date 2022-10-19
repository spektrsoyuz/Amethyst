package dev.spektrsoyuz.amethyst.command;

import dev.spektrsoyuz.amethyst.Main;
import dev.spektrsoyuz.amethyst.util.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

/*---------------------------------------------------------------------------------------------------------------------+
|                                                                                                                      |
|                                                   Profile Command                                                    |
|                                                                                                                      |
+---------------------------------------------------------------------------------------------------------------------*/
public class ProfileCommand implements CommandExecutor {

    Main plugin;
    public ProfileCommand(Main pl) {
        plugin = pl;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (command.getName().equalsIgnoreCase("profile")) {
            Player p = (Player) sender;

            // TODO - Finish profile command

            return true;
        }

        // Return with debug message
        return false;
    }
}