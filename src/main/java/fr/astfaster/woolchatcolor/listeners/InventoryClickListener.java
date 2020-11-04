package fr.astfaster.woolchatcolor.listeners;

import fr.astfaster.woolchatcolor.WoolChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e){
        final Player player = (Player) e.getWhoClicked();

        if (e.getInventory().getName().equals("§4Chat§cColor")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.WOOL){
                switch (e.getSlot()){
                    case 0:
                        WoolChatColor.getInstance().setCurrentColor("§f");
                        player.sendMessage("§4[ChatColor]:§f Changing color to WHITE");
                        break;
                    case 1:
                    case 12:
                        WoolChatColor.getInstance().setCurrentColor("§6");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §6GOLD");
                        break;
                    case 2:
                        WoolChatColor.getInstance().setCurrentColor("§c");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §cRED");
                        break;
                    case 3:
                        WoolChatColor.getInstance().setCurrentColor("§9");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §9BLUE");
                        break;
                    case 4:
                        WoolChatColor.getInstance().setCurrentColor("§e");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §eYELLOW");
                        break;
                    case 5:
                        WoolChatColor.getInstance().setCurrentColor("§a");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §aGREEN");
                        break;
                    case 6:
                        WoolChatColor.getInstance().setCurrentColor("§d");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §dLIGHT PURPLE");
                        break;
                    case 7:
                        WoolChatColor.getInstance().setCurrentColor("§8");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §8DARK GRAY");
                        break;
                    case 8:
                        WoolChatColor.getInstance().setCurrentColor("§7");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §7GRAY");
                        break;
                    case 9:
                        WoolChatColor.getInstance().setCurrentColor("§b");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §bAQUA");
                        break;
                    case 10:
                        WoolChatColor.getInstance().setCurrentColor("§5");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §5DARK PURPLE");
                        break;
                    case 11:
                        WoolChatColor.getInstance().setCurrentColor("§1");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §1DARK BLUE");
                        break;
                    case 13:
                        WoolChatColor.getInstance().setCurrentColor("§2");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §2DARK GREEN");
                        break;
                    case 14:
                        WoolChatColor.getInstance().setCurrentColor("§4");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §4DARK RED");
                        break;
                    case 15:
                        WoolChatColor.getInstance().setCurrentColor("§0");
                        player.sendMessage("§4[ChatColor]:§f Changing color to §0BLACK");
                        break;
                }
            }
        }
    }

}
