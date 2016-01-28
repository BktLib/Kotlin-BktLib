package io.github.bktlib.kotlin.extensions

import org.bukkit.inventory.ItemStack
import org.bukkit.Material;
import org.bukkit.inventory.Inventory

import io.github.bktlib.inventory.Invs.*;

import java.util.stream.Stream;

val Inventory.isEmpty: Boolean
    get() = isEmpty( this );

val Inventory.isFull: Boolean
    get() = isFull( this );

fun Inventory.stream(): Stream<ItemStack> 	= stream( this );
fun Inventory.fill(item: ItemStack) 		= fill( this, item );
fun Inventory.fill(material: Material)		= fill( this, material );