package com.example.swissmaptest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MapActivity : AppCompatActivity() {

    private var mapFragment: SwisstopoFragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        initMap()
    }

    private fun initMap() {
        mapFragment = SwisstopoFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.mapContainer, mapFragment!!)
            .disallowAddToBackStack()
            .commit()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

