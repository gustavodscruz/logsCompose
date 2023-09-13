package com.example.logs

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.logs.ui.theme.DebugButtonColors
import com.example.logs.ui.theme.ErrorButtonColors
import com.example.logs.ui.theme.InfoButtonColors
import com.example.logs.ui.theme.WarningButtonColors

@Composable
fun MainScreen(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            modifier = Modifier.fillMaxSize(0.5f),
            colors = DebugButtonColors(),
            onClick = {
                Log.d(TAG, "Clicou em DEBUG!" )
            }) {
            Text(text = "Debug")
        }
        Button(
            modifier = Modifier.fillMaxSize(0.5f),
            colors = InfoButtonColors(),
            onClick = {
                Log.i(TAG, "Clicou em INFO!" )

            }) {
            Text(text = "Info")
        }
        Button(
            modifier = Modifier.fillMaxSize(0.5f),
            colors = WarningButtonColors(),
            onClick = {
                Log.w(TAG, "Clicou em WARNING!")
            }) {
            Text(text = "Warmning")
        }
        Button(
            modifier = Modifier.fillMaxSize(0.5f),
            colors = ErrorButtonColors(),
            onClick = {
                Log.e(TAG, "Clicou em ERROR!")
            }) {
            Text(text = "Error")
        }
    }
}