package me.MorcCrafak.plugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	public void onEnable() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	@EventHandler
    public void death(PlayerDeathEvent e) {
            Player p = e.getEntity().getPlayer();
            Player k = e.getEntity().getKiller();
                    e.setDeathMessage(getConfig().getString("death"));      
    }

	
}
