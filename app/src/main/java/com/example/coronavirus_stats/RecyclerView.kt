package com.example.coronavirus_stats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coronavirus_stats.recycler.ListRecycler
import com.example.coronavirus_stats.recycler.State
import com.example.coronavirus_stats.recycler.States
import com.example.coronavirus_stats.R
import com.example.coronavirus_stats.MainActivity


class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()
{
        lateinit var context: MainActivity
        private var states = ArrayList<State>()

        fun setUpdatedData(states: States) {
            this.states = states.toArrayList()
            notifyDataSetChanged()
        }

        class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
            private val tvName = view.findViewById<TextView>(R.id.tvName)
            private val tvActiveCase = view.findViewById<TextView>(R.id.tvActiveCase)
            private val tvTotalCase = view.findViewById<TextView>(R.id.tvTotalCase)
            private val tvDeaths = view.findViewById<TextView>(R.id.tvDeath)
            private val tvRecovered = view.findViewById<TextView>(R.id.tvRecovered)

            fun bind(state: State) {
                tvName.text = state.name
                tvActiveCase.text = state.activeCases.toString()
                tvTotalCase.text = state.totalCases.toString()
                tvDeaths.text = state.deaths.toString()
                tvRecovered.text = state.recovered.toString()
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater
                .from(parent.context)
                .inflate(R.layout.recycler_list, parent, false))

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bind(states.get(position))
        }

        override fun getItemCount(): Int = states.size
}