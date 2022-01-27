package com.example.android.basicweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weatherListRV = findViewById<RecyclerView>(R.id.rv_card_list)
        weatherListRV.layoutManager = LinearLayoutManager(this)
        weatherListRV.setHasFixedSize(true)

        val adapter = WeatherListAdapter()
        weatherListRV.adapter = adapter

        val weatherHandData: MutableList<Weather> = mutableListOf (
            Weather("Jan 12", "54", "41", "25", "Sunny", "Sunny with a chance of clouds"),
            Weather("Jan 13", "64", "42", "80", "AM Showers", "AM Showers with a high chance of sun later in the day")
        )
        adapter.addWeather(Weather("Jan 21", "54 F", "41 F", "25%", "Mostly Cloudy", "Mostly clouding in the morning with sun in the evening"))
        adapter.addWeather(Weather("Jan 20", "64 F", "42 F", "80%", "Showers", "Showers throughout the day with sun later in the day"))
        adapter.addWeather(Weather("Jan 19", "32 F", "28 F", "30%", "Partly Cloudy", "Some clouds with a chance of rain in the evening"))
        adapter.addWeather(Weather("Jan 18", "62 F", "39 F", "25%", "Partly Cloudy", "Some clouds with a chance of rain or sun"))
        adapter.addWeather(Weather("Jan 17", "53 F", "46 F", "40%", "Mostly Cloudy", "Cloudy throughout the day and into the evening"))
        adapter.addWeather(Weather("Jan 16", "60 F", "51 F", "90%", "Showers", "Showers with a chance of sun later in the day"))
        adapter.addWeather(Weather("Jan 15", "68 F", "54 F", "0%", "Sunny", "Sunny with a chance of clouds "))
        adapter.addWeather(Weather("Jan 14", "60", "43", "80%", "Showers", "Showers throughout the whole day"))
        adapter.addWeather(Weather("Jan 13", "54 F", "38 F", "5%", "Sunny", "Sunny with a chance of clouds"))
        adapter.addWeather(Weather("Jan 12", "51 F", "43 F", "25%", "AM Showers", "AM Showers with a high chance of sun later in the day"))
    }
}
