package com.abhishek.firebasedemo

import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class FirebaseRepo {
    val db = Firebase.firestore

    fun Count(value: Int) {
        Log.e("ABC","Inside Firebase Repo Function $value")
        val x = hashMapOf(
            "count" to value
        )
        db.collection("ABHISHEK")
            .document("COUNT")
            .set(x)
            .addOnSuccessListener { Log.e("ABC", "DocumentSnapshot successfully written!") }
            .addOnFailureListener { e -> Log.e("ABC", "Error writing document", e) }
    }
}