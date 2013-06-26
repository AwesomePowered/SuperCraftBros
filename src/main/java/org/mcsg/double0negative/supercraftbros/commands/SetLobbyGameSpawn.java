package org.mcsg.double0negative.supercraftbros.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mcsg.double0negative.supercraftbros.SettingsManager;

public class SetLobbyGameSpawn implements SubCommand{

	@Override
	public boolean onCommand(Player player, String[] args) {
		if(player.isOp()){
			
			if(args.length == 1){
				int i = Integer.parseInt(args[0]);
				SettingsManager.getInstance().setGameLobbySpawn(i, player.getLocation());
				player.sendMessage(ChatColor.GREEN + "Game lobby set for Arena #" + ChatColor.GOLD + args[0]);
			}
			
			
		}
		return true;
	}

	@Override
	public String help(Player p) {
		// TODO Auto-generated method stub
		return null;
	}

}
