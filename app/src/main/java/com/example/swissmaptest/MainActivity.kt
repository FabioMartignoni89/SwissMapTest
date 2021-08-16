package com.example.swissmaptest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ch.admin.geo.openswissmaps.OpenSwissMaps

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        OpenSwissMaps.initialize()

        setContentView(R.layout.activity_main)

        val openMapButton: Button = this.findViewById(R.id.openMapButton)
        openMapButton.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
    }
}