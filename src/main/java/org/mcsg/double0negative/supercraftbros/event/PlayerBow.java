package org.mcsg.double0negative.supercraftbros.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

public class PlayerBow implements Listener {
	
	boolean started = false;
	
	public void onShot(EntityShootBowEvent ev) {
		if (ev.getEntity() instanceof Player){
			if (!started){
				ev.setCancelled(true);
			}
		}
	}
}
