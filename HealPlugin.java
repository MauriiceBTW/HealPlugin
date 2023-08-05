package me.maurice.healplugin;
// change this to your package if you copy & paste!

import org.bukkit.plugin.java.JavaPlugin;

public final class HealPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        // Register /heal command
        getCommand("heal").setExecutor(new HealCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

