package com.assign.klistassignment.demo

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.assign.klistassignment.data.KList
import com.assign.klistassignment.ui.presentation.KListItem
import com.assign.klistassignment.ui.viewmodel.CoinViewModel

@Composable
fun HomeScreen() {
    val context = LocalContext.current
    val viewModel: CoinViewModel = viewModel()
    val coins by viewModel.coinList.collectAsState()

    KList<String>()
        .padding(16.dp)
        .header("Top Gainers")
        .items(coins) {
            KListItem(it) {
                Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
            }
        }
        .render()

}