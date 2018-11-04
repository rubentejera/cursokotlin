package com.rubentejera.seccion4cursokotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rubentejera.seccion4cursokotlin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_picasso_activity.*

class PicassoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picasso_activity)

        buttonLoader.setOnClickListener{loadImages()}

        Picasso.get().load("https://html.com/wp-content/uploads/flamingo.jpg").fetch()
    }

    private fun loadImages(){
        Picasso
                .get()
                .load("https://html.com/wp-content/uploads/flamingo.jpg")
                .resize(400,400)
                .centerInside()
                .into(imageViewTop)
        Picasso
                .get()
                .load("https://www.w3schools.com/css/img_forest.jpg")
                .fit()
                .into(imageViewButtom)
    }
}