package dev.spektrsoyuz.amethyst;

import dev.spektrsoyuz.amethyst.command.HelloCommand;
import dev.spektrsoyuz.amethyst.command.ProfileCommand;
import dev.spektrsoyuz.amethyst.handler.ChatMessage;
import dev.spektrsoyuz.amethyst.handler.PlayerJoin;
import dev.spektrsoyuz.amethyst.util.ChatUtils;
import org.bukkit.plugin.java.JavaPlugin;

/*---------------------------------------------------------------------------------------------------------------------+
|                                                                                                                      |
|                                                     Main Class                                                       |
|                                                                                                                      |
+---------------------------------------------------------------------------------------------------------------------*/
public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(ChatUtils.format("&bRoleplay Plugin: &fInitializing..."));
        System.out.println(ChatUtils.format("&bRoleplay Plugin: &fVersion: " + getConfig().getString("version")));

        // Plugin startup logic
        saveDefaultConfig();

        constructCommands();
        constructHandlers();

        System.out.println(ChatUtils.format("&bRoleplay Plugin: &fLoading Completed!"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void constructCommands() {

        // Construct command classes
        new HelloCommand(this);
        new ProfileCommand(this);
    }

    public void constructHandlers() {

        // Construct handler classes
        new PlayerJoin(this);
        new ChatMessage(this);
    }

    public void save() {

        saveConfig();
        System.out.println(ChatUtils.format("&bRoleplay Plugin: &fConfig Saved!"));
    }
}