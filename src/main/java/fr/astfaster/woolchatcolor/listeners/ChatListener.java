package fr.astfaster.woolchatcolor.listeners;

import fr.astfaster.woolchatcolor.WoolChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e){
        final Player player = e.getPlayer();

        for (Player p : Bukkit.getOnlinePlayers()){
            p.sendMessage(WoolChatColor.getInstance().getCurrentColor() + player.getDisplayName() + ": " + e.getMessage());
        }
        e.setCancelled(true);
    }

}
