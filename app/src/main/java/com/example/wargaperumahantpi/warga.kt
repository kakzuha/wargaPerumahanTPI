package com.example.wargaperumahantpi

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun WargaLokal() {
    var listWarga = getDataWarga()
    LazyColumn(content = {
        itemsIndexed(listWarga, itemContent = { index, item ->
            WargaItem(item = item)
        })
    })
}

@Composable
fun WargaItem() {
    Column {
        Text(text = item.namaLengkap)
    }
}