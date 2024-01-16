package com.example.intent_exkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class move_act : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val buttonmove: Button = findViewById(R.id.btn_move_activity1)
        buttonmove.setOnClickListener(this)
    }

    override fun onClick(V: View?) {
        if (V != null) {
            when (V.id) {
                R.id.btn_move_activity1 -> {
                    val moveintent = Intent(this@move_act, move_act::class.java)
                    startActivity(moveintent)
                }
            }
        }
    }
}