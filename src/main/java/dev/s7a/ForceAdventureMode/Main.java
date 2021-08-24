package dev.s7a.ForceAdventureMode;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.*;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(this, this);
    }

    @EventHandler
    public void on(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.isOp()) return;
        GameMode gameMode = player.getGameMode();
        if (gameMode == GameMode.ADVENTURE) return;
        player.setGameMode(GameMode.ADVENTURE);
    }
}
