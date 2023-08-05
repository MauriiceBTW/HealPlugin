package me.maurice.healplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (label.equalsIgnoreCase("heal")) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("This command can only be executed by a Player!");
                return true;
            }

            Player player = (Player) sender;

            if (args.length > 0) {
                player.sendMessage("Too many arguments! Use /heal");
                return true;
            }

            player.setHealth(20);
            player.sendMessage("§aYou have been healed!");
        }

        return false;
    }
}
