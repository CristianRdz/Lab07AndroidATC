package com.example.lab07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab07.databinding.ActivityConfirmBinding

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityConfirmBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.SnameId.text = intent.getStringExtra("name")
        binding.SadressId.text = intent.getStringExtra("adress")
        binding.ScityId.text = intent.getStringExtra("city")
        binding.SstateId.text = intent.getStringExtra("state")
        binding.SzipCodeId.text = intent.getStringExtra("zipCode")
        binding.ScountryId.text = intent.getStringExtra("country")
        val btnEdit = binding.btnEdit
        val btnAccept = binding.btnAccept
        btnAccept.setOnClickListener(View.OnClickListener {
            Accept(it)
        })
        btnEdit.setOnClickListener(View.OnClickListener {
            Edit(it)
        })
    }

    fun Accept(view: View) {
        var agree = Intent(this, ThankYouActivity::class.java)
        startActivity(agree)
    }

    fun Edit(view: View) {
        onBackPressed()
    }
}