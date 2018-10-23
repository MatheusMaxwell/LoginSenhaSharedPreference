package com.example.matheusmaxwellmeireles.loginsenha

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class bemVindo_activity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bem_vindo_activity)
        val intent = Intent(this, MenuActivity::class.java)

        Timer().schedule(1500){
            startActivity(intent)
        }
    }
}
