package com.example.dyukarev_v_12

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Authorization : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        val btnAuthorize = findViewById<Button>(R.id.btnAuthorize)


        btnAuthorize.setOnClickListener {
            val intent = Intent(this, News_feed::class.java)
            startActivity(intent)
        }
    }
}