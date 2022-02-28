package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn.setOnClickListener {
            if(email.text.isNullOrBlank() && password.text.isNullOrBlank()){
                Toast.makeText(this, "please fill the required field", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "successfully logged in", Toast.LENGTH_LONG).show()
            }
        }

        new_account.setOnClickListener {
            Toast.makeText(this, "new account need to be created", Toast.LENGTH_LONG).show()
        }
    }
}