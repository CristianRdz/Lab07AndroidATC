package com.example.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab07.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val btnSchedule = binding.btnSchedule
        btnSchedule.setOnClickListener {
            mySchedule(binding)
        }

    }
    private fun mySchedule(binding: ActivityMainBinding) {
        val intent = Intent(this, ConfirmActivity::class.java)
        intent.putExtra("name",binding.nameId.text.toString())
        intent.putExtra("adress",binding.adressId.text.toString())
        intent.putExtra("city",binding.cityId.text.toString())
        intent.putExtra("state",binding.stateId.text.toString())
        intent.putExtra("zipCode",binding.zipId.text.toString())
        intent.putExtra("country",binding.countryId.text.toString())
        startActivity(intent)
    }
}