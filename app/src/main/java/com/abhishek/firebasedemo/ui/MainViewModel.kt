package com.abhishek.firebasedemo.ui

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.abhishek.firebasedemo.FirebaseRepo

class MainViewModel: ViewModel(){
    val count = mutableStateOf(0)
    val firebaseRepo = FirebaseRepo()

    fun count(){
        Log.e("ABC","Inside View Model Function")
        firebaseRepo.Count(count.value)
    }

}