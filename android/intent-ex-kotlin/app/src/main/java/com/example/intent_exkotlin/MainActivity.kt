package com.example.intent_exkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button


class MainActivity : AppCompatActivity (), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnmoveact :Button =findViewById(R.id.btn_move_activity)
        btnmoveact.setOnClickListener(this)

    }

    override fun onClick(V : View?) {
        if (V != null) {
            when (V.id){
                R.id.btn_move_activity ->{
                    val moveintent = Intent(this@MainActivity, move_act::class.java)
                    startActivity(moveintent)
                }
            }
        }
    }


}