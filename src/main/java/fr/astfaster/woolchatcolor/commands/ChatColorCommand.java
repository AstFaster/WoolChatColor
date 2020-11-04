package fr.astfaster.woolchatcolor.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ChatColorCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            final Player player = (Player) sender;

            final Inventory inventory = Bukkit.createInventory(null, 18, "§4Chat§cColor");

            initializeItems(inventory);

            player.openInventory(inventory);

            return true;
        }

        return false;
    }

    private void initializeItems(Inventory inventory){
        for (int i = 0; i < 16; i++){
            inventory.addItem(new ItemStack(Material.WOOL, 1, (byte)i));
        }
    }
}
