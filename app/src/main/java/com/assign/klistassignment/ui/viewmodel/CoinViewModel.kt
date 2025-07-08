package com.assign.klistassignment.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CoinViewModel : ViewModel() {
    private val _coinList = MutableStateFlow(listOf("Bitcoin", "Ethereum", "Solana", "Cardano"))
    val coinList: StateFlow<List<String>> = _coinList

    fun addCoin(coin: String) {
        _coinList.value = _coinList.value + coin
    }

}