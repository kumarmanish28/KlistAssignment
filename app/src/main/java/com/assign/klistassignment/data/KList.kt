package com.assign.klistassignment.data

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class KList<T> private constructor() {
    private var padding: Dp = 0.dp
    private var header: String? = null
    private var items: List<T> = emptyList()
    private var itemContent: @Composable (T) -> Unit = {}

    fun padding(dp: Dp): KList<T> = apply { this.padding = dp }

    fun header(title: String): KList<T> = apply { this.header = title }

    fun items(items: List<T>, itemContent: @Composable (T) -> Unit): KList<T> = apply {
        this.items = items
        this.itemContent = itemContent
    }

    @Composable
    fun render() {
        LazyColumn(contentPadding = PaddingValues(all = padding)) {
            header?.let {
                item { Text(text = it) }
            }
            items(items) { item ->
                itemContent(item)
            }
        }
    }

    companion object {
        internal inline operator fun <reified T> invoke(): KList<T> = KList()
    }
}

