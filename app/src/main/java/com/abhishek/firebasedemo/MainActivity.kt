package com.abhishek.firebasedemo

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.abhishek.firebasedemo.ui.theme.FirebaseDemoTheme
import com.abhishek.firebasedemo.ui.MainViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirebaseDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val mainViewModel: MainViewModel by viewModels()
                    Firebase(mainViewModel)
                }
            }
        }
    }
}

@Composable
fun Firebase(mainViewModel: MainViewModel) {
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,) {
        Text(text = mainViewModel.count.value.toString())
        Button(onClick = {
            Log.e("ABC","Inside Main Activity Function ${mainViewModel.count.value}")
            mainViewModel.count.value = mainViewModel.count.value + 1
            mainViewModel.count()
        }) {
            Text(text = "Click Me")

        }
    }
}