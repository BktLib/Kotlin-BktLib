package io.github.bktlib.kotlin.extensions

import org.bukkit.inventory.*;

import io.github.bktlib.Invs;

import java.util.stream.Stream;

fun Inventory.stream(): Stream<ItemStack> = Invs.stream( this );