package com.bignerdranch.charactergen

import java.io.File


private const val DEX_DICE = 4
private const val WIS_DICE = 3
private const val STR_DICE = 2

private fun <T> List<T>.rand() = shuffled().first()
private val firstName = File("data/names.txt").readLines()
private val lastName = firstName

object FantasyName {

    private fun name() = "${firstName.rand()} ${lastName.rand()}"
    private fun race() = listOf("dwarf", "elf", "human", "halfling").rand()
    private fun dex() = DEX_DICE.roll()
    private fun wis() = WIS_DICE.roll()
    private fun str() = STR_DICE.roll()

    private fun Int.roll() = (1..this).map { (1..6).toList().rand() }.sum()


    fun character() = "${name()},${race()},${dex()},${wis()},${str()}"
}
