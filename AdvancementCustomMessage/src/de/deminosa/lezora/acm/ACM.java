package de.deminosa.lezora.acm;

import org.bukkit.plugin.java.JavaPlugin;

/*
*	Class Create by Deminosa
*	YouTube: 	Deminosa
* 	Web:	 	deminosa.de
*	Create at: 	20:45:09 # 08.08.2021
*
*/

public class ACM extends JavaPlugin {

	private static ACM instance;

	@Override
	public void onEnable() {
		instance = this;
	}

	@Override
	public void onDisable() {
	}

	public static ACM getInstance() {
		return instance;
	}

}