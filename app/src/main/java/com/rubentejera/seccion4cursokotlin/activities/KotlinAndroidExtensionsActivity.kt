package com.rubentejera.seccion4cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.rubentejera.seccion4cursokotlin.R
import kotlinx.android.synthetic.main.activity_kotlin_android_extensions.* //<-Cargamos all lo que hay en el layout que ponemos

class KotlinAndroidExtensionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_android_extensions)

        val btn = findViewById<Button>(R.id.buttonById) //<-Forma para Java y Kotlin
        btn.setOnClickListener { Toast.makeText(this,"Click By Id",Toast.LENGTH_SHORT).show() }


        buttonByKAT.setOnClickListener { Toast.makeText(this,"Click By KAT",Toast.LENGTH_SHORT).show() } //<-Kotlin Android Extensions
        //No hay que hacer mas findViewById ni casteos
    }
}
