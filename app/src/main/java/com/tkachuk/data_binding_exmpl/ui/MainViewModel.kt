package com.tkachuk.data_binding_exmpl.ui

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableInt
import com.tkachuk.data_binding_exmpl.data.User

class MainViewModel : ViewModel() {

    val user = User(
            "Igor",
            33,
            ObservableInt(0))

    fun onLike() {
        user.likes.set(user.likes.get() + 1)
    }
}


