package com.example.matheusmaxwellmeireles.loginsenha

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : Activity() {

    val hashMaps = mutableListOf<HashMap<String, String>>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var arrayLogin = ArrayList<String>()

        var hashMap = HashMap<String, String>()
        hashMap.set("joao", "1234")
        hashMaps.add(0, hashMap)
        hashMap.clear()
        hashMap.set("matheus", "1234")
        hashMaps.add(hashMap)
        hashMap.clear()
        hashMap.set("jorge", "1234")
        hashMaps.add(hashMap)
        hashMap.clear()

        var sharedPreference = getSharedPreferences("PREFERENCE_LOGIN", Context.MODE_PRIVATE)

        tvLogin.text.clear()
        tvSenha.text.clear()


        btnEntrar.setOnClickListener({
            if(!tvSenha.text.isEmpty() || !tvLogin.text.isEmpty()){
                var user = sharedPreference.getString("login", tvLogin.text.toString())
                if(sharedPreference.getString("login", "default").equals(tvLogin.text.toString())){
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                }
                else{
                    var editor = sharedPreference.edit()
                    editor.putString("login", tvLogin.text.toString())
                    editor.commit()
                    val intent = Intent(this, bemVindo_activity::class.java)
                    startActivity(intent)
                }
            }
            else{
                Toast.makeText(this,"Login inválido.", Toast.LENGTH_LONG).show()
            }



        })


    }

    fun validaLogin ( login:String, senha:String) : Boolean{

        for(i in hashMaps){
            if(i.getValue(login).equals(senha)){
                return true
            }
        }

        return false

    }
}
