package me.akaishin.beddup;

/*Imports others */
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bukkit.*;

/*Commands Inport */
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public final class BedDupe extends JavaPlugin { // PLUGIN CREADO POR XG2025 + AnarchyGooD // PLUGIN BY AnarchyGooD // NEW CODE


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new BedDupeListener(), this);
        getCommand("beddupereload").setExecutor(new ReloadCommand());
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private final class BedDupeListener implements Listener {

        @EventHandler
        public void onRightClick(PlayerInteractEvent event) {
            Player p = event.getPlayer();
            Block block = event.getClickedBlock();
            if(event.getClickedBlock() == null) return;

            if (block.getType().equals(Material.BLUE_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.BLACK_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.BROWN_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.RED_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.GREEN_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.CYAN_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.LIGHT_GRAY_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.PURPLE_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.YELLOW_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.LIME_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.ORANGE_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.MAGENTA_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.PINK_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }

            if (block.getType().equals(Material.WHITE_BED) && event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.AIR) {
                int rng = (int)Math.round(Math.random() * 100);
                    if (rng < getConfig().getInt("probability-percentage")) {
                        block.getWorld().dropItemNaturally(block.getLocation().add(0, 1, 0), p.getInventory().getItemInMainHand());
                    }
                }
            }
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
private final class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp()) {
            reloadConfig();
            return true;
        }
        return false;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}






