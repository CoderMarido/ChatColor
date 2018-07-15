package nl.marido.chatcolor.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

public class SignListener implements Listener {

	@EventHandler
	public void signListener(SignChangeEvent event) {
		if (!event.getPlayer().hasPermission("chatcolor.disable")) {
			for (int line = 0; line < event.getLines().length; line++) {
				String message = event.getLine(line);
				message = ChatColor.translateAlternateColorCodes('&', message);
				event.setLine(line, message);
			}
		}
	}

}