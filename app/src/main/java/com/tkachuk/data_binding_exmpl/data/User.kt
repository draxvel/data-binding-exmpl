package com.tkachuk.data_binding_exmpl.data

import android.databinding.ObservableInt

data class User(var name: String, var age: Int, var likes: ObservableInt) {
    fun isAdult() = age > 18
}