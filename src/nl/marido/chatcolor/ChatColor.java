package nl.marido.chatcolor;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import nl.marido.chatcolor.handlers.Updater;
import nl.marido.chatcolor.listeners.ChatListener;
import nl.marido.chatcolor.listeners.SignListener;

public class ChatColor extends JavaPlugin {

	public static ChatColor instance;

	public void onEnable() {
		instance = this;
		System.out.println("Thank you for using the ChatColor resource.");
		saveDefaultConfig();
		Updater.runChecks();
		registerListeners();
	}

	public void registerListeners() {
		PluginManager manager = getServer().getPluginManager();
		manager.registerEvents(new ChatListener(), this);
		manager.registerEvents(new SignListener(), this);
	}

	public void onDisable() {
		System.out.println("Thank you for using the ChatColor resource.");
	}

	public static ChatColor getInstance() {
		return instance;
	}

}