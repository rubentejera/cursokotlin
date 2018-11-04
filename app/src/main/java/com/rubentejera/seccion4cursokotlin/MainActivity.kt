package com.rubentejera.seccion4cursokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar
import android.widget.Button
import android.widget.Toast
import com.rubentejera.seccion4cursokotlin.activities.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        // Variables que representan los botones
//        val btnLifeCycle = findViewById<Button>(R.id.button_to_cycle)
//        val btnClickEvents = findViewById<Button>(R.id.button_to_click)
//        val btnAndroidExt = findViewById<Button>(R.id.button_to_android_extensions)
//        val btnPicasso = findViewById<Button>(R.id.button_to_picasso)
//        val btnListView = findViewById<Button>(R.id.button_to_list_view)
//        val btnIntents = findViewById<Button>(R.id.button_to_intents)
//        val btnPermission = findViewById<Button>(R.id.button_to_permissions)
//        val btnSharePreferences = findViewById<Button>(R.id.button_to_shared_preferences)
//        val btnExtensionFunctions = findViewById<Button>(R.id.button_to_extension_functions)
//
//        //Asignacion de un método para el evento Click del Botón
//        btnLifeCycle.setOnClickListener{goToLifeCycleActivity()}
//        btnClickEvents.setOnClickListener{goToClickEventsActivity()}
//        btnAndroidExt.setOnClickListener { goToKotlinAndroidExtActivity() }
//        btnPicasso.setOnClickListener { goToPicassoActivity() }
//        btnListView.setOnClickListener { goToListViewActivity() }
//        btnIntents.setOnClickListener { goToIntentsActivity() }
//        btnPermission.setOnClickListener { goToPermissionsActivity() }
//        btnSharePreferences.setOnClickListener { goToSharedPreferencesActivity() }
//        btnExtensionFunctions.setOnClickListener { goToExtensionFunctionsActivity() }



        button_to_cycle.setOnClickListener{goToLifeCycleActivity()}
        button_to_click.setOnClickListener{goToClickEventsActivity()}
        button_to_android_extensions.setOnClickListener { goToKotlinAndroidExtActivity() }
        button_to_picasso.setOnClickListener { goToPicassoActivity() }
        button_to_list_view.setOnClickListener { goToListViewActivity() }
        button_to_intents.setOnClickListener { goToIntentsActivity() }
        button_to_permissions.setOnClickListener { goToPermissionsActivity() }
        button_to_shared_preferences.setOnClickListener { goToSharedPreferencesActivity() }
        button_to_extension_functions.setOnClickListener { goToExtensionFunctionsActivity() }

    }


    fun showToast() {
        Toast.makeText(this, "Hello from the Toast", Toast.LENGTH_LONG).show() //Parametros: (Contexto,Texto,Duracion)
    }

    fun showSnackBar() {
        val layout = findViewById<ConstraintLayout>(R.id.constraint)

//      Snackbar.make(layout,"Hello fron SnackBar!",Snackbar.LENGTH_LONG).show()//Igual que el Toast pero le pasas un View
        Snackbar.make(layout, "Hello fron SnackBar!", Snackbar.LENGTH_LONG).setAction("UNDO") {
            // Parametros de setAction( (Texto){Action ó Callback})
            Snackbar.make(layout, "Email has been restored!!", Snackbar.LENGTH_LONG).show()
        }.show()
    }




//    Métodos que nos llevarán de un activity a otro

//    Declaracion de Método Larga
//    private fun goToLifeCycleActivityLong() {
//        val intent = Intent(this, LifeCycleActivity::class.java)
//        startActivity(intent)
//    }

    //Declaracion de Métodos en Linea
    private fun goToLifeCycleActivity() = startActivity(Intent(this, LifeCycleActivity::class.java))
    private fun goToClickEventsActivity() = startActivity(Intent(this, ClickEventsActivity::class.java))
    private fun goToKotlinAndroidExtActivity() = startActivity(Intent(this, KotlinAndroidExtensionsActivity::class.java))
    private fun goToPicassoActivity() = startActivity(Intent(this, PicassoActivity::class.java))
    private fun goToListViewActivity() = startActivity(Intent(this, ListViewActivity::class.java))
    private fun goToIntentsActivity() = startActivity(Intent(this, IntentsActivity::class.java))
    private fun goToPermissionsActivity() = startActivity(Intent(this, PermissionsActivity::class.java))
    private fun goToSharedPreferencesActivity() = startActivity(Intent(this, SharedPreferencesActivity::class.java))
    private fun goToExtensionFunctionsActivity() = startActivity(Intent(this, ExtensionFunctionsActivity::class.java))

}
