package es.mithrandircraft.detectsuccessfullyloaded;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Detectsuccessfullyloaded extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[Detectsuccessfullyloaded] (!) DEBUG PLUGIN (!) Registering event.");
        getServer().getPluginManager().registerEvents(new EventRPSuccessfullyLoaded(), this);
    }
}
