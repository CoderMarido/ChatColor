package nl.marido.chatcolor.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

	@EventHandler
	public void chatListener(AsyncPlayerChatEvent event) {
		if (!event.getPlayer().hasPermission("chatcolor.disable")) {
			String message = ChatColor.translateAlternateColorCodes('&', event.getMessage());
			event.setMessage(message);
		}
	}

}