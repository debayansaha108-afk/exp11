package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var tvLocationInfo: TextView
    private val defaultLocation = LatLng(28.6139, 77.2090) // Default: New Delhi, India

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvLocationInfo = findViewById(R.id.tv_location_info)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        val fabMyLocation = findViewById<FloatingActionButton>(R.id.fab_my_location)
        fabMyLocation.setOnClickListener {
            if (::mMap.isInitialized) {
                // Move camera back to default location with animation
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(defaultLocation, 12f))
                tvLocationInfo.text = "Centered on New Delhi"
            }
        }
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in New Delhi and move the camera
        mMap.addMarker(MarkerOptions().position(defaultLocation).title("Marker in New Delhi"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(defaultLocation, 10f))

        // Set a listener for map clicks to show it's interactive
        mMap.setOnMapClickListener { latLng ->
            mMap.clear() // Clear old markers
            mMap.addMarker(MarkerOptions().position(latLng).title("Custom Marker"))
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng))
            
            val formattedLat = String.format("%.4f", latLng.latitude)
            val formattedLng = String.format("%.4f", latLng.longitude)
            tvLocationInfo.text = "Tapped: $formattedLat, $formattedLng"
        }
    }
}
