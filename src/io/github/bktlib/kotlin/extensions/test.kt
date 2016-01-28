package io.github.bktlib.kotlin.extensions

import io.github.bktlib.inventory.builders.ItemBuilder
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

import org.bukkit.Material
import org.bukkit.entity.Player

public class Test : JavaPlugin()
{
    override fun onCommand( sender: CommandSender?, command: Command?,
                            label: String?, args: Array<out String>? ): Boolean
    {
        var player: Player = sender as Player;


        with( player )
        {
            inventory.fill(Material.DIAMOND_AXE);

            inventory.fill(
                    ItemBuilder.newBuilder()
                            .type(Material.DIAMOND_AXE)
                            .name("thor")
                            .build()
            )

            inventory.stream()
                    .filter { it != null }
                    .map { it.type }
                    .forEach {
                        player.sendMessage( it.toString() )
                    }

            inventory.isFull.let {
                player.sendMessage("Seu inventario está cheio")
            }
            inventory.isEmpty.let {
                player.sendMessage("Seu inventario está vazio")
            }
        }

        return super.onCommand(sender, command, label, args)
    }
}