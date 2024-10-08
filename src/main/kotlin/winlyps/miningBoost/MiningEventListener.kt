package winlyps.miningBoost

import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockBreakEvent
import org.bukkit.plugin.Plugin
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class MiningEventListener(private val plugin: Plugin) : Listener {

    @EventHandler
    fun onBlockBreak(event: BlockBreakEvent) {
        val player: Player = event.player
        applyHasteEffect(player)
    }

    private fun applyHasteEffect(player: Player) {
        player.addPotionEffect(PotionEffect(PotionEffectType.FAST_DIGGING, 6 * 20, 0, false, false, false))
    }
}