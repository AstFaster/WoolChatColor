package fr.astfaster.woolchatcolor;

import fr.astfaster.woolchatcolor.commands.ChatColorCommand;
import fr.astfaster.woolchatcolor.listeners.InventoryClickListener;
import fr.astfaster.woolchatcolor.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public class WoolChatColor extends JavaPlugin {

    private static WoolChatColor INSTANCE;

    private String currentColor = "§f";

    public WoolChatColor(){
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        this.getCommand("chatcolor").setExecutor(new ChatColorCommand());

        this.getServer().getPluginManager().registerEvents(new ChatListener(), this);
        this.getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
    }

    @Override
    public void onDisable() {

    }

    public String getCurrentColor() {
        return currentColor;
    }

    public void setCurrentColor(String currentColor) {
        this.currentColor = currentColor;
    }

    public static WoolChatColor getInstance() {
        return INSTANCE;
    }
}
