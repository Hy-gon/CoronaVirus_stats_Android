package com.example.coronavirus_stats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.coronavirus_stats.recycler.ListRecycler
import com.example.coronavirus_stats.retro.ImportState
import com.example.coronavirus_stats.retro.RetroFitBase

class RecyclerFrag : Fragment()
{
    private lateinit var recyclerAdapter: RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_recycler, container, false)
        initViewModel(view)
        initViewModel()
        return view
    }

    private fun initViewModel(view: View) {
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
        recyclerView.addItemDecoration(decoration)

        recyclerAdapter = RecyclerViewAdapter()
        recyclerView.adapter = recyclerAdapter
    }

    private fun initViewModel() {
        val viewModel = ViewModelProvider(this).get(MainActivityView::class.java)
        viewModel.getRecyclerListObserver().observe(this, Observer<ListRecycler> {
            if(it != null) {
                recyclerAdapter.setUpdatedData(it.data.State)
            }})
        viewModel.makeApiCall()
    }

    companion object {
        @JvmStatic
        fun newInstance() = RecyclerFrag()
    }
}