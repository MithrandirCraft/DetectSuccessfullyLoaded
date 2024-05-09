package es.mithrandircraft.detectsuccessfullyloaded;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

class EventRPSuccessfullyLoaded implements Listener {
    public EventRPSuccessfullyLoaded()
    {
        Bukkit.getLogger().info("[Detectsuccessfullyloaded] (!) DEBUG PLUGIN (!) Detectsuccessfullyloaded enabled.");
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onPlayerJoin(PlayerResourcePackStatusEvent e) {
        Bukkit.getLogger().info("[Detectsuccessfullyloaded] PlayerResourcePackStatusEvent Status received: " + e.getStatus());
        if (e.getStatus() != PlayerResourcePackStatusEvent.Status.SUCCESSFULLY_LOADED)
            Bukkit.getLogger().info("[Detectsuccessfullyloaded] Status is resourcepack SUCCESSFULLY_LOADED!");
    }
}