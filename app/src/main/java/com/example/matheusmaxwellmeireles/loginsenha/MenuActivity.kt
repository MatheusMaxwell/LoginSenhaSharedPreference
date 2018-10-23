package com.example.matheusmaxwellmeireles.loginsenha

import android.app.Activity
import android.content.Intent

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnSair.setOnClickListener({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
    }

    @Override
    public override fun onBackPressed() {

    }
}
