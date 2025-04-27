package com.example.projectujian_tengah_semester

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class Register : AppCompatActivity() {

    lateinit var namaInput : EditText
    lateinit var emailInput : EditText
    lateinit var passwordInput : EditText
    lateinit var registerbtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

    namaInput = findViewById(R.id.nama_input)
    emailInput = findViewById(R.id.email_input)
    passwordInput = findViewById(R.id.password_input)
    registerbtn = findViewById(R.id.regsiter_btn)

     registerbtn.setOnClickListener {
       val nama = namaInput.text.toString()
       val email = emailInput.text.toString()
       val password = passwordInput.text.toString()
         Toast.makeText(this, "Pendaftaran berhasil untuk $nama", Toast.LENGTH_SHORT).show()
       val intent = Intent(this, chatActivity::class.java)
       startActivity(intent)
       Log.i("Selamat datang kamu berhasil!", "nama : $nama email : $email and password : $password")
     }
    }
}