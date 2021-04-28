package com.example.coronavirus_stats

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.coronavirus_stats.recycler.ListRecycler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.example.coronavirus_stats.retro.ImportState
import com.example.coronavirus_stats.retro.RetroFitBase

class MainActivityView: ViewModel() {
    var recyclerListLiveData: MutableLiveData<ListRecycler> = MutableLiveData()

    fun getRecyclerListObserver(): MutableLiveData<ListRecycler> = recyclerListLiveData

    fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {
            val retroInstance = RetroFitBase.getRetroInstance().create(ImportState::class.java)
            val response = retroInstance.getState()
            recyclerListLiveData.postValue(response)
        }
    }
}