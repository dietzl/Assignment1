package com.example.android.basicweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import android.widget.TextView
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.recyclerview.widget.ItemTouchHelper

class WeatherListAdapter : RecyclerView.Adapter<WeatherListAdapter.ViewHolder>() {
    val weatherList: MutableList<Weather> = mutableListOf()

    override fun getItemCount() = this.weatherList.size

    fun addWeather(weather: Weather) {
        this.weatherList.add(0, weather)
        this.notifyItemInserted(0)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.weather_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(this.weatherList[position])
    }
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val date: TextView = view.findViewById(R.id.item_date)
        private val high: TextView = view.findViewById(R.id.item_high)
        private val low: TextView = view.findViewById(R.id.item_low)
        private val precip: TextView = view.findViewById(R.id.item_precip)
        private val descShort: TextView = view.findViewById(R.id.item_short)
        private var descLong: String = ""

        init {
            view.setOnClickListener{
                val snackbar = Snackbar.make(
                    view,
                    this.descLong,
                    Snackbar.LENGTH_SHORT).show()
            }
        }

        fun bind (weather: Weather) {
            this.date.text = weather.date
            this.high.text = weather.high
            this.low.text = weather.low
            this.precip.text = weather.precip
            this.descShort.text = weather.descShort
            this.descLong = weather.descLong
        }
    }
}
