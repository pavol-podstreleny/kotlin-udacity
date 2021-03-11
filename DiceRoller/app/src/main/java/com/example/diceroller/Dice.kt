package com.example.diceroller

import androidx.annotation.DrawableRes

class Dice(private val numberOfSides: Int = 6) {

    @DrawableRes
    fun roll() : Int  {
        return when((1..numberOfSides).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
    }

}