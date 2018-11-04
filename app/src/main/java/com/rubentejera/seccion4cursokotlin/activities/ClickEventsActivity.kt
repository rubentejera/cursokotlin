package com.rubentejera.seccion4cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.rubentejera.seccion4cursokotlin.R

class ClickEventsActivity : AppCompatActivity(), View.OnLongClickListener {//--> //3.- Click by IDS en 'when'

    //1.- Click en XML  // No aconsejable, no deberiamos tener nombre de metodos, logica de nuestro codigo, esta diseñado para la interfaz de usuario
    //2.- Click en linea
    //3.- Click by IDS en 'when'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        clickInLine()  // Se llama aqui para poder "registrarlo" --> //2.- Click en linea

        /*3.- Click by IDS en 'when'*/
        val btn1 = findViewById<Button>(R.id.buttonClickMulti1)
        val btn2 = findViewById<Button>(R.id.buttonClickMulti2)
        val btn3 = findViewById<Button>(R.id.buttonClickMulti3)

        btn1.setOnLongClickListener(this)
        btn2.setOnLongClickListener(this)
        btn3.setOnLongClickListener(this)
        /*3.- Click by IDS en 'when'*/
    }


    //1.- Click en XML

    //Regla Obligatoria para Clicks en XMLs:
    // 1.- El método tiene que ser público
    // 2.- Los nombres tienen que coincidir
    // 3.- Recibe un solo parámetro(View)
    fun xmlClick(view: View){
        Toast.makeText(this,"Click by XML",Toast.LENGTH_SHORT).show()
    }


    //2.- Click en linea
    private fun clickInLine(){
        val btn = findViewById<Button>(R.id.buttonClickInLine)
        btn.setOnClickListener{
            Toast.makeText(this,"Click in Line!",Toast.LENGTH_SHORT).show()
        }
    }

    //3.- Click by IDS en 'when'
    override fun onLongClick(view: View): Boolean {
        when(view.id){
            R.id.buttonClickMulti1 -> Toast.makeText(this,"Click Multi 1",Toast.LENGTH_SHORT).show()
            R.id.buttonClickMulti2 -> Toast.makeText(this,"Click Multi 2",Toast.LENGTH_SHORT).show()
            R.id.buttonClickMulti3 -> Toast.makeText(this,"Click Multi 3",Toast.LENGTH_SHORT).show()
        }
        return true
    }

}
