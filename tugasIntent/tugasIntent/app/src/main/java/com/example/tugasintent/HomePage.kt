package com.example.tugasintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasintent.databinding.ActivityHomePageBinding

private lateinit var binding: ActivityHomePageBinding


class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            txtName.text= "Welcome " + intent.getStringExtra(Register.EXTRA_USERNAME)
            txtEmail.text="Your " + intent.getStringExtra(Register.EXTRA_EMAIL)+" has been actived"
            txtAddress.text= "Your Phone " + intent.getStringExtra(Register.EXTRA_TELPON)+" has been registered"
        }
    }
}