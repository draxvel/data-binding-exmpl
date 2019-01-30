package com.tkachuk.data_binding_exmpl

import android.databinding.DataBindingUtil
import android.databinding.ObservableInt
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.tkachuk.data_binding_exmpl.data.User
import com.tkachuk.data_binding_exmpl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val user = User("Igor", 3, ObservableInt(0))

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.user = user

    }

    fun onLike() {
        user.likes.set(user.likes.get()+1)
    }
}
