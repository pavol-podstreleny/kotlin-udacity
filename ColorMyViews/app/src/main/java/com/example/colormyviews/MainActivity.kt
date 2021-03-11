package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        listOf(binding.boxOne,
            binding.boxTwo,
            binding.boxThree,
            binding.boxFour,
            binding.boxFive,
            binding.root,
            binding.btnGreen,
            binding.btnYellow,
            binding.redBtn
            ).forEach {
                it.setOnClickListener {
                    makeColored(it)
                }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two -> view.setBackgroundColor(Color.GRAY)

            R.id.btn_green -> binding.boxOne.setBackgroundResource(R.color.my_red)
            R.id.btn_yellow -> binding.boxTwo.setBackgroundResource(R.color.my_yellow)
            R.id.red_btn -> binding.boxThree.setBackgroundResource(R.color.my_green)

            // Boxes using Android color resources for background
            R.id.box_three -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five -> view.setBackgroundResource(android.R.color.holo_green_light)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}