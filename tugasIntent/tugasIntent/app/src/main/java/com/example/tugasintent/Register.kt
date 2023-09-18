package com.example.tugasintent

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasintent.databinding.ActivityRegisterBinding

private lateinit var binding: ActivityRegisterBinding


class Register : AppCompatActivity() {
    companion object{
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_PASSWORD = "extra_password"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_TELPON = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            binding.register.setOnClickListener {
                val intent = Intent(/* packageContext = */ this@Register,/* cls = */ HomePage::class.java)
                intent.putExtra(EXTRA_USERNAME,textUsername.text.toString())
                intent.putExtra(EXTRA_PASSWORD,textPassword.text.toString())
                intent.putExtra(EXTRA_EMAIL,textEmail.text.toString())
                intent.putExtra(EXTRA_TELPON,textTelpon.text.toString())
                startActivity(intent)
            }
        }
    }
}