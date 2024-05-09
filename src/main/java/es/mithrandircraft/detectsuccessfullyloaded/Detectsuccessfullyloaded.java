package es.mithrandircraft.detectsuccessfullyloaded;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Detectsuccessfullyloaded extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EventRPSuccessfullyLoaded(), this);
        Bukkit.getLogger().info("[Detectsuccessfullyloaded] (!) DEBUG PLUGIN (!) Registering event.");
    }
}
