package winlyps.miningBoost

import org.bukkit.plugin.java.JavaPlugin

class MiningBoost : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(MiningEventListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}