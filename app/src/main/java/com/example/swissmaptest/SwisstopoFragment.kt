package com.example.swissmaptest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ch.admin.geo.openswissmaps.shared.layers.config.SwisstopoLayerType
import ch.admin.geo.openswissmaps.view.SwisstopoMapView

class SwisstopoFragment : Fragment() {

    private var mapView: SwisstopoMapView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_swisstopo, container, false)

        mapView = view.findViewById(R.id.map)
        mapView?.registerLifecycle(lifecycle)
        mapView?.setBaseLayerType(SwisstopoLayerType.PIXELKARTE_FARBE)

        return view
    }
}